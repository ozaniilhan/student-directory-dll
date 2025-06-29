package proje;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        DoublyLinkedList liste = new DoublyLinkedList();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Seçim : ");
            int islem = scan.nextInt();

            switch (islem){
                case 1 -> {
                    Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\ilhno\\Documents\\NetBeansProjects\\proje\\ogrenciler"));

                    while (scanner.hasNextLine()){
                        String satir = scanner.nextLine();

                        int ogrNo = Integer.parseInt(satir.split(",")[0]);
                        String isim = satir.split(",")[1];
                        ArrayList<String> phoneNumbers = new ArrayList<>();

                        for (int i=2; i < (satir.split(",")).length; i++){
                            phoneNumbers.add(satir.split(",")[i]);
                        }
                        Student student = new Student(ogrNo, isim, phoneNumbers);
                        liste.addData(student);
                    }
                    System.out.println("Liste Oluştu.");
                }

                case 2 -> {
                    System.out.print("Öğrenci no : ");
                    int ogrNo = scan.nextInt();

                    System.out.print("Ad-Soyad : ");
                    scan.nextLine();
                    String isim = scan.nextLine();

                    System.out.print("Telefon no : ");
                    String phoneNumber = scan.nextLine();

                    ArrayList<String> phoneNumbers = new ArrayList<>();

                    for (int i=0; i < (phoneNumber.split(",")).length; i++){
                        phoneNumbers.add(phoneNumber.split(",")[i]);
                    }

                    Student s = new Student(ogrNo, isim, phoneNumbers);
                    liste.addData(s);
                }

                case 3 -> {
                    System.out.print("Ad-Soyad : ");
                    scan.nextLine();
                    String isim = scan.nextLine();
                    liste.showName(isim);
                }

                case 4 -> { 
                    System.out.print("Öğrenci numarası : ");
                    int ogrNo = scan.nextInt();
                    liste.remove(ogrNo);
                }

                case 5 -> liste.print();

                case 6 -> liste.writeBack();

                case 7 -> {
                    System.out.println("Program bitti");
                    System.exit(0);
                }
            }
        }
    }
}