package project1;
import java.util.Scanner;
public class LinearBinarySearch
{
	int i,j,size,search;
	Scanner s=new Scanner(System.in);
	int arr[]=new  int[100];
public 	LinearBinarySearch() 
{
	
	System.out.println("enter size   value");
	size=s.nextInt();
	System.out.println("enter "+size+"  value");
	for( i=0;i<size;i++)
	{
	arr[i]=s.nextInt();
	}
    for(int i=0;i<size;i++)
		{
System.out.print(arr[i]+"\t");
}
	}
	
	
public void linear(int search)
{int flag=0;
	for(i=0;i<size;i++)
 
    {
		if(search==arr[i])
		{
		flag++;
		}
		}
	if(flag>1)
		System.out.println("fre  :"+flag);
		else
		System.out.println("is not present");  
}

public int  binary(int search)
{
	
  int l=0,r=size,mid=-1;
  for(i=l;i<r;i++)
    {
	  mid=(l+r)/2;
	  if(search==arr[mid])
	  {
		  return mid;
	  }
	  else if(search>arr[mid])
		  {
		  l=mid+1;
		  }
	   else 
	   {
	   r=mid-1;
	      }
    }

return mid;

}

public void viewoOptions()
{ int opt;
System.out.println("1.lineary search");
System.out.println("2.binary search");
do
{
System.out.println("enter opt 1-2");
opt=s.nextInt();
if(opt==1)
{ 	System.out.println("enter search element");
    search=s.nextInt();
	linear(search);
	
	}
if(opt==2)
{ 	System.out.println("enter search element");
    search=s.nextInt();
    binary(search);
    int index=binary(search);
	System.out.println(index);
	}
}while(opt!=0);
}
	

	public static void main(String[] args) 
	{
		LinearBinarySearch obj=new LinearBinarySearch();
		obj.viewoOptions();
		

	}

}
