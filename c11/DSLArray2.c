#include<stdio.h>
void main()
{
    int a[100]={1,2,4,5,6,7,8,9},i,pos,num;
    printf("Enter an element");
    scanf("%d",&num);
    printf("Enter position");
    scanf("%d",&pos);
    for(i=8;i>=pos;i--)
    {
        a[i+1]=a[i];
    }
    a[pos]=num;
    for(i=0;i<9;i++)
        printf("%d ",a[i]);
}
