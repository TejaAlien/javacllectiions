package prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Primenumbers {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int k = st.nextInt();

int l = k/2;
boolean flag = false;
for(int h=2; h<=l ;h++){

    if (k%l==0){
flag = true;
break;

    }}
if(!flag)
    System.out.println("It's a prime");
else
    System.out.println("It' not a prime");


    }
   }


