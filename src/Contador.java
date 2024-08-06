class Contador {
    int numeroContado;

    public Contador(int numeroContado) {
        this.numeroContado = numeroContado;
    }

    void zerarContador() {
        numeroContado = 0;
        System.out.println("Contador zerado.");
    }

    void incrementarContador() {
        numeroContado++;
        System.out.println("Contador incrementado.");
    }

    void retornarContador() {
        System.out.println("Contador: " + numeroContado);
    }
}

