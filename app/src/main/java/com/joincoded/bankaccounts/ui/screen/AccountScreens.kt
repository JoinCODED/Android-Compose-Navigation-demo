package com.joincoded.bankaccounts.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.joincoded.bankaccounts.data.Account
import com.joincoded.bankaccounts.ui.composables.AccountCard

@Composable
fun AccountDetailsScreen(account: Account?, modifier: Modifier = Modifier) {
    Text(text = "${account?.name} ${account?.amount}")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountsListScreen(accountsList: List<Account>,
                       onItemClicked: (Int) -> Unit,
                       modifier: Modifier = Modifier
) {
    Scaffold(modifier = modifier,
        topBar = {
            TopAppBar(title = {
                Text(text = "Bank Statement")
            })
        }
    ) {
        LazyColumn(modifier = Modifier.padding(it)) {
            items(accountsList) { account ->
                AccountCard(
                    modifier = Modifier.clickable {
                        onItemClicked(account.id)
                    },
                    name = account.name,
                    amount = account.amount,
                    currency = account.currency
                )
            }

        }
    }
}