public class Main {
    public static void main(String[] args) {
        Tariff myOnline = new Tariff();

        myOnline.id = 1;
        myOnline.name = "Мой онлайн";
        myOnline.costPerMonth = 290;
        myOnline.trafficLimitInMegabyte = 15360;
        myOnline.unlimSocialsAndMessengers = true;
        myOnline.minutesLimit = 400;
        myOnline.unlimCallsOnTeleTwo = true;

        Tariff myOnlinePlus = new Tariff();

        myOnlinePlus.id = 2;
        myOnlinePlus.name = "Мой онлайн +";
        myOnlinePlus.costPerMonth = 350;
        myOnlinePlus.trafficLimitInMegabyte = 20480;
        myOnlinePlus.unlimSocialsAndMessengers = true;
        myOnlinePlus.abroadInternet = true;
        myOnlinePlus.minutesLimit = 600;
        myOnlinePlus.unlimCallsOnTeleTwo = true;

        Tariff myTalk = new Tariff();

        myTalk.id = 3;
        myTalk.name = "Мой разговор";
        myTalk.costPerMonth = 190;
        myTalk.trafficLimitInMegabyte = 3072;
        myTalk.minutesLimit = 250;
        myTalk.unlimCallsOnTeleTwo = true;

        Tariff myTeleTwo = new Tariff();

        myTeleTwo.id = 4;
        myTeleTwo.name = "Мой Tele2";
        myTeleTwo.costPerDay = 7;
        myTeleTwo.trafficLimitInMegabyte = 6144;
        myTalk.unlimCallsOnTeleTwo = true;

        Tariff unlimited = new Tariff();

        unlimited.id = 5;
        unlimited.name = "Безлимит";
        unlimited.costPerMonth = 400;
        unlimited.internetUnlim = true;
        unlimited.minutesLimit = 500;
        unlimited.unlimCallsOnTeleTwo = true;
        unlimited.freeMessages = 50;

        Tariff premium = new Tariff();

        premium.id = 6;
        premium.name = "Премиум";
        premium.costPerMonth = 1100;
        premium.trafficLimitInMegabyte = 40960;
        premium.minutesLimit = 2000;
        premium.unlimCallsOnTeleTwo = true;
        premium.freeMessages = 500;

        Tariff classical = new Tariff();

        classical.id = 7;
        classical.name = "Классический";
        classical.noSubscriptionFee = true;

        Tariff internetForDevices = new Tariff();

        internetForDevices.id = 8;
        internetForDevices.name = "Интернет для устрйств";
        internetForDevices.noSubscriptionFee = true;

        Tariff internetForThings = new Tariff();

        internetForThings.id = 9;
        internetForThings.name = "Интернет для вещей";
        internetForThings.costPerMonth = 100;
        internetForThings.trafficLimitInMegabyte = 300;
        internetForThings.minutesLimit = 30;
        internetForThings.freeMessages = 100;

    }
}
