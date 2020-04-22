
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.WebDriverWait;

import step.handlers.javahandler.AbstractKeyword;
import step.handlers.javahandler.Keyword;

public class ChromeKeywords extends AbstractKeyword{
	@Keyword
	public void createAndNavigate() {

		ChromeDriver chrome = new ChromeDriver();
		String homeUrl =input.getString("url");
		chrome.navigate().to(homeUrl);
		String extractedValue = chrome.findElement(By.xpath("//p[1]")).getText();
		System.out.println("val : "+extractedValue); 

	    JavascriptExecutor js = (JavascriptExecutor) chrome;
	    String username ="admin";
	    String password ="init";
	    String val = js.executeScript("$(\"input[name='username']\").val('"+username+"');"
		+ "$(\"input[name='password']\").val('"+password+"');"
		
		+ " return true").toString();
	    System.out.println("val1 aa: "+val); 

	    val = js.executeScript("$(\"button\")[0].click();"
	    		+ "$(\"[class='glyphicon glyphicon-file']\").parent().click();"
	    		+ " return true").toString();
	     	System.out.println("val2 xx : "+val); 
	     	String i= "plan2";
		    val = js.executeScript("$('table  > tbody  > tr').each(function(index, tr) { "
				+"td = tr.getElementsByTagName(\"td\")[0];if(td.innerText=="+i+") {td2 =$('> td:nth-child(3) > div > div > button:nth-child(2)', this);"
		    	 + "console.log(td2);$('> td:nth-child(3) > div > div > button:nth-child(2)', this).click();  return false;}"
		    	+"});"
		    	+ " return true").toString();
		     	System.out.println("val3 xx : "+val); 	
		     	
		  	  val = js.executeScript("$(\"[class='glyphicon glyphicon glyphicon-play']\").parent().click();"  
				    	+ " return true").toString();
		     	 System.out.println("val4 xx : "+val); 	
		     	 
		   	  val = js.executeScript("$(\"[class='glyphicon glyphicon-tasks']\").parent().click();" + 
			  	  		"return true").toString();
			     	 System.out.println("val5 xx : "+val); 	
	      	  val = js.executeScript("$(\"body > div > div > div > div > div > ul > li:nth-child(1) > a\").click();" + 
			  	  		"return true").toString();
			     	 System.out.println("val6 xx : "+val); 
			     
	    	  val = js.executeScript(	"var i=false  ;$('table  > tbody  > tr').each(function(index, tr) {"
					 +"if (tr.innerText.indexOf(\"plan32\") >= 0)i=true;"
		    	      +"}) ;return i").toString();
	     	 System.out.println("val7 xx : "+val); 
	     	 
	     	  val = js.executeScript("$(\"[class='glyphicon glyphicon-off']\").click(); return true").toString();
		     	 System.out.println("val8 xx : "+val); 	
		     	 
		     	  val = js.executeScript("return true").toString();
		     	 System.out.println("val3 xx : "+val); 	
	}


	 public static void main(String args[]){
		 System.out.println("Hello World"); 
			//	    System.setProperty("webdriver.chrome.driver",
			//		"D:\\MyInstalls\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver chrome = new ChromeDriver();
			String homeUrl ="http://localhost:8080/";
			chrome.navigate().to(homeUrl);
			String extractedValue = chrome.findElement(By.xpath("//p[1]")).getText();
			System.out.println("val : "+extractedValue); 

		    JavascriptExecutor js = (JavascriptExecutor) chrome;
		    String username ="admin";
		    String password ="init";
		    String val = js.executeScript("$(\"input[name='username']\").val('"+username+"');"
    		+ "$(\"input[name='password']\").val('"+password+"');"
    		
    		+ " return true").toString();
		    System.out.println(" "); 

		    val = js.executeScript("$(\"button\")[0].click();"
		    		+ "$(\"[class='glyphicon glyphicon-file']\").parent().click();"
		    		+ " return true").toString();
		     	System.out.println("val2 xx : "+val); 
		     	String i= "plan";
			    val = js.executeScript("$('table  > tbody  > tr').each(function(index, tr) { "
					+"td = tr.getElementsByTagName(\"td\")[0];if(td.innerText==\"plan2\") {td2 =$('> td:nth-child(3) > div > div > button:nth-child(2)', this);"
			    	 + "console.log(td2);$('> td:nth-child(3) > div > div > button:nth-child(2)', this).click();  return false;}"
			    	+"});"
			    	+ " return true").toString();
			     	System.out.println("val3 xx : "+val); 	
			     	
			  	  val = js.executeScript("$(\"[class='glyphicon glyphicon glyphicon-play']\").parent().click();"  
					    	+ " return true").toString();
			     	 System.out.println("val4 xx : "+val); 	
			     	 
			   	  val = js.executeScript("$(\"[class='glyphicon glyphicon-tasks']\").parent().click();" + 
				  	  		"return true").toString();
				     	 System.out.println("val5 xx : "+val); 	
		      	  val = js.executeScript("$(\"body > div > div > div > div > div > ul > li:nth-child(1) > a\").click();" + 
				  	  		"return true").toString();
				     	 System.out.println("val6 xx : "+val); 
				     
		    	  val = js.executeScript(	"var i=false  ;$('table  > tbody  > tr').each(function(index, tr) {"
						 +"if (tr.innerText.indexOf(\"plan\") >= 0)i=true;"
			    	      +"}) ;return i").toString();
		     	 System.out.println("val7 xx : "+val); 
		     	 
//		     	  val = js.executeScript("$(\"[class='glyphicon glyphicon-off']\").click(); return true").toString();
//			     	 System.out.println("val8 xx : "+val); 	
			     	 
			     	  val = js.executeScript("return true").toString();
			     	 System.out.println("val3 xx : "+val); 	
	
	 }
}
