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
	
	//burada diyoruz ki receiver da gönderirken hata yapabilir
	
	public static void main(String[] args) {
		int ACK=1;
		int NACK=0;
		
		SenderSide sender=new SenderSide();
		ReceiverSide receiver=new ReceiverSide();
		/*sender.rdt_snd();
		receiver.rdt_rcv(sender.datas);
		System.out.println("nack döndükten sonra veyahut data bozulduktan sonra");
		System.out.println("receiver response ==>\t\t"+receiver.response);
		sender.rdt_send(receiver.response);
		receiver.rdt_rcv(sender.datas);*/
		
		sender.rdt_snd();
		receiver.rdt_rcv(sender.datas);
		System.out.println("data bozulduktan sonraxxxxxxxxxxxxx");
		sender.kontrolBiti=datayıBoz();
		sender.rdt_send(receiver.response);
		receiver.rdt_rcv(sender.datas);
	System.out.println("yyyyyyyyyyyyyyyy");
		
	sender.rdt_snd();
	receiver.rdt_rcv(sender.datas);
		
		
	}

}
