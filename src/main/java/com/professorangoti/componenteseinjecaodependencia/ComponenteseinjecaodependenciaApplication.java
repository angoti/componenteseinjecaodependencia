package com.professorangoti.componenteseinjecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.professorangoti.componenteseinjecaodependencia.entities.Order;
import com.professorangoti.componenteseinjecaodependencia.services.OrderService;

@SpringBootApplication
public class ComponenteseinjecaodependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponenteseinjecaodependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		Order order2 = new Order(2282, 800.0, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order1.getCode() + "\nValor Total: R$ " + orderService.total(order1));
		System.out.println("Pedido código " + order2.getCode() + "\nValor Total: R$ " + orderService.total(order2));
		System.out.println("Pedido código " + order3.getCode() + "\nValor Total: R$ " + orderService.total(order3));
	}

}
