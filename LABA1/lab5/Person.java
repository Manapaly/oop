public class Person {
  Gender gender;
  
  public Person(Gender gender) {
    this.gender = gender;
  }

  public String toString() {
    return gender + " ";
  }
}