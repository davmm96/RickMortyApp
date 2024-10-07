package com.david.rickmortyapp

import androidx.compose.ui.window.ComposeUIViewController
import com.david.rickmortyapp.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }