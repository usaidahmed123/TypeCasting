package com.TypeCast;





class X {                         //Super   class
	
	public void Method2() {
		
	}
}


class Y extends  X {             //sub   class
	
	public void method1() {
		
	}
	
	
	public void method2() {
		
		
	}
	
	
	
}




public class TypeCasting {
	
	
	
	Object obj;
	public Object getObject() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		
		
		X x = new Y();   //UpCasting
		
		Y y = (Y)x;
		
		
		x.Method2();
		
		y.method1();
		
		System.out.println(x);
		
	}

}
