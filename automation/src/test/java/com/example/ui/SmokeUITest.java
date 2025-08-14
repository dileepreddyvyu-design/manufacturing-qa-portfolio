package com.example.ui;
import org.testng.annotations.*; import org.openqa.selenium.*; import org.openqa.selenium.chrome.ChromeDriver;
public class SmokeUITest {
  WebDriver d;
  @BeforeClass public void setUp(){ d=new ChromeDriver(); }
  @Test public void open(){ d.get("https://example.org"); assert d.getTitle()!=null; }
  @AfterClass public void tearDown(){ if(d!=null) d.quit(); }
}