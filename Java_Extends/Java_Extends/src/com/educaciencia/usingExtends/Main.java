package com.educaciencia.usingExtends;

public class Main {

    public static void main(String[] args) {

        // Testando Veiculo
        String veic_caract_fabricante = "Volks";
        String veic_caract_combustivel = "Gasolina";
        String veic_caract_cor = "Branco";

        Veiculo_Caracteristicas vcaracteristica = new Veiculo_Caracteristicas();
        vcaracteristica.setFabricante(veic_caract_fabricante);
        vcaracteristica.setCombustivel(veic_caract_combustivel);
        vcaracteristica.setCor(veic_caract_cor);
        System.out.println("Testando Veiculo");
        System.out.println(vcaracteristica.getFabricante());
        System.out.println(vcaracteristica.getCombustivel());
        System.out.println(vcaracteristica.getCor());
        System.out.println("----------------------------------------");

        // testando Veiculo Passeio
        String veic_passeio_fabricante = "Ford";
        String veic_passeio_combustivel = "Alcool";
        String veic_passeio_cor = "Azul";
        String veic_passeio_portas = "4";
        String veic_passeio_lugares = "5";

        Veiculo_de_Passeio vpasseio = new Veiculo_de_Passeio();
        vpasseio.setFabricante(veic_passeio_fabricante);
        vpasseio.setLugares(veic_passeio_lugares);
        vpasseio.setCor(veic_passeio_cor);
        vpasseio.setCombustivel(veic_passeio_combustivel);
        vpasseio.setPortas(veic_passeio_portas);

        System.out.println("testando Veiculo Passeio");
        System.out.println(vpasseio.getFabricante());
        System.out.println(vpasseio.getLugares());
        System.out.println(vpasseio.getPortas());
        System.out.println("----------------------------------------");

        // testando Veiculo Carga
        String vcarga_fabricante = "Mercedes";
        String vcarga_combustivel = "Diesel";
        String vcarga_cor = "Rosa";
        String vcarga_eixos = "8";
        String vcarga_comprimento = "15 metros";

        Veiculo_de_Carga vcarga = new Veiculo_de_Carga();
        vcarga.setEixos(vcarga_eixos);
        vcarga.setComprimento(vcarga_comprimento);
        vcarga.setFabricante(vcarga_fabricante);
        vcarga.setCor(vcarga_cor);
        vcarga.setCombustivel(vcarga_combustivel);

        System.out.println("testando Veiculo Carga");
        System.out.println(vcarga.getFabricante());
        System.out.println(vcarga.getEixos());
        System.out.println(vcarga.getComprimento());
        System.out.println("----------------------------------------");

    }
}
