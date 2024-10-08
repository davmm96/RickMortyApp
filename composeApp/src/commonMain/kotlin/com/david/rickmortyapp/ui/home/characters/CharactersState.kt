package com.david.rickmortyapp.ui.home.characters

import com.david.rickmortyapp.domain.model.Character

data class CharactersState (
    val characterOfTheDay: Character? = null,
)