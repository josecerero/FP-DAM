package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, 695.0f); 
    }

    // El método debe estar fuera del método main
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.getSaldo();

        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad); // Uso del parámetro cantidad
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
