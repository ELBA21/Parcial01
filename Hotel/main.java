import java.util.Scanner;
public class main{
    public static void main(String[] arg){
        Habitacion hab1 = new Habitacion(1,2);
        Habitacion hab2 = new Habitacion(2,2);
        Habitacion hab3 = new Habitacion(3,4);
        Habitacion hab4 = new Habitacion(4,4);
        Habitacion hab5 = new Habitacion(5,10);
        Cliente Cliente = new Cliente(1,"",1);
        System.out.println("Bienvenido a nuestro Hotel");
        String nombre;
        int rut;
        int tCredito;
        do{
            System.out.println("Porfavor ingrese la fecha cuando quiere reservar, no olvide que estamos en noviembre");
            Scanner lec = new Scanner(System.in);
            int fechaInic = lec.nextInt();
            if(fechaInic<=1 || fechaInic >= 30){
                System.out.println("DIa invalido, recuerde que noviembre tiene solo 30 dias");
            }
        } while(fechaInic <=1 && fechaInic >= 30);
        do{
            System.out.println("Porfavor ingrese la fecha de salida quiere reservar, no olvide que estamos llenos en diciembre");
            Scanner lec = new Scanner(System.in);
            int fechaFin = lec.nextInt();
            if(fechaFin >= fechaInic || fechaFin >= 30){
                System.out.println("DIa invalido");
            }
        } while(fechaInic <= fechaFin && fechaFin >= 30);        

        System.out.println("Ingrese cantidad de personas para la reserva");
        int habNum;
        habNum = lec.nextInt();
        if(habNum <= 2){
            println("Todas las habitaciones estan dispinibles");
            Cliente.Crearreserva(fechaInic, fechaFin, habNum);
        } else if(habNum<=4 && habNum >2){
            println("La habitacion 3 y 4, estan disponibles");
            Cliente.Crearreserva(fechaInic, fechaFin, habNum);
        } else if(habNUm <=10 && habNum >4){
            println("La habitacion 5 e la unica dispinible ");
            Cliente.Crearreserva(fechaInic, fechaFin, habNum);
        }
//Reserva nuevaR = new Reserva(fechaInic,fechaFin,cantP, habNum);
    }
}