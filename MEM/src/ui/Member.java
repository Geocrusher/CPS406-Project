import java.util.*;

public class Member implements Comparable<Member> {

	private String userName;
	private String lastName;
	private String firstName;
	private String telephone;
	private String email;
	private String password;
	private int balance;
	private String permission;
	private int paid;
	private int notPaid;
	private int consecDiscount;

	public Member(String userN, String lN, String fN, String tele, String email, String pass, int bal, String perm, int paid, int notPaid, int consec) {
		setUserName(userN);
		setLastName(lN);
		setFirstName(fN);
		setTelephone(tele);
		setEmail(email);
		setPassword(pass);
		setBalance(bal);
		setPermission(perm);
		setPaid(paid);
		setNotPaid(notPaid);
		setConsecDiscount(consec);
	}
	
	public void setUserName(String userN) {
		userName = userN;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public void setFirstName(String fName) {
		firstName = fName;
	}

	public void setTelephone(String tele) {
		telephone = tele;
	}

	public void setEmail(String em) {
		email = em;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public void setBalance(int bal) {
		balance = bal;
	}
	
	public void setPermission(String perm) {
		permission = perm;
	}
	
	public void setPaid(int pay) {
		paid = pay;
	}
	
	public void setNotPaid(int nPay) {
		notPaid = nPay;
	}
	
	public void setConsecDiscount(int consec) {
		consecDiscount = consec;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getTelephone() {
		return telephone;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getPermission() {
		return permission;
	}
	
	public int getPaid() {
		return paid;
	}
	
	public int getNotPaid() {
		return notPaid;
	}
	
	public int getConsecDiscount() {
		return consecDiscount;
	}
	
	//payment status, attendance
	public int compareTo(Member other) {
		if ((getLastName() == other.getLastName())){
			return (getFirstName().compareTo(other.getFirstName()));
	}else{
		return (getLastName().compareTo(other.getLastName()));
		}
	}

	class compEmail implements Comparator<Member>{
		public int compare(Member firstPer, Member secondPer) {
			return firstPer.getEmail().compareTo(secondPer.getEmail());
		}
	}

	class compTele implements Comparator<Member>{
		public int compare(Member firstPer, Member secondPer){
			return (firstPer.getTelephone().compareTo(secondPer.getTelephone()));
		}
	}
}
