#include<stdio.h>
void main()
{
char a= 'E';
int i,j;
for(i=0;i<5;i++)
{
    for(j=0;j<i;j++)
    {
        printf("%c",a-i-j);
    }
    printf("\n");
}
}
