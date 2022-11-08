
public class Letters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		for(int i=0;i<n;i++)
		{
			//Printing Alphabet 'A'
			for(int j=0;j<n;j++)
			{
				if ((i==0 && j>0 && j!=n-1) || (j==0 && i!=0) || (i!=0 && j==n-1) || i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			//Printing Alphabet B
			for(int j=0;j<n;j++)
			{
				if((i==0 && j<n/2) || (j==0) || (j==n/2 && i!=n/2 && i!=0 && i!=n-1) || (i==n/2 && j<=n/2-1) || (i==n-1 && j<n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet C
			for(int j=0;j<n;j++)
			{
				if ( (i==0 && j!=0 && j<=n/2) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=0 && j<=n/2))
				{
				System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet D
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j<n/2) || (j==n/2 && i!=0 && i!=n-1) || (i==n-1 && j<n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			//Printing Alphabet E
			for(int j=0;j<n;j++)
			{
				if((i==0 && j<n-1) || (i==n/2&&j<n-1) || (i==n-1 && j<n-1) || j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet F
			for(int j=0;j<n;j++)
			{
				if((i==0 && j<=n/2) || j==0 || (i==n/2 && j<=n/2-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet G
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<(3*n)/4)|| (j==0 && i>0 && i<(n-1)) || (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*n)/4)|| (j==(3*n)/4 && i>=(n-1)/2)|| (i==n-1 && j<(n-1)/2) || (j==(n-1)/2 && i>=(n-1)/2))
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			//Printing Alphabet H
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==n/2 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet I
			for(int j=0;j<n;j++)
			{
				if(j==n/2 || (i==0 && j>=n/2-2 &&  j<=n/2+2) || (i==n-1 && j>=n/2-2 && j<=n/2+2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet J
			for(int j=0;j<n;j++)
			{
				if(j==n/2 || (i==0 && j==n/2-1 && i!=n-1) || (i==n-1 && j>=0 && j<n/2) || (j==0 && i>=n-3) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet K
			for(int j=0;j<n;j++)
			{
				if(j==0 || i+j==n/2 || i-j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet L
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==n-1 && j<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet M
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==n && j>n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet N
			for(int j=0;j<n;j++)
			{
				if(j==0 || j== n-1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet O
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>=n/2-2 && j<=n/2+2) || (i==n-1 && j>=n/2-2 && j<=n/2+2) || (j==n/2-3 && i!=0 && i!=n-1) || (j==n/2+3 && i!=n-1 && i!=0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			///Printing Alphabet P
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j<n/2) || (j==n/2 && i!=0 && i<n/2) || (i==n/2 && j<n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet Q
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>=n/2-2 && j<=n/2+2) || (i==n-1 && j>=n/2-2 && j<=n/2+2) || (j==n/2-3 && i!=0 && i!=n-1) || (j==n/2+3 && i!=n-1 && i!=0)|| (i>=n-3 && j>=n-3 && i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet R
			for(int j=0;j<n;j++)
			{
				if((j==0 && i!=0) || (i==0 && j<n/2 && j!=0) || (j==n/2 && i!=0 && i<=n/2) || (i==n/2 && j<n/2) || (i>n/2 && i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet S
			for(int j=0;j<n;j++)
			{
				if ( (i==0 && j!=0 && j<n/2) || (i==1 && j==n/2 ) || (i<n/2 && i!=0 && j==0) || (i==n/2 && j<n/2) || (j==n/2 && i>n/2 && i!=n-1) || (i==n-1 && j<n/2) || (i==n-2 && j==0))
				{
				System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet T
			for(int j=0;j<n;j++)
			{
				if(j==n/2 || (i==0 && j>=n/2-3 &&  j<=n/2+3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//Printing Alphabet U
			for(int j=0;j<n;j++)
			{
				if ((j==0 && i<n-1) || (j==n-1 && i<n-1) || (i==n-1 && j!=0 && j!=n-1))
				{
				System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
	}

}
