package sxt5;

public class CommonString {
	    public static void main(String[] args) {
	        String s = "";
	        String s1 = "How are you?";
	        System.out.println(s1.startsWith("How"));//�Ƿ���How��ͷ
	        System.out.println(s1.endsWith("you"));//�Ƿ���you��β
	        s = s1.substring(4);//��ȡ���ַ��������±�Ϊ4�Ŀ�ʼ���ַ�����βΪֹ
	        System.out.println(s);
	        s = s1.substring(4, 7);//��ȡ���ַ������±�[4, 7) ������7
	        System.out.println(s);
	        s = s1.toLowerCase();//תСд
	        System.out.println(s);
	        s = s1.toUpperCase();//ת��д
	        System.out.println(s);
	        String s2 = "  How old are you!! ";
	        s = s2.trim();//ȥ���ַ�����β�Ŀո�ע�⣺�м�Ŀո���ȥ��
	        System.out.println(s);
	        System.out.println(s2);//��ΪString�ǲ��ɱ��ַ���������s2����
	        
	        
	        String s3 = "core Java";
	        String s4 = "Core Java";
	        System.out.println(s3.charAt(3));//��ȡ�±�Ϊ3���ַ�
	        System.out.println(s3.length());//�ַ����ĳ���
	        System.out.println(s3.equals(s4));//�Ƚ������ַ����Ƿ����
	        System.out.println(s3.equalsIgnoreCase(s4));//�Ƚ������ַ��������Դ�Сд��
	        System.out.println(s3.indexOf("Java"));//�ַ���s1���Ƿ����Java
	        System.out.println(s3.indexOf("apple"));//�ַ���s1���Ƿ����apple
	        String s5 = s3.replace(' ', '&');//��s1�еĿո��滻��&
	        System.out.println("result is :" + s5);
	    }
}
