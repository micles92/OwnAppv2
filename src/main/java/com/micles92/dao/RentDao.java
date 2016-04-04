package com.micles92.dao;

import com.micles92.model.Book;
import com.micles92.model.Rent;
import com.micles92.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lesiulol on 29.02.16.
 */
@Repository
public interface RentDao extends JpaRepository<Rent,Long> {

}
