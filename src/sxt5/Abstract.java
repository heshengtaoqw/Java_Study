package sxt5;
/*
 * 1. �г��󷽷�����ֻ�ܶ���ɳ�����

     2. �����಻��ʵ��������������new��ʵ���������ࡣ

     3. ��������԰������ԡ����������췽�������ǹ��췽����������newʵ����ֻ��������������á�

     4. ������ֻ���������̳С�

     5. ���󷽷����뱻����ʵ�֡�
 */
public class Abstract {
	public static void main(String[] args) {
		House h = new House();
		h.build();
	}

}

abstract class Building{
	public abstract void build();
}

class House extends Building{
	public void build(){
		System.out.println("High");
	}
}