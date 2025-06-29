package proje;
import java.util.ArrayList;

public class Student {
    private Integer ogrNo;
    private String isim;
    private ArrayList<String> phoneNumbers;

    public Student() {
        this.ogrNo = null;
        this.isim = null;
        this.phoneNumbers = null;
    }

    public Student(Integer ogrNo, String isim, ArrayList<String> phoneNumbers) {
        this.ogrNo = ogrNo;
        this.isim = isim;
        this.phoneNumbers = phoneNumbers;
    }

    public Student(Student student) {
        if (student == null) {
            System.exit(0);
        }

        ogrNo = student.ogrNo;
        isim = student.isim;
        phoneNumbers = student.phoneNumbers;
    }

    public Integer getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(Integer ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String showTelefonNo(){
        for (String i : phoneNumbers){
            System.out.print(i + ", ");
        }
        return " ";
    }

    public String print(){
        return(ogrNo + ", " + isim + ", " + showTelefonNo());
    }
}