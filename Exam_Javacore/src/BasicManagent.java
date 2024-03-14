import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BasicManagent {
    public static List<Department> departmentList=new ArrayList<>();
    public static List<Employee> employeeList=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        do {
            mainMenu();
            System.out.println("chon chuc nang mong muon");
            int choose=Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    int choose1;
                    do {
                        departmentMenu();
                        System.out.println("chon chuc nang mong muon");
                        choose1=Integer.parseInt(scanner.nextLine());
                        switch (choose1){
                            case 1:
                                addDepartment();
                                break;
                            case 2:
                                showDepartment();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("quay lai chuong trinh");

                        }

                    }while (true);
                    break;
                case 2:
                    int choose2;
                    do {
                        System.out.println("chon chuc nang mong muon");
                        choose2=Integer.parseInt(scanner.nextLine());
                        switch (choose2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;

                        }


                    }while (true)
;            }

        }while (true);
    }
    public static void mainMenu(){
        System.out.println(""" 
        *********************************MENU******************************* 
        1. Quản lý phòng ban
        2. Quản lý nhân viên
        3. Thoát chương trình
                """);

    }
    public static void departmentMenu(){
        System.out.println("""
                **********************DEPARTMENT-MENU************************
                1. Thêm mới phòng ban
                2. Hiển thị thông tin tất cả phòng ban 
                3. Sửa tên phòng ban
                4. Xóa phòng ban
                5. Tìm kiếm phòng ban
                0. Quay lại
                """);
    }
    public static void employeeMenu(){
        System.out.println("""
                *************************EMPLOYEE-MENU**************************
                1. Thêm mới nhân viên
                2. Hiển thị thông tin tất cả nhân viên
                3. Xem chi tiết thông tin nhân viên
                4. Thay đổi thông tin nhân viên
                5. Xóa nhân viên
                6. Hiển thị danh sách nhân viên theo phòng ban 7. Sắp xếp danh sách nhân viên
                0. Quay lại
                """);
    }
    public static void addDepartment(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so luong phong ban muon them");
        int departmentNum=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < departmentNum ; i++) {
            Department department =new Department();
            department.input(scanner);
            departmentList.add(department);
            System.out.println("them thanh cong");
        }
    }
    public static void showDepartment(){
        Scanner scanner=new Scanner(System.in);
        departmentList.sort(new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.getDepartmentld() -o2.getDepartmentName().charAt(0);
            }
        });
        for (Department c: departmentList){
            c.display();
        }
    }
    public static void deleteDepartment() {
        System.out.println("chon phong ban can xoas");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int deleteDepartment = Integer.parseInt(scanner.nextLine());
        for (Department c : departmentList) {
            if (deleteDepartment == c.getDepartmentld()) {
                check = true;
                break;
            }

        }
    }
