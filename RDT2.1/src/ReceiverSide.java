import java.util.Random;

public class ReceiverSide {

	 static int datas[]=new int[5];
	 
	
	 public static String  receiverIP="2.2.2.4";
	 
	public static  int response;
	
	 public static int result;
	 
	 static int kontrolBiti;
	
	 
public static int generateResponse() {
	 //ACK & NACK İÇİN RASTGELE DEĞERLER ÜRECETEK
	 Random r = new Random();
	  int low = 0;
	 int high = 1;
	 result = r.nextInt(high-low) + low;
	 return result;
}



	 
	 
	 public static int rdt_rcv(int []data) {
		 response=generateResponse();
		
		datas=data;
			for(int i=0;i<datas.length;i++) {
				System.out.println("receives data from<---------------------------"+data[i]);
			}
			extractPacked(datas,response);
			
			
			if(kontrolBiti==1) {
				return response=1;
			}else {
				return response;
			}
			
		}
	 
	 public static int[] extractPacked(int []data,int response) {
			
		
			for(int i=0;i<datas.length;i++) {
				System.out.println("extract data from packet<---------------------"+datas[i]);
			}
			deliver_data(datas,response);
			return datas;
		}
		public static void deliver_data(int []data,int response) {
			
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("receiver IP"+receiverIP+"receiving data to packetting<---------------------"+datas[i]);
			}
				
			
		}
	
	

}
