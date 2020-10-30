package varaibles;

public class Demo5 {

	String name;
	String subject;
	String topic;

	public Demo5(String name, String subject, String topic) {
		this.name = name;
		this.subject = subject;
		this.topic = topic;

	}

	public static void main(String[] args) {
		Demo5 d = new Demo5("bharani", "selenium", "locators");
		System.out.println(d.name);
		System.out.println(d.subject);
		System.out.println(d.topic);

	}

}
