package com.example.demo.model;


import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class ArchPk implements Serializable{
  private Date date;
  private int idDevice;
  
}
