class Pattern3
{
public static void main(String []args)
{
//rows
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}

//print
for(int k=1;k<=i;k++)
{
System.out.print("*");
}

for(int m=2;m<=i;m++)
{
System.out.print("*");
}
System.out.println();
}
}
}