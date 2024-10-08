package com.david.rickmortyapp.data.remote.response

import com.david.rickmortyapp.domain.model.Character
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse(
    @SerialName("id")
    val id: Int,
    val status: String,
    val image: String
) {
    fun toDomain(): Character {
        return Character(
            id = id,
            isAlive = status.lowercase() == "alive",
            image = image
        )
    }
}