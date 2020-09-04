package com.techproed.tests;

import com.techproed.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {
    @Test
    public void cokluPencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String sayfaninHandle=driver.getWindowHandle();
        System.out.println(sayfaninHandle);
        //<a href="/windows/new" ,="" target="_blank">Click Here</a>
        driver.findElement(By.partialLinkText("Click Here")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> tumPencereler=driver.getWindowHandles();
        int index=0;
        for (String handle:tumPencereler) {
            if(index==tumPencereler.size()-1){
                System.out.println(handle);
            }
            index++;
        }



        Object[] array = (Object[]) tumPencereler.toArray();
        String ikinciSayfaHandle = array[array.length - 1].toString();
        System.out.println(ikinciSayfaHandle);
        driver.switchTo().window(sayfaninHandle);


    }

}
