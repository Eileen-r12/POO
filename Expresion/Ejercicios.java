package Expresion;

public class Ejercicios {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double d1=42.0, d2=58.5, d3=37.2;
        double t1=0.9, t2=1.4, t3=0.8;
        double l1=5.1, l2=6.9, l3=4.3;
        double precioLitro=1.35;
        double masaCargaKg=1200;
        double largo=2.0, ancho=1.2, alto=1.1;
        double p1=2.5, p2=3.0, p3=2.0;
        double deprecPorKm=0.08;
        double volCamionM3=10.0;
        double fCO2=2.68;
        double galPorLitro=0.264172;
        double vmin=30, vmax=90;
        double va=40, vb=80, ca=0.05, cb=0.09;
        double a=-0.0008, b=0.08,c=4.0;
        double resultado = d1 + d2 + d3 + t1;

        System.out.println("d1 = " + d1 + " km, d2 = " + d2 + " km, d3 = " + d3 + " km ");
        System.out.println("t1 = " + t1 + " h, t2 = " + t2 + " h, t3 = " + t3 + " h ");
        System.out.println("l1 = " + l1 + "L, l2 = " + l2 + " L, l3= " + l3 + " L ");
        System.out.println("precioLitro = " + precioLitro);
        System.out.println("masaCargaKg = " + "masaCargaKg");
        System.out.println("largo = " + largo + " m, largo = " + ancho  + " m, ancho" + "alto = " + " m ");
        System.out.println("p1 = " + p1 + "  p2 = " + p2 + "  p3 = " + p3 );
        System.out.println("deprecPorKm = " + "deprecPorKm");
        System.out.println("volCamionM3 = " + "volCamionM3");
        System.out.println("fCO2 =" + "fCO2");
        System.out.println("galPorLitro = " + "galPorLitro");
        System.out.println("vmin = " + "vmin " + " vmax = " + vmax );
        System.out.println("va = " + va + ", vb = " + vb + ", ca = " + ca + ", cb = " + cb);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("suma total:" + resultado);

        double v1, v2, v3, vprom;
        double kml1, kml2, kml3; 
        double kmltotal;

        v1 = d1/t1;
        v2 = d2/t2;
        v3 = d3/t3;
        vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

        kml1 = d1/l1;
        kml2 = d2/l2;
        kml3 = d3/l3;
        kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

        System.out.println("v1=" + v1);
        System.out.println("v2=" + v2);
        System.out.println("v3=" + v3);
        System.out.println("vprom=" + vprom + "km/h");

        System.out.println("kml1=" + kml1);
        System.out.println("kml2=" + kml2);
        System.out.println("kml3=" + kml3);
        System.out.println("kmltotal: " + kmltotal + "km/L");

        resultado = v1 + v2 + v3 + kml1 + kml2 + kml3;
        System.out.println("kml total: " + kmltotal + "km/L"); 

        double costoComb = 22.01;
        double peajes = 7.50;
        double costoDirecto = 40.521;
        double costoPorKm;
        costoComb = (l1 + l2 + l3) * precioLitro;
        System.out.println("costoComb = " + costoComb);
        deprecPorKm = (d1 + d2 + d3) * deprecPorKm;
        System.out.println("deprec = " + deprecPorKm);
        peajes = p1 + p2 + p3;
        System.out.println("peajes = " + peajes);
        costoDirecto = costoComb + deprecPorKm + peajes;
        System.out.println("costoDirecto = " + costoDirecto);
        costoPorKm = costoDirecto / (d1 + d2 + d3);
        System.out.println("costoPorKm = " + costoPorKm);
        
        double volumenM3, densidad, ocupacion;
        volumenM3 = largo * ancho * alto;
        densidad = masaCargaKg / volumenM3;
        ocupacion = volumenM3 / volCamionM3;
        System.out.println("volumenM3 = " + volumenM3 + " m3");
        System.out.println("densidad = " + densidad + " kg/m3");
        System.out.println("ocupacion = " + ocupacion);

        double CO2Total = 43.684;
        double CO2porKm = 0.317;
        CO2Total = (l1 + l2 + l3) * fCO2;
        CO2porKm = CO2Total / (d1 + d2 + d3);
        System.out.println("COTotal2 = " + CO2Total + " kg");
        System.out.println("COporKm2 = " + CO2porKm + " kg/km");
        
        double vprom_mps;
        double galTot = 4.3060;
        double vnorm = 0.242;
        vprom_mps = vprom * 1000 / 3600;
        galTot = (l1 + l2 + l3) * galPorLitro;
        vnorm = (vprom - vmin) / (vmax - vmin);

        System.out.println("vprom_mps = " + vprom_mps + " m/s");
        System.out.println("galTot = " + galTot + " gal");
        System.out.println("vnorm = " + vnorm);

        double vmedia = 47.727;
        double  vpond_t = 47.059;
        double sigma;
        vmedia = (v1 + v2 + v3) / 3;
        sigma = Math.sqrt((Math.pow(v1 - vmedia, 2) + Math.pow(v2 - vmedia, 2) + Math.pow(v3 - vmedia, 2)) / 3);
        vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

        System.out.println("vmedia = " + vmedia);
        System.out.println("sigma = " + sigma);
        System.out.println("vpond_t = " + vpond_t);

        double c_vprom;
        double costoMant;
        c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
        costoMant = c_vprom * (d1 + d2 + d3);
        System.out.println("c(vprom) = " + c_vprom);
        System.out.println("costoMant = " + costoMant);

        double kmlModelo = 6.043;
        double LitrosModelo = 26.478;
        kmlModelo = a * Math.pow(vprom, 2) + b * vprom + c;
        LitrosModelo = (d1 + d2 + d3) / kmlModelo;

        System.out.println("kmlModelo = " + kmlModelo);
        System.out.println("litrosModelo = " + LitrosModelo);

        double Score = 3.6777;
        double w1 = 0, w2 = 0, w3 = 0, w4 = 0;
        Score = w1 * (1.0 / costoPorKm)+ w2 * kmltotal + w3 * (1.0 / CO2porKm)+ w4 * (1.0 / (1.0 + sigma));

        System.out.println("Score = " + Score);
        





        






        

        









    }
    
}
