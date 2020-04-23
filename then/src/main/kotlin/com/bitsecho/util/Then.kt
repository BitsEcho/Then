package com.bitsecho.util

fun <T>T.then(block: T.()->Unit): T {
    block()
    return this
}