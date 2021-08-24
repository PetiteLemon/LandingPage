package com.example.collector;

import com.example.collector.data.EndUserDao;
import com.example.collector.EndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndUserService {

    private final EndUserDao endUserDao;

    @Autowired
    public EndUserService(@Qualifier("fakeDao") EndUserDao endUserDao) {
        this.endUserDao = endUserDao;
    }

    public int addEndUser(EndUser endUser) {
        return endUserDao.insertEndUser(endUser);
    }

    public List<EndUser> getAllUsers() {
        return endUserDao.selectAllUsers();
    }

}
