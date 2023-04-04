// find factorial and sum using inheritance 
package parent1;

public class Parent1 {

  int n ;
    Parent1(int nn){
        n = nn;
    }

    public int factorial(int a){
        int fact = 1;
        for(int i =a;i>=1;i--){
            fact*=i;
        }
        //System.out.println("factorial " +fact);
        return fact;
    }

    public void display(){
        System.out.println(n);
    }

    
}
