package day_3_problems;
                  public class UC6 {

                      final static int present=1;
                      final static int parttime=2;
                       final static      int wagerate=20;
                      final static int maxday=20;
                      final static int maxhour=100;

                     public static void main(String[] args) {

                   int emp;
                    int days=0;
                     int hours=0;
                     int salary=0;

                   while(days<=maxday&&hours<=maxhour){
                     days++;

                   emp=(int)(Math.floor(Math.random()*10)%3);

                     switch(emp) { 
                    case present:
                     hours+=8;
                     break;

                     case parttime:
                        hours+=4;
                       break;
                      
                      default:
                      hours+=0;
                         break;
}
                    //salary=hours*wagerate;
                   System.out.println("no of days"+days+"/n no of hours"+hours);
}
              salary=hours*wagerate;
                System.out.println("salary earned by employee"+salary);
}
}
