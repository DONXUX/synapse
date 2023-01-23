package com.donxux.synapse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform