package com.joincoded.bankaccounts.repo

import com.joincoded.bankaccounts.data.Account

class AccountsRepo {

    companion object {
        var dummyAccountsList = listOf(
            Account(121,"haya", 20.34, "kwd"),
            Account(222,"Mubarak", 20.34, "kwd"),
            Account(333,"Aseel", 20.34, "kwd"),
            Account(5423,"Haya 2", 20.34, "kwd"),
            Account(5425,"Haya 2", 244.34, "kwd"),

        )
    }
}