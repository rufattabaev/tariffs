public class Main {
    public static void main(String[] args) {
        Tariffs myOnline = new Tariffs();

        myOnline.id = 1;
        myOnline.name = "Мой онлайн";
        myOnline.costPerMonth = 290;
        myOnline.trafficLimitInMegabyte = 15360;
        myOnline.unlimSocialsAndMessengers = true;
        myOnline.minutesLimit = 400;
        myOnline.unlimCallsOnTeleTwo = true;

        Tariffs myOnlinePlus = new Tariffs();

        myOnlinePlus.id = 2;
        myOnlinePlus.name = "Мой онлайн +";
        myOnlinePlus.costPerMonth = 350;
        myOnlinePlus.trafficLimitInMegabyte = 20480;
        myOnlinePlus.unlimSocialsAndMessengers = true;
        myOnlinePlus.abroadInternet = true;
        myOnlinePlus.minutesLimit = 600;
        myOnlinePlus.unlimCallsOnTeleTwo = true;

        Tariffs myTalk = new Tariffs();

        myTalk.id = 3;
        myTalk.name = "Мой разговор";
        myTalk.costPerMonth = 190;
        myTalk.trafficLimitInMegabyte = 3072;
        myTalk.minutesLimit = 250;
        myTalk.unlimCallsOnTeleTwo = true;

        Tariffs myTeleTwo = new Tariffs();

        myTeleTwo.id = 4;
        myTeleTwo.name = "Мой Tele2";
        myTeleTwo.costPerDay = 7;
        myTeleTwo.trafficLimitInMegabyte = 6144;
        myTalk.unlimCallsOnTeleTwo = true;

        Tariffs unlimited = new Tariffs();

        unlimited.id = 5;
        unlimited.name = "Безлимит";
        unlimited.costPerMonth = 400;
        unlimited.internetUnlim = true;
        unlimited.minutesLimit = 500;
        unlimited.unlimCallsOnTeleTwo = true;
        unlimited.freeMessages = 50;

        Tariffs premium = new Tariffs();

        premium.id = 6;
        premium.name = "Премиум";
        premium.costPerMonth = 1100;
        premium.trafficLimitInMegabyte = 40960;
        premium.minutesLimit = 2000;
        premium.unlimCallsOnTeleTwo = true;
        premium.freeMessages = 500;

        Tariffs classical = new Tariffs();

        classical.id = 7;
        classical.name = "Классический";
        classical.noSubscriptionFee = true;

        Tariffs internetForDevices = new Tariffs();

        internetForDevices.id = 8;
        internetForDevices.name = "Интернет для устрйств";
        internetForDevices.noSubscriptionFee = true;

        Tariffs internetForThings = new Tariffs();

        internetForThings.id = 9;
        internetForThings.name = "Интернет для вещей";
        internetForThings.costPerMonth = 100;
        internetForThings.trafficLimitInMegabyte = 300;
        internetForThings.minutesLimit = 30;
        internetForThings.freeMessages = 100;

    }
}
