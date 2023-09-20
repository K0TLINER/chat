package kr.co.devcs.chat.service;

import kr.co.devcs.chat.dto.AccountForm;
import kr.co.devcs.chat.entity.Account;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//@Service
@Transactional
public interface AccountService {
    Account addAccount(AccountForm accountForm);
    Optional<Account> getAccount(long accountNo);
    Account updateAccount(AccountForm accountForm);
    Boolean deleteAccount(long accountNo);
    List<Account> getAccountList(Pageable pageable, String nickname);
    List<Account> findAccountIds(String name, LocalDate birthDate);
}
