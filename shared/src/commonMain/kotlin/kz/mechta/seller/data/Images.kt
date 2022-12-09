package kz.mechta.seller.data

@kotlinx.serialization.Serializable
data class Images(
    val mobile: String?,
    val tablet: String?,
    val desktop: String?,
)

fun emptyImagesModel(): Images {
    return Images(null, null, null)
}