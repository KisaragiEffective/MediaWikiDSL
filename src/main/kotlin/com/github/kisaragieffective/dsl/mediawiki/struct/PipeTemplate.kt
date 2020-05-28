package com.github.kisaragieffective.dsl.mediawiki.struct

import com.github.kisaragieffective.dsl.mediawiki.struct.InvokeTemplate

object PipeTemplate : InvokeTemplate("!") {
    override fun toWikiText(): String {
        return "{{!}}"
    }
}