package com.company.strategy;

public class PublicTransportationStrategy implements RouteStrategy {
    @Override
    public String buildRoute(int originCoordinates, int destinationCoordinates) {
        return "Coordinates for Public Transportation";
    }
}