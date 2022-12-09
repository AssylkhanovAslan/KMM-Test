package kz.mechta.seller.data

@kotlinx.serialization.Serializable
data class BaseResponse<T>(
    val result: Boolean,
    val errors: List<String>?,
    val message: String?,
    val data: T,
)