package page;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MainPage extends BasePage
{
    public MainPage(AppiumDriver<MobileElement> driver)
    {
        super(driver);
    }

    public void addTask(String taskTitle, String taskDetail) throws InterruptedException {
        Thread.sleep(2000);
        clickElement(addTaskButton);
        sendKeys(titleTextbox,taskTitle);
        sendKeys(taskDetailTextBox,taskDetail);
        clickElement(saveTaskButton);
    }

    public void deleteTask()
    {
        clickElement(selectFirstTask);
        clickElement(otherOptionsButton);
        clickElement(clearCompletedButton);
    }

    public void seeTaskDescriptionAndDelete()
    {
        clickElement(selectFirstTaskLinear);
        clickElement(deleteFirstTaskButton);
    }

    public void showIstatistics()
    {
        clickElement(explorerButton);
        clickElement(seeAllStatistics);
    }

    // Mobile page elements
    private By explorerButton = By.xpath("\t//android.widget.ImageButton[@content-desc=\"Gezinme çekmecesini aç\"]");
    private By addTaskButton = By.id("com.example.android.architecture.blueprints.master:id/add_task_fab");
    private By titleTextbox = By.id("com.example.android.architecture.blueprints.master:id/add_task_title_edit_text");
    private By taskDetailTextBox = By.id("com.example.android.architecture.blueprints.master:id/add_task_description_edit_text");
    private By saveTaskButton = By.id("com.example.android.architecture.blueprints.master:id/save_task_fab");
    private By selectFirstTask = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.CheckBox");
    private By selectFirstTaskLinear = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    private By deleteFirstTaskButton = By.id("com.example.android.architecture.blueprints.master:id/menu_delete");
    private By otherOptionsButton = By.xpath("//android.widget.ImageView[@content-desc=\"Diğer seçenekler\"]");
    private By clearCompletedButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    private By seeAllStatistics = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView\n");
}
