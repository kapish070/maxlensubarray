import java.util.*;
public class maxlensubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     while(a>0)
     {
    	 int count=0,count1=0;
    	 int size=sc.nextInt();
    	 int b[]=new int[size];
    	 for(int i=0;i<size;i++)
    	 {
    		 b[i]=sc.nextInt();
    	 }
    	 for(int i=0;i<size;i++)
    	 {
    			 if(b[i]==1)
    			 {
    			 count1++;
    			 }
    			 if(b[i]==0)
    			 {
    				 count++;
    			 }
    	
    		 
    	 }
    	 if(count==count1)
    	 {
    		 System.out.println(count+count1);
    	 }
    	 if(count<count1)
    	 {
    		 System.out.println(count+1);
    	 }
    	 if(count1<count)
    	 {
    		 System.out.println(count1+1);
    	 }
    	 a--;
     }
	}

}
