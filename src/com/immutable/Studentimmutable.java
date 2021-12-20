package com.immutable;
// to make the class immutable we make the class as final and all the fields are finale and no setter methods
final class Studentimmutable {

  private final  String name;
  private final int id;



   private Age age;
   Studentimmutable(String name, int id, Age age) {
      this.name = name;
      this.id = id;
      this.age=age;
   }
   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }
   public Age getAge() {
    Age clone = new Age();
    clone.setDay(this.age.getDay());
    clone.setYear(this.age.getYear());
    clone.setMonth(this.age.getMonth());
    return clone;

   }

   @Override
   public String toString() {
      return "Studentimmutable{" +
              "name='" + name + '\'' +
              ", id=" + id +
              '}';
   }
}
