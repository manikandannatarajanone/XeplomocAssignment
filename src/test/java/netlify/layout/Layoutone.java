package netlify.layout;

import java.io.IOException;

import org.testng.annotations.Test;

import netlify.pom.Lay1loc;
import netlify.utility.Baseclass;

public class Layoutone extends Baseclass {
	
	
	Lay1loc lay1;
	@Test
	private void test_layoutone() throws IOException, InterruptedException {
		launchbrowser("chrome");
		loadurl("https://trytestingthis.netlify.app/");
		lay1 = new Lay1loc();
		clickbtn(lay1.getAlert());
		acceptalert();
		doubleclick(lay1.getDoubleclick());
		draganddrop(lay1.getDrag(),lay1.getDrop());
		entervalue(lay1.getUsername(),toreaddatafromexcel("sheet1", 4, 0));
		entervalue(lay1.getPassword(),toreaddatafromexcel("sheet1", 5, 0));
		clickbtn(lay1.getLogin());
		clickbtn(lay1.getClickback());
		quitbrowser();
		
			
	}

}
