package com.github.kisaragieffective.dsl.mediawiki.builder

import com.github.kisaragieffective.dsl.mediawiki.struct.Empty
import com.github.kisaragieffective.dsl.mediawiki.struct.NoWiki
import com.github.kisaragieffective.dsl.mediawiki.struct.Node

class WikiTextBuilder {
    val elements = ArrayList<Node>(30)
    fun element(e: Node) {
        elements += e
    }

    fun toWikiText(): String {
        return elements.joinToString("", transform = Node::toWikiText)
    }

    fun bold(f: (Any) -> Unit) {
        f(3)
    }

    fun nowiki(f: () -> String) {
        element(NoWiki(f()))
    }
    val newLine: Unit
        get() = element(Empty)
}

fun wikitext(f: WikiTextBuilder.() -> Unit): WikiTextBuilder {
    return WikiTextBuilder().apply(f)
}