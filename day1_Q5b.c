#include<stdio.h>
void main()
{
    int d,m,y,c,m1,c1,y1,d1;
    printf("enter date dd//mm//yy");
    scanf("%d%d%d",&d,&m,&y);
    if(m==1)
        m1=1;
    else if(m==2)
        m1=4;
    else if(m==3)
        m1=4;
    else if(m==4)
        m1=0;
    else if(m==5)
        m1=2;
    else if(m==6)
        m1=5;
    else if(m==7)
        m1=0;
    else if(m==8)
        m1=3;
    else if(m==9)
        m1=6;
    else if(m==10)
        m1=1;
    else if(m=11)
        m1=4;
    else
        m1=6;
    if(y>=1500&&y<1600)
        y1=0;
    else if(y>=1600&&y<1700)
        y1=6;
    else if(y>=1700&&y<1800)
        y1=4;
    else if(y>=1800&&y<1900)
        y1=2;
    else if(y>=1900&&y<2000)
        y1=0;
    else if(y>=2000&&y<2100)
        y1=6;
    else
    {
        printf("enter year in between 1500 and 2100");
        exit(0);
    }
    c1=c%100;
    d1 =d+m1+c1+y1+(c1/4);
    d1=d1/7;
    if(d1==0)
        printf("saturday");
    else if(d1==1)
        printf("sunday");
    else if(d1==2)
        printf("monday");
    else if(d1==3)
        printf("tuesday");
    else if(d1==4)
        printf("wednesday");
    else if(d1==5)
        printf("thursday");
    else
        printf("friday");

}
