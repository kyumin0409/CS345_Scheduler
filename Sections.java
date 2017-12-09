import java.time.*;

public class Sections {
	
	private String sectionNum;
	private LocalTime start;
	private LocalTime end;
	private boolean mon;
	private boolean tues;
	private boolean wed;
	private boolean thurs;
	private boolean fri;
	
	public Sections(String sectionNum, String time, boolean mon, boolean tues, boolean wed, boolean thurs, boolean fri) {
		this.sectionNum = sectionNum;
		String[] timeArr = time.split("\\s+");
		String[] startArr = timeArr[0].split(":");
		if(timeArr[1].equals("am")) {
			start = LocalTime.of(Integer.parseInt(startArr[0]), Integer.parseInt(startArr[1]));
		}else {
			start = LocalTime.of(Integer.parseInt(startArr[0])+12, Integer.parseInt(startArr[1]));
		}
		String[] endArr = timeArr[3].split(":");
		if(timeArr[5].equals("am")) {
			end = LocalTime.of(Integer.parseInt(endArr[0]), Integer.parseInt(endArr[1]));
		}else {
			end = LocalTime.of(Integer.parseInt(endArr[0]+12), Integer.parseInt(endArr[1]));
		}
		this.mon = mon;
		this.tues = tues;
		this.wed = wed;
		this.thurs = thurs;
		this.fri = fri;
	}
}
