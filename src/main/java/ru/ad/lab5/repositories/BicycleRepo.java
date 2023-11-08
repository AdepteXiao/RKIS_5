package ru.ad.lab5.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ad.lab5.models.Bicycle;

@Repository
public interface BicycleRepo extends JpaRepository<Bicycle, Integer> {

  List<Bicycle> findByPriceLessThan(float price);

}
