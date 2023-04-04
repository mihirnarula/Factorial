package parent1;

import java.util.Scanner;

public class Child1 extends Parent1 {
    int sum ;
    public static void main(String args[]){
        
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Child1 ob = new Child1(num);
        ob.calsum();
        ob.display();
    }

    Child1(int nn ){
        super(nn);
    }

    public void calsum(){
        for(int i = 1;i<=n;i++){
            sum += factorial(i);
        }

    }

    public void display(){
        System.out.println("n: "+n);
        System.out.println("factorial: "+ factorial(n));
        System.out.println("sum: "+sum);
    }

}
