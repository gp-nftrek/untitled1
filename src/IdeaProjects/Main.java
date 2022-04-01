package IdeaProjects;

public class Main {

    public static void main(String[] args) {
        //1//
        //у меня не выводит идея русский шрифт, только ромбики. что делать???//
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("ustanovite prilojenie android po ssilke");
        }
        if (clientOS == 0) {
            System.out.println("ustanovite prilojenie iOS po ssilke");
        }
//запускаю вторую задачу, а джава собирает все вместе с самого начала кода, не знаю как сделать чтобы она не читала то что не нужно//
//2//
        int clientDeviceYear = 2011;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("ustanovite prilojenie android po ssilke");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("ustanovita obleg4ennuyu versiu ANDROID po ssilke");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("ustanovite prilojenie iOS po ssilke");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("ustanovita obleg4ennuyu versiu iOS po ssilke");
        }
//3//
        //выполнил каким то чудом, делал третью задачу часа два//
        int year = 1701;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("god visokosniy");
        } else if (year % 400 == 0) {
            System.out.println("god visokosniy");
        } else { System.out.println("god ne visokosniy");
        }

        //4//
        int deliveryDistance = 95;

        int deliveryDay = 1;
        if (deliveryDistance <=20) {
            System.out.println("dostavka zaymet " + deliveryDay + " den");
        } else if (deliveryDistance >20 && deliveryDistance <= 60) {
            System.out.println("dostavka zaymet " + (deliveryDay + 1 + " dnia"));
        } else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println("dostavka zaymet " + (deliveryDay + 2 + " dnia"));
        } else {
            System.out.println("dostavki net");
        }

//5//
int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10:
                System.out.println("autumn");
                break;
            case 11:
                System.out.println("autumn");
                break;
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("no such m0nth");
        }






    }}