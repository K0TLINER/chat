package kr.co.devcs.chat.account.impl;

import kr.co.devcs.chat.account.AccountTestApp;
import kr.co.devcs.chat.dto.AccountForm;
import kr.co.devcs.chat.entity.Account;
import kr.co.devcs.chat.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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

        Account existingAccount = Account.builder()
                .phone("010-1111-2222")
                .email("protein@protein.com")
                .build();

        Account savedAccount = accountService.updateAccount(AccountForm.builder().phone(toString()).email(toString()).build());

        AccountForm accountForm = AccountForm.builder()
                .phone("010-7777-8888")
                .email("sexy@sexy.com")
                .build();

        Account updatedAccount = accountService.updateAccount(accountForm);

    }

    @Override
    @Test
    public void deleteAccountTest() {
        Account account = Account.builder()
                .accountNo(888888)
                .build();

        boolean isDeleted = accountService.deleteAccount(888888);

        assertFalse(isDeleted);
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

        List<Account> accounts = accountService.findAccountIds("김성윤", LocalDate.parse("2023-09-19"));

        assertEquals(3,accounts.size());

        for (Account account : accounts){
            System.out.println("account = " + account);
        }


    }
}
