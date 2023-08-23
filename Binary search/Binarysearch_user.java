
public class Binarysearch_user
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.print ("Enter the size of Array :");
    int size = sc.nextInt ();

    int[] arr = new int[size];
      System.out.println ("Enter elements");
    for (int i = 0; i < size; i++)
      {

	arr[i] = sc.nextInt ();
      }
    System.out.println ("Entered elemnets are :");
    for (int i = 0; i < arr.length; i++)
      {
	System.out.println(arr[i] + " ");
      }

    System.out.print("Enter Element you want to find =");
          int k=sc.nextInt();
        

     Binarysearch_user obj = new  Binarysearch_user ();

    int result = obj.findele (arr, k, size);
    if (result == -1)
      {
	System.out.print ("not found");
      }
    else
      {
	System.out.print ("Element found at index" + " " + result);
      }

  }



  public static int findele (int[]arr, int k, int size)
  {

    int li = 0;
    int hi = arr.length - 1;
    int mi = (li + hi) / 2;

    while (li <= hi)
      {

	for (int i = 0; i < arr.length; i++)
	  {

	    if (arr[mi] == k)
	      {

		return mi;
	      }

	    else if (arr[mi] > k)
	      {
		hi = mi - 1;
	      }

	    else
	      {
		li = mi + 1;
	      }

	    mi = (li + hi) / 2;
	  }


      }
    return -1;
  }


}
