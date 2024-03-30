package com.example.javaprac.DAO;

import com.example.javaprac.models.*;

import java.util.List;

public interface ClientOfficeDAO extends CommonDAO<ClientOffice, Long> {


    public List<Client> GetClient(int id);
    public List<Office> GetOffice(int id);

}
