class Pattern2
{
public static void main(String []args)
{
int c=0;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
c+=j;
}
System.out.print(" "+c);
c=0;
System.out.println();
}
}
}

/*
1  2
1 2  3
1 2 3  6
1 2 3 4  10
1 2 3 4 5 15

*/