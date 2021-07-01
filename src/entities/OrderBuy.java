package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderBuy {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orderItens = new ArrayList<>();

	public OrderBuy() {

	}

	public OrderBuy(Date moment, OrderStatus status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {

		orderItens.add(item);
	}

	public void removeItem(OrderItem item) {

		orderItens.add(item);
	}

	public double total() {
		Double sum = 0.0;
		for (OrderItem o : orderItens) {
			sum += o.subTotal();
		}

		return sum;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		for (OrderItem Item : orderItens) {
			sb.append(Item + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));

		return sb.toString();

	}

}