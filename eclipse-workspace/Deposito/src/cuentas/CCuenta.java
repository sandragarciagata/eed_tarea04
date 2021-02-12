package cuentas;

/**
*
* @author Entornos de desarrollo - Tarea de Sandra Garc�a Gata
* @version 1
*/
public class CCuenta {

/** Atributos  y tipo de la clase CCuenta:
 * @param nombre Variable nombre tipo String.
 * @param cuenta Variable cuenta tipo String.
 * @param saldo Variable saldo Tipo double.
 * @param tipoInteres Variable tipo Inter�s tipo Double.
 * @category 
 * Todos son privados.
 * */ 
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

 /** Constructor al que no se
 *  le pasan argumentos */ 
   
    public CCuenta()
    {
    }
    
 /** Constructor que s� tiene par�metros: inicializa los atributos de la clase anteriores 
 * @param nom Nombre del cliente
 * @param cue N�mero de cuenta
 * @param sal Saldo 
 * @param tipo Tipo de inter�s
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/** M�todo estado() para obtener el saldo con un getter
* 
* @return Te devuelve el saldo
*/
    public double estado()
    {
        return getSaldo();
    }
/** M�todo ingresar que captura las siguientes excepciones.
 * Si no captura excepci�n, suma la cantidad al saldo con un setter
 * @param cantidad
 * @throws Exception
 * Las excepciones son de cantidad <0 (no se puede ingresar una cantidad negativa)
 * 
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/** M�todo retirar que captura excepciones y en caso de ir correctamente:
 *  Si no captura excepci�n, resta la cantidad al saldo obtenido con un get, utilizando
 *  un setter. 
 * @param cantidad
 * @throws Exception
 * 2 casos: - Si la cantidad a retirar es negativa
 * - Si el saldo es menor que la cantidad a retirar (llamando a m�todo estado() )
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

/** M�todo getter para atributo nombre
 *  
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**M�todo setter para atributo nombre.
 * Con �l le asignamos el valor
 * @param nombre
 */
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/** M�todo getter para atributo cuenta
 * 
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/** M�todo setter para atributo cuenta con el que asignamos valor
 * 
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**M�todo getter para el atributo saldo
 * 
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/** M�todo setter para atributo saldo con el que asignarle valor
 * 
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/** M�todo getter para atributo tipoInteres
 * 
 * @return tipoInteres
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/** M�todo setter para atributo tipoInter�s con el que asignarle valor
 * 
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
