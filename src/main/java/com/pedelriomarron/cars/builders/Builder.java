package com.pedelriomarron.cars.builders;

import com.pedelriomarron.cars.cars.CarType;
import com.pedelriomarron.cars.components.Engine;
import com.pedelriomarron.cars.components.GPSNavigator;
import com.pedelriomarron.cars.components.Transmission;
import com.pedelriomarron.cars.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}