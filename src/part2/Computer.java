package part2;


public class Computer{
    String brand;
    String model;
    long SN;
    double price;
    static int count = 0;

    public Computer(){
        brand = "Brand";
        model = "Model";
        SN = 00;
        price = 0000;
        count+=1;
    }

    Computer(String brand, String model, long SN, double price){
        this.brand = brand;
        this.model = model;
        this.SN =SN;
        this.price = price;
        count+=1;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public long getSN(){
        return this.SN;
    }

    public void setSN(long SN){
        this.SN = SN;
    }

    public  double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return brand+"     "+model+"    "+SN+"      "+price;
    }

    public int findNumberOfCreatedComputers(){
        return  count;
    }


    public boolean equals(Computer s1){
        return this.brand.equals(s1.brand) && this.model.equals(s1.model) && this.price==s1.price;
    }




}

