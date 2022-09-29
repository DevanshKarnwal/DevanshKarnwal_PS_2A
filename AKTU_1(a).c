//  DEVANSH KARNWAL
//  2100320130064
#include<stdio.h>
void main()
{
    int s[100],n,i,m,avg;
    printf("enter number of students");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&s[i]);
        m=m+s[i];
    }
    avg = m/n;
    printf("the average is %d",avg);
}
