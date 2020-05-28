package com.github.kisaragieffective.dsl.mediawiki.struct

sealed class Argument : Node {
    class Numbered(val number: Int, val defaultValue: Node? = null) : Argument() {
        override fun toWikiText(): String {
            return if (defaultValue == null) {
                "{{{$number}}}"
            } else {
                "{{{$number|${defaultValue.toWikiText()}}}}"
            }
        }
    }

    class Named(val name: String, val defaultValue: Node? = null) : Argument() {
        override fun toWikiText(): String {
            return if (defaultValue == null) {
                "{{{$name}}}"
            } else {
                "{{{$name|${defaultValue.toWikiText()}}}}"
            }
        }
    }
}