
public class ReceiverSide {

	 static int datas[]=new int[5];
	 SenderSide sender1=new SenderSide();
	
	 public static String  receiverIP="2.2.2.4";
	 
	 public static int[] rdt_rcv(int []data) {
			
		
			for(int i=0;i<datas.length;i++) {
				System.out.println("receives data from<---------------------------");
			}
			extractPacked(datas);
			return datas;
		}
	 
	 public static int[] extractPacked(int []data) {
			
		
			for(int i=0;i<datas.length;i++) {
				System.out.println("extract data from packet<---------------------"+datas[i]);
			}
			deliver_data(datas);
			return datas;
		}
		public static void deliver_data(int []data) {
			
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("receiver IP"+receiverIP+"receiving data to packetting<---------------------"+datas[i]);
			}
				
			
		}
	
	

}
