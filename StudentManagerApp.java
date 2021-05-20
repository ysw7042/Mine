package xyz.itwill.util;

import java.util.Collections;
import java.util.List;

//�л����� ���� ���α׷�
public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		
		//�л������� �����Ͽ� �����ü�� �����ϴ� �޼ҵ� ȣ��
		manager.insertStudent(new Student(1000, "ȫ�浿"));
		manager.insertStudent(new Student(2000, "�Ӳ���"));
		manager.insertStudent(new Student(3000, "����ġ"));
		manager.insertStudent(new Student(4000, "������"));
		
		boolean result=manager.insertStudent(new Student(5000, "����"));
		if(result) {
			System.out.println("[�޼���]�л������� ���������� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println("[�޼���]�̹� ����� �й��� �л������̹Ƿ� ������� �ʾҽ��ϴ�.");
		}
		System.out.println("=============================================================");
		//�й��� [2000]�� �л������� �˻��Ͽ� ���
		Student searchStudent=manager.selectStudent(2000);
		if(searchStudent==null) {
			System.out.println("[�޼���]�ش� �й��� �л������� ã�� �� �����ϴ�.");
		} else {
			System.out.println(searchStudent);
		}
		System.out.println("=============================================================");
		//�й��� [2000]�� �л��� �̸��� [�Ӱ���]���� ����
		searchStudent.setName("�Ӱ���");
		if(manager.updateStudent(searchStudent)) {
			System.out.println("[�޼���]�л������� ���������� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println("[�޼���]������ �л������� ã�� �� �����ϴ�.");
		}
		System.out.println("=============================================================");
		//�й��� [4000]�� �л����� ����
		if(manager.deleteStudent(8000)) {
			System.out.println("[�޼���]�л������� ���������� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println("[�޼���]������ �л������� ã�� �� �����ϴ�.");
		}
		System.out.println("=============================================================");
		List<Student> studentList=manager.selectStudentList();
		
		for(Student student:studentList) {
			System.out.println(student);//toString() �޼ҵ� �ڵ� ȣ��
		}
		System.out.println("=============================================================");
		//List �ν��Ͻ��� ����� �л������� �����Ͽ� ���
		//Collections.sort(studentList);
		
		for(Student student:studentList) {
			System.out.println(student);//toString() �޼ҵ� �ڵ� ȣ��
		}
		System.out.println("=============================================================");
	}
}








