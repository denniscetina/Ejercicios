/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traducmorse;

import java.util.Scanner;

/**
 *
 * @author denni
 */
public class TraducMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);
        char c;
        String morse, resultadoMor = "", e;//
        int longitud;
        String cadena, cadena2 = "", mensaje;
        String codigoM[] = new String[36];
        String espacioo = " ", A = ".-", B = "-...", C = "-.-.", D = "-..", E = ".", F = "..-.", G = "--.", H = "....", I = "..", J = ".---", K = "-.-",
                L = ".-..", M = "--", N = "-.", O = "---", P = ".--.", Q = "--.-", R = ".-.", S = "...", T = "-", U = "..-", V = "...-", W = ".--", X = "-..-",
                Y = "-.--", Z = "--..", c1 = ".----", c2 = "..---", c3 = "...--", c4 = "....-", c5 = ".....", c6 = "-....", c7 = "--...", c8 = "---..", c9 = "----.", c0 = "-----";

        do{
        //Pregunta que desea convertir
        System.out.println("¿Qué desea convertir? (Texto/Morse): ");
        mensaje = entrada.nextLine();

        //Texto a morse
        if (mensaje.equalsIgnoreCase("texto")) {
            String mensajeM = "";
            System.out.println("Introduzca el texto: ");
            mensajeM = entrada.nextLine();
            String letras = "abcdefghijklmnopqrstuvwxyz0123456789";

            mensajeM = mensajeM.toLowerCase();

            String espacio = "   ";
            String morseM = " ";

            codigoM[0] = ".-"; 		//A
            codigoM[1] = "-...";		//B
            codigoM[2] = "-.-.";		//C
            codigoM[3] = "-..";		//D
            codigoM[4] = ".";		//E
            codigoM[5] = "..-.";		//F
            codigoM[6] = "--.";		//G
            codigoM[7] = "....";		//H
            codigoM[8] = "..";		//I
            codigoM[9] = ".---";		//J
            codigoM[10] = "-.-";		//K
            codigoM[11] = ".-..";	//L
            codigoM[12] = "--";		//M
            codigoM[13] = "-.";		//N
            codigoM[14] = "---";		//O
            codigoM[15] = ".--.";	//P
            codigoM[16] = "--.-";	//Q
            codigoM[17] = ".-.";		//R
            codigoM[18] = "...";		//S
            codigoM[19] = "-";		//T
            codigoM[20] = "..-";		//U
            codigoM[21] = "...-";	//V
            codigoM[22] = ".--";		//W
            codigoM[23] = "-..-";	//X
            codigoM[24] = "-.--";	//Y
            codigoM[25] = "--..";	//Z
            codigoM[26] = "-----";	//0
            codigoM[27] = ".----";	//1
            codigoM[28] = "..---";	//2
            codigoM[29] = "...--";	//3
            codigoM[30] = "....-";	//4
            codigoM[31] = ".....";	//5
            codigoM[32] = "-....";	//6
            codigoM[33] = "--...";	//7
            codigoM[34] = "---..";	//8
            codigoM[35] = "----.";	//9
            
            //Aquí recorre el for todo el caracter, comprueba que sea un espacio para cada caracter y
            //tres espacios para cada palabra
            
            for (int i = 0; i < mensajeM.length(); i++) {
                if (mensajeM.charAt(i) == ' ') {
                    morseM = morseM + espacio + ' ';

                } else {
                    for (int j = 0; j < letras.length(); j++) {
                        if (mensajeM.charAt(i) == letras.charAt(j)) {
                            morseM = morseM + codigoM[j] + ' ';	
// Cuando no hay letras se eliminan

                        }
                    }
                }

            }
            morseM = morseM.substring(1, morseM.length());
            //Quita el exceso de espacio

            System.out.println(morseM);
        }

        if (mensaje.equalsIgnoreCase("morse")) {

            System.out.println("------------ABECEDARIO Y NÚMEROS EN CÓDIGO MORSE-ESPAÑOL------------");
                    System.out.print(" .-    = A   -...  = B     -.-.  = C    -..   = D\n .     = E   ..-.  = F     --.   = G    ....  = H\n"
                            + " ..    = I   .---  = J     -.-   = K    .-..  = L\n --    = M   -.    = N     ---   = O    .--.  = P\n"
                            + " --.-  = Q   .-.   = R     ...   = S    -     = T\n ..-   = U   ...-  = V     .--   = W    -..-  = X\n"
                            + " -.--  = Y   --..  = Z     .---- = 1    ..--- = 2 \n ...-- = 3   ....- = 4     ..... = 5    -.... = 6\n"
                            + " --... = 7   ---.. = 8     ----. = 9    ----- = 0\n\n");
            System.out.println("Introduzca la oración en morse: ");
            morse = entrada.nextLine();
            int longitudMorse, i = 0;
            //Divide por un espacio
            String[] letra = morse.split("\\ ");
            while (i < letra.length) {
                if (letra[i].equals(A)) {
                    resultadoMor = resultadoMor.concat("A");
                }
                if (letra[i].equals(B)) {
                    resultadoMor = resultadoMor.concat("B");
                }
                if (letra[i].equals(C)) {
                    resultadoMor = resultadoMor.concat("C");
                }
                if (letra[i].equals(D)) {
                    resultadoMor = resultadoMor.concat("D");
                }
                if (letra[i].equals(E)) {
                    resultadoMor = resultadoMor.concat("E");
                }
                if (letra[i].equals(F)) {
                    resultadoMor = resultadoMor.concat("F");
                }
                if (letra[i].equals(G)) {
                    resultadoMor = resultadoMor.concat("G");
                }
                if (letra[i].equals(H)) {
                    resultadoMor = resultadoMor.concat("H");
                }
                if (letra[i].equals(I)) {
                    resultadoMor = resultadoMor.concat("I");
                }
                if (letra[i].equals(J)) {
                    resultadoMor = resultadoMor.concat("J");
                }
                if (letra[i].equals(K)) {
                    resultadoMor = resultadoMor.concat("K");
                }
                if (letra[i].equals(L)) {
                    resultadoMor = resultadoMor.concat("L");
                }
                if (letra[i].equals(M)) {
                    resultadoMor = resultadoMor.concat("M");
                }
                if (letra[i].equals(N)) {
                    resultadoMor = resultadoMor.concat("N");
                }
                if (letra[i].equals(O)) {
                    resultadoMor = resultadoMor.concat("O");
                }
                if (letra[i].equals(P)) {
                    resultadoMor = resultadoMor.concat("P");
                }
                if (letra[i].equals(Q)) {
                    resultadoMor = resultadoMor.concat("Q");
                }
                if (letra[i].equals(R)) {
                    resultadoMor = resultadoMor.concat("R");
                }
                if (letra[i].equals(S)) {
                    resultadoMor = resultadoMor.concat("S");
                }
                if (letra[i].equals(T)) {
                    resultadoMor = resultadoMor.concat("T");
                }
                if (letra[i].equals(U)) {
                    resultadoMor = resultadoMor.concat("U");
                }
                if (letra[i].equals(V)) {
                    resultadoMor = resultadoMor.concat("V");
                }
                if (letra[i].equals(W)) {
                    resultadoMor = resultadoMor.concat("W");
                }
                if (letra[i].equals(X)) {
                    resultadoMor = resultadoMor.concat("X");
                }
                if (letra[i].equals(Y)) {
                    resultadoMor = resultadoMor.concat("Y");
                }
                if (letra[i].equals(Z)) {
                    resultadoMor = resultadoMor.concat("Z");
                }
                if (letra[i].equals(c1)) {
                    resultadoMor = resultadoMor.concat("1");
                }
                if (letra[i].equals(c2)) {
                    resultadoMor = resultadoMor.concat("2");
                }
                if (letra[i].equals(c3)) {
                    resultadoMor = resultadoMor.concat("3");
                }
                if (letra[i].equals(c4)) {
                    resultadoMor = resultadoMor.concat("4");
                }
                if (letra[i].equals(c5)) {
                    resultadoMor = resultadoMor.concat("5");
                }
                if (letra[i].equals(c6)) {
                    resultadoMor = resultadoMor.concat("6");
                }
                if (letra[i].equals(c7)) {
                    resultadoMor = resultadoMor.concat("7");
                }
                if (letra[i].equals(c8)) {
                    resultadoMor = resultadoMor.concat("8");
                }
                if (letra[i].equals(c9)) {
                    resultadoMor = resultadoMor.concat("9");
                }
                if (letra[i].equals(c0)) {
                    resultadoMor = resultadoMor.concat("0");
                }
                i++;
                resultadoMor = resultadoMor.concat(" ");
            }
            longitudMorse = resultadoMor.length();

            int b = 0;

            for (int j = 0; j < longitudMorse; j++) {
                cadena = resultadoMor.charAt(j) + "";

                if (resultadoMor.charAt(j) != ' ') {//Si el caracter es distinto a un espacio
                    cadena2 = cadena2 + resultadoMor.charAt(j);//Se hace una cadena nueva
                    b = 0;
                } else {
                    b = b + 1;
                    if (b == 3)//Si los espacios en blanco es igual a tres
                    {
                        cadena2 = cadena2 + " ";//Agrega un espacio en blanco para separar las palabras      
                    }
                }
            }
            System.out.println("De morse a texto es :");
            System.out.println(cadena2);

        }
        System.out.println("¿Desea volver a hacer otra traducción?");
        e = entrada.nextLine();
        }while(e.equalsIgnoreCase("Si"));
    }
}
