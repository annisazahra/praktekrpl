import java.util.Scanner;
public class binsearch
{
	public static void main(String[]args)
	{
	int a,s;
	Scanner scan=new Scanner(System.in);
	System.out.printf("Masukan jumlah angka yang akan dimasukan : ");
	int jml=scan.nextInt();
	int n[]=new int[jml];
	for(int i=0; i<n.length; i++)
	{
		System.out.printf("Angka ke-"+(i+1)+" : ");
		n[i]=scan.nextInt();
	}
	
	for(int i=0;i<n.length;i++)
		{
			for(int z=i+1;z<n.length;z++)
			{
				if(n[z]<n[i])
				{
					s=n[z];
					n[z]=n[i];
					n[i]=s;
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Data yang sudah tersusun : ");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(" ");
		}
	
	for(int i=0; i<n.length; i++)
	{
		System.out.print(" " +n[i]);
	}
	System.out.println("\n");
	System.out.print("Masukkan Nilai Yang Ingin Dicari: ");
	a=scan.nextInt();
	System.out.println("n:"+search(n,a));
	}	
	
	public static String search(int[]n, int x)
	{
		int lo=0;
		int hi=n.length;
		while(lo<hi)
		{
			int i=(lo+hi)/2;
			if(n[i]==x)
			{
				return "bilangan" +x+ "ada pada indeks ke ["+i+"]";
			}
			else if(n[i]<x)
			{
				lo=i+1;
			}
			else 
			{
				hi=1;
			}
		}
		return "bilangan" +x+ "tidak ada pada array" ;
	}
}
		