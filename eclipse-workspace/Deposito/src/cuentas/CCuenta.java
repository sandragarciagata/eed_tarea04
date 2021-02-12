package cuentas;

/**
*
* @author Entornos de desarrollo - Tarea de Sandra García Gata
* @version 1
*/
public class CCuenta {

/** Atributos  y tipo de la clase CCuenta:
 * @param nombre Variable nombre tipo String.
 * @param cuenta Variable cuenta tipo String.
 * @param saldo Variable saldo Tipo double.
 * @param tipoInteres Variable tipo Interés tipo Double.
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
    
 /** Constructor que sí tiene parámetros: inicializa los atributos de la clase anteriores 
 * @param nom Nombre del cliente
 * @param cue Número de cuenta
 * @param sal Saldo 
 * @param tipo Tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/** Método estado() para obtener el saldo con un getter
* 
* @return Te devuelve el saldo
*/
    public double estado()
    {
        return getSaldo();
    }
/** Método ingresar que captura las siguientes excepciones.
 * Si no captura excepción, suma la cantidad al saldo con un setter
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
/** Método retirar que captura excepciones y en caso de ir correctamente:
 *  Si no captura excepción, resta la cantidad al saldo obtenido con un get, utilizando
 *  un setter. 
 * @param cantidad
 * @throws Exception
 * 2 casos: - Si la cantidad a retirar es negativa
 * - Si el saldo es menor que la cantidad a retirar (llamando a método estado() )
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

/** Método getter para atributo nombre
 *  
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**Método setter para atributo nombre.
 * Con él le asignamos el valor
 * @param nombre
 */
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/** Método getter para atributo cuenta
 * 
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/** Método setter para atributo cuenta con el que asignamos valor
 * 
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**Método getter para el atributo saldo
 * 
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/** Método setter para atributo saldo con el que asignarle valor
 * 
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/** Método getter para atributo tipoInteres
 * 
 * @return tipoInteres
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/** Método setter para atributo tipoInterés con el que asignarle valor
 * 
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
