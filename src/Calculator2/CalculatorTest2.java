package Calculator2;

public class CalculatorTest2 {
    public static void main(String[] args) { 
        //Instantiate a Calculator2 object
 Calculator2 calc = new Calculator2();       
        
        //Acesse os campos e métodos do objeto Calculator2
        //para encontrar o total de cada membro da festa de aniversário
         
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
    calc.originalPrice = 10.00;
        System.out.println("pessoa1: $");
        calc.findTotal();
        
    calc.originalPrice = 12.00;
        System.out.print("pessoa2: $");
        calc.findTotal();
        
        calc.originalPrice = 9.00;
        System.out.print("pessoa3: $");
        calc.findTotal();
        
        calc.originalPrice = 8.00;
        System.out.print("pessoa4: $");
        calc.findTotal();
        
        calc.originalPrice = 7.00;
        System.out.print("pessoa5: $");
        calc.findTotal();
        
        calc.originalPrice = 15.00;
        System.out.print("pessoa6: $");
        calc.findTotal();
        
        calc.originalPrice = 11.00;
        System.out.print("pessoa7: $");
        calc.findTotal();
        
        calc.originalPrice = 30.00;
        System.out.print("pessoa8: $");
        calc.findTotal();    
    }

   }
