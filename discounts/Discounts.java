package discounts;

public class Discounts {
    int age;
    int qty;

    //    constructor
    public Discounts(int age,int qty){
        this.age = age;
        this.qty = qty;
    }

    public double ageGroupDiscount(){
        double ticket = 0;
        int normalTicket = 7;

        if(this.age<5){
            ticket = normalTicket * 0.6;
        }
        else if(this.age>60){
            ticket = normalTicket * 0.55;
        }
        else{
            ticket = normalTicket;
        }

        return ticket;
    }

    public double qtyDiscount(){
        double qtyDiscount = 0;
        if(this.qty>=2){
            qtyDiscount = (ageGroupDiscount() * this.qty)*0.3;
        }
        qtyDiscount = ageGroupDiscount() * this.qty;
        return qtyDiscount;
    }
}
