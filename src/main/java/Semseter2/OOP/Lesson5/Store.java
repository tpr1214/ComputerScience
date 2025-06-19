package Semseter2.OOP.Lesson5;

import com.github.javafaker.Faker;

import java.util.*;

public class Store {
    public  static final List<String>PRODUCTS_BANK=List.of("Milk", "Water", "Eggs", "Bread", "Brokoli");
    Random random = new Random();
    private String storeName;
    private List<Product> products;
    private Map<Integer,List<Product>> productsBonus;
    private List<Salesman> salesmen;

    public Store(){
        Random random = new Random();
     Faker faker =new Faker();
     this.storeName= faker.name().name();
    List<String>productsName=getRandomProducts();

    this.products=new ArrayList<>();
    for (String productName : productsName){
        this.products.add(new Product(productName, random.nextInt(5,20), random.nextInt(50)));
    }
    this.productsBonus=new TreeMap<>();
    for (int i=1; i<=7; i++){
        Product bonusProduct=this.products.get(random.nextInt(this.products.size()));
        this.productsBonus.put(i, List.of(bonusProduct));
    }
    this.salesmen = new ArrayList<>();

    for (int i=0; i<10; i++){
        String firstName= faker.name().firstName();
        String lastName= faker.name().lastName();
        int salary= random.nextInt(1000,1500);
        Salesman salesmen1=new Salesman(firstName,lastName,salary);
        this.salesmen.add(salesmen1);
    }
    System.out.println(this.salesmen);


    }

        public List<String>getRandomProducts() {
        Set<String> products = new HashSet<>();
        while (products.size() < 3) {
            String product = PRODUCTS_BANK.get(random.nextInt(PRODUCTS_BANK.size()));
            products.add(product);
        }
        return  new ArrayList<>(products);
    }

    @Override
    public String toString() {
        return "Store{" + ", storeName='" + storeName + '\n' +
                ", products=" + products +'\n'+
                ", productsBonus=" + productsBonus +'\n'+
                ", salesmen=" + salesmen +
                '}';
    }
    public void SalesForWeek(List<Salesman> salesman){
        for(int i=0; i<salesman.size(); i++){
            int max=0;


        }


    }
}
