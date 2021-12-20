package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Solutionproduct {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Apple","SC8965",987.7f));
        list.add(new Product("Dell", "AHBD793",453f));
        list.add(new Product("LG","FJR674",567f));
        list.add(new Product("Blackberry","FGS454",343f));
      //  list.stream().filter(product -> product.productPrice>455f).forEach(product -> System.out.println(product));
        //here filter is using the predicate function to check whether the productprice>455 exist or not true or false
        //we can get Product{productName='Apple', productId='SC8965', productPrice=987.7}
        //Product{productName='LG', productId='FJR674', productPrice=567.0}
        //if we change the condition product.price>1000f we can get null
       // list.stream().filter(product -> product.productName.equals("Blackberry")).forEach(product -> System.out.println(product.productId));
     Product maxproductprice = list.stream().max((p1, p2)->p1.productPrice> p2.productPrice?1:-1).get();
        System.out.println(maxproductprice.productPrice);
        // to calculate the min

       Product minproductprice =list.stream().min((p1,p2)->p1.productPrice>p2.productPrice?1:-1).get();
       System.out.println(minproductprice);
       List<Float> lss= list.stream().filter(product -> product.productPrice>330f).map(product -> product.productPrice).collect(Collectors.toList());
       System.out.println(lss
       );
       // filter to filter the productprice>330f and map to retrieve thre productprices and to list to store the prices in alist array

    }
    //keynotes: Astream consists of source(group of elements)followed by zero or more intermediate operations and terminal operations

    //Intermediate operations are filter, sort and map
    //terminal operations are foreach,collect(for retrieving )

}
