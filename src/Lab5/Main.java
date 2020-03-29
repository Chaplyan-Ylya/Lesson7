package Lab5;

import java.util.Arrays;

import static Lab5.Book.*;
import static Lab5.PostOffice.cashlessPayments;
import static Lab5.PostOffice.isCashlessPayments;
import static Lab5.Vacation.allInclusive;

public class Main {
    public static void main(String[] args) {
        //Моя книга
        Book myBook = new Book();
        myBook.setTitle("Моя первая книга");
        myBook.setAuthor("Чаплян Ю.Н.");
        myBook.setPages(300);
        myBook.setYear(2020);
        myBook.isHardCover(true);
        String[] arr = {"Глава 1", "Глава 2", "Глава 3", "Глава 4"};
        myBook.setTableOfContents(arr);

        System.out.println(myBook);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPages());
        System.out.println(myBook.getYear());
        System.out.println(myBook.isHardCover());
        System.out.println(Arrays.toString(myBook.getTableOfContents()));
        System.out.print(getPrice());
        System.out.println(getCurrency());
        //почта
        PostOffice myPostOffice = new PostOffice();
        myPostOffice.setDepartmentNumber("13");
        myPostOffice.setAddress("Ivanova str.23");
        myPostOffice.setIndex(690013);
        myPostOffice.isOversized(true);
        myPostOffice.setStaff(5);
        System.out.println(myPostOffice);
        System.out.println(myPostOffice.getDepartmentNumber());
        System.out.println(myPostOffice.getAddress());
        System.out.println(myPostOffice.getIndex());
        System.out.println(myPostOffice.isOversized());
        System.out.println(myPostOffice.getStaff());
        System.out.println(isCashlessPayments());
        //Отпуск
        Vacation myVocation = new Vacation();
        myVocation.dateBeginning = "20.08.2020";
        myVocation.day = 10;
        myVocation.country = "Греция";
        myVocation.transport = "Самолет";
        System.out.println(myVocation);
        System.out.println(myVocation.dateBeginning);
        System.out.println(myVocation.day);
        System.out.println(myVocation.country);
        System.out.println(myVocation.transport);
        System.out.println(allInclusive);

    }


    }
