package OOPS_Concept;

public class ATB6X_Person {


        public ATB6X_Person(String name, long phone, String email, boolean isMarried, String courseName) {
                this.name = name;
                this.phone = phone;
                this.email = email;
                this.isMarried = isMarried;
                this.courseName = courseName;
        }
      ATB6X_Person(String name) {
              this.name = name;
      }
        public ATB6X_Person(String name, long phone){
                this.name = name;
                this.phone = phone;
        }


        String name; // instance variables
        long phone;
        String email;
        boolean isMarried= true;
        String courseName;

        void print_details(){
              //  int age=10; // for local variable we have to assign the value
               // System.out.println(age);
            System.out.println("Printing details of the students");
        }
        // constructor
        // default constructor
        ATB6X_Person(){
                System.out.println("Default constructor");
                courseName="ATB";
        }
  //       parameterized constructor
//        ATB6X_Person(String givenName,long phoneNo){
//                System.out.println("parameterized constructor");
//                this.name=givenName;
//               this.phone = phoneNo;
//
//        }






}
