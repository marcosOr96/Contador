public class Contador {
    private int cont;

    public Contador() {
    }

    public Contador(int cont) {
        this.cont = cont;
        if (getCont() <= 0) {
            setCont(0);
        }
    }

    public Contador(final Contador c) {
        cont = c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int incrementar() {
        this.cont = cont + 1;
        if (cont <= 0) {
            cont=0;
        }
        return cont;
    }

    public int decrementar() {
        this.cont = cont - 1;
        if (cont <= 0) {
            cont=0;
        }
        return cont;
    }

    public static void main(String[] args) {
        Consola sc = new Consola();
        Contador c1 = new Contador(sc.leerEntero("Valor inicial del contador"));
        System.out.println("Contador decrementado: "+c1.decrementar());
        System.out.println("Contador incrementado: "+c1.incrementar());
        System.out.println("Contador incrementado: "+c1.incrementar());
        System.out.println("Contador decrementado: "+c1.decrementar());
    }
}
