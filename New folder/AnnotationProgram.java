package TestNGProgramms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationProgram {
  @Test
  public void f() {
	  System.out.println("i m first program");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method executes before each test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftre method executes after each test method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class method executes before first method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class method executes after last method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test executes before test method");
  }
 
  @AfterTest
  public void afterTest() {
	  System.out.println("after text executes after all test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suit executes before all method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite executes after all method");
  }

}
