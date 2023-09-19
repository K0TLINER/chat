package kr.co.devcs.chat.service.impl;

import kr.co.devcs.chat.dto.AccountForm;
import kr.co.devcs.chat.entity.Account;
import kr.co.devcs.chat.repository.AccountRepository;
import kr.co.devcs.chat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired private AccountRepository accountRepository;
    @Override
    public Account addAccount(AccountForm accountForm) {return null; }

    @Override
    public Optional<Account> getAccount(long accountNo) {
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
        System.out.println("getAccountList");
        return accountRepository.findAllByNicknameLike(pageable,nickname).getContent();
    }

    @Override
    public List<Account> findAccountIds(String name, LocalDate birthDate) {
        return null;
    }
}
