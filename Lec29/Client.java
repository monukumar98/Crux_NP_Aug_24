package Lec29;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 1. case
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
//		// 2. case
//		P obj = new C();
//		System.out.println(obj.d);// 1
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) obj).d2);// 20
//		System.out.println(((C) obj).d);// 2
//		obj.fun();//C
//		obj.fun1();
//		((C) obj).fun2();
//		// 3. case
//		C obj = new P();
//		System.out.println(obj.d);// 1
//		System.out.println(obj.d1);// 10
//		System.out.println(((C) obj).d2);// 20
//		System.out.println(((C) obj).d);// 2
//		obj.fun();// C
//		obj.fun1();
//		obj.fun2();
		// 4. case
		C obj = new C();
		System.out.println(obj.d);// 1
		System.out.println(obj.d1);// 10
		System.out.println(obj.d2);// 20
		System.out.println(((P) obj).d);// 2
		((P) obj).fun();// C
		obj.fun();// C
		obj.fun1();
		obj.fun2();
		System.out.println(obj);
	}

}
