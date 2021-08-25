
import java.io.IOException;

import tables.VarTable;
import tables.StrTable;
import static typing.Type.NUM_TYPE;
import static typing.Type.FRACTIONAL_TYPE;
import static typing.Type.CHAR_TYPE;
import static typing.Type.STRING_TYPE;
import static typing.Type.NO_TYPE;

public class Main {
    public static void main(String[] args) throws IOException {
        //Teste da tabela de variaveis

        //VarTable vt = new VarTable();
        //System.out.println("Tamanho da tabela: " + vt.size());
        //vt.addVar("x", 2, NUM_TYPE);
        //System.out.println("Tamanho da tabela: " + vt.size());
        //System.out.println(vt.toString());

        //Teste da tabela de Strings
        StrTable st = new StrTable();
        st.addStr("Hello World");
        System.out.println(st.toString());
    }
}