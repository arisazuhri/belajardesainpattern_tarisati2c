package latihan_solid_single_responsibility;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Employee
        Employee employee = new Employee("020105", "Tarisa Zuhri", 10000.0);

        // Memanggil metode printSalaryReport untuk mencetak laporan gaji
        employee.printSalaryReport();
    }
}