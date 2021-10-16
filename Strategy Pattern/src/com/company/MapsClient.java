package com.company;

import com.company.strategy.RoadStrategy;
import com.company.strategy.PublicTransportationStrategy;
import com.company.strategy.WalkingStrategy;

public class MapsClient {

    public static void main(String[] args) {
        Navigator context = new Navigator(new RoadStrategy());
        System.out.println(context.buildRoute(10, 5));

        context = new Navigator(new WalkingStrategy());
        System.out.println(context.buildRoute(10, 5));

        context = new Navigator(new PublicTransportationStrategy());
        System.out.println(context.buildRoute(10, 5));
    }
}
