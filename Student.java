public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    ID = input_id;
    grade = input_grade;
    name = input_name;
  }
  public Student(String name, int grade, int id)
  {
    this.name = name;
    this.grade = grade;
    this.ID = id;
  }
  public Student(int grade, String name, int id)
  {
    this.grade = grade;
    this.name = name;
    this.ID = id; 
  }

  public void setName(String name)
  {
    this.name = name;
  }
  public void setGrade(int grade)
  {
    this.grade = grade; 
  }
  public void setID(int id)
  {
    this.ID = id;
  }

  public String getName()
  {
    return this.name;
  }
  public int getID()
  {
    return this.ID;
  }
  public int getGrade()
  {
    return this.grade;
  }

  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
