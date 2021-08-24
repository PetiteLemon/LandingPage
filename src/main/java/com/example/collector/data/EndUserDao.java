package com.example.collector.data;
import com.example.collector.EndUser;

import java.util.List;

public interface EndUserDao {
    int insertEndUser(EndUser endUser);
    List<EndUser> selectAllUsers();
}
