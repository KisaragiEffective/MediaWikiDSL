package com.github.kisaragieffective.dsl.mediawiki.struct.parserexpression

import com.github.kisaragieffective.dsl.mediawiki.struct.Node

class If(val condition: Node, val then: Node, val `else`: Node) :
    Node {
    override fun toWikiText(): String {
        return "{{#if:${condition.toWikiText()}|${then.toWikiText()}|${`else`.toWikiText()}}}"
    }
}