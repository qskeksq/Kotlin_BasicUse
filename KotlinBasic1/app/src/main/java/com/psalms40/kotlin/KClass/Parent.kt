package com.psalms40.kotlin.KClass

/**
 * Created by mac on 2018. 2. 21..
 */
open class Parent {

    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaultVal = 4  // public by default

    protected class ProtectedNested {
        val publicInNested: Int = 5
    }


}