package com.david.rickmortyapp.data

import com.david.rickmortyapp.data.remote.ApiService
import com.david.rickmortyapp.domain.Repository
import com.david.rickmortyapp.domain.model.Character

class RepositoryImpl(private val api: ApiService) : Repository {
    override suspend fun getSingleCharacter(id: String): Character {
        return api.getSingleCharacter(id).toDomain()
    }
}