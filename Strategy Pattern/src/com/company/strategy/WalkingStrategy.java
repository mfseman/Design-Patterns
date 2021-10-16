package com.company.strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public String buildRoute(int originCoordinates, int destinationCoordinates) {
        return "Coordinates for Walking Route";
    }
}