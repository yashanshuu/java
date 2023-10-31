package inheritance2;

public class faculty extends person {
	private int exp;
	private String sme;
	public faculty(String fn,String ln,int exp, String sme) {
		super(fn,ln);
		//System.out.println("In Faculty's Constructor");
		this.exp=exp;
		this.sme=sme;	
	}
	@Override
	public String toString() {
		return "faculty details:" + super.toString() + " " + this.exp+" "+ this.sme;
	}
	public void teach() {
		System.out.println(super.getFirstName() + super.getLastName() + "training for" + exp + "in" + sme);
	}
}
