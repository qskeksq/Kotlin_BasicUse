package com.psalms40.kotlin.KClass

/**
 * Created by mac on 2018. 2. 21..
 */
open class KotlinClass5 : IKotlin {

    override var variable: String = ""

    override fun function1() {

    }

    override fun function2() {

    }

    var kotlinImpl = object : IKotlin {
        override var variable: String = ""

        override fun function1() {

        }

        override fun function2() {

        }
    }

}