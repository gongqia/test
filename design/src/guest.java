import java.util.ArrayList;
import java.util.Random;

 class Wife{
	//����ʵ������
	private static int maxnumofwife = 4;
	private static ArrayList<String> nameList=new ArrayList<String>();//�����ŵ�����
	private static ArrayList<Wife> wifeList=new ArrayList<Wife>();//���������ŵ�ʵ��
	private static int countNumofwife = 0;
	static{
		for(int i=0;i<maxnumofwife;i++){
			wifeList.add(new Wife("����"+(i+1)));
		}
	}
//	private Wife(){
//		
//	}
	//�����������ƣ�����һ�����Ŷ���
	private Wife(String name){
		nameList.add(name);
	}
	//������һ�����Ŷ���
	public static Wife getInstance(){
		Random random = new Random();
		countNumofwife = random.nextInt(maxnumofwife);
		return wifeList.get(countNumofwife);
	}
	//���Ż������
	public static void say(){
		System.out.println(nameList.get(countNumofwife));
	}
}
public class guest {  //���˻������
	public static void main(String[] args) {
		// ����8������
		int guestNum = 8;
		for(int i=0;i<guestNum;i++){
			Wife wife = Wife.getInstance();
			System.out.println("��"+(i+1)+"�����˻�����ǣ�");
			Wife.say();
		}
	}
}
