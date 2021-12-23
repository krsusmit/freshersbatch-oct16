import java.util.*;
import java.util.Comparator;
class Contact implements Comparable<Contact>
{
    private long phonenumer;
    private String name;
    private String email;
    private Gender gender;

  public Contact(String name,String email,Gender gender)
  {
      this.name=name;
      this.email=email;
      this.gender=gender;
  }

    public long getPhonenumer() {
        return phonenumer;
    }

    @Override
    public int compareTo(Contact o) {
        return 0;
    }


    enum Gender
    {
        male,female;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }


}