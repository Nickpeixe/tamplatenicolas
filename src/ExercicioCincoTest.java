import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import org.junit.Test;

public class ExercicioCincoTest {
    @Test
    public void PessoaTest() {
        Pessoa pessoa = new Pessoa(
                "João",
                110,
                1.79,
                "2000-01-01");
        String pessoaToString = "{" +
                " nome='João'" +
                ", peso='110.0'" +
                ", altura='1.79'" +
                ", dataNascimento='2000-01-01'" +
                "}";

        assertEquals(pessoaToString, pessoa.toString());
    }

    @Test
    public void PessoaImcTest() {
        Pessoa pessoa = new Pessoa(
                "João",
                110,
                1.79,
                "2000-01-01");

        assertEquals(34.331013, pessoa.imc(), 0.000003F);
        assertEquals("Obesidade Grau I", pessoa.imcTexto());
    }

    @Test
    public void CircunferenciaTest() {
        Circunferencia circunferencia = new Circunferencia(15);

        assertEquals(94.247780, circunferencia.area(), 0.000003F);
        assertEquals(706.858347, circunferencia.circunferencia(), 0.000003F);
    }

    @Test
    public void CifraDeCesarTest() {
        CifraDeCesar cifraUm = new CifraDeCesar("ola", 1);
        assertEquals("pmb", cifraUm.mensagemCifrada());
        CifraDeCesar cifraDois = new CifraDeCesar("a", 27);
        assertEquals("b", cifraDois.mensagemCifrada());
    }
}
