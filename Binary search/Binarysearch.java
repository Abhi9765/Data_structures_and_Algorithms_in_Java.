class Binarysearch {
    int binarysearch(int arr[],  int k) {
        // code here
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        //while loop for avoid error of index out fo bound
        while(li<=hi){
        for(int i=0;i<arr.length;i++){
            
          if(arr[mi]==k){
             return mi;
          }
          
           else if(arr[mi]<k){
              
              li=mi+1;
              
              
              }
            else{
               
               hi=mi-1;
           }   
           mi=(li+hi)/2;
        }
        if(li>hi){                     //That is for if elemnt not found and li cross the hi then loop will break and print this statement
            System.out.print("element not found");
        }
        
        }
   
    return -1;
    }
    
    public static void main(String[] args){
        
        
        int arr[]={1,2,3,4,5};
        int k=4;
        
        
        Binarysearch obj=new Binarysearch();
        int result=obj.binarysearch(arr,k);
        if(result== -1){
            System.out.print("element is not present");
        }
        else{
            System.out.print("Element present at"+" "+result);
        }
        
        
    }
}