/**
 * 
 */
package src.main.java.com.lab1;

import java.math.BigDecimal;

public class Account {
    private String usuario;
    private BigDecimal saldo;

    public Account(String usuario, BigDecimal saldo){
        this.usuario = usuario;
        this.saldo = saldo;
    } 

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
    
    public void Retirar(BigDecimal retiro, BigDecimal saldo) throws Exception{

        Boolean validacion = ValidarRetiro(saldo, retiro);
        BigDecimal nuevoSaldo;
        if (validacion == true){
            nuevoSaldo = new BigDecimal(saldo.doubleValue() - retiro.doubleValue());
            this.saldo = nuevoSaldo;
        }
        else{
            throw new Exception("Error al retirar");
        }
        
    }

    public Boolean ValidarRetiro(BigDecimal retiro, BigDecimal saldo){

        if(retiro.doubleValue() <= saldo.doubleValue())
            return true;
        else
            return false;

    }
}
