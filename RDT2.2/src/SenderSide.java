import java.util.Random;

public class SenderSide {
	 
	 public static int process1=1;
	 public static int process0=0;
	 public static int birOncekiProcessNumber;
	 public static int ACK=1;
	 
	 static int datas[]=new int[5];
	 public static String  senderIP="1.2.3.4";
	public static int kontrolBiti=1;
	 
	//eğer process 0 gönderdi ack gelmedi ise yeni istek geldiğinde process 1 gönderir ve process 0 beklenmeye devam eder
	
	
	
	
	
	 public static void rdt_send(int request,int process) {
		 
		 System.out.println("Data Comes from Application layer");
			
			if(birOncekiProcessNumber!=process||request!=ACK ) {//eğer aynı state durumundan tekrar gönderilmesi istenirse
				 datas=generateRandomNumbers();
			
			for(int i =0;i<datas.length;i++) {
				
				
			//	System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+datas[i]);
				 System.out.println(i+".ci"+datas[i]);
				
			
			}
			
			}else {
				
				for(int i =0;i<datas.length;i++)
				System.out.println("bir terslik var yenisi tekrar gönderiliyor   \t"+i+".ci"+datas[i]+"\t"+"processsss "+process);
				
				
				
			}
		
		
			makeRdtPacked(datas,kontrolBiti,process);
	
	 }
	 public static void rdt_snd(int process) {
		 //ilk mesaj için overload edildi
		 
		 datas=generateRandomNumbers();
		 for(int i=0;i<5;i++) {//5li paketler oluşturuyoruz
				
				System.out.println("sender IP"+senderIP+"sendind data to packetting-------->>>>"+datas[i]);
				
			}
		 
			makeRdtPacked(datas,kontrolBiti,process);
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
	 public static int[] makeRdtPacked(int []data,int kontrolBiti,int process) {
			//String packet;
			System.out.println("makeRdtPacked ------------------------------>");
			int datas[]=data;    //declaring array
			
		
			
			for(int i=0;i<5;i++) {//5li paketler oluşturuyoruz
				
				System.out.println("data is packetting"+datas[i]+process+"process");
				
			}
			
			
				udt_send(datas,kontrolBiti,process);
			return datas;
		}
	 
	 public static int[] udt_send(int []data,int kontrolBiti,int process) {
			System.out.println("udt_send ----------------------------->>>>>");
			
			int datas[]=data;    
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("udt_send --------------------->>>>"+datas[i]+process+"process");
			}
			//unreliableChannel(datas);
			return datas;
		}
}
