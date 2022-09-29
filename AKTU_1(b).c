//  DEVANSH KARNWAL
//  2100320130064
#include<stdio.h>
void main()
{
    int n,a[100],max,i;
    printf("enter number of terms ");
    scanf("%d",&n);
    printf("enter values ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    max = a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
            max = a[i];
    }
    printf("\nthe max value is %d",max);
}
