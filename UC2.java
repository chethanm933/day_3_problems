package day_3_problems;
   public class UC2 {
       
      public static void main(String[] args) {
      //CONSTANT
    	  int Present = 1;
    	  double wage_rate = 20;
    	  double attendance = Math.floor(Math.random()*10)%2 ;
    	  double workinghours = 0; 
    	  if (attendance == Present)  
    	  workinghours=8;
      
      	double wage = workinghours * wage_rate;
        System.out.println("employee is"+wage+"earned today");
      }
}
   
