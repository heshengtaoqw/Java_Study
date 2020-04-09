package sxt6.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 所有不是RuntimeException的异常，统称为Checked Exception，又被称为“已检查异常”，
 * 如IOException、SQLException等以及用户自定义的Exception异常。 这类异常在编译时就必须做出处理，否则无法通过编译。如图6-9所示。
 * n-通常在finally中关闭程序块已打开的资源，比如：关闭文件流、释放数据库连接等。
 * 
 * 程序首先执行可能发生异常的try语句块。如果try语句没有出现异常则执行完后跳至finally语句块执行;如果try语句出现异常，
 * 则中断执行并根据发生的异常类型跳至相应的catch语句块执行处理。catch语句块可以有多个，分别捕获不同类型的异常。
 * catch语句块执行完后程序会继续执行finally语句块。finally语句是可选的，如果有的话，则不管是否发生异常，finally语句都会被执行。
 * 
 * 1. 即使try和catch块中存在return语句，finally语句也会执行。是在执行完finally语句后再通过return退出。
   2. finally语句块只有一种情况是不会执行的，那就是在执行finally之前遇到了System.exit(0)结束程序运行。
   
   
*/

public class TestCheckedException {
	public static void main(String[] args) throws Exception {
		try {
		InputStream is = new FileInputStream("D://text.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("final");
		}
		
		TestCheckedException tce = new TestCheckedException();
		tce.test2();
	}
	
	/*
	 * 如果一个方法中可能产生某种异常，但是并不能确定如何处理这种异常，则应根据异常规范在方法的首部声明该方法可能抛出的异常。
      	如果一个方法抛出多个已检查异常，就必须在方法的首部列出所有的异常，之间以逗号隔开。
	 * 方法重写中声明异常原则：子类重写父类方法时，如果父类方法有声明异常，那么子类声明的异常范围不能超过父类声明的范围。/
	 */
	public void test() throws Exception{
		InputStream is = new FileInputStream("D://text.txt");
	}
	
	
	public void test2() throws Exception{
		int num=3;
		if (num < 1 || num > 4) {
            throw new Exception("必须在1-4之间！");
        }
		try {
			InputStream is = new FileInputStream("D://text.txt");
		}catch(Exception e) {
			throw new Exception("zidingyi");
		}
	}
}
