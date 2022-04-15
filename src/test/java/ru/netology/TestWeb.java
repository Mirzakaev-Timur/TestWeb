package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeDriver;

=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
>>>>>>> 1e7056a (Write Test)

public class TestWeb {
    private WebDriver driver;


    @BeforeAll
    public static void setUpParam () {
        System.setProperty("webdriver.chrome.driver", "./driver/win/chromedriver.exe");
    }

<<<<<<< HEAD
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }



    @Test
=======
        @BeforeEach
                public void setUp() {
            driver = new ChromeDriver();
        }



        @Test
>>>>>>> 1e7056a (Write Test)

    public void shouldSendForm ()  {
        driver.get("http://localhost:9999/");
        driver.findElement(By.name("name")).sendKeys("Иван Иванов");
        driver.findElement(By.name("phone")).sendKeys("+79177774411");
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.tagName("button")).click();
        String actualText = driver.findElement(By.className("paragraph_theme_alfa-on-white")).getText().trim();
        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";


<<<<<<< HEAD
    }

    @AfterEach
    public void tearDown () {
        driver.quit();
        driver = null;
    }
}
=======
        }

        @AfterEach
         public void tearDown () {
             driver.quit();
            driver = null;
     }
        }



>>>>>>> 1e7056a (Write Test)


