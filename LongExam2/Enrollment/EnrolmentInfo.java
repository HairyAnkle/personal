package Enrollment;

class Student {
	
    public String idNumber;
    public String fName;
    public String lName;
    public String studentType;
    public String courseName;
    public int tuitionFee = 0;
    public int miscellaneousFee = 0;
    public double discount = 0;
    public int total = 0;

    Student(String idNumber, String fName, String lName, String studentType, String courseName){
        this.idNumber = idNumber;
        this.fName = fName;
        this.lName = lName;
        this.studentType = studentType.toLowerCase();
        this.courseName = courseName.toLowerCase();
        
        this.setFees();
        this.setDiscount();
        this.setTotalFee();
        System.out.println(studentType);
       	System.out.println(total);
        
    }

    void setFees() {
        if (courseName.equals("tourism")) {
            this.tuitionFee = 10000;
            this.miscellaneousFee = 22500;
        } else if (courseName.equals("computer science")) {
            this.tuitionFee = 20000;
            this.miscellaneousFee = 11000;
        } else if (courseName.equals("engineering")) {
            this.tuitionFee = 30000;
            this.miscellaneousFee = 25000;
        } else if (courseName.equals("nursing")) {
            this.tuitionFee = 15000;
            this.miscellaneousFee = 15000;
        } else if (courseName.equals("architecture")) {
            this.tuitionFee = 25000;
            this.miscellaneousFee = 23000;
        }
    }
    
    void setDiscount() {
        if (studentType.equals("discounted (gold)")) 
            this.discount = 0.5;
        else if (studentType.equals("discounted (blue)")) 
            this.discount = 0.3;
        else if (studentType.equals("discounted (white)")) 
            this.discount = 0.1;
        else if (studentType.equals("continuing")) 
            this.discount = 0.1;
    }

    void setTotalFee() {
        total = this.tuitionFee + this.miscellaneousFee;

        if (studentType.equals("continuing")) 
            total -= (tuitionFee*this.discount);
        else if(this.discount != 0.0) {
            total -= (tuitionFee + miscellaneousFee) * this.discount;
        }

    } 

}
