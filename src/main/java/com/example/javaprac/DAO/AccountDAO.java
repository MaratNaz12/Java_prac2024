package com.example.javaprac.DAO;

import com.example.javaprac.models.*;
import lombok.Builder;
import lombok.Getter;

import java.util.Collection;
import java.util.List;

public interface AccountDAO extends CommonDAO<Account, Long> {


    public List <Account> GetWithFilter(String fieldName, int value);
    public List <Account> GetWithFilterBalanceRange(int lo, int hi);
    public List <Account> GetWithFilterBalanceFree(String sign, int value);

}