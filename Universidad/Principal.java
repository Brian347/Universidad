package Universidad;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        MetodosUniversidad met = new MetodosUniversidad();
        Scanner in = new Scanner(System.in);
        int OpcionUni;
        do{
            System.out.println("1 --> AGREGAR UNIVERSIDAD"+
                    "\n2 --> ELIMINAR UNIVERSIDAD"+
                    "\n3 --> INGRESAR A LA UNIVERSIDAD"+
                    "\n4 --> MOSTRAR UNIVERSIDADES"+
                    "\n5 --> SALIR");
            OpcionUni = in.nextInt();
            
            if(OpcionUni == 1){
                System.out.println("INGRESE EL NOMBRE DE LA UNIVERSIDAD");
                in.nextLine();
                String NombreUni = in.nextLine(); //NOMBRE DE LA UNIVERSIDAD
                System.out.println("---UNIVERSIDAD \""+NombreUni+"\" CREADA---");
                Universidad x = null;
                int OpcionFacu;
                do{
                    System.out.println("1 --> AGREGAR FACULTAD"+
                            "\n2 --> AGREGAR OFICINA"+
                            "\n3 --> ELIMINAR FACULTAD"+
                            "\n4 --> ELIMINAR OFICINA"+
                            "\n5 --> INGRESAR A LA FACULTAD"+
                            "\n6 --> INGRESAR A LA OFICINA"+
                            "\n7 --> MOSTRAR FACULTADES"+
                            "\n8 --> MOSTRAR OFICINAS"+
                            "\n9 --> SALIR");
                    OpcionFacu = in.nextInt();
                    if(OpcionFacu == 1){
                        System.out.println("INGRESE EL NOMBRE DE LA FACULTAD");
                        in.next();
                        String NombreFacu = in.nextLine(); //NOMBRE DE LA FACULTAD
                        
                    }
                    if(OpcionFacu == 2){
                        
                    }
                    if(OpcionFacu == 3){
                        
                    }
                }while(OpcionFacu < 9 && OpcionFacu > 0);
                x = new Universidad(NombreUni, null, null);
                met.Agregar(x);
            }
            if(OpcionUni == 2){
            
            }
            if(OpcionUni == 3){
            
            }
        }while(OpcionUni < 5 && OpcionUni > 0);
        
        
        
    }
}
