package com.bob.project4.profile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;

  public UserEntity() {
  }

  public UserEntity(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public long getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "{" +
        " userID='" + getID() + "'" +
        ", name='" + getName() + "'" +
        ", email='" + getEmail() + "'" +
        "}";
  }

}
