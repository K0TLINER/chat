package kr.co.devcs.chat.account.impl;

import kr.co.devcs.chat.account.AccountTestApp;
import kr.co.devcs.chat.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountTestAppImpl implements AccountTestApp {

    @Autowired private AccountService accountService;
    @Override
    @Test
    public void addAccountTest() {

    }

    @Override
    @Test
    public void getAccountTest() {

    }

    @Override
    @Test
    public void updateAccountTest() {

    }

    @Override
    @Test
    public void deleteAccountTest() {

    }

    @Override
    @Test
    public void getAccountListTest() {

    }

    @Override
    @Test
    public void findAccountIdsTest() {

    }
}
