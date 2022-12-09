package kz.mechta.seller.data

@kotlinx.serialization.Serializable
data class BannerModel(
    val name: String? = null,
    val url: String? = null,
    val sort: Int? = null,
    val images: Images
)

fun emptyBannerModel(): BannerModel {
    return BannerModel(null, null, null, emptyImagesModel())
}