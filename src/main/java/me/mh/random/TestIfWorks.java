package me.mh.random;

public class TestIfWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmergencyState emState = new EmergencyState();
		emState.setId(1L);
		emState.setName("Something very hard");
		//emState.setSentTo("");
		
		String[] pushReceivers = emState.getSentTo().split(",");
		for (String receiver : pushReceivers) {
			System.out.println("RECEIVER : " + receiver);
		}
		
	}

}
