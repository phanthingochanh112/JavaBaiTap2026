package baitapOOP3.testcases;
import baitapOOP3.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginTest() {
        System.out.println("Login Page Test");
        createDriver();
        System.out.println("Step 1: Open login page");
        System.out.println("Step 2: Enter username: admin@example.com");
        System.out.println("Step 3: Enter password: 123456");
        System.out.println("Step 4: Click login button");
        System.out.println("Step 5: Verify login success Dashboard screen");
        closeDriver();
    }

    public void addCategoryTest() {
        System.out.println("Add Category Test");
        createDriver();
        System.out.println("Step 1: Navigate to Categories page");
        System.out.println("Step 2: Click Add Category");
        System.out.println("Step 3: Fill category name: NewCategory");
        System.out.println("Step 4: Save");
        System.out.println("Step 5: Verify category appears in list");
        closeDriver("CustomBrowserName");
    }

}

