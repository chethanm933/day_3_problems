package day_3_problems;
   public class UC3 {
       
      public static void main(String[] args) {
      //CONSTANT
       int Present = 1;
        int parttime=2;
        int wage_rate = 20;
         double attendance = Math.floor(Math.random()*10)%3 ;
        int workinghours = 0; 
        if (attendance == Present)    {
              workinghours=8;
        }
           else if(attendance==parttime); {
             workinghours=4;
             System.out.println("employee is parttime");
                                           }
       double wage = workinghours*wage_rate;
         System.out.println("employee is"+wage+"earned today");
       
         }
}
