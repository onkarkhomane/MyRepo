
public class Test {
	
	void bubblesort(){
		//
	}

	public static void main(String args[]) {
		String messageReferenceNumber = "20221109MMQFMC21000089";
		StringBuilder ackMessage = new StringBuilder();
		ackMessage.append("                 FTFR1200000018")
		.append(messageReferenceNumber.substring(4, 8)) //MMDD 5-8 chars
		.append(messageReferenceNumber.substring(8, 16)) // source 9 to 16 (8 length)
		.append(messageReferenceNumber.substring(16, 22)) //sequence part 17 to 22 chars 
		.append("04231203FT012 ")
		.append(messageReferenceNumber.substring(4, 8))
		.append("QMGFNP64000025")
		.append(messageReferenceNumber.substring(4, 8))
		.append("1343FT01")
		.append(messageReferenceNumber.substring(0, 4))
		.append(messageReferenceNumber.substring(0, 4))
		.append("                                          ");
		
		System.out.println(ackMessage.toString());
	}

}
