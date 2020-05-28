package com.github.kisaragieffective.dsl.mediawiki

import com.github.kisaragieffective.dsl.mediawiki.builder.wikitext

class TestBuilder {
    fun a() {
        wikitext {
            nowiki {
                ""
            }

            newLine
            bold {

            }
        }
    }
}