#include <iostream>
#include <conio.h>
main()
{
	int N;
   cout<<"masukan angka : ";
   cin>>N;
   if(N>75)
		{
      	N=N-25;
   	}
   else
   	{
      	if(N>50)
         	{
      			N=N-10;
            }
         N=N+20;
      }
   cout<<N<<endl;
getch();
}