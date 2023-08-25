import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arraylistmenu
{
  public static void main (String[]args)
  {
 ArrayList<Integer>list=new ArrayList<>();
 
 Scanner sc=new Scanner(System.in);
 
 while(true){
 display();
  System.out.print("your choice:");
 int choice=sc.nextInt();
 
 
 if(choice==1){
     //add
     System.out.print("Enter your input:");
     list.add(sc.nextInt());
     System.out.println("Added");
     
 }else if(choice==2){
     //remove
     System.out.println("Enter your input");
    int eletoremove=sc.nextInt();
    
    if(list.contains(eletoremove)){
        list.remove(Integer.valueOf(eletoremove));
        
    }else{
        System.out.println("Element not found");
    }
 }
 else if(choice==3){
     
     System.out.println(list);
 }
 else if(choice==4){
     System.out.print("Thank you");
     break;
 }
    
}
}

public static void display(){
    
    
    System.out.println("1.Add");
    System.out.println("2.Remove");
    System.out.println("3.Display");
    System.out.println("4.Exit");
     System.out.println("");

    
}
}
     

    
    
    
    






