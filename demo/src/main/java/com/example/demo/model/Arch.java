package com.example.demo.model;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "arch_1004901")
@IdClass(ArchPk.class)
@Data
public class Arch {
  @Id
  @Column(name = "date")
  private Date date;

  @Id
  @Column(name = "id_device")
  private int idDevice;

  private int speed;
  private double latitude;
  private double longitude;
  private int rpm;
  private double odo;
  private int fuel;
  
}
