package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderBuy;
import entities.OrderItem;
import entities.Products;
import entities.enums.OrderStatus;

public class appOrderBuy {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client clients = new Client(nameClient, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

		OrderBuy orderBuy = new OrderBuy(new Date(), orderStatus, clients);

		System.out.print("How many itens to this order? ");
		Integer n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter " + i + "# data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			Products product = new Products(productName, price);
			OrderItem item = new OrderItem(quantity, price, product);

			orderBuy.addItem(item);

		}

		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(orderBuy);

		sc.close();

	}

}