package day_3_problems;
    public class employeecase  {
         static final int Present=1;
          static final int parttime=2;
          static final int wagerate=20;
          
      public static void main(String[] args) {
    	  int empcheck;
      
    	  empcheck=(int)(Math.floor(Math.random() *10)%3);
    	  int wrkhour=0;
      
      switch (empcheck){
      	case Present :
      	wrkhour=8 ;
      	break;

      	case parttime:
      	wrkhour=4;
      	break;

      	default:
      	wrkhour=0;
      	break;
      	}
      
      double empsal=wrkhour*wagerate;
      }
}

