package listkovSubstitutionPrinciple;

public class SchoolStaff {
	
	private void makeAnnouncements() {
		System.out.println("made announcements..");
	}
	
	private void takeAttendence() {
		System.out.println("took attendence..");
	}
	
	private void collectPaperwork() {
		System.out.println("collected paperwork..");
	}
	
	private void conductHallwayDuties() {
		System.out.println("conducted hallway duties..");
	}
	
	public void performOtherResponsibilities() {
		makeAnnouncements();
		takeAttendence();
		collectPaperwork();
		conductHallwayDuties();
		performOtherResponsibilities();
	}

}
