import java.util.Scanner;
public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o mes desejado: ");
        int mesInt = ler.nextInt();
        String mes = null;
        
        switch(mesInt){
        case 1 : mes = "janeiro" ;
            break;
        case 2 : mes = "fevereiro";
            break;
        case 3 : mes = "marco"    ;
            break;
        case 4 : mes = "abril";
            break;
        case 5 : mes = "maio";
            break;
        case 6 : mes = "junho";
            break;
        case 7 : mes = "julho";
            break;
        case 8 : mes = "julho";
            break;
        case 9 : mes = "agosto";
            break;
        case 10 : mes = "setembro";
            break;
        case 11 : mes = "outubro";
            break;
        case 12 : mes = "desembro";
            break;         
        }
       System.out.println(mesInt > 12 ? "mes invalido" : "O mes "+mesInt+" e "+mes);
    }
}
