package com.example.javaprac;

import com.example.javaprac.DAO.CommonDAO;
import com.example.javaprac.models.BankAccType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;



@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestPropertySource(locations="classpath:application.properties")
class TestCommon {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;


    @Test
    public void test() {
        SessionFactory sessionFactoryObject = sessionFactory.getObject();
        assertNotNull(sessionFactoryObject);
        Session session = sessionFactoryObject.openSession();
        assertNotNull(session);
    }


//    @Test
//    public void create_bankacctypes(){
//        List<BankAccType> AccTypeList = new ArrayList<>();
//        AccTypeList.add(new BankAccType(null, "RARE",0.2, 300L, 0L, 0L, 0L, 0L));
//        AccTypeList.add(new BankAccType(null, "REGULAR",0.12, 100L, 1000000L, 100L, 100000L, 100L));
//        AccTypeList.add(new BankAccType(null, "OFTEN",0.6, 50L, 1000000L, 100L, 1000000L, 100L));
//        commonDAO.saveCollection(AccTypeList);


//    }
}
