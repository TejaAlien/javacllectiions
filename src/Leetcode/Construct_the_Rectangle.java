package Leetcode;

import java.util.*;

public class Construct_the_Rectangle {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int area = st.nextInt();
        Construct_the_Rectangle c = new Construct_the_Rectangle();
        c.constructRectangle(area);

    }

    private int[] constructRectangle(int area) {
        int lenght = 0;
        int breadth=0;
        if(!(lenght==area || breadth==area) &&(lenght==1 || breadth==1) ){}
        Map<Integer, Integer> map = new HashMap<>();
        int divisor = area/2;
        int count =1;

        int[] lengh = new int[divisor];
        for(int i =1 ;i<divisor;i++){
            if(area%i==0){

                map.put(count,i);
                count++;

            }
        }
        for(Map.Entry<Integer,Integer> j : map.entrySet()){
            System.out.println("Key: "+j.getKey()+ " value: "+ j.getValue());
        }
Set<Map.Entry<Integer,Integer>> ss = map.entrySet();
        List<Map.Entry<Integer,Integer>> ld = new ArrayList<>(ss);
Object[] a = ld.stream().toArray();
for(Object sq :a){
    System.out.println(sq);
}
Collection<Integer> cs = map.values();
int[] q = cs.stream().mapToInt(d->d).toArray();
for(Integer w:q){
    System.out.println(w);
}
        return new int[]{0};
    }
}
