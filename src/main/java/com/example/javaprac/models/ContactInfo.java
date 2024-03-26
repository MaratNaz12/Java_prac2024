package com.example.javaprac.models;
import jakarta.annotation.Nonnull;
import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "bankacctype")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ContactInfo implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name="name" )
    private String name;

    @Column(nullable = false, name="telnumber1" )
    private String telnumber1;

    @Column(name="telnumber2" )
    private String telnumber2;

    @Column(name="email" )
    private String email;

    @Column(name="address" )
    private String address;

}
