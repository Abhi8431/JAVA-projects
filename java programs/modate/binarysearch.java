import java.util.*;
public class binarysearch {
	public static int bin(int a[],int f,int l,int key)
	{
		int mid=(f+l)/2;
		if(f<=l)
		{
			if(a[mid]<key)
			{
				bin(a,mid+1,l,key);
			}
			else if(a[mid]==key)
			{
				System.out.println("the element found at index"+mid);
			}
			else if(a[mid]>key)
			{
				bin(a,f,mid-1,key);
			}}
			return -1;
			
	}

	public static void main(String []args)
	{	int n;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the array size");
		n=ob.nextInt();
		int []a=new int[n];
		//Scanner ob=new Scanner(System.in);
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
		}
		int key;
		int last=a.length-1; 
		System.out.println("enter the key");
		key=ob.nextInt();
		bin(a,0,last,key);
	}
}
