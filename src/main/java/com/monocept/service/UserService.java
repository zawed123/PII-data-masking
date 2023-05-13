package com.monocept.service;

import com.monocept.dto.AccountDetails;
import com.monocept.dto.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    public List<User> getAllUser()
    {
      User user1=new User(56789,"John","8687346123","1234567890",30,"john_jvm","john@1234",
              Arrays.asList(new AccountDetails("JOHN CURRAN","568734219734","SAVING"),
                      new AccountDetails("JOHN CURRAN","456723450967","CURRENT")));
        User user2=new User(56797,"Smith","9061553887","9876543210",40,"smithkn","smit@1234",
                Arrays.asList(new AccountDetails("SMITH CURRAN","214531946723","SAVING"),
                        new AccountDetails("SMITH CURRAN","568733210973","CURRENT")));
      return Stream.of(user1,user2).collect(Collectors.toList());
    }

    public User getUserById(int id)
    {
        return getAllUser().stream().filter(user -> user.getId()==id)
                .findAny()
                .orElseThrow(()->new RuntimeException("User not found"));
    }
}
