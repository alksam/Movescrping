package org.example.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AccountDTO {
    private String fullName;
    private String city;
    private String zipCode;
    private String isActive;


    public AccountDTO(){
        String  fullName;
        String city;
        String zipCode;
        String isActive;


    }

    public String getAccountDetails() {
        return "AccountDTO{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }

}
