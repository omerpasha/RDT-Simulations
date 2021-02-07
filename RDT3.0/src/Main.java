import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main  {
		//hem paketin gidişinde hemde paketin gelişinde timeout olabilir bunların kontrolü yapılmalı
	
	//her iki tarafa da timer kurulmalı ve paket gönderilmesi başlandığında başlatılmalı--->sender
	
	//ACK gönderilmeye başlandığında timer başlatılmalı
	
	
	
	/*1. durum ACK timeout'a düşebilir
	 *2.gönderilen paket timeout a düşebilir
	 *3.premature timeout olabilir
	 * 
	 * 
	 * 
	 * */
	public static int timeOutBoz() {
		int kontrolBiti;
		
		 Random r = new Random();
		  int low = 0;
		 int high = 1;
		 kontrolBiti = r.nextInt(high-low) + low;
		 return kontrolBiti;
		
	}
	public static int datayıBoz() {
		int kontrolBiti;
		
		 Random r = new Random();
		  int low = 0;
		 int high = 1;
		 kontrolBiti = r.nextInt(high-low) + low;
		 return kontrolBiti;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		//burada sadece ACK ile iş yapılıyor 0 ve 1 process numberları ile ilerliyor işler ve process number ile 
		//ack eşleştirilip yapılıyor 
		
		//hem gönderilen paket hemde alınacak olan paket kaybolabilir,çift yönlü
		
		int ACK=1;
		
		 
		SenderSide sender=new SenderSide();
		ReceiverSide receiver=new ReceiverSide();
		//sender.rdt_snd();//ilk mesaj için
		//receiver.rdt_rcv(sender.datas);
		sender.isTimeout=false;//initialize için
		sender.rdt_send(ACK, sender.process1,sender.isTimeout);
		
		
		//timeout true ise -->sender tarafı için
		sender.isTimeout=true;//initialize için
		sender.rdt_send(ACK, sender.process1,sender.isTimeout);
		
		
		//receiver tarafı response timeout
		
		System.out.println("burada ack beklenen sürede gelmedi");
		receiver.isTimeout=true;//initialize için
		sender.rdt_send(ACK, sender.process1,receiver.isTimeout);
		
		
		
		
		
		

		/*int once=sender.birOncekiProcessNumber =sender.process0;
		
		System.out.println("processs00000 againnnnnn");
			
		
		sender.rdt_send(ACK,once,sender.isTimeout);
		
		
		receiver.rdt_rcv(sender.datas,once);

	 
	*/

	}
	
	


	
	
}
