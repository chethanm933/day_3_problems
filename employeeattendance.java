package day_3_problems;
   public class employeeattendance {
       
      public static void main(String[] args) {
      //CONSTANT
       int Present = 1;
         
         double attendance = Math.floor(Math.random()*10)%2 ;
 
        if (attendance == Present)

        System.out.println("employee is present");
       else
         System.out.println("employee is absent");
         }
}
