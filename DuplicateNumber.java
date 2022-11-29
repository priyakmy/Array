import java.util.*;

class DuplicateNumber{
   public static void main(String args[]){
	   
     Scanner s=new Scanner(System.in);
	 System.out.println("ENTER NUMBER OF ELEMENTS");
	  int length=s.nextInt();
	 
	 int arr[]=new int[length];
	 
       System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<length;i++){
            arr[i]=s.nextInt();
		}
		
        System.out.println("Duplicate elements in given array: ");  
          
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]); 
				 
   
			}
			 }
}
}
   
   