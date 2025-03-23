package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria con operaciones básicas
 * como ingresos y retiros.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío para la clase CCuenta.
     * Este constructor crea una instancia de CCuenta sin inicializar los valores de los atributos.
     * Los valores de los atributos deben ser establecidos a través de los métodos setters.
     */
    public CCuenta() {
    }

    /**
     * Constructor para inicializar una cuenta con los datos proporcionados.
     *
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta.
     * @param saldo  El saldo inicial de la cuenta.
     * @param tipoInteres El tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular de la cuenta. 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular de la cuenta.
     *
     * @param nombre El nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta.
     *
     * @param cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Modifica el saldo de la cuenta si la cantidad es válida.
     * Si el saldo es negativo, se imprime un mensaje de error.
     *
     * @param saldo El nuevo saldo a establecer.
     */
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
        }
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return El tipo de interés de la cuenta.
     */
    public double getInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInteres El nuevo tipo de interés.
     */
    public void setInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad El monto a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es menor o igual a 0, o si no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
