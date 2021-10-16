package com.company;

import com.company.strategy.RouteStrategy;

public class Navigator {

    private RouteStrategy algorithm;

    public Navigator(RouteStrategy strategy) {
        this.algorithm = strategy;
    }

    public String buildRoute(int originCoordinates, int destinationCoordinates) {
        return algorithm.buildRoute(originCoordinates, destinationCoordinates);
    }
}
