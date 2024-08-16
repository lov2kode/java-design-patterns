package com.lov2kode.javadesignpatterns.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * Limit the no of instance to one
 */
public class BMWCar implements Serializable
{
  private static final long serialVersionUID = -7604766932017737115L;
  private volatile static BMWCar INSTANCE;

  /**
   * Instance can not be created outside using constructor
   */
  private BMWCar()
  {

  }

  public static BMWCar getInstance()
  {
    if (null == INSTANCE)
    {
      synchronized (BMWCar.class)
      {
        if (null == INSTANCE)
        {
          INSTANCE = new BMWCar();
        }
      }
    }

    return INSTANCE;
  }

  @Serial
  protected Object readResolve()
  {
    return getInstance();
  }
}
