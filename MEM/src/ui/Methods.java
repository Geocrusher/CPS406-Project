import java.util.*;

public class Methods {
	
	ArrayList<Member> membersList = new ArrayList<Member>();
			
	public void addMem(String userName, String password,  String lastName, String firstName, String tele, String email, String perm){
		Member member = new Member(userName, password, lastName, firstName, tele, email, perm, 0, 0, 0, 0, 0);
		membersList.add(member);
	}
	
	public void remMem(String lastName, String firstName){
		membersList.remove(findMember(lastName, firstName));
	}	
	
	public void remMem(String userName){
		membersList.remove(findMember(userName));
	}
	
	public Member findMember(String lastName, String firstName){
		for (Member x : membersList) {
			if ((x.getLastName().equals(lastName))&&(x.getFirstName().equals(firstName)))
				return x;
		}
		return null;
	}
	
	public Member findMember(String userName){
		for (Member x : membersList) {
			if (x.getUserName().equals(userName)){
				return x;
			}
		}
		return null;
	}
	
	public void addBal(Member mem, int bal){
		mem.addBalance(bal);
	}
	
	public void payBal(Member mem, int bal){
		mem.payBalance(bal);
	}
	
	public void attendedClass(Member mem, int numclass, String theClass){
		mem.classCounter(numclass);
		mem.classAttendance(theClass);
	}
	
	public String viewMem(){
		for (Member x: membersList){
			return x.getFirstName() + " " + x.getLastName() + " " + x.getBalance();
		}
		return null;
	}
	
	public void sortAttendance(){
		Collections.sort(membersList, new Comparator<Member>() {
			public int compare(Member firstMem, Member secondMem){
				return ((firstMem.getAttendance()).compareTo((secondMem.getAttendance())));
			}
		});
	}
	
	public void sortPaid(){
		Collections.sort(membersList, new Comparator<Member>() {
			public int compare(Member firstMem, Member secondMem){
				return firstMem.getPaid().compareTo(secondMem.getPaid());
			}
		});
	}

	public void sortNotPaid(){
		Collections.sort(membersList, new Comparator<Member>() {
			public int compare(Member firstMem, Member secondMem){
				return (firstMem.getNotPaid().compareTo(secondMem.getNotPaid()));
			}
		});
	}
	
	public void multipleMissedPay(Member mem){
		if (mem.getNotPaid() != 0){
			mem.addBalance(10);
			//SEND MESSAGE TO PAY
		}
	}
	
	public void consecDiscount(Member mem){
		if (mem.getConsecDiscount() > 3){
			mem.payBalance(5);
			//SEND MESSAGE 10% OFF RECEIVED FOR NEXT CLASS PURCHASED
		}
	}
	
	public Member whoIsAttendning(String currentClass){
		for (Member x : membersList) {
			if (x.isComing(currentClass))
				return x;
		}
		return null;
	}
	
}
