package com.company.lecciones.leccion1.coche.interfaces;

import com.company.lecciones.leccion1.coche.Coche;
import com.company.lecciones.leccion1.coche.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Se ha creado un coche deportivo");
        return new CocheElectrico("negro","mercedes","yaris",3500.99, 5.50,"JKL");
    }
}
