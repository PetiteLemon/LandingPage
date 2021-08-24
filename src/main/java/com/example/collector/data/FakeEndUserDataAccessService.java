package com.example.collector.data;

import com.example.collector.EndUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakeEndUserDataAccessService implements EndUserDao{
    private static List<EndUser> DB = new ArrayList<>();

    @Override
    public int insertEndUser(EndUser endUser) {
        // DB.add(new EndUser(endUser.getId(), endUser.getName(), endUser.getTitle(), endUser.getEmail(), endUser.getPhone()));
        DB.add(endUser);
        return 1;
    }
    @Override
    public List<EndUser> selectAllUsers() {
        return DB;
    }
}
