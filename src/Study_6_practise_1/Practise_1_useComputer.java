package Study_6_practise_1;

//ģ��һ��ѧ���ڻ�����ʹ�õ��Ե�����
/*
 * 1.���г��ж��ٸ���
 * 2.�ٻ���������֮��Ĺ�ϵ
 * 3.�پ���ÿ�����ڲ��ĵ��÷���������
 * 
 * 
 * ��һ������
 * ��һ��̨����  ���Կ��Կ��ػ������Ե�״̬�б��򿪣���ʹ�ã����ر�
 * ��һ��ѧ��  ʹ�õ���
 * ��ѧ���������  ʹ�õ���
 * ��չ�� �����ڷ���5̨���� ��ѧ���������ѡ��һ̨�رյĵ���ʹ�ã�ѧ��Ҳ��5����½���������
 */

public class Practise_1_useComputer {
	
	public static void main(String[] args) {
		ComputerRoom room = new ComputerRoom();
		Student student1 = new Student("xiaoming",12);
		room.studentIn(student1);
		Student student2 = new Student("xiaozhao",12);
		room.studentIn(student2);
		Student student3 = new Student("xiaoliu",12);
		room.studentIn(student3);
		Student student4 = new Student("xiaoli",12);
		room.studentIn(student4);
	}
	
}
