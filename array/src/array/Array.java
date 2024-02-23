package array;

public class Array {
 
 public static void main(String[] args) {
	 
	 /*
	 int arr[] = new int[5];
	 
	 arr[0]=23;
	 arr[1]=14;
	 arr[2]=224;
	 arr[3]=956;
	 arr[4]=231;
	
	 System.out.println(arr[4]);
	 
	 //Tradtional loop
	 
	 //for (int i =0 ; i<arr.length;i++)
	 //System.out.println(arr[i]);
	 
	 //enhanced for-loop
	 
//	 for (int ele : arr)
//		 System.out.println(ele);
	 
 }
	*/


//===========================array creation===================================

	 int arr[]= {1,2,3,4,5,8};
	 int[] arr1= {11,22,33,44,55,88};           //int[] arr this also works...
	 
	 for (int i: arr)
		 System.out.println(i);
	 
	 
	 for (int n: arr1)
		 System.out.println(n);
//-------------------------------float type array--------------------------------
	 
	 float[] temp1= new float[4];
	 float[] temp= {12.21f,41.23f,23.15f,42.36f,25.01f};
	 
	 for (float t:temp)
		 System.out.println(t);
		
	//-------------------------------char type array--------------------------------
	 
	 char chars[]= {'a',' ','#','!'};
	 for (char c:chars)
		 System.out.println(c);
	 
	//-------------------------------string type array--------------------------------
	 
		 String name[]= {"Nandan","Aniket","Vinay"};
		 for (String s:name)
			 System.out.println(s);
		 

	 
 }
}
	 