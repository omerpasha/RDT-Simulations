import java.util.Random;



// RDT1.0 
public class RDTV1 extends Thread{
	static String senderIP="1.2.3.4";
	static String recevierIP="2.2.2.2";
	
	
	
		
		public static void rdt_send() {
			System.out.println("Data Comes from Application layer");
			int datas[];
			datas=new int[5];
			for(int i =0;i<5;i++) {
				Random rnd=new Random();
				int randomData1=rnd.nextInt();
				datas[i]=randomData1;
				
				System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+randomData1);
				
				
			}
		
			makeRdtPacked(datas);
		}
		
		
		public static int[] makeRdtPacked(int []data) {
			//String packet;
			System.out.println("makeRdtPacked ------------------------------>");
			int datas[]=data;    //declaring array
			
		
			
			for(int i=0;i<5;i++) {//5li paketler oluşturuyoruz
				
				System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+datas[i]);
				
			}
			
			
				udt_send(datas);
			return datas;
		}
	public static int[] udt_send(int []data) {
			System.out.println("udt_send ----------------------------->>>>>");
			
			int datas[]=data;    
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("udt_send --------------------->>>>"+datas[i]);
			}
			unreliableChannel(datas);
			return datas;
		}
		

		public static int[] unreliableChannel(int []data) {
			//String packet;
			System.out.println("sending from ------------->>"+senderIP+"to"+recevierIP);
			int datas[]=data;
			for(int i=0;i<datas.length;i++) {
				System.out.println("sending from------------>>>>"+senderIP+"to"+recevierIP+datas[i]);
			}
			
			rdt_rcv(datas);
			return datas;
		}
		
		
		public static int[] rdt_rcv(int []data) {
			
			int datas[]=data;    //declaring array
			for(int i=0;i<datas.length;i++) {
				System.out.println("receives data from<---------------------------"+senderIP);
			}
			extractPacked(datas);
			return datas;
		}
		
		public static int[] extractPacked(int []data) {
		
			int datas[]=data;    //declaring array
			for(int i=0;i<datas.length;i++) {
				System.out.println("extract data from packet<---------------------"+datas[i]);
			}
			deliver_data(datas);
			return datas;
		}
	
	
		public static void deliver_data(int []data) {
			
			int datas[]=data;  
			for(int i=0;i<datas.length;i++) {
				System.out.println("receiver IP"+recevierIP+"receiving data to packetting<---------------------"+datas[i]);
			}
				
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//önce data paketlenecek
		rdt_send();
		
		
		
		
	}

}
