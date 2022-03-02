import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected, actual);
    }
}
