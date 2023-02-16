public class Product
{
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */


    private String name;
    private int priceInCents;

    public Product(String name, int priceInCents)
    {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public static int findAveragePrice(Product[] products)
    {
        int sum = 0;
        for(Product product : products)
        {
            sum += product.priceInCents;
        }

        return sum / products.length;
    }


    public static void main(String[] args)
    {
        Product p1 = new Product("Soap", 100);
        Product p2 = new Product("Apple", 50);
        Product p3 = new Product("Shampoo", 150);

        Product[] products = {p1, p2, p3};

        System.out.println(Product.findAveragePrice(products));


    }



}
