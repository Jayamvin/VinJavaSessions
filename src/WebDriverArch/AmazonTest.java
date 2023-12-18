package WebDriverArch;

public class AmazonTest {
	static WebDriver driver;// this is webDriver reference at the global level --- for top casting purpose 
	//webDriver Driver = new ChromeDriver(); // top casting 

	public static void main(String[] args) {

		//chrome:
		//ChromeDriver driver = new ChromeDriver();
		
		//firefox:
		//FirefoxDriver driver = new FirefoxDriver();
		
		//edge:
		//EdgeDriver driver = new EdgeDriver();
		
		//top casting: cross browser logic
		
		String browser = "chrome";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();// driver is the parent interface variable
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("please pass the right browser name...." + browser);
			break;
		}
		
		
		driver.get("https://www.amazon.com");//NPE
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement("emailId");
		driver.findElement("password");
		driver.sendKeys("emailId", "admin@gmail.com");
		driver.sendKeys("password", "admin@123");
		driver.click("login button");
		
		driver.close();
		
		
		//Testing obj = new Testing();
		//System obj = new System();
		
		Testing.vin1();
		Testing2.vin2();
	}

}
