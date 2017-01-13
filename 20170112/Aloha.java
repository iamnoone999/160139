public class Aloha{
	public static void main(String[] args) {
Alohaman am= new Alohaman();
  am.sayAloha();

	}
}
class Alohaman{
	private String msg;
	private String msg2;
	public Alohaman(){
		this.msg="aloha";
		this.msg2="ALOHA";

	}
	public void sayAloha(){
		System.out.println(this.msg);
	}
}


