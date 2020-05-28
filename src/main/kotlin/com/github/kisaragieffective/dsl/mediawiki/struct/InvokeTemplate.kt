package com.github.kisaragieffective.dsl.mediawiki.struct

import com.github.kisaragieffective.dsl.mediawiki.WikiPath

open class InvokeTemplate(val name: WikiPath, private vararg val arguments: Node) :
    Node {
    override fun toWikiText(): String {
        return if (arguments.isEmpty()) {
            "{{$name}}"
        } else {
            "{{$name|" + arguments.joinToString("|", transform = Node::toString) + "}}"
        }
    }
}