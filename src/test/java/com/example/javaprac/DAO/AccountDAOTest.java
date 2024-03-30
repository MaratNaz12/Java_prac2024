//package com.example.javaprac.DAO;
//
//
//import com.example.javaprac.models.Account;
//import com.example.javaprac.models.BankAccType;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.jupiter.api.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestPropertySource;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//@SpringBootTest
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestPropertySource(locations="classpath:application.properties")
//public class AccountDAOTest {
//
//    @Autowired
//    private AccountDAO accountDAO;
//
//    private CommonDAO commonDAO;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Test
//    void testSimpleManipulations() {
//        List<Account> personListAll = (List<Account>) accountDAO.getAll();
//        assertEquals(6, personListAll.size());
//
//        List<Account> geraltQuery = accountDAO.getAllPersonByName("Геральт");
//        assertEquals(1, geraltQuery.size());
//        assertEquals("Геральт из Ривии", geraltQuery.get(0).getName());
//
//        Person personId3 = personDAO.getById(3L);
//        assertEquals(3, personId3.getId());
//
//        Person personNotExist = personDAO.getById(100L);
//        assertNull(personNotExist);
//    }
//
//
//
//    @BeforeEach
//    void beforeEach() {
//
//    }
//
//    @BeforeAll
//    @AfterEach
//    void annihilation() {
//        try (Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//            session.createSQLQuery("TRUNCATE person RESTART IDENTITY CASCADE;").executeUpdate();
//            session.createSQLQuery("ALTER SEQUENCE person_person_id_seq RESTART WITH 1;").executeUpdate();
//            session.getTransaction().commit();
//        }
//    }
//}
//}
