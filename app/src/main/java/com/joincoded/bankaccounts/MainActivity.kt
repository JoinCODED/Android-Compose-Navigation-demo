package com.joincoded.bankaccounts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joincoded.bankaccounts.repo.AccountsRepo
import com.joincoded.bankaccounts.ui.nav.HomeNavScreen
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
                    HomeNavScreen(accountsList)

                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BankAccountsTheme {

    }
}