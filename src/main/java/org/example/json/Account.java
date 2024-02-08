package org.example.json;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String firstName;
    private String lastName;
    private String birthDate;
    private Address address;
    private AccountDetails account;
}
