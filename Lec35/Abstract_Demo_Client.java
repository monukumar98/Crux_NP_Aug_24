package Lec35;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		ab.Payment();
		Phone_Pe p = new Phone_Pe();
		Abstract_Demo p1 = new Phone_Pe();
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public void Payment() {
				// TODO Auto-generated method stub
				
			}
			
		};

	}

}
