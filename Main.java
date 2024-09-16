import models.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de Medico
        Medico medico1 = new Medico("Dr. Juan Pérez", "Calle Falsa 123", "555-1234", "Ciudad X", "Provincia X",
                                    "12345", "ABC123", "987654321", "12345", "Cirujano", new Date(), null);

        // Crear objetos de Empleado
        Empleado empleado1 = new Empleado("Ana López", "Avenida Y 456", "555-5678", "Ciudad Y", "Provincia Y",
                                          "67890", "XYZ987", "654321", "Administrador");

        // Crear objetos de Paciente
        Paciente paciente1 = new Paciente("Carlos Gómez", "Calle Z 789", "555-8765", "54321", "GHI456",
                                          "123456789", medico1);

        // Relacionar el paciente con su médico
        medico1.getPacientes().add(paciente1);

        // Crear objeto de Vacaciones para Medico y Empleado
        Vacaciones vacacionesMedico = new Vacaciones(new Date(), new Date());
        medico1.getVacaciones().add(vacacionesMedico);
        empleado1.getVacaciones().add(vacacionesMedico);

        // Crear objeto de Cita
        Cita cita1 = new Cita(new Date(), "Consultorio 1", "IPS A", "EPS B", medico1, paciente1, null);
        paciente1.getCitas().add(cita1);
        medico1.getCitas().add(cita1);

        // Crear objetos de Diagnostico y Sintoma
        Sintoma sintoma1 = new Sintoma("Fiebre");
        Sintoma sintoma2 = new Sintoma("Tos");
        Diagnostico diagnostico1 = new Diagnostico("Gripe", "Fiebre, tos y malestar general", null);
        diagnostico1.getSintomas().add(sintoma1);
        diagnostico1.getSintomas().add(sintoma2);


        // Crear objeto de Receta
        Receta receta1 = new Receta(new Date(), new Date());

        // Relacionar Diagnostico con Receta
        diagnostico1.setReceta(receta1);
        cita1.setDiagnostico(diagnostico1); // Relacionar Cita con Diagnostico

        // Crear objetos de Medicamento, PrincipioActivo y Contraindicacion
        PrincipioActivo principioActivo1 = new PrincipioActivo("Paracetamol");
        Medicamento medicamento1 = new Medicamento("Tylenol", "Paracetamol", "Laboratorio A", true,
                                                   "500mg", "250mg", true, true, 100, principioActivo1);
        Contraindicacion contraindicacion1 = new Contraindicacion("Hipersensibilidad al paracetamol");

        // Relacionar Medicamento con Contraindicacion
        MedicamentoContraindicacion medContra1 = new MedicamentoContraindicacion(medicamento1, contraindicacion1);

        // Relacionar Receta con Medicamento
        RecetaMedicamento recetaMedicamento1 = new RecetaMedicamento(receta1, medicamento1);
        recetaMedicamento1.setReceta(receta1);

        // Output para verificar
        System.out.println("Medico: " + medico1.getNombre());
        System.out.println("Paciente: " + paciente1.getNombre());
        System.out.println("Diagnostico: " + diagnostico1.getNombre());
        System.out.println("Diagnostico receta: " + recetaMedicamento1.getMedicamento() + " medicamentos.");
        System.out.println("contradicciones del medicamento: " + medContra1.getContraindicacion());
    }
}
