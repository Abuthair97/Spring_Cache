package Abu.dev.Spring_cache.repository;/*
 *Created by Abuthair
 * Date:30/03/2024
 * time:21:14
 *projectName:Spring_cache

 */

import Abu.dev.Spring_cache.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepo extends JpaRepository<Car,Long> {
}
