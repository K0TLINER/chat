package kr.co.devcs.chat.account;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Pageable;

public interface AccountTestApp {
    void addAccountTest();
    void getAccountTest();
    void updateAccountTest();
    void deleteAccountTest();
    void getAccountListTest();
    void findAccountIdsTest();
}
