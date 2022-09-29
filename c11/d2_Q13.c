#include<stdio.h>
void main()
{
    int n,s;
    printf("enter a number");
    scanf("%d",&n);
    s=n;
    while(n>0)
    {
        printf("%d ",n);
        n=n-5;
    }
    while(n<=s)
    {
                printf("%d ",n);
                n=n+5;
    }
}
