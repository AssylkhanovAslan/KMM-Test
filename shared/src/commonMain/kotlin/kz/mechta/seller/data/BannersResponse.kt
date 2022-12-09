package kz.mechta.seller.data

import kotlinx.serialization.Serializer

@kotlinx.serialization.Serializable

data class BaseResponse<T>(
    val result: Boolean,
    val errors: List<String>?,
    val message: String,
    val data: List<BannerModel>,
)