package com.example.javaprac.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.annotation.Nonnull;
import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Dictionary;


@Entity
@Table(name = "client")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Client implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name="name" )
    @NonNull
    private String name;


    @Column(nullable = false, name="contacts" )
    @NonNull
    private JsonAlias contacts;

    @Column(nullable = false, name="accounts" )
    private Long[] accounts;

    @Column(nullable = false, name="offices" )
    private Long[] clients;

}
