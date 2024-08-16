package com.lov2kode.javadesignpatterns.builder;

/**
 * It is particularly useful when the construction process is complex, or when there are multiple
 * ways to create an object. This can be the case when dealing with complex objects that have a
 * large number of attributes or configurations.
 *
 * <p>
 * 1. The builder pattern is most commonly used to create immutable objects.
 *
 * <p>
 * 2. To many constructors
 * <p>
 * 3. Long list of parameters
 */
public class Party
{
  private final String organizer;
  private final String place;
  private final String date;
  private final String reasonForParty;

  public Party(PartyBuilder builder)
  {
    this.organizer = builder.organizer;
    this.place = builder.place;
    this.date = builder.date;
    this.reasonForParty = builder.reasonForParty;
  }

  public static PartyBuilder newBuilder()
  {
    return new PartyBuilder();
  }

  public String getOrganizer()
  {
    return organizer;
  }

  public String getPlace()
  {
    return place;
  }

  public String getDate()
  {
    return date;
  }

  public String getReasonForParty()
  {
    return reasonForParty;
  }

  public static class PartyBuilder
  {

    private String organizer;
    private String place;
    private String date;
    private String reasonForParty;

    private PartyBuilder()
    {

    }

    public PartyBuilder organizer(String organizer)
    {
      this.organizer = organizer;
      return this;
    }

    public PartyBuilder place(String place)
    {
      this.place = place;
      return this;
    }

    public PartyBuilder date(String date)
    {
      this.date = date;
      return this;
    }

    public PartyBuilder reasonForParty(String reasonForParty)
    {
      this.reasonForParty = reasonForParty;
      return this;
    }

    public Party build()
    {
      return new Party(this);
    }
  }

  @Override public String toString()
  {
    return "Party{" +
        "organizer='" + organizer + '\'' +
        ", place='" + place + '\'' +
        ", date='" + date + '\'' +
        ", reasonForParty='" + reasonForParty + '\'' +
        '}';
  }
}
