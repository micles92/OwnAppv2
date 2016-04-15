package com.micles92.service.impl;

import com.micles92.model.Rent;

import java.util.List;

/**
 * Created by lesiulol on 15.04.16.
 */
public interface RentService {
    List<Rent> findAll();

    void save(Rent rent);

    void delete(Long id);
}
