package com.getirbootcamp.realestate.repository;

import com.getirbootcamp.realestate.model.ClassicHouse;
import com.getirbootcamp.realestate.model.House;
import com.getirbootcamp.realestate.model.SummerHouse;
import com.getirbootcamp.realestate.model.Villa;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class HouseRepo {
    private final List<ClassicHouse> classicHouses;
    private final List<Villa> villas;
    private final List<SummerHouse> summerHouses;

    public List<ClassicHouse> getClassicHouses() {
        return classicHouses;
    }

    public List<Villa> getVillas() {
        return villas;
    }

    public List<SummerHouse> getSummerHouses() {
        return summerHouses;
    }

    public HouseRepo() {
        classicHouses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();



        classicHouses.add(new ClassicHouse(1000000, 100, 3, 1));
        classicHouses.add(new ClassicHouse(1200000, 120, 4, 1));
        classicHouses.add(new ClassicHouse(1300000, 130, 3, 2));

        villas.add(new Villa(3000000, 200, 5, 2));
        villas.add(new Villa(3200000, 220, 6, 2));
        villas.add(new Villa(3100000, 210, 5, 2));

        summerHouses.add(new SummerHouse(1500000, 150, 4, 1));
        summerHouses.add(new SummerHouse(1600000, 155, 3, 1));
        summerHouses.add(new SummerHouse(1700000, 160, 4, 2));
    }

    public List<House> getAllHouses() {
        List<House> all = new ArrayList<>();
        all.addAll(classicHouses);
        all.addAll(villas);
        all.addAll(summerHouses);
        return all;
    }
}