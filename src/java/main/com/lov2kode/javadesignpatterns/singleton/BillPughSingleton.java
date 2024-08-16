package com.lov2kode.javadesignpatterns.singleton;

public class BillPughSingleton
{
  /**
   * Inner class will be loaded at the time of getInstance
   */
  private static class SingletonHelper
  {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance()
  {
    return SingletonHelper.INSTANCE;
  }
}
