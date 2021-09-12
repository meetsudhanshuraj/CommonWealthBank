public class CcommonBank {
public static void main(String[] args) {

//Setting system properties of ChromeDriver
System.setProperty("webdriver.chrome.driver", "Local Path of chrome driver");

//Creating an object of ChromeDriver
WebDriver driver = new ChromeDriver();

//To Maximise the browser
driver.manage().window().maximize();

//Deleting all the cookies
driver.manage().deleteAllCookies();

//launching the Common Bank URL
driver.get("https://www.commbank.com.au/");

//Click on Repayment Option
WebElement rePayment = driver.findElement(By.xpath("//*[text()='Repayments calculator')]"));
rePayment.click();

//Validate Borrowing Calculator element is present or not
boolean borrowingCalculator = Driver.findElement(By.xpath("//*[text()='Borrowing calculator')]")).isDisplayed();
			
			if(borrowingCalculator){
				System.out.println("Borrowing Calculator Element is visible");
			} else {
				System.out.println("Borrowing Calculator Element  is not Visible");
			}

//Validate Stamp duty calculator element is present or not
boolean stampDutyCalculator = Driver.findElement(By.xpath("//*[text()='Stamp duty calculator')]")).isDisplayed();
			
			if(stampDutyCalculator){
				System.out.println("Stamp duty calculator Element is visible");
			} else {
				System.out.println("Stamp duty calculator Element is not Visible");
			}

//Validate Repayment calculator element is present or not
boolean repaymentCalculator = Driver.findElement(By.xpath("//*[text()='Repayment calculator')]")).isDisplayed();
			
			if(repaymentCalculator){
				System.out.println("Repayment calculator Element is visible");
			} else {
				System.out.println("Repayment calculator Element is not Visible");
			}

//To click on Calculate Button on the Repayment Tab

WebElement calculateButton = driver.findElement(By.xpath("//*[text()='Calculate')]"));
calculateButton.click();

//To validate Total Loan Repayment Option is Visible or not
boolean totalLoanRepayment= Driver.findElement(By.xpath("//*[text()='Total loan repayments')]")).isDisplayed();
			
			if(totalLoan Repayment){
				System.out.println("total Repayment Element is visible");
			} else {
				System.out.println("totalRepayment Element is not Visible");
			}




}
}

