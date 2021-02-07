import java.util.Random;

public class SenderSide {

	 static int datas[]=new int[5];
	 public static String  senderIP="1.2.3.4";
	public static int kontrolBiti=1;
	 
	 
	 public static void rdt_send(int request) {
		 System.out.println("Data Comes from Application layer");
			
			if(request==1) {//ACK 1 ise generate et
				 datas=generateRandomNumbers();
			
			for(int i =0;i<datas.length;i++) {
				
				
			//	System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+datas[i]);
				 System.out.println(i+".ci"+datas[i]);
				
			
			}
			
			}else {
				//NACk durumu veya bozuk gelen response,aynı arrayi tekrar gönder
				for(int i =0;i<datas.length;i++)
				System.out.println("NACK \t"+i+".ci"+datas[i]);
				
				
				
			}
		
			makeRdtPacked(datas,kontrolBiti);
	
	 }
	 public static void rdt_snd() {
		 //ilk mesaj için overload edildi
		 
		 datas=generateRandomNumbers();
		 for(int i=0;i<5;i++) {//5li paketler oluşturuyoruz
				
				System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+datas[i]);
				
			}
		 
			makeRdtPacked(datas,kontrolBiti);
	 }
	 
	 
	 
	 public static int[] generateRandomNumbers() {
		 int datas[]=new int[5];
		 for(int i =0;i<5;i++) {
			
				Random rnd=new Random();
				int randomData1=rnd.nextInt();
				datas[i]=randomData1;
				
				//System.out.println("sender IP"+senderIP+"sendind data to"+" packetting-------->>>>"+randomData1);
				
			}
		 return datas;
		 
	 }
	 public static int[] makeRdtPacked(int []data,int kontrolBiti) {
			//String packet;
			System.out.println("makeRdtPacked ------------------------------>");
			int datas[]=data;    //declaring array
			
		
			
			for(int i=0;i<5;i++) {//5li paketler oluşturuyoruz
				
				System.out.println("data is packetting"+datas[i]);
				
			}
			
			
				udt_send(datas,kontrolBiti);
			return datas;
		}
	 
	 public static int[] udt_send(int []data,int kontrolBiti) {
			System.out.println("udt_send ----------------------------->>>>>");
			
			int datas[]=data;    
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("udt_send --------------------->>>>"+datas[i]);
			}
			//unreliableChannel(datas);
			return datas;
		}
}
