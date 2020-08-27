package Exercicios;
    
public class Attributes {
    //class será usada para fazer os exercicios de List.
    public String name;
    public Integer id;
    public Double salario;
    
    public Attributes(String name , int id , double salario){
        this.name = name;
        this.id = id;
        this.salario = salario;
    }
    
    public String toString(){
        return "--------------------\n" 
                +"Employee :" + this.name
                + ", Id: " + this.id 
                +", Salary: " + this.salario;
    }
    
    public double upgradeSalary(double salario){
        this.salario += (salario * 10) / 100; 
        return this.salario;
    }
}
