package org.arav.poker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform