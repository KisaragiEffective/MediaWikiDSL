package com.github.kisaragieffective.dsl.mediawiki.struct

import com.github.kisaragieffective.dsl.mediawiki.struct.Node

class NoWiki(private val str: String) : Node {
    override fun toWikiText(): String {
        return "<nowiki>$str</nowiki>"
    }
}