package sxt8.commonObject;

import java.io.File;
import java.io.IOException;
import java.util.Date;



public class CommonFile {
	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("usr.dir"));
		File f1 = new File("a.txt");
		f1.createNewFile();
		File f2 = new File("d:/b.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(new Date(f2.lastModified()));
		f2.delete();
		
		File f3 = new File("d:/��Ӱ/����/��½");
		boolean flag = f3.mkdir(); //Ŀ¼�ṹ����һ�������ڣ��򲻻ᴴ������Ŀ¼��
        System.out.println(flag);//����ʧ��
    	boolean flag1 = f3.mkdirs(); //Ŀ¼�ṹ����һ��������Ҳû��ϵ����������Ŀ¼��
        System.out.println(flag1);//�����ɹ�
        
	}
	
	public void createFile() {
		 File file = new File("d:/sxt/b.txt");
	        //�жϸ��ļ��Ƿ����
	        boolean flag= file.exists();
	        //������ھ�ɾ������������ھʹ���
	        if(flag){
	            //ɾ��
	            boolean flagd = file.delete();
	            if(flagd){
	                System.out.println("ɾ���ɹ�");
	            }else{
	                System.out.println("ɾ��ʧ��");
	            }
	        }else{
	            //����
	            boolean flagn = true;
	            try {
	                //���Ŀ¼�����ڣ��ȴ���Ŀ¼
	                File dir = file.getParentFile();
	                dir.mkdirs();
	                //�����ļ�
	                flagn = file.createNewFile();
	                System.out.println("�����ɹ�");
	            } catch (IOException e) {
	                System.out.println("����ʧ��");
	                e.printStackTrace();
	            }          
	        }
	        //�ļ�������(ͬѧ�����Լ�����һ��)
	        //file.renameTo(new File("d:/readme.txt"));
	}
}
