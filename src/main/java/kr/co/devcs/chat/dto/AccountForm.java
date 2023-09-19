package kr.co.devcs.chat.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
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
