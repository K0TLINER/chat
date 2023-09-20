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
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class AccountTestAppImpl implements AccountTestApp {

    @Autowired private AccountService accountService;
    @Override
    @Test
    public void addAccountTest() {
        AccountForm accountForm = AccountForm.builder()
                .password("tjddbs1111")
                .phone("01089114554")
                .birthDate(LocalDate.now().minusDays(5).minusYears(10))
                .email("sungyuun@naver.com")
                .name("김성윤")
                .statusMessage("hi")
                .nickname("김엉윤")
                .build();

        accountService.getAccount(1);

        Account account = accountService.getAccount(1).orElseThrow();
        System.out.println(account);
    }

    @Override
    @Test
    public void getAccountTest() {
        AccountForm accountForm = AccountForm.builder()
                .password("tjddbs1111")
                .phone("01089114554")
                .birthDate(LocalDate.now().minusDays(5).minusYears(10))
                .email("sungyuun@naver.com")
                .name("김성윤")
                .statusMessage("hi")
                .nickname("김엉윤")
                .build();

        accountService.addAccount(accountForm);

        Account account = accountService.getAccount(1).orElseThrow();
        System.out.println(account);
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

        List<Account> accounts = accountService.findAccountIds("김성윤", LocalDate.parse("2023-09-19"));

        Assertions.assertEquals(3,accounts.size());

        for (Account account : accounts){
            System.out.println("account = " + account);
        }


    }
}
