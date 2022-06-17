@Test(Login)
public void A()
{
	System.setProperty("webdriver.chrome.driver","path of chrome driver");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("- https://demoblaze.com/index.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	webElement register = driver.findElement(By.xpath "path of the PHONES section");
	select dropdown =driver.findElement (By.path of samsang galaxy s6);
	select x =new select (dropdown);
	x.select (byvisibletext);
	public void addtocartTest()
	{
		driver.get("path of samsang galaxy s6");
		driver.manage().window().maximize();
		samsang galaxy s6=new samsang galaxy s6(driver);
		samsang galaxy s6.AddtoCart();
		Actions action =new action(register);
		action.click(Home menu);
		webElement register = driver.findElement(By.xpath"path of the LAPTOP");
		action.click(laptop);
		driver.manage().windows().add(Dell I7 8GB);
		Actions action =new action(register);
		action.click(Home menu);
		webElement register = driver.findElement(By.xpath"path of the MONITOR");
		action.click(MONITOR);
		}

	driver.get("path of Asus Full HD monitor ");
	driver.manage().window().maximize();
	Asus Full HD monitor s6=new Asus Full HD monitor(driver);
	Asus Full HD monitor.AddtoCart();
	driver.navigate().to("cart manu");
	public void lowToHigh()
	{
	driver.get("URL");
	driver.findElement(By.xpath);
	Select select = new Select(driver.findElement(By.name));
	slectByVisibleText("Price -Low to High");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	java.util.List<WebElement>price = driver.findElement (By.xpath);
	system.out.println(price.size());
	for(int i=0; i<price.size();i++);
	{
		System.out.println(price.getText());
	}
		
	
	}
}