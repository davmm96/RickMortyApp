package com.david.rickmortyapp.data.remote.response

import kotlinx.serialization.Serializable

@Serializable
data class CharacterResponse (
    val id: String,
    val status: String,
    val image: String
)