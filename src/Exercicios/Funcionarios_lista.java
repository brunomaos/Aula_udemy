package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.print.DocFlavor;


public class Funcionarios_lista {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creat new list of employee
        List<Attributes> list_funcioario = new ArrayList<>(); 
        
        int help = input.nextInt();
        
        for(int i =0 ; i< help ; ++i){
            System.out.println("Enter for a name employee?");
            String name = input.next();
            System.out.println("Enter for a id employee?");
            int id = input.nextInt();
            System.out.println("Whats the salary of employee in money?");
            double salario = input.nextDouble();
            list_funcioario.add(new Attributes(name, id, salario));
        }
        System.out.println("Enter in id of employee for upgrade of salary; ");
        int upForId = input.nextInt();
        
        for(Attributes x : list_funcioario){
            if(x.id == upForId){
                x.upgradeSalary(x.salario);
            }else;
        }
        for(Attributes x : list_funcioario){
            System.out.println(x);
        }
    }
}
