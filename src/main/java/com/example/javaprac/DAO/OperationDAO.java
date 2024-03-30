package com.example.javaprac.DAO;

import com.example.javaprac.models.Operation;

import java.util.Collection;

public interface OperationDAO {

    public Collection <Operation> GetWithFilterRange(String fieldName, int lo, int hi);
    public Collection <Operation> GetWithFilterFree(String fieldName, String sign, int value);

}
