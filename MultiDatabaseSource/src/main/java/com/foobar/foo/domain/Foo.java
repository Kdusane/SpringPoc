package com.foobar.foo.domain;



import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FOO")
public class Foo {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "FOO")
    private String foo;
}
