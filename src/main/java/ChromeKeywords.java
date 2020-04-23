
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
	    try {
		ChromeDriver chrome = new ChromeDriver();
		String homeUrl =input.getString("url");
     	String plan= input.getString("plan");;
        String username = input.getString("username");;
	    String password = input.getString("password");;
	    
		chrome.navigate().to(homeUrl);
	
			Thread.sleep(3000);
	

	    JavascriptExecutor js = (JavascriptExecutor) chrome;
	
     	System.out.println("login "); 
	    String val = js.executeScript("$(\"input[name='username']\").val('"+username+"');"
		+ "$(\"input[name='password']\").val('"+password+"');"		
		+ " return true").toString();
		Thread.sleep(3000);

	     val = js.executeScript("$(\"button\")[0].click();"
	    		+ "$(\"[class='glyphicon glyphicon-file']\").parent().click();"
	    		+ " return true").toString();
     	System.out.println("Fin login"); 
		Thread.sleep(3000);
     	System.out.println("lance un plan "); 
		    val = js.executeScript("$('table  > tbody  > tr').each(function(index, tr) { "
				+"td = tr.getElementsByTagName(\"td\")[0];if(td.innerText==\""+plan+"\") {td2 =$('> td:nth-child(3) > div > div > button:nth-child(2)', this);"
		    	 + "console.log(td2);$('> td:nth-child(3) > div > div > button:nth-child(2)', this).click();  return false;}"
		    	+"});"
		    	+ " return true").toString();
		  	  val = js.executeScript("$(\"[class='glyphicon glyphicon glyphicon-play']\").parent().click();"  
				    	+ " return true").toString();
	     	System.out.println("Fin lance un plan "); 
			Thread.sleep(6000);
	     	System.out.println("naviguer sur la vue exécution"); 		     	
			   	  val = js.executeScript("$(\"[class='glyphicon glyphicon-tasks']\").parent().click();" + 
			  	  		"$(\"body > div > div > div > div > div > ul > li:nth-child(1) > a\").click();" + 
			  	  		"return true").toString();	      	  
		     	System.out.println("Fin naviguer sur la vue exécution"); 		     	
				Thread.sleep(3000);
		     	System.out.println("vérifier qu'il y a bien une exécution qui correspond à mon plan et ouvrir la dernière exécution ");	  	
	    	  val = js.executeScript(	"var execExist=false  ;$('table  > tbody  > tr').each(function(index, tr) {"
					 +"if (tr.innerText.indexOf(\""+plan+"\") >= 0){$('> td:nth-child(1) > a', this).click();execExist=true;return false}"
		    	      +"}) ;return i").toString();
		     	System.out.println("Fin vérifier qu'il y a bien une exécution qui correspond à mon plan"); 	
				Thread.sleep(3000);
		     	System.out.println("je me déconnecte");	 
	     	  val = js.executeScript("$(\"[class='glyphicon glyphicon-off']\").click(); return true").toString();
			     	System.out.println("Fin je me déconnecte");	  	

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}


}
