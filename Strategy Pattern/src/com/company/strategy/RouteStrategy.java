package com.company.strategy;

public interface RouteStrategy {
    String buildRoute(int originCoordinates, int destinationCoordinates);
}