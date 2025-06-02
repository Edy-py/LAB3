package Lista1_lab3.Exer2;

public class Numeros {
    float n1, n2, n3;
    Numeros(float n1, float n2, float n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    float media3num() {
        return (n1 + n2 + n3)/3;
    }
    Numeros(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    float media2num() {
        return (n1 + n2 )/2;
    }

}
