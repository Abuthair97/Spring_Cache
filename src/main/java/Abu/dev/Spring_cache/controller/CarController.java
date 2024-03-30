package Abu.dev.Spring_cache.controller;/*
 *Created by Abuthair
 * Date:30/03/2024
 * time:21:33
 *projectName:Spring_cache

 */

import Abu.dev.Spring_cache.model.Car;
import Abu.dev.Spring_cache.service.ICarService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
 private ICarService carService;
 public CarController (ICarService carService) {
     this.carService = carService;
 }

  @Cacheable(value = "car")
  @GetMapping("/car")
   public List<Car> getAll(){
     return carService.getAll();
   }
    @CachePut(value = "car", key = "#car.id", unless = "#car.brand !=null ")
    @PostMapping("/car")
    Car createCar(@RequestBody Car car){
     return carService.createCar(car.getBrand(), car.getCarModel());
    }
    @Cacheable(value = "car")
    @GetMapping("/car/{id}")
    Car getByCarId(@PathVariable("id") Long id){
     return carService.getByCarId(id);
    }

}
