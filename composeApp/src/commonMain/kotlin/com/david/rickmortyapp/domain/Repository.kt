package com.david.rickmortyapp.domain

import com.david.rickmortyapp.domain.model.Character

interface Repository {
    suspend fun getSingleCharacter(id: String): Character
}