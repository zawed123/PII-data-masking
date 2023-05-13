package com.monocept.dto;

import com.monocept.encrypt.MaskData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    @MaskData
    private String ssn;
    @MaskData
    private String phoneNumber;
    private int age;
    private String userName;
    @MaskData
    private String password;
    private List<AccountDetails> accountDetailsList;
}
