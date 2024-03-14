import java.util.Scanner;

public abstract class Department implements IEmployee {
    private int departmentld;
    private String departmentName;

    public Department(int departmentld, String departmentName) {
        this.departmentld = departmentld;
        this.departmentName = departmentName;
    }

    public int getDepartmentld() {
        return departmentld;
    }

    public void setDepartmentld(int departmentld) {
        this.departmentld = departmentld;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void input(){
        inputDepartmentld();
        inputDepartmentName();
    }

    public void display(){
        System.out.println("ma phong ban"+departmentld+"ten phong ban"+departmentName);
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

    private void inputDepartmentName() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten phong ban");
        do {
            String departmentName=scanner.nextLine();

        }while (true);

    }


}

