public class Customer {

    private String name;
    private String phone;
    private char packageType;
    private int minutesUsed;

    public Customer(String name, String phone, char packageType, int minutesUsed) {

        if(phone.length() != 11){
            System.out.println("Invalid phone number! Setting default.");
            phone = "00000000000";
        }

        if(minutesUsed < 0){
            minutesUsed = 0;
        }

        this.name = name;
        this.phone = phone;
        this.packageType = packageType;
        this.minutesUsed = minutesUsed;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public char getPackageType() {
        return packageType;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }
}