package model.demand;

import model.ice_cream_van.Location;

public record Demand(String customerName, int numberOfPeople, String dietaryRequirements, Location location, DemandStatus status) {

}
