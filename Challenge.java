import java.util.Scanner;  
class Challenge{  
  
 public static void main(String args[]){  
  
         Scanner sc = new Scanner(System.in) ; 
  
         System.out.print("Enter String: "); 
         String str = sc.nextLine();  
         //Start
         ///{ Write your code here    
             int math = 0;
         for(int counter = 0; counter < str.length(); counter++)
         {
             int num = Integer.parseInt(str.substring(counter,counter+1));
             if ((num == 2) || (num == 3) || (num == 7))
             {
                 math += num;
                 System.out.println(num);
                }
             if ((num % 2 != 0 && num %3 != 0 && num%7 != 0) && (num != 1))
             {
                 math += num;
                 System.out.println(num);
                }
            }
         
         
         
         
         
        
        
        
        
        
        ///} 
           
        
         

           
        System.out.println ("Number of a's: " + math);   
        // End    
}  
  
}  