package ya.practikum.accounttest;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import ya.practikum.account.Account;


public class TestAccountName {

    Account account;

    @Test
    @DisplayName("Check normal account name assertTrue") // имя теста
    @Description("Проверка обычного имени")
    public void normalName() {
        account = new Account("Иван Иванов");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check small account name assertTrue") // имя теста
    @Description("Проверка имени из трех символов")
    public void smallName() {
        account = new Account("И М");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check big account name assertTrue") // имя теста
    @Description("Проверка имени из 19 символов")
    public void bigName() {
        account = new Account("Васиилий Дубовицкий");
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check very small name assertFalse") // имя теста
    @Description("Проверка очень маленького имени")
    public void verySmallName() {
        account = new Account("В");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check very big name assertFalse") // имя теста
    @Description("Проверка очень маленького имени")
    public void veryBigName() {
        account = new Account("Вdsdfsd sdfsdfsdfsdfsdfsdfsdsdfsdfsdf");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check no space small name assertFalse") // имя теста
    @Description("Проверка маленького имени без пробела")
    public void smallNoSpaceName() {
        account = new Account("Bbb");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check no space big name assertFalse") // имя теста
    @Description("Проверка маленького имени без пробела")
    public void bigNoSpaceName() {
        account = new Account("ВасиилиййДубовицкий");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check space begin name assertFalse") // имя теста
    @Description("Проверка пробела в начале имени")
    public void spaceBeginName() {
        account = new Account(" Василий Иванов");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check space end name assertFalse") // имя теста
    @Description("Проверка пробела в конце имени")
    public void spaceEndName() {
        account = new Account("Василий Иванов ");
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check many space assertFalse") // имя теста
    @Description("Проверка нескольких пробелов")
    public void manySpaceName() {
        account = new Account("Васи лий Иванов");
        Assert.assertFalse(account.checkNameToEmboss());
    }

}
