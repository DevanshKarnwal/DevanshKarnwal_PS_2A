#include<stdio.h>
void main()
{
    int A[100],B[100],C[100],a1,b1,c1,i,j,z=0,found=0;
    printf("Devansh Karnwal\n");
    printf("Enter size of set A");
    scanf("%d",&a1);
    printf("Enter size of set B");
    scanf("%d",&b1);
    printf("Enter elements of set A  ");
    for(i=0;i<a1;i++)
    {
        scanf("%d",&A[i]);
    }
    printf("Enter elements of set B  ");
    for(i=0;i<b1;i++)
    {
        scanf("%d",&B[i]);
    }
    for(i=0;i<a1;i++)
    {

        for(j=0;j<b1;j++)
        {
            if(A[i]==B[j])
                found=1;
        }
        if(found==0)
        {
            C[z]=A[i];
            z++;
        }
        found=0;
    }
    printf("new elements are ");
     for(i=0;i<z;i++)
        {
            printf("%d ",C[i]);
        }
}
