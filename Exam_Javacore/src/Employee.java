import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee implements IEmployee {
    private int employeeld; //(mã nhân viên , tự tăng)//
    private String employeeName; //tên nhân viên, không được để trống//
    private String email; //địa chỉ gmail, đúng định dạng example@gmail.com, không trùng lặp//
    private String phoneNumber; //số điện thoại, đúng định dạng số Việtnam, không trùng lặp//
    private String address; //địa chỉ thường trú//
    private boolean gender ;  //giới tính ,nhận 1 trong 3 giá trị MALE, FEMALE,OTHER//

    private Date birthday; //ngày sinh, đinh dạng dd/MM/yyyy , không đểtrống//
    private float basicSalary; //lương cơ bản, đơn vị $//
    private float allowanceSalary; //phụ cấp, đơn vị $//
    private float rate; //hệ số lương , phải >=1//
    private int departmentld; //mã phòng ban làm việc , không được null//

    public Employee(int employeeld, String employeeName, String email, String phoneNumber, String address, boolean gender, Date birthday, float basicSalary, float allowanceSalary, float rate, int departmentld) {
        this.employeeld = employeeld;
        this.employeeName = employeeName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.basicSalary = basicSalary;
        this.allowanceSalary = allowanceSalary;
        this.rate = rate;
        this.departmentld = departmentld;
    }

    public int getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(int employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getAllowanceSalary() {
        return allowanceSalary;
    }

    public void setAllowanceSalary(float allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getDepartmentld() {
        return departmentld;
    }

    public void setDepartmentld(int departmentld) {
        this.departmentld = departmentld;
    }

    @Override
    public void input(Scanner scanner){
       inputEmployeeld();
       inputEmployeeName();
       inputEmail();
       inputPhoneNumber();
       inputAddress();
       inputGender();
       inputBirthday();
       inputBasicSalary();
       inputAllowanceSalary();
       inputRate();
       inputDepartmentld();
    }

    private void inputDepartmentld() {
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap phong ban");
            String departmentLd=scanner.nextLine();
            if (departmentLd == null) {
                System.out.println("hay nhap ma trong ban");
                break;}
        }while (true);

    }

    private void inputRate() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap he so luong");
       int rate=scanner.nextInt();
    }

    private void inputAllowanceSalary() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap phu cap");
        int allowanceSalary=scanner.nextInt();
    }

    private void inputBasicSalary() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap luong co ban");
        int allowanceSalary=scanner.nextInt();
    }

    private void inputBirthday() {
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap ngay sinh");
            String birthday=scanner.nextLine();
            Pattern patternPhone=Pattern.compile("\\d[1-30]{2}/}\\d[1-12]{2}/}\\d{4}");
            Matcher check=patternPhone.matcher(birthday);
            if (check.matches()){
                break;
            }else {
                System.out.println("nhap dung ngay thang");
            }
        }while (true);
    }

    private void inputGender() {
    }

    private void inputAddress() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap dia chi");
        String address=scanner.nextLine();
    }


    private void inputPhoneNumber() {
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap so dien thoai");
            String phone=scanner.nextLine();
            Pattern patternPhone=Pattern.compile("84¥0[3¥5¥7¥8¥9]+[0-9]{8}");
            Matcher check=patternPhone.matcher(phone);
            if (check.matches()){
                break;
            }else {
                System.out.println("nhap dung so dien thoai");
            }
        }while (true);
    }


    private void inputEmail() {
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhap email");
            String email=scanner.nextLine();
            Pattern patternEmail=Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$");
            Matcher check=patternEmail.matcher(email);
            if (check.matches()) {
                break;
            }else {
                System.out.println("sai dinh dang mail");
            }
        }while (true);
    }


    private void inputEmployeeName() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten nhan vien");
        String employeeName=scanner.nextLine();
        do {
            if (employeeName == null || employeeName.trim().isEmpty()) {
                System.out.println("khong duoc de trong");
            } ;
        }while (true);
    }



    public void inputEmployeeld(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ma nhan vien");
        int EmployeeId=scanner.nextInt();

    }
    public float totalSalary(){
        return basicSalary*rate+allowanceSalary;
    }

}
