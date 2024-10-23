#include <stdio.h>

int fibonacciVerification(int a, int b, int num) {
       if(num < b) {
              return 0;
       }
                  
       if(num == b) {
              return 1;
       }   
       
       return fibonacciVerification(b, a+b, num);
}

int main(){
       int num = 20;
       
       int res = fibonacciVerification(0, 1, num);
       if(res == 0) {
              printf("O numero %d nao se encontra na sequencia de Fibonacci", num);
       }
       else {
              printf("O numero %d se encontra na sequencia de Fibonacci", num);
       }
}
