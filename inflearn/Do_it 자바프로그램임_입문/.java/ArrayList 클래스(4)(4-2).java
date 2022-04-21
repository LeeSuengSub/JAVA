package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<subject>();
	}
	
	public void addSubject(String name, int score) {
		subject subject = new subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		for(subject subject : subjectList) {
			total+=subject.getScorePoint();
			System.out.println("학생 "+studentName+"님의 "+subject.getName()+" 과목의 성적은 "+subject.getScorePoint()+"점 입니다.");
		}
		System.out.println("학생 "+studentName+"님의 총점은 "+total+"점 입니다.");
	}
	
}
