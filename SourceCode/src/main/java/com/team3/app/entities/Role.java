package com.team3.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Role implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id
  @Column(name="role_id")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int roleId;
  
}
