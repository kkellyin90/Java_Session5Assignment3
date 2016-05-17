package session5assignment3;
class squareRect{
	//polymorphism overloading
	
	// For rectangle will choose the method below
	int area(int length, int breadth){
		return length*breadth;
	}
	//for square will choose the method below
	int area(int side){
		return side*side;
	}
}

public class sess5Assign3 {

	public static void main(String[] args) {
		squareRect rect = new squareRect();//rectangle
		int result=rect.area(2,4);
		System.out.println("The area of rectangle is "+result);
		
		squareRect square = new squareRect();//square
		int result2=square.area(5);
		System.out.println("The area of square is "+result2);
	}

}
