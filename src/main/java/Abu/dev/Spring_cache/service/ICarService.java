package Abu.dev.Spring_cache.service;/*
 *Created by Abuthair
 * Date:30/03/2024
 * time:21:17
 *projectName:Spring_cache

 */

import Abu.dev.Spring_cache.model.Car;
import org.springframework.data.domain.Page;

import java.util.List;


public interface ICarService {
    List<Car> getAll();
    Car createCar(String brand,String carModel);

    Car getByCarId(Long id);
}
