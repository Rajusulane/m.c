#include<stdio.h>

int main()
{
int i=10;
float f=20;
int *ip;
float *fp;

ip=&i;
fp=&f;

printf("%d\n",i);
printf("%f\n",f);
printf("%d\n",&ip);
printf("%d\n",&fp);




}
