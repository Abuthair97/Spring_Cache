package Abu.dev.Spring_cache.service;/*
 *Created by Abuthair
 * Date:30/03/2024
 * time:21:21
 *projectName:Spring_cache

 */

import Abu.dev.Spring_cache.model.Car;
import Abu.dev.Spring_cache.repository.ICarRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ICarServiceImpl implements  ICarService{

    private ICarRepo repository;
    public ICarServiceImpl(ICarRepo repository) {
        this.repository = repository;
    }
    @Override
    public List<Car> getAll() {
        List<Car> result = repository.findAll();
        return result;
    }

    @Override
    public Car createCar(String brand, String carModel) {
        Car newCar = new Car();
       newCar.setBrand(brand);
       newCar.setCarModel(carModel);
        return  repository.save(newCar);
    }

    @Override
    public Car getByCarId(Long id) {
        return repository.findById(id).get();
    }

}
