package org.example.json;

import java.util.ArrayList;
import java.util.List;

public class Converter {

  /*  public static List<AccountDTO> convertToDTOList(Account[] accounts) {
        List<AccountDTO> dtos = new ArrayList<>();
        for (Account account : accounts) {
            dtos.add(convertToDTO(account));
        }

        return dtos;

    }

    public static AccountDTO convertToDTO(Account account) {
        AccountDTO dto = new AccountDTO();
        dto.setFullName(account.getFirstName() + " " + account.getLastName());
        dto.setCity(account.getAddress().getCity());
        dto.setZipCode(Integer.toString(account.getAddress().getZipCode()));
        dto.setIsActive(account.getAccount().isActive() ? "Active" : "Inactive");
        return dto;
    }*/
}
