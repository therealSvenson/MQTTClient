package main;



public class Main {
	
	Main main;
	private Main() {
		main = new Main();
	}
	public Main getInstance() {
		
		return this.main;
	}
	
	 
	public static void main(String[] args) {
		 
		Gui gui= new Gui();
		MqttConnect connection = new MqttConnect();
		connection.start();
		
	}
	
	
}
