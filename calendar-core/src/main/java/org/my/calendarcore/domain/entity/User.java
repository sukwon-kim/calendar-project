package org.my.calendarcore.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String name;
    private String email;
    private String password;
    private LocalDate birthday;
    private LocalDateTime createAt = LocalDateTime.now();

    public User(
            String name,
            String email,
            String password,
            LocalDate birthday
    ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
    }
}
