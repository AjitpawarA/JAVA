class Shoes{
    private String comapny;
    private int price;


    public String getComapny() {
        return comapny;
    }
    public void setComapny(String comapny) {
        this.comapny = comapny;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

class EncapsulationJAVA{
    public static void main(String[] args){
        
        Shoes s1 = new Shoes();


        //setting the values to the privete members using set method
        s1.setPrice(1000);
        s1.setComapny("Adidas");
        

        //getting the values of privet members using getmathod
        System.out.println("Shoes company is "+s1.getComapny()+" and price is "+s1.getPrice());
    }
}