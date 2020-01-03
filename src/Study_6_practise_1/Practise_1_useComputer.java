package Study_6_practise_1;

//模拟一个学生在机房内使用电脑的例子
/*
 * 1.先列出有多少个类
 * 2.再画出各个类之间的关系
 * 3.再具体每个类内部的调用方法和属性
 * 
 * 
 * 有一个机房
 * 有一个台电脑  电脑可以开关机，电脑的状态有被打开，被使用，被关闭
 * 有一个学生  使用电脑
 * 让学生进入机房  使用电脑
 * 扩展： 机房内放置5台电脑 让学生进入机房选择一台关闭的电脑使用，学生也有5个，陆续进入机房
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
