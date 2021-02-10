package pl.pjatk.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.demo.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
}
