package src.test.java.com.lab1;

import java.math.BigDecimal;
import src.main.java.com.lab1.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void ValidarUsuario(){

        Account cuenta = new Account("Gabriela", new BigDecimal("500.20"));
        String usuarioEsperado = "Gabriela";
        String usuarioReal = cuenta.getUsuario();
        assertEquals(usuarioEsperado, usuarioReal);
    }

    @Test
    public void VerificarCuenta(){
        Account cuenta = new Account("Gabriela", new BigDecimal("500.20"));
        assertNotNull(cuenta);
    }
    @Test
    public void VerificarSaldo(){
        Account cuenta = new Account("Gabriela", new BigDecimal("500.20"));
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);
    }
    @Test
    public void ValidarRetiro(){
        Account cuenta = new Account("Gabriela", new BigDecimal("500.20"));
        BigDecimal retirar = new BigDecimal("200.25");

        Boolean validar = cuenta.ValidarRetiro(retirar, cuenta.getSaldo());
        assertTrue(validar);
    }
}
