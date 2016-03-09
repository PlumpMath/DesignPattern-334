package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {

		Employee original = new Employee(101, "Dhawal");
		System.out.println("Original: " + original);
		Employee protoType = null;
		try {
			protoType = (Employee) original.clone();
			protoType.setEmpName("Mr. " + protoType.getEmpName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Original: " + original);
		System.out.println("Prototype: " + protoType);
	}

}
