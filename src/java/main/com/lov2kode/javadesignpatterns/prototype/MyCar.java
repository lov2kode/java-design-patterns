package com.lov2kode.javadesignpatterns.prototype;

public class MyCar implements Cloneable
{
  private String name;
  private String year;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getYear()
  {
    return year;
  }

  public void setYear(String year)
  {
    this.year = year;
  }

  @Override
  public MyCar clone() throws CloneNotSupportedException
  {
    try
    {
      return (MyCar) super.clone();
    }
    catch (CloneNotSupportedException ex)
    {
      throw new AssertionError();
    }
  }
}
