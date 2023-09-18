package kr.co.devcs.chat.service.impl;

import kr.co.devcs.chat.dto.AccountForm;
import kr.co.devcs.chat.entity.Account;
import kr.co.devcs.chat.repository.AccountRepository;
import kr.co.devcs.chat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired private AccountRepository accountRepository;
    @Override
    public Account addAccount(AccountForm accountForm) {
        return null;
    }

    @Override
    public Account getAccount(long accountNo) {
        return null;
    }

    @Override
    public Account updateAccount(AccountForm accountForm) {
        return null;
    }

    @Override
    public Boolean deleteAccount(long accountNo) {
        return null;
    }

    @Override
    public List<Account> getAccountList(Pageable pageable, String nickname) {
        return null;
    }

    @Override
    public List<Account> findAccountIds(String name, LocalDate birthDate) {
        return null;
    }
}
