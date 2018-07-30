import java.util.ArrayList;
import java.util.Random;

 class Wife{
	//定义实例数量
	private static int maxnumofwife = 4;
	private static ArrayList<String> nameList=new ArrayList<String>();//放老婆的名字
	private static ArrayList<Wife> wifeList=new ArrayList<Wife>();//放所有老婆的实例
	private static int countNumofwife = 0;
	static{
		for(int i=0;i<maxnumofwife;i++){
			wifeList.add(new Wife("老婆"+(i+1)));
		}
	}
//	private Wife(){
//		
//	}
	//传入老婆名称，建立一个老婆对象
	private Wife(String name){
		nameList.add(name);
	}
	//随机获得一个老婆对象
	public static Wife getInstance(){
		Random random = new Random();
		countNumofwife = random.nextInt(maxnumofwife);
		return wifeList.get(countNumofwife);
	}
	//老婆会见客人
	public static void say(){
		System.out.println(nameList.get(countNumofwife));
	}
}
public class guest {  //客人会见老婆
	public static void main(String[] args) {
		// 定义8个客人
		int guestNum = 8;
		for(int i=0;i<guestNum;i++){
			Wife wife = Wife.getInstance();
			System.out.println("第"+(i+1)+"个客人会见的是：");
			Wife.say();
		}
	}
}
