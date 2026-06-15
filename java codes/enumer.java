enum laptop{
    macbook(2000),xps(),surface(1500), thinkpad(1800);

        private int price;

        private laptop(int price) {
            this.price = price;
        }

        private laptop() {
            price = 20;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        

}

public class enumer {
    public static void main(String[] args) {
        
        laptop lap = laptop.macbook;
        System.out.println(lap.getPrice());//prints only macbook without price because price is private

        for(laptop lapt :laptop.values())
        {
            System.out.println(lapt + ":" + lapt.getPrice());
        }



    }
}
