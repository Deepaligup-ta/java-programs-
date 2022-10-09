import java.io.*;
import java.util.Scanner;
class ComplexNumber{
    int real,image;
    public ComplexNumber(int r,int i){
        this.real=r;
        this.image=i;
    }
    public void ShowC(){
        System.out.println(this.real+"+i"+this,image);
        
    }
    public void ComplexNUmber add(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res=new ComplexNumber(0,0);
        res.real=n1.real+n2.real;
        res.image=n1.image+n2.image;
        return res;
    }
    public static void main(String[]args){
        ComplexNUmber c1=new ComplexNumber(3,4);
        ComplexNUmber c2=new ComplexNumber(4,4);
        System.out.println("first complex number is:");
        c1.ShowC();
        System.out.println("second complex number is:");
        c2.ShowC();
        ComplexNumber res=add(c1,c2);
          System.out.println("\nAddition is :");
        res.showC();
        
        
    }
}
