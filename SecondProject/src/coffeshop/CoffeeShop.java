package coffeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	// think of this at the menu the coffee ship has to offer
	List<Product> products = new ArrayList<>();

	// this is a list of items in your order
	List<Product> order = new ArrayList<>();

	// this is a scanner input
	Scanner input = new Scanner(System.in);

	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product sandwich = new Product();
		sandwich.setName("Egg & Cheese Muffin");
		sandwich.setPrice(19.99);
		products.add(sandwich);

		Product parfait = new Product();
		parfait.setName("Parfait");
		parfait.setPrice(4.59);
		products.add(parfait);
	}

	public void printProduct(Product product) {
		// TODO HOMEOWORK : Change this print only the product name + tab + price with a
		// $
		System.out.println(product.getName() + "\t\t\t\t\t\t\t\t$" + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}
	
	public void printOrder (Product order)  {
		System.out.println(order);
	}
	public void printOrder() {
		for (Product product : order) {
			printProduct(product);
		}
	}

	public void example() {
		double coffee = 5.44d;
		double tea = 4.33d;
		double cookie = 6.73d;

		double subTotal = (3 * coffee) + (4 * tea) + (2 * cookie);

		DecimalFormat df = new DecimalFormat("$#,###.00");
		System.out.println("Subtotal  :" + df.format(subTotal));
		double salesTax = subTotal * 0.10;
		System.out.println("Sales Tax :" + df.format(salesTax));
		double totalSale = subTotal * salesTax;
		System.out.println("Total     :" + df.format(totalSale));
	}

	public int displayMainUserMenu() {
		System.out.println("1) Print the menu items and prices");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print an item to your order");
		System.out.println("4) Checkout");
		System.out.println("5) Exit");

		System.out.println("\nWhat do you want to do?");
		int select = input.nextInt();
		input.nextLine();

		return select;
	}

	public void userSelectProduct() {
		System.out.println("Enter product name to order: ");
		String orderSelection = input.nextLine();

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + " to your order.");
			}
		}
	}

	public static void main(String[] args) {
		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();

		while (true) {
			int userSelection = cf.displayMainUserMenu();
			if (userSelection == 1) {
				cf.printAllProducts();

			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3) {
				cf.printOrder();
				// TODO display the products in the order list (use the order array)
			} else if (userSelection == 5) {
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknown.  Try again;");
			}

		}
	}
}
