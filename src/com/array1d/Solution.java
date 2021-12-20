package com.array1d;

import java.util.Scanner;

public class Solution {
//n size of the array, m is the leap a is the array , i index , backmove
public static String check(int n, int m, int[] a, int i, int backMove){
        if(i < 0 || (i < n && a[i] == 1))
        return "NO";
        else if(i >= n)
        return "YES";
        else if(backMove < m && check(n, m, a, i + m, 0) == "YES")
        return "YES";
        else if(backMove == 0 && check(n, m, a, i + 1, 0) == "YES")
        return "YES";
        else if(check(n, m, a, i - 1, backMove + 1) == "YES")
        return "YES";
        return "NO";
        }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int j = 0; j < n; j ++)
        a[j] = sc.nextInt();
        System.out.println(check(n, m, a, 0, 0));
        }
        sc.close();
        }
        }