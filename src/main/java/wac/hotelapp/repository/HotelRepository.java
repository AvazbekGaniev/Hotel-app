package wac.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wac.hotelapp.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
