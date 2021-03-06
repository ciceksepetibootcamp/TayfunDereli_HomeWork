// Generated by Selenium IDE
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;
using SeleniumExtras.PageObjects;
using Microsoft.VisualStudio.TestPlatform.CrossPlatEngine.Client;

namespace DotnetWeb
{

public class HomePage   : BasePage{

  public HomePage (IWebDriver driver) {
      HomePage.driver = driver;
      PageFactory.InitElements(driver,this);
  }

  [FindsBy(How = How.Id, Using = "search-textbox")]
  private IWebElement aramakutusu;

   [FindsBy(How = How.XPath, Using = "//*[@id='quick-index-nav']/li[4]/a")]
  private IWebElement categoryclick;

[FindsBy(How = How.XPath, Using = "//button[@aria-label='getir']")]
  private IWebElement aramabutonu;

   [FindsBy(How = How.TagName, Using = "h2")]
  private IWebElement categorycontrol;

  public String PageLoad(){
     return driver.Url ;
     
  }

    public void Category(){
        categoryclick.Click();
        Thread.Sleep(2000);
        Assert.True(categorycontrol.Text.Contains("#spor"));    }
        

  public void SearchBox(String text){
    
      aramakutusu.Click();
      aramakutusu.SendKeys(text);
      aramabutonu.Click();
      
  }



}

}