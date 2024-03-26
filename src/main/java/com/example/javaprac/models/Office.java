package com.example.javaprac.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

import jakarta.persistence.*;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;




@Entity
@Table(name = "office")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Office implements CommonEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Long id;

    @Column(nullable = false, name="name" )
    private String name;

    @Column(nullable = false, name="address" )
    private String address;

    @Column(nullable = false, name="contacts" )
    private JsonAlias contacts;


}
