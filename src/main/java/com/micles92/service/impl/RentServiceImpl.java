package com.micles92.service.impl;

import com.micles92.dao.RentDao;
import com.micles92.model.Rent;
import com.micles92.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lesiulol on 15.04.16.
 */
@Service
public class RentServiceImpl implements RentService {


    @Autowired
    RentDao rentDao;

    public List<Rent> findAll() {
        return rentDao.findAll();
    }

    public void save(Rent rent) {
        rentDao.save(rent);
    }

    public void delete(Long id) {
        rentDao.delete(id);
    }
}
