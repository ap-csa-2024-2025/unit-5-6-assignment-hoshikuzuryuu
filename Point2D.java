public class Point2D
{
  // Fields / Attributes / Instance variables
  private int x;
  private int y;

  // Constructors
  public Point2D()
  {
    this(0, 0);
  }

  public Point2D(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  // Setters and getters
  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  // Additional methods
  public String toString()
  {
    String result = "(" + x + " =" + ", " + y + ")";
    return result;
  }

  // Returns the distance from the origin to this point
  public double dist()
  {
    double distX = Math.pow(x, 2);
    double distY = Math.pow(y, 2);
    return Math.sqrt(distX + distY);
  }

  // Overload of dist() method
  // Returns the distance from this point to Point2D other
  public double dist(Point2D other)
  {
    double distX = Math.pow((other.x-x), 2);
    double distY = Math.pow((other.y-y), 2);
    return Math.sqrt(distX + distY);
  }
}
