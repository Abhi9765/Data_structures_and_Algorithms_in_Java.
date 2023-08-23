import javax.swing.text.html.parser.Element;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = { 23, 54, 56, 87, 32, 67, };

        int key = 87;
       
               System.out.println(result(arr, key));
        

    }
// function which travarse the elment through fro loop
    public static int result(int[] arr, int key) {

    
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

             return i;

            }
        
           
        }
        return key;
    

    }

}