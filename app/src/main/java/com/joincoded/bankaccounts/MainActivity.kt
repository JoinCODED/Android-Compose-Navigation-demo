package com.joincoded.bankaccounts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joincoded.bankaccounts.data.Account
import com.joincoded.bankaccounts.repo.AccountsRepo
import com.joincoded.bankaccounts.ui.composables.AccountCard
import com.joincoded.bankaccounts.ui.theme.BankAccountsTheme

class MainActivity : ComponentActivity() {
    var accountsList = AccountsRepo.dummyAccountsList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    AccountsList(
                        accountsList = accountsList
                    )


                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountsList(accountsList: List<Account>, modifier: Modifier = Modifier) {
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
                    name = account.name,
                    amount = account.amount,
                    currency = account.currency
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BankAccountsTheme {
        AccountsList(AccountsRepo.dummyAccountsList)
    }
}