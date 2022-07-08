public class ExcessaoFG {

    public void f () throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println(e.toString());
            throw new Exception("Excessao dentro do bloco catch da funcao F");
        }
    }

    public void g () throws Exception {
        throw new Exception("Este ERROR esta na funcao G");
    }
}
