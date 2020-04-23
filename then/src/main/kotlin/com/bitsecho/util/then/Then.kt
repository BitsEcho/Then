package com.bitsecho.util.then

fun <T>T.then(block: T.()->Unit): T {
    block()
    return this
}