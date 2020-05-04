package Grid_Process_15;

public class Process_Grid_Node_Configs {

	
	// step1 create a hub
	   //create hub - In CMD  Type "Java -jar selenium-server-standalone-3.141.59.jar -role hub"
	// or "java  -jar selenium-server-standalone-3.141.59.jar -role hub -port 5566 "
	   // COpy NOde to Connect this  url http://192.168.1.11:4444/grid/console ,paste it in Browser
	//step2 Create  nodes
		// we should have Physical Access to the Nodes 
		// In CMD we need to Type in..."java -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.1.11:4444/grid/Register -port 5566 "
		// java -Dwebdriver.chrome.driver="C:/chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver
		// -hub http://192.168.1.11:4444/grid/register -port 5566
	// if port no given at no neeed to here at nodel level
	
}
