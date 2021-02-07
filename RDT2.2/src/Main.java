import java.util.Random;

public class Main {
	public static int datayıBoz() {
		int kontrolBiti;
		
		 Random r = new Random();
		  int low = 0;
		 int high = 1;
		 kontrolBiti = r.nextInt(high-low) + low;
		 return kontrolBiti;
		
	}
	
	public static void main(String[] args) {
		//burada sadece ACK ile iş yapılıyor 0 ve 1 process numberları ile ilerliyor işler ve process number ile 
		//ack eşleştirilip yapılıyor 
		
		int ACK=1;
		
		SenderSide sender=new SenderSide();
		ReceiverSide receiver=new ReceiverSide();
		//sender.rdt_snd();//ilk mesaj için
		//receiver.rdt_rcv(sender.datas);
		
		
	sender.rdt_send(ACK, sender.process1);
		
	receiver.rdt_rcv(sender.datas,sender.process1);
	int once=sender.birOncekiProcessNumber=sender.process0;
	
	System.out.println("processs00000 againnnnnn");
		
	
	sender.rdt_send(ACK,once);
	
	
	receiver.rdt_rcv(sender.datas,once);
	

	}

}
