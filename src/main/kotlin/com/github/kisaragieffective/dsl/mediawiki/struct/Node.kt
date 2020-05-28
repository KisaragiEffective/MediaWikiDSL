package com.github.kisaragieffective.dsl.mediawiki.struct

interface Node {
    fun toWikiText() = toString()
}