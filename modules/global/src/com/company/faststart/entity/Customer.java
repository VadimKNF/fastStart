package com.company.faststart.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "FASTSTART_CUSTOMER")
@Entity(name = "faststart_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -2704029398351779844L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 50)
    protected String email;

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}