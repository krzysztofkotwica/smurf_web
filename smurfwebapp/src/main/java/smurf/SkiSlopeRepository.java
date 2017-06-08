package smurf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SkiSlopeRepository extends JpaRepository<SkiSlope, Long> {
	Optional<SkiSlope> findById(Long id);

	@Query("SELECT s FROM SkiSlope s WHERE s.latitude <= ( :lat + 0.99) AND s.latitude >= ( :lat - 0.99 ) AND s.longitude >= ( :lng - 0.99 ) AND s.longitude <= ( :lng + 0.99 )")
	List<SkiSlope> findByLatitudeAndLongitude(@Param("lat") double lat, @Param("lng") double lng);
}
