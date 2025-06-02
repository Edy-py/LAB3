package Lista1_lab3.Exer4;

public class MediaPonderada {
    float n1,n2,n3,n4;
    MediaPonderada(float n1,float n2,float n3,float n4){
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
        this.n4=n4;
    }
    float CalcularPonderada(){
        return ((n1*1)+(n2*2)+(n3*3)+(n4*4))/4;
    }
    void MostrarPonderada(){
        System.out.println("(("+n1+" x 1)+("+n2+" x 2)+("+n3+" x 3)+("+n4+" x 4))/4 = "+CalcularPonderada());
    }

}

