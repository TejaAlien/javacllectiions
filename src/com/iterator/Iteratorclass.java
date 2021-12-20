package com.iterator;/*
package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Iteratorclass {
static  Iterator myfunc(ArrayList List){
    Iterator itr = List.iterator();
    while(itr.hasNext()){
        Object element = itr.next();
        if(element instanceof Object){
            break;
        }

    }
    return itr;
}
    public static void main(String[] args) {
Scanner st = new Scanner(System.in);
int n = st.nextInt();
// ArrayList is a class which holds both int and string

ArrayList List = new ArrayList();
for(int i=0;i<n;i++){
    int k = st.nextInt();
    List.add(k);

}
String m = st.next();
int j = Integer.parseInt(m);

List.add("####");
for(int i=0; i<j;i++){

List.add(st.next());
}


System.out
        .println(List);
//System.out.println(stringList);
        Iterator itr = myfunc(List);
        while (itr.hasNext()){
            Object el = itr.next();
System.out.println((String)el);
        }
    }
}
*/
import java.util.*;
public class Iteratorclass
{
    static Iterator func(ArrayList mylist)
    {
        Iterator it=mylist.iterator();
        while(it.hasNext())
        {
            Object element = it.next();
            if(element instanceof String)//Hints: use instanceof operator
                break;
        }
        return it;

    }

    public static void main(String []argh)
    {
        ArrayList mylist = new ArrayList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            mylist.add(sc.nextInt());
        }
        mylist.add("###");
        for(int i=0;i<m;i++)
        {
            mylist.add(sc.next());
        }


        Iterator it=func(mylist);
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println((String)element);
        }

    }
}