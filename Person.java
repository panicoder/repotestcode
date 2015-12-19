import java.lang.reflect.Field;

public class Person {
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static void main(String... args) {
		Class<Person> clazz= Person.class;
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields)
			System.out.println(f.toString());
	}
}
