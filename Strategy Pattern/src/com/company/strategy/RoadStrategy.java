package com.company.strategy;

public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRoute(int originCoordinates, int destinationCoordinates) {
        return "Coordinates for Driving Route";
    }
}