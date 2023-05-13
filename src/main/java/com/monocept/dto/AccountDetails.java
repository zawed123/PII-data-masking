package com.monocept.dto;

import com.monocept.encrypt.MaskData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class AccountDetails {

    private String accountHolderName;
    @MaskData
    private String accountNumber;
    private String accountType;
}
