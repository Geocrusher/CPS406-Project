package ui;
import java.util.*;
import javax.swing.JFrame;
import java.awt.EventQueue;

public class main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame window = new LoginUI();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
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
	
	public void attended(Member mem, int numclass){
		mem.cameToClass(numclass);
	}
	
	public String viewMem(){
		for (Member x: membersList){
			return x.getFirstName() + " " + x.getLastName();
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
	
	*/
}
