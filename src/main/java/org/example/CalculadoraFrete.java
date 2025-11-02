package org.example;

public class CalculadoraFrete {

    public double calcular(double pesoKg, String regiao) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        if (regiao == null || regiao.trim().isEmpty()) {
            throw new IllegalArgumentException("A região não pode ser nula ou vazia.");
        }

        double custoFixo;
        double adicionalPorKg;

        switch (regiao.toLowerCase()) {
            case "sudeste":
                custoFixo = 10.0;
                adicionalPorKg = 2.0;
                break;
            case "sul":
                custoFixo = 15.0;
                adicionalPorKg = 2.5;
                break;
            case "centro-oeste":
                custoFixo = 20.0;
                adicionalPorKg = 3.0;
                break;
            default:
                custoFixo = 30.0;
                adicionalPorKg = 5.0;
                break;
        }

        double pesoExtra = Math.max(0, pesoKg - 1);
        return custoFixo + (pesoExtra * adicionalPorKg);
    }
}
