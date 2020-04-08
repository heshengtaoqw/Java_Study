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
		
		File f3 = new File("d:/电影/华语/大陆");
		boolean flag = f3.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败
    	boolean flag1 = f3.mkdirs(); //目录结构中有一个不存在也没关系；创建整个目录树
        System.out.println(flag1);//创建成功
        
	}
	
	public void createFile() {
		 File file = new File("d:/sxt/b.txt");
	        //判断该文件是否存在
	        boolean flag= file.exists();
	        //如果存在就删除，如果不存在就创建
	        if(flag){
	            //删除
	            boolean flagd = file.delete();
	            if(flagd){
	                System.out.println("删除成功");
	            }else{
	                System.out.println("删除失败");
	            }
	        }else{
	            //创建
	            boolean flagn = true;
	            try {
	                //如果目录不存在，先创建目录
	                File dir = file.getParentFile();
	                dir.mkdirs();
	                //创建文件
	                flagn = file.createNewFile();
	                System.out.println("创建成功");
	            } catch (IOException e) {
	                System.out.println("创建失败");
	                e.printStackTrace();
	            }          
	        }
	        //文件重命名(同学可以自己测试一下)
	        //file.renameTo(new File("d:/readme.txt"));
	}
}
