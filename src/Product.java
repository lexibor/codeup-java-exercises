public class Product
{
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */


    private String name;
    private int priceInCents;


    ///// GETTERS AND SETTERS /////
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPriceInCents()
    {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents)
    {
        this.priceInCents = priceInCents;
    }


    //////// CONSTRUCTOR ////////
    public Product(String name, int priceInCents)
    {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    //// STATIC ////
    public static int findAveragePrice(Product[] products)
    {
        int sum = 0;
        for(Product product : products)
        {
            sum += product.getPriceInCents();
        }

        return sum / products.length;
    }


    public static void main(String[] args)
    {
        Product p1 = new Product("Soap", 100);
        Product p2 = new Product("Soup", 50);
        Product p3 = new Product("Shampoo", 150);

        Product[] products = {p1, p2, p3};

        System.out.println(Product.findAveragePrice(products));


    }



}
