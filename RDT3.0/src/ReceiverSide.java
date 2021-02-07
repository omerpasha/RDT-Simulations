public class ReceiverSide {

	 static int datas[]=new int[5];
	 public static int ACK=1;
	 public static boolean isACKTIMEOUT;
	 public static int process1=1;
	 public static int process0=0;
	 public static int birOncekiProcessNumber;
	 
	 
	
	 public static String  receiverIP="2.2.2.4";
	 
	public static  int response;
	
	 public static int result;
	 
	 static int kontrolBiti;
	
	 public static boolean isTimeout;


	 
	 
	 public static int rdt_rcv(int []data,int process) {
		 response=ACK;
		
		datas=data;
			for(int i=0;i<datas.length;i++) {
				System.out.println("receives data from<---------------------------"+data[i]+"processss"+process);
			}
			extractPacked(datas,response,process);
			
			
			if(kontrolBiti!=1||isTimeout==true) {
				System.out.println("timeouttttttttttttt");
				return response=1;
			}else {
				return response;
			}
			
		}
	 
	 public static int[] extractPacked(int []data,int response,int process) {
			
		
			for(int i=0;i<datas.length;i++) {
				System.out.println("extract data from packet<---------------------"+datas[i]+"process"+process);
			}
			deliver_data(datas,response,process);
			return datas;
		}
		public static void deliver_data(int []data,int response ,int process) {
			
			
			for(int i=0;i<datas.length;i++) {
				System.out.println("receiver IP"+receiverIP+"receiving data to packetting<---------------------"+datas[i]+"process"+process);
			}
				
			
		}
	
	

}
