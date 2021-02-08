package pl.pjatk.usedCarDealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.usedCarDealer.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
