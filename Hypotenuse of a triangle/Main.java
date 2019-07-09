#include<stdio.h>
#include<math.h>
int main()
{
  float p,r;
  scanf("%f%f",&p,&r);
  float h = hypot(p,r);
  printf("%.2f",h);               
                 
  return 0;
}