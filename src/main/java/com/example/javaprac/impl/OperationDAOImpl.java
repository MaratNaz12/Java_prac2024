package com.example.javaprac.impl;

import com.example.javaprac.DAO.AccountDAO;
import com.example.javaprac.DAO.OperationDAO;
import com.example.javaprac.models.Account;
import com.example.javaprac.models.Operation;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.validation.ObjectError;

import java.util.Collection;
import java.util.List;

@Repository
public class OperationDAOImpl extends CommonDAOImpl<Operation, Long> implements OperationDAO {

    public OperationDAOImpl() {
        super(Operation.class);
    }


    @Override
    public Collection<Operation> GetWithFilterRange(String fieldName, int lo, int hi) {
        try (Session session = sessionFactory.openSession()) {
            String query = "from Operation  where " + fieldName + " between :lo and :hi";
            Transaction t = session.beginTransaction();
            List<Operation> listOperations = session
                    .createQuery(query, Operation.class)
                    .setParameter("lo", lo)
                    .setParameter("hi", hi)
                    .getResultList();
            t.commit();
            return listOperations;
        }
    }

    @Override
    public Collection<Operation> GetWithFilterFree(String fieldName, String sign_, int value_) {
        try (Session session = sessionFactory.openSession()) {
            String query = "from Operation  where " + fieldName + sign_ + " :value_";
            Transaction t = session.beginTransaction();
            List<Operation> listOperations = session
                    .createQuery(query, Operation.class)
                    .setParameter("value_", value_)
                    .getResultList();
            t.commit();
            return listOperations;
        }
    }
}
