package com.getirbootcamp.realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.getirbootcamp.realestate.model.House;
import com.getirbootcamp.realestate.service.HouseService;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class RealestateApplication implements CommandLineRunner {

	private final HouseService houseService;

	public RealestateApplication(HouseService houseService) {
		this.houseService = houseService;
	}

	public static void main(String[] args) {
		SpringApplication.run(RealestateApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("===== TOTAL PRICES =====");
		System.out.println("Classic Houses: " + houseService.getTotalPriceOfClassicHouses() + "₺");
		System.out.println("Villas        : " + houseService.getTotalPriceOfVillas() + "₺");
		System.out.println("Summer Houses : " + houseService.getTotalPriceOfSummerHouses() + "₺");
		System.out.println("All Houses    : " + houseService.getTotalPriceOfAllHouses() + "₺");

		System.out.println("\n===== AVERAGE SQUARE METERS =====");
		System.out.println("Classic Houses: " + houseService.getAverageSquareMeterOfClassicHouses() + " m²");
		System.out.println("Villas        : " + houseService.getAverageSquareMeterOfVillas() + " m²");
		System.out.println("Summer Houses : " + houseService.getAverageSquareMeterOfSummerHouses() + " m²");
		System.out.println("All Houses    : " + houseService.getAverageSquareMeterOfAllHouses() + " m²");

		System.out.println("\n===== FILTERED HOUSES (4 rooms & 2 living rooms) =====");
		List<House> filteredHouses = houseService.filterHousesByRoomAndLivingRoom(4, 2);
		if (filteredHouses.isEmpty()) {
			System.out.println("No houses found with 4 rooms and 2 living rooms.");
		} else {
			for (House house : filteredHouses) {
				System.out.println("- " + house.getClass().getSimpleName() +
						" | Price: " + house.getPrice() +
						"₺ | Size: " + house.getSquareMeter() + " m²");
			}
		}
	}
}

