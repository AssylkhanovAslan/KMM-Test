package kz.mechta.seller

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform