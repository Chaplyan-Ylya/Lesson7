package Lab5;

public class PostOffice {
    public String departmentNumber;
    public String address;
    public int index;
    public int staff;
    public boolean oversized;
    static final public boolean cashlessPayments = true;

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public boolean isOversized() {
        return oversized;
    }

    public void isOversized(boolean oversized) {
        this.oversized = oversized;
    }

    public static boolean isCashlessPayments() {
        return cashlessPayments;
    }
}
