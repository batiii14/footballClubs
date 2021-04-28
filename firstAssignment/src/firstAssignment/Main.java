package firstAssignment;

public class Main {

	public static void main(String[] args) {
		
		Team club1 = new Team("ÝSTANBUL","BEÞÝKTAÞ","ÇARÞI",1);
		
		Team club2 = new Team("ADANA","ADANADEMÝRSPOR","MAVÝ ÞÝMÞEKLER",2);
		
		Team club3 = new Team("ESKÝÞEHÝR","ESKÝÞEHÝRSPOR","NEFER",3);
		
		Team club4 = new Team("ÝSTANBUL","FENERBAHÇE","SARI KANARYA",4);
		
		
		Category category1 = new Category();
		category1.id = 10;
		category1.name = "Süper Lig";
				
		Category category2 = new Category();
		category2.id = 11;
		category2.name = "1. Lig";		
		
		TeamManager teamManager = new TeamManager();
		teamManager.showMeinfo(club1,category1);
		teamManager.showMeinfo(club2,category2);
		teamManager.showMeinfo(club3,category2);
		teamManager.showMeinfo(club4,category1);
				

	}

}