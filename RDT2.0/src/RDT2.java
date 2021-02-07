// RDT2.0 
public class RDT2 extends Thread{
	static int ACK=1;
	static int NACK=0;
	static String recevierIP="2.2.2.2";
	static String senderIP; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//önce data paketlenecek
		
		SenderSide sender=new SenderSide();
	
		ReceiverSide receiver=new ReceiverSide();
			
		
		sender.rdt_send(ACK);
		receiver.datas=sender.datas;
		receiver.rdt_rcv(receiver.datas);
		
		sender.rdt_send(NACK);
		receiver.rdt_rcv(receiver.datas);
		//sender.rdt_send(ACK);
		
		
		
		
		
	}

}
