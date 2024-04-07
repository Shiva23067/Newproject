package seleniumgrid1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Day1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
   
		
		// Step 1- Create object of Desired Capabilities
				DesiredCapabilities des = new DesiredCapabilities();
				
				//Step -2 Through Desired Capabilities we set the browser name and platform name.
				des.setBrowserName("chrome");
				
				des.setPlatform(Platform.MAC);
				
				
				// step 3 - I have to create Object of ChromeOptions class
				
				ChromeOptions op = new ChromeOptions();
				
				
				//Step 4 - Merging ChromeOptions with the Desired Capabilities
				
				op.merge(des);
				
				// We are making use of ChromeOptions class to merge the desired capabilities with
				// the chromeoptions reference and mentioning the same in RemoteWebDriver
				
				// Step 5 - Store the HubURL in a string
				
				String HubURL="http://192.168.0.104:4444/wd/hub"; 
				
				
				
				
				// Step 6 - Invoke the browser with RemoteWebDriver
				//and pass the HubuRL and chromeoptions instance using URL object.
				
					
				// In the First parameter of RemoteWebDriver we are passing the details of Hub.
					// IN second parameter we are passing the details of the node.
				WebDriver driver = new RemoteWebDriver(new URL(HubURL),op);
				
                Thread.sleep(10);				
				
				
				driver.get("https://www.amazon.in/");
				
				System.out.println(driver.getTitle());
      }
      
				}
					
				
			
			



