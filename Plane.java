public class Plane
{
  private int location;

  public Plane()
  {
    this.location = 0;
  }
  public Plane(int loc)
  {
    if (loc >= -2000 && loc<= 2000)
    {
      this.location = loc;
    }
    else
    {
      this.location = 0;
    }
  }
  public void upward()
  {
    if (this.location <= 2000)
    {
      this.location += 100;
    }
    else
    {
      System.out.println("You may not exceed 2000 feet!");
    }
  }
  public void downward()
  {
    if (this.location >= -2000)
    {
      this.location -= 100;
    }
    else
    {
      System.out.println("You may not go below -2000 feet!");
    }
  }
  public int getLocation()
  {
    return this.location;
  }
  public String toString()
  {
    int spaces = (location + 2000)/100;
    String result = "";
    for (int i = 0; i < spaces; i++)
    {
      result += " ";
    }
    result += "@";
    return result;
  }
  
}
