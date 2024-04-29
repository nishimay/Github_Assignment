package prac;

public class student extends person {
public static final String R_BCA_2019 = "R/BCA-2019";
int [] marks;
private String address;
private String rollno;
private double CPI;
student(String name, String rollno, int [] marks)
{
super();
this.name = name;
this.rollno = rollno;
this.marks = marks;
}
String getName()
{
return name;
}
void display_results()
{
//compute average
char grade;
float avg = Computeavg();
//compute grade
grade = computeGrade(avg);
System.out.println("Result of " + name.toUpperCase());
System.out.println("Roll no is " + R_BCA_2019 + rollno);
System.out.println("Grade is " + grade);

}
public char computeGrade(float avg) {
	char grade;
	if(avg >80)
	grade = 'A';
	else if (avg >60 && avg <=80)
	grade = 'B';
	else if (avg >50 && avg <=60)
	grade = 'C';
	else if (avg >40 && avg <=50)
	grade = 'D';
	else
	grade = 'F';
	return grade;
}
public float Computeavg() {
	int sum=0;
	float avg=0;
	char grade;
	for (int i=0; i< marks.length;i++)
	sum+= marks[i];
	avg = sum/marks.length;
	return avg;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
int[] marks = {90,80,70,56,89};
student sue = new student("Anne Sue", "777", marks);
sue.display_results();
}
}