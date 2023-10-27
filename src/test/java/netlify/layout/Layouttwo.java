package netlify.layout;


import java.io.IOException;

import org.testng.annotations.Test;

import netlify.pom.Lay2loc;
import netlify.utility.Baseclass;

public class Layouttwo extends Baseclass{
	
	
	Lay2loc lay2;
	@Test
	private void test_layouttwo() throws IOException, InterruptedException {
		lay2 = new Lay2loc();
		launchbrowser("chrome");
		loadurl("https://trytestingthis.netlify.app/");
		lay2 = new Lay2loc();
		entervalue(lay2.getFirstname(),toreaddatafromexcel("sheet1",0,0));
		entervalue(lay2.getLastname(), toreaddatafromexcel("sheet1",1,0));
		clickbtn(lay2.getGender());
		selfromddn(lay2.getOption(),1);
		selfromddn(lay2.getOwc(),1);
		selfromddn(lay2.getOwc(),2);
		clickbtn(lay2.getApplicableoptions());
		entervalue(lay2.getDatalists(),toreaddatafromexcel("sheet1",2,0));
		entervalue(lay2.getDate(),toreaddatafromexcel("sheet1",3,0));
		draganddropby(lay2.getScroll(),-20, 0);
	    entervalue(lay2.getQuantity(),"4");
		togetetxt(lay2.getMessage());
		clickbtn(lay2.getSubmit()); 
		quitbrowser();
		
		
		
		

	}

}
