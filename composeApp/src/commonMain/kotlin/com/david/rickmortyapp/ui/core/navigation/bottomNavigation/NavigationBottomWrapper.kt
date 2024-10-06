package com.david.rickmortyapp.ui.core.navigation.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.david.rickmortyapp.ui.core.navigation.Routes
import com.david.rickmortyapp.ui.home.characters.CharactersScreen
import com.david.rickmortyapp.ui.home.episodes.EpisodesScreen

@Composable
fun NavigationBottomWrapper(navController: NavHostController){

    NavHost(navController = navController, startDestination = Routes.Episodes.route){
        composable(route = Routes.Episodes.route){
            EpisodesScreen()
        }

        composable(route = Routes.Characters.route){
            CharactersScreen()
        }
    }
}