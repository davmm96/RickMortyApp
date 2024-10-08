package com.david.rickmortyapp.domain.usecase

import com.david.rickmortyapp.domain.Repository
import com.david.rickmortyapp.domain.model.Character

class GetRandomCharacter(private val repository: Repository) {
    suspend operator fun invoke(): Character {
        val randomId = (1..826).random().toString()
        return repository.getSingleCharacter(randomId)
    }
}