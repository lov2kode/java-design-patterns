package com.lov2kode.javadesignpatterns;

import com.lov2kode.javadesignpatterns.builder.Party;
import com.lov2kode.javadesignpatterns.prototype.MyCar;
import com.lov2kode.javadesignpatterns.singleton.BMWCar;

public class DesignPatternMainApp
{
  public static void main(String[] args) throws CloneNotSupportedException
  {
    final Party party = Party.newBuilder()
        .organizer("Divyansh")
        .place("Delhi")
        .date("15-08-2024")
        .reasonForParty("Independence Day")
        .build();

    System.out.println(party);

    // This car is special and had only 1 piece only for president.
    final BMWCar car = BMWCar.getInstance();
    System.out.println(car);

    final MyCar myCar = new MyCar();
    myCar.setName("Tata Nano");
    myCar.setYear("2023");
    System.out.println("myCar = " + myCar);
    final MyCar myCar2 = myCar.clone();
    myCar2.setYear("2022");
    System.out.println("myCar2 = " + myCar2);
    System.out.println("after clone, myCar = " + myCar + ", year = " + myCar.getYear());
  }
}
