package xyz.itwill.util;

import java.util.ArrayList;
import java.util.List;

//�л������� ����(����,����,����,�˻�)�ϴ� ����� �����ϱ� ���� Ŭ���� 
// => BO(Business Object) Ŭ���� : Manager Ŭ����
public class StudnetManager {
	//�ټ��� �л������� �����ϱ� ���� �ݷ��� �ʵ�
	private List<Student> studentList;//�����ü(DataSource)
	
	public StudnetManager() {
		studentList=new ArrayList<Student>();//���԰���
	}
	
	//�й��� ���޹޾� �ݷ��� �ʵ忡 ����� ��Ҹ� �˻��Ͽ� ����� ��ġ��(÷��)�� ��ȯ�ϴ� �޼ҵ�
	// => �ش� �й��� �л������� �ݷ��� �ʵ忡 ����� ��Ұ� �ƴ� ��� -1 ��ȯ
	// => Ŭ���� ���ο����� �����Ͽ� ��� �����ϵ��� ����ȭ ó��
	private int getStudentIndex(int num) {
		int index=-1;
		
		//�ݷ��� �ʵ忡 ����� ��ҿ� ���� �ݺ� ó��
		for(int i=0;i<studentList.size();i++) {
			//�ݷ��� �ʵ忡 ����� ���(�л�����)�� �й��� ���޵� �й��� ���Ͽ� ���� ���
			if(studentList.get(i).getNum()==num) {
				index=i;//����� ÷�� ����
				break;
			}
		}

		return index;
	}
	
	//�л������� ���޹޾� �ݷ��� �ʵ��� ��ҷ� ����(�߰�)�ϰ� ���� ����� ��ȯ�ϴ� �޼ҵ�
	// => false : ������, true : ����
	// => ���޹��� �л������� �й��� �̹� �ݷ��� �ʵ忡 ����� ����� ��� ������� �ʵ��� ó��
	public boolean insertStudent(Student student) {
		if(getStudentIndex(student.getNum())!=-1) {//�ݷ��� �ʵ忡 ����� ����� ���
			return false;
		}
		studentList.add(student);
		return true;
	}
	
	//�л������� ���޹޾� �ݷ��� �ʵ��� ��Ҹ� �����ϰ� ���� ����� ��ȯ�ϴ� �޼ҵ�
	// => false : �̺���, true : ����
	// => ���޹��� �л������� �й��� �ݷ��� �ʵ忡 ����� ��Ұ� �ƴ� ��� ������� �ʵ��� ó��
	public boolean updateStudent(Student student) {
		int index=getStudentIndex(student.getNum());
		if(index==-1) {//�ݷ��� �ʵ忡 ����� ��Ұ� �ƴ� ���
			return false;
		}
		studentList.set(index, student);
		return true;
	}
	
	//�й��� ���޹޾� �ݷ��� �ʵ��� ��Ҹ� �����ϰ� ���� ����� ��ȯ�ϴ� �޼ҵ�
	// => false : �̻���, true : ����
	// => ���޹��� �й��� �ݷ��� �ʵ忡 ����� ��Ұ� �ƴ� ��� �������� �ʵ��� ó��
	public boolean deleteStudent(int num) {
		int index=getStudentIndex(num);
		if(index==-1) {
			return false;
		}
		studentList.remove(index);
		return true;
	}
	
	//�й��� ���޹޾� �ݷ��� �ʵ��� ��Ҹ� �˻��Ͽ� ��Ұ�(�л�����)�� ��ȯ�ϴ� �޼ҵ�
	// => ���޹��� �й��� �ݷ��� �ʵ忡 ����� ��Ұ� �ƴ� ��� null ��ȯ
	public Student selectStudent(int num) {
		int index=getStudentIndex(num);
		if(index==-1) {
			return null;
		}
		return studentList.get(index);
	}
	
	//�ݷ��� �ʵ忡 ����� ��� �л������� ��ȯ�ϴ� �޼ҵ�
	public List<Student> selectStudentList() {
		return studentList;
	}
}









