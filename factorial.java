import java.util.*;
public class factorial{
    
public static void main(String[] args){
    int num=-1;
    fact(num);
}
public static void fact(int num){
    int i,fact=1;
    if (num > 0){
    for(i=1;i<=num;i++){
        fact*=i;
    }
    System.out.print(fact);
   }
   else if(num==0){
    System.out.print(1);
   }
   else{
    System.out.print("NOT valid");
   }
}

}