package Ejercicios.avion;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- ✈️ Inicio de la Simulación del Avión ---");

        // 1. CREACIÓN DEL DEPÓSITO DE COMBUSTIBLE
        try {
            // Depósito de 10000 litros de capacidad máxima, con 8000 litros actuales.
            Deposito depositoAvion = new Deposito(10000.0, 8000.0);
            System.out.println("\n✅ Depósito creado: Capacidad Máx: " + depositoAvion.getCAPACIDAD_MAX() + "L, Actual: " + depositoAvion.getCapacidadActual() + "L.");

            // 2. CREACIÓN DEL AVIÓN
            // Consumo: 5 litros por kilómetro.
            Avion miAvion = new Avion("Airbus", "A320", 5, depositoAvion);
            System.out.println("✅ Avión creado: " + miAvion);

            // 3. REGISTROS Y REVISIONES

            // Periodo de validez: 1 año.
            Period validezUnAnio = Period.ofYears(1);

            // *** Escenario 1: Avión sin revisiones (NO LISTO) ***
            System.out.println("\n--- 3.1 Pruebas Iniciales (Sin Registros) ---");
            System.out.println("¿Avión listo para volar (sin registros)? " + (miAvion.puedeVolar(1000)));
            // Esto debería imprimir "No se encontro ninguna revision" y devolver false.

            // *** Escenario 2: Agregar una revisión VÁLIDA ***
            System.out.println("\n--- 3.2 Agregar Revisión Válida ---");
            // Revisión realizada hace 6 meses.
            LocalDate fechaRevisionValida = LocalDate.now().minus(Period.ofMonths(6));
            Registro registro1 = new Registro(fechaRevisionValida, validezUnAnio);

            miAvion.añadirRegistro(registro1);
            System.out.println("Registro 1 añadido. Vigente: " + registro1.isEstado()); // True

            // ** Pruebas con el Avión Listo **
            System.out.println("\n--- 3.3 Pruebas con Avión Listo y Combustible ---");
            double distanciaCorta = 1000; // Requiere 1000 * 5 = 5000L.
            System.out.println("Vuelo de " + distanciaCorta + "km (5000L requeridos): " + miAvion.puedeVolar(distanciaCorta)); // Debería ser TRUE (8000L disponibles)

            double distanciaLarga = 2000; // Requiere 2000 * 5 = 10000L.
            System.out.println("Vuelo de " + distanciaLarga + "km (10000L requeridos): " + miAvion.puedeVolar(distanciaLarga)); // Debería ser TRUE

            double distanciaExcesiva = 2001; // Requiere 2001 * 5 = 10005L.
            System.out.println("Vuelo de " + distanciaExcesiva + "km (10005L requeridos): " + miAvion.puedeVolar(distanciaExcesiva)); // Debería ser FALSE (Solo 10000L máx, 8000L actual)

            // *** Escenario 3: Agregar una revisión EXPIRADA ***
            System.out.println("\n--- 3.4 Agregar Revisión Expirada ---");
            // Revisión realizada hace 2 años (expirada hace 1 año).
            LocalDate fechaRevisionExpirada = LocalDate.now().minus(Period.ofYears(2));
            Registro registro2 = new Registro(fechaRevisionExpirada, validezUnAnio); // Al crearse, estaListo() pondrá estado=false

            miAvion.añadirRegistro(registro2);
            System.out.println("Registro 2 (último) añadido. Vigente: " + registro2.isEstado()); // False

            // ** Pruebas con el Avión NO LISTO por Revisión Expirada **
            System.out.println("\n--- 3.5 Pruebas con Avión No Listo ---");
            // Aunque el combustible es suficiente (5000L < 8000L), el estado no es válido.
            System.out.println("Vuelo de 1000km (última revisión expirada): " + miAvion.puedeVolar(distanciaCorta)); // Debería ser FALSE

            // 4. PRUEBA DE LLENADO DE REGISTROS (Array de tamaño 5)
            System.out.println("\n--- 4. Llenado del Historial de Registros ---");
            for (int i = 3; i <= 5; i++) {
                Registro reg = new Registro(LocalDate.now(), validezUnAnio);
                miAvion.añadirRegistro(reg);
                System.out.println("Añadido Registro " + i);
            }

            // Intentar añadir un sexto registro
            try {
                System.out.println("\nIntentando añadir un sexto registro...");
                miAvion.añadirRegistro(new Registro(LocalDate.now(), validezUnAnio));
            } catch (AvionException e) {
                System.out.println("❌ EXCEPCIÓN ESPERADA: " + e.getMessage()); // Captura la excepción "No se encontro ninguna revision"
            }

        } catch (AvionException e) {
            System.err.println("❌ ERROR FATAL DE INICIALIZACIÓN: " + e.getMessage());
        }
    }
}
