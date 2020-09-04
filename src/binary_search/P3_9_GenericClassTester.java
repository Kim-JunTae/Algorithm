package binary_search;

public class P3_9_GenericClassTester {

	static class GenericClass<T>{
		private T xyz;
		
		GenericClass(T t){
			this.xyz = t;
		}
		
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		//파라미터에 String, Integer 등을 넘길 수 있다.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
