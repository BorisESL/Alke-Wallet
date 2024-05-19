package service;

import model.Cliente;

import java.util.Scanner;

public class DepositarFondo implements OperacionBancaria {
    private Banco banco;

    @Override
    public void realizarOperacion(Cliente cliente) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese monto a depositar");
        double monto = scanner.nextDouble();
        cliente.depositarDinero(monto);

    }



}

