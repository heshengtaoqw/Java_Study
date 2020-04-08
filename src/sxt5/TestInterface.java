package sxt5;
/*
 * 1. �������η���ֻ����public��Ĭ�ϡ�

      2. �ӿ�����������������ͬ�������ơ�

      3. extends���ӿڿ��Զ�̳С�

      4. �������ӿ��е�����ֻ���ǳ��������ǣ�public static final ���Ρ���дҲ�ǡ�

      5. �������ӿ��еķ���ֻ���ǣ�public abstract�� ʡ�ԵĻ���Ҳ��public abstract��
 */

public class TestInterface {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);
         
        Honest honest = new GoodMan();
        honest.helpOther();
    }
}
/**���нӿ�*/
interface Volant { 
    int FLY_HIGHT = 100;  // ���ǣ�public static final���͵ģ�
    void fly();   //���ǣ�public abstract void fly();
}
/**�����ӿ�*/
interface Honest { 
    void helpOther();
}
/**Angle��ʵ�ַ��нӿں������ӿ�*/
class Angel implements Volant, Honest{
    public void fly() {
        System.out.println("������ʹ������������");
    }
    public void helpOther() {
        System.out.println("�������̹���·��");
    }
}
class GoodMan implements Honest {
   public void helpOther() {
        System.out.println("�������̹���·��");
    }  
}
class BirdMan implements Volant {
    public void fly() {
        System.out.println("�������ˣ����ڷɣ�");
    }
}

interface A {
    void testa();
}
interface B {
    void testb();
}
/**�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B*/
interface C extends A, B {
    void testc();
}

class Test implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}