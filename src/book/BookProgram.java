package book;

import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class BookProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list = new ArrayList<Book>();
        boolean flag = false;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. THOÁT");
            System.out.println("Mời bạn chọn 1-9");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mời nhập vào số lượng muốn thêm");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        //Khởi tao đối tượng sách
                        Book book = new Book();
                        // gọ
                        book.inputBookData();
                        //add book vào list
                        list.add(book);
                    }
                    break;
                case 2:
                    //tính lợi nhuận cho tưừng sách
                    for (Book book : list) {
                        book.prosesInterest();
                    }
                    break;
                case 3:
                    System.out.println("=========Danh sách =========");
                    for (Book item : list) {
                        item.displayBookInfo();
                    }
                    break;
                case 4:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return Float.compare(o1.getExportPrice(), o2.getExportPrice());
                        }
                    });
                    System.out.println("Danh sách sắp xếp giá bán tăng dần");
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).displayBookInfo();
                        System.out.println(i < list.size() - 1 ? "----------" : "");
                    }
                case 5:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return Float.compare(o2.getInterest(), o1.getInterest());
                        }
                    });
                    System.out.println("Danh sách sắp xếp giá lợi thuận giảm dần");
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).displayBookInfo();
                        list.get(i).prosesInterest();
                        System.out.println(i < list.size() - 1 ? "----------" : "");
                    }
                    break;
                case 6:
                    System.out.print("\nNhập tên sách: ");
                    String name = scanner.nextLine();
                    boolean check = false;
                    for (Book b : list) {
                        if (name.equals(b.getBookName())) {
                            System.out.println("Đây là sách của " + b.getBookName());
                            b.displayBookInfo();
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("\nKhông có sách như vậy!");
                    }
                    break;
                case 7:
                    System.out.print("\nThống kê vào năm: ");
                    int year = scanner.nextInt();
                    int count1 = 0;
                    for (Book b : list) {
                        if (year == b.getYear()) {
                            b.displayBookInfo();
                            count1++;
                        }
                    }
                    if (count1 > 0) {
                        System.out.println("\nTổng số sách là: " + count1);
                    } else {

                        System.out.println("\n Không có sách vào năm " + year);
                    }
                    break;
                case 8:
                    System.out.print("\nThống kê tên tác giả: ");
                    String author = scanner.nextLine();
                    int count2 = 0;
                    for (Book b : list) {
                        if (b.getAuthor().equals(author)) {
                            b.displayBookInfo();
                            count2++;
                        }
                    }
                    if (count2 > 0) {
                        System.out.println("\nTổng số sách là: " + count2);
                    } else {

                        System.out.println("\n Không có sách của tác giả " + author);
                    }
                    break;
                case 10:
                    flag = true;
                    System.out.println("Đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
            }
        } while(!flag);
    }
}
