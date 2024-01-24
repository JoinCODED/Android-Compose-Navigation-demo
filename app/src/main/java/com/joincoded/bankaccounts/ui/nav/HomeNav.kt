package com.joincoded.bankaccounts.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joincoded.bankaccounts.data.Account
import com.joincoded.bankaccounts.ui.screen.AccountDetailsScreen
import com.joincoded.bankaccounts.ui.screen.AccountsListScreen

@Composable
fun HomeNavScreen(accountsList: List<Account>) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "accountsList"
    ) {
        composable("accountsList") {
            AccountsListScreen(accountsList,
                onItemClicked = {
                    navController.navigate("accountDetails/${it}")
                })
        }

        composable("accountDetails/{accountId}") {
            val accountId = it.arguments?.getString("accountId")
            val filteredAccountsList = accountsList.filter {
                it.id.toString() == accountId
            }

            AccountDetailsScreen(filteredAccountsList[0])
        }
    }
}