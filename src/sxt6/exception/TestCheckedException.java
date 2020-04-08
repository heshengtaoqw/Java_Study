package sxt6.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * ���в���RuntimeException���쳣��ͳ��ΪChecked Exception���ֱ���Ϊ���Ѽ���쳣����
 * ��IOException��SQLException���Լ��û��Զ����Exception�쳣�� �����쳣�ڱ���ʱ�ͱ����������������޷�ͨ�����롣��ͼ6-9��ʾ��
 * n-ͨ����finally�йرճ�����Ѵ򿪵���Դ�����磺�ر��ļ������ͷ����ݿ����ӵȡ�
 * 
 * ��������ִ�п��ܷ����쳣��try���顣���try���û�г����쳣��ִ���������finally����ִ��;���try�������쳣��
 * ���ж�ִ�в����ݷ������쳣����������Ӧ��catch����ִ�д���catch��������ж�����ֱ𲶻�ͬ���͵��쳣��
 * catch����ִ������������ִ��finally���顣finally����ǿ�ѡ�ģ�����еĻ����򲻹��Ƿ����쳣��finally��䶼�ᱻִ�С�
 * 
 * 1. ��ʹtry��catch���д���return��䣬finally���Ҳ��ִ�С�����ִ����finally������ͨ��return�˳���
   2. finally����ֻ��һ������ǲ���ִ�еģ��Ǿ�����ִ��finally֮ǰ������System.exit(0)�����������С�
   
   
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
	 * ���һ�������п��ܲ���ĳ���쳣�����ǲ�����ȷ����δ��������쳣����Ӧ�����쳣�淶�ڷ������ײ������÷��������׳����쳣��
      	���һ�������׳�����Ѽ���쳣���ͱ����ڷ������ײ��г����е��쳣��֮���Զ��Ÿ�����
	 * ������д�������쳣ԭ��������д���෽��ʱ��������෽���������쳣����ô�����������쳣��Χ���ܳ������������ķ�Χ��/
	 */
	public void test() throws Exception{
		InputStream is = new FileInputStream("D://text.txt");
	}
	
	
	public void test2() throws Exception{
		int num=3;
		if (num < 1 || num > 4) {
            throw new Exception("������1-4֮�䣡");
        }
		try {
			InputStream is = new FileInputStream("D://text.txt");
		}catch(Exception e) {
			throw new Exception("zidingyi");
		}
	}
}
