package com.david.rickmortyapp.di

import com.david.rickmortyapp.ui.home.characters.CharactersViewModel
import com.david.rickmortyapp.ui.home.episodes.EpisodesViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val uiModule = module {
    viewModelOf(::EpisodesViewModel)
    viewModelOf(::CharactersViewModel)
}