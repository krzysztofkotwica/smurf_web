package smurf;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SkiSlopeRepository extends JpaRepository<SkiSlope, Long> {
	Optional<SkiSlope> findById(Long id);
}
