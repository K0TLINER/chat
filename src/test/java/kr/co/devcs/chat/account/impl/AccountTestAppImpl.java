package kr.co.devcs.chat.account.impl;

import kr.co.devcs.chat.account.AccountTestApp;
import kr.co.devcs.chat.dto.AccountForm;
import kr.co.devcs.chat.entity.Account;
import kr.co.devcs.chat.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;

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

        int page = 0;  // 페이지 번호 (0부터 시작)
        int size = 20; // 페이지당 아이템 수
        Pageable page1 = PageRequest.of(page, size);
        List<Account> page2 = accountService.getAccountList(page1, "김엉윤");
        for(Account account : page2) {
            System.out.println(account);
        }
    }


    @Override
    @Test
    public void findAccountIdsTest() {

    }
}
