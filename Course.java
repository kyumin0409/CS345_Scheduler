import java.util.ArrayList;

public class Course {

	private String subject;
	private int courseNum;
	private String courseName;
	private String catalog;
	private ArrayList<Sections> list; 
	
	public Course (String subject, int courseNum, String courseName, String catalog) {
		this.subject = subject;
		this.courseNum = courseNum;
		this.courseName = courseName;
		this.catalog = catalog;
		list = null;
		
	}
	
	public void addSections(ArrayList<Sections> sectionList) {
		list = sectionList;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getCourseNum() {
		return courseNum;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String catalog() {
		return catalog;
	}
	
	public ArrayList<Sections> getList(){
		return list;
	}
}
