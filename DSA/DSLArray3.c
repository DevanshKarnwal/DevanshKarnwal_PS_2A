#include<stdio.h>
void main()
{
    int a[100],j,n,i,num,temp;
    printf("Enter number of terms");
    scanf("%d",&n);
    printf("Enter terms");
    for(i=0;i<n;i++)
    {
    scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
    }
    printf("the sorted array is \n");
    for(i=0;i<n;i++)
    {
        printf("%d  ",a[i]);
    }
    printf("\nEnter element to insert ");
    scanf("%d",&num);
    a[n]=num;
    for(i=0;i<n+1;i++)
    {
        for(j=i+1;j<n+1;j++)
        {
            if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
    }
    for(i=0;i<n+1;i++)
        printf("%d  ",a[i]);
}
