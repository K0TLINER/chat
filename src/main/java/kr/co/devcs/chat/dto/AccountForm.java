package kr.co.devcs.chat.dto;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class AccountForm {
    private String phone;
    private String email;
    private String password;
    private String checkPassword;
    private String nickname;
    private String name;
    private LocalDate birthDate;
    private String statusMessage;
}
