package com.joincoded.bankaccounts.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joincoded.bankaccounts.R
import com.joincoded.bankaccounts.ui.theme.BankAccountsTheme

@Composable
fun AccountCard(
    name: String,
    amount: Double,
    currency: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = stringResource(R.string.account, name))
            Text(text = "$amount $currency")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountCardPreview() {
    BankAccountsTheme {
        AccountCard(name = "maha", amount = 300.0, currency = "almaha")
    }
}