package AmazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonLibs.implementations.CommonElements;
import commonLibs.implementations.DropdownControls;

public class AmazonHomePage {

    private static WebElement searchBox;
    private static WebElement searchButton;
    private static WebElement searchDropdownBox;
    private static WebElement searchByCategory;

    private static CommonElements commonElements;
    private static DropdownControls dropdownControls;

    public AmazonHomePage(WebDriver driver) {
        searchBox = driver.findElement(By.id("nav-search-bar-form"));
        searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchDropdownBox = driver.findElement(By.id("searchDropdownBox"));
        searchByCategory = driver.findElement(By.cssSelector("#nav-gwbar > a:nth-child(1)"));

        commonElements = new CommonElements();
        dropdownControls = new DropdownControls();
    }

    public static void searchProduct(String product, String category) throws Exception {
        clickSearchCategory();
        commonElements.setText(searchBox, product);
        dropdownControls.selectViaVisibleText(searchDropdownBox, category);
        clickSearchButton();
    }

    public static void clickSearchButton() throws Exception {
        commonElements.click(searchButton);
    }

    public static void clickSearchCategory() throws Exception {
        commonElements.click(searchByCategory);
    }

    public void clickFirstProduct() {
        System.out.println("Clicking on First Product");
    }

    public void clickAddToCart() {
        System.out.println("Clicking on Add to Cart");
    }

    public void clickProceedToCheckout() {
        System.out.println("Clicking on Proceed to Checkout");
    }

    public void clickPlaceOrder() {
        System.out.println("Clicking on Place Order");
    }

    public void enterEmail(String email) {
        System.out.println("Entering email: " + email);
    }

    public void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }

    public void clickLogin() {
        System.out.println("Clicking on Login");
    }

    public void clickCreateAccount() {
        System.out.println("Clicking on Create Account");
    }

    public void enterName(String name) {
        System.out.println("Entering name: " + name);
    }

    public void enterMobile(String mobile) {
        System.out.println("Entering mobile: " + mobile);
    }

    public void enterNewPassword(String newPassword) {
        System.out.println("Entering new password: " + newPassword);
    }

    public void clickCreateAccountButton() {
        System.out.println("Clicking on Create Account button");
    }

    public void clickLogout() {
        System.out.println("Clicking on Logout");
    }

    public void clickForgotPassword() {
        System.out.println("Clicking on Forgot Password");
    }

    public void clickChangePassword() {
        System.out.println("Clicking on Change Password");
    }

    public void enterOldPassword(String oldPassword) {
        System.out.println("Entering old password: " + oldPassword);
    }

    public void enterNewPasswordAgain(String newPasswordAgain) {
        System.out.println("Entering new password again: " + newPasswordAgain);
    }

    public void clickChangePasswordButton() {
        System.out.println("Clicking on Change Password button");
    }

    public void clickCancel() {
        System.out.println("Clicking on Cancel");
    }

    public void clickReturn() {
        System.out.println("Clicking on Return");
    }

    public void clickExchange() {
        System.out.println("Clicking on Exchange");
    }

}
