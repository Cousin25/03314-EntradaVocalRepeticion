/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        char carac;
        boolean todoOK = true;

        do {
            try {
                System.out.print("Introduzca una vocal mayúscula...:");
                carac = SCN.nextLine().charAt(0);

                if (carac == 'A' || carac == 'E' || carac == 'I' || carac == 'O'
                        || carac == 'U') {
                    System.out.printf("Vocal seleccionada ...: %C%n", carac);
                    todoOK = false;
                } else {
                    System.out.printf("%c no es una vocal mayúscula, vuelve a intentarlo.%n", carac);
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        } while (todoOK);

    }

}
