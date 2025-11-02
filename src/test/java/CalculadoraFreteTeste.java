import org.example.CalculadoraFrete;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFreteTeste {

    private final CalculadoraFrete calculadora = new CalculadoraFrete();

    @Test
    void deveCalcularFreteParaSudesteCom1Kg() {
        double resultado = calculadora.calcular(1.0, "Sudeste");
        assertEquals(10.0, resultado);
    }

    @Test
    void deveCalcularFreteParaSulComPesoExtra() {
        double resultado = calculadora.calcular(2.0, "Sul");
        assertEquals(15.0 + (1 * 2.5), resultado);
    }

    @Test
    void deveLancarExcecaoParaPesoZero() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcular(0, "Sudeste")
        );
        assertEquals("O peso deve ser maior que zero.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaRegiaoVazia() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcular(1, ""));
    }

    @Test
    void deveCalcularFreteParaSudesteAcimaDe1Kg() {
        double resultado = calculadora.calcular(1.5, "Sudeste");
        assertEquals(10.0 + (0.5 * 2.0), resultado);
    }

    @Test
    void deveCalcularFreteParaCentroOeste() {
        double resultado = calculadora.calcular(3.0, "Centro-Oeste");
        assertEquals(20.0 + (2 * 3.0), resultado);
    }

    @Test
    void deveCalcularFreteParaOutraRegiao() {
        double resultado = calculadora.calcular(2.0, "Norte");
        assertEquals(30.0 + (1 * 5.0), resultado);
    }

    @Test
    void deveLancarExcecaoParaPesoNegativo() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcular(-1, "Sul")
        );
        assertEquals("O peso deve ser maior que zero.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaRegiaoNula() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcular(1, null)
        );
        assertEquals("A região não pode ser nula ou vazia.", ex.getMessage());
    }
}
