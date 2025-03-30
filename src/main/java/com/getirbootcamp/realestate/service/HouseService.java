package com.getirbootcamp.realestate.service;

import com.getirbootcamp.realestate.model.*;
import com.getirbootcamp.realestate.repository.HouseRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseService {

    private final HouseRepo houseRepo;

    public HouseService(HouseRepo houseRepo) {
        this.houseRepo = houseRepo;
    }

    public int getTotalPriceOfClassicHouses() {
        return houseRepo.getClassicHouses().stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public int getTotalPriceOfVillas() {
        return houseRepo.getVillas().stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public int getTotalPriceOfSummerHouses() {
        return houseRepo.getSummerHouses().stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public int getTotalPriceOfAllHouses() {
        return houseRepo.getAllHouses().stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    public double getAverageSquareMeterOfClassicHouses() {
        return houseRepo.getClassicHouses().stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfVillas() {
        return houseRepo.getVillas().stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfSummerHouses() {
        return houseRepo.getSummerHouses().stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }

    public double getAverageSquareMeterOfAllHouses() {
        return houseRepo.getAllHouses().stream()
                .mapToInt(House::getSquareMeter)
                .average()
                .orElse(0);
    }


    public List<House> filterHousesByRoomAndLivingRoom(int roomCount, int livingRoomCount) {
        return houseRepo.getAllHouses().stream()
                .filter(h -> h.getNumberOfRooms() == roomCount && h.getNumberOfLivingRooms() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
