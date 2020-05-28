package com.github.kisaragieffective.dsl.mediawiki.struct

object Empty : Node {
    override fun toWikiText(): String {
        return ""
    }
}