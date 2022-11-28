import java.util.*;

class ArrayMaxmin {
	public static void main( String[] args){

       int min,max;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int length=s.nextInt();
        int arr[]=new int[length];
        System.out.println("enter elements");
        for(int i=0;i<length;i++){//for reading array
            arr[i]=s.nextInt();
        }
		max=arr[0];
		min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
			System.out.println("Smallest elements :"   +min+ "\n" +  "Largest element :"   +max);
		
	}
}
