package day_3_problems;
               public class monthlysalary  {
                static final int present=1;

                  static final int parttime=2;

                  static final int wagerate=20;

                  static final int days=20;

             public static void main(String[] args){

                 int emp=0;
                 int hour=0;
                 int totalsalary=0;

                   for (int i=0; i<=20; i++) {

                  emp = (int)(Math.floor(Math.random() * 10) % 3); 

                    switch(emp) {

                    case present:
                         hour=8;
                    break;

                     case parttime:
                          hour=4;
                     break;

                     default:
                     hour=0;
                      break;
}
                  double salary=hour*wagerate;
                 totalsalary+=salary;
}
                 System.out.println("employee earned"+totalsalary+"this month");


 }
}
