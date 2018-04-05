import java.util.*;

public class Member/* implements Comparable<Member>*/ {

	private String userName;
	private String password;
	private String lastName;
	private String firstName;
	private String telephone;
	private String email;
	private String permission;
	private Integer attendance;
	private Integer paid;
	private Integer notPaid;
	private int consecDiscount;
	private int balance;
	private ArrayList<String> classesAttended = new ArrayList<String>();

	public Member(String userN, String pass, String lN, String fN, String tele, String email, String perm, int bal, Integer paid, Integer notPaid, int consec, Integer attend) {
		setUserName(userN);
		setPassword(pass);
		setLastName(lN);
		setFirstName(fN);
		setTelephone(tele);
		setEmail(email);
		setPermission(perm);
		setBalance(bal);
		setPaid(paid);
		setNotPaid(notPaid);
		setConsecDiscount(consec);
		setAttendance(attend);
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
	
	public void addBalance(int bal) {
		balance += bal;
	}
	
	public void payBalance(int bal) {
		balance -= bal;
	}
	
	public void setPermission(String perm) {
		permission = perm;
	}
	
	public void setPaid(Integer pay) {
		paid = pay;
	}
	
	public void setNotPaid(Integer nPay) {
		notPaid = nPay;
	}
	
	public void setConsecDiscount(int consec) {
		consecDiscount = consec;
	}
	
	public void setAttendance(Integer attend) {
		attendance = attend;
	}
	
	public void classCounter(int numclass) {
		attendance += numclass;
	}
	
	public void classAttendance(String theClass){
		classesAttended.add(theClass);
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
	
	public Integer getPaid() {
		return paid;
	}
	
	public Integer getNotPaid() {
		return notPaid;
	}
	
	public int getConsecDiscount() {
		return consecDiscount;
	}
	
	public Integer getAttendance() {
		return attendance;
	}
	
	public boolean isComing(String theClass){
		for(String x: classesAttended){
			if(theClass.equals(x)){
				return true;
			}
		}
		return false;
	}
	
	//payment status, attendance
/*	
	public int compareTo(Member other) {
		if ((getLastName() == other.getLastName())){
			return (getFirstName().compareTo(other.getFirstName()));
	}else{
		return (getLastName().compareTo(other.getLastName()));
		}
	}

	class compPaid implements Comparator<Member>{
		public int compare(Member firstMem, Member secondMem) {
			return firstMem.getPaid().compareTo(secondMem.getPaid());
		}
	}

	class compNotPaid implements Comparator<Member>{
		public int compare(Member firstMem, Member secondMem){
			return (firstMem.getNotPaid().compareTo(secondMem.getNotPaid()));
		}
	}

	public class compAttendance implements Comparator<Member>{
		public int compare(Member firstMem, Member secondMem){
			return ((firstMem.getAttendance()).compareTo((secondMem.getAttendance())));
		}
	}
	*/
}
