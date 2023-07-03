package java_programming;

public class TestArray {
	//hello world
	public void HelloWorld() {
		System.out.println("Hello World!");
		System.out.println("Eysir Ahamed");
		System.out.println("Sheikh Hasina University");
		System.out.println("Jamalpur");
	}
	//fun with array
	public void testArray() {
		//declation a array
	    //int a[] = new int[5];
	    //initialization
	    int a[] = {10,20,30,40,50};
	    //traversing a array
	    for(int i=0;i<a.length;i++){
	    	System.out.println(a[i]);
	    }
	    //average calculation
	    float sum=0,avg=0;
	    for(int i=0;i<a.length;i++){
	    	sum = sum + a[i];
	    }
	    avg = sum / a.length;
	    System.out.println("Sum is : "+sum);
	    System.out.println("Average is : "+avg);
	}
}
























