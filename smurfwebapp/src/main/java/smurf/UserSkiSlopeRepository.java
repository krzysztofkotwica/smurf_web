package smurf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserSkiSlopeRepository extends JpaRepository<UserSkiSlope, Long> {

	@Query("SELECT us.skiSlope FROM UserSkiSlope us where us.user.id = :id")
	List<SkiSlope> findSkiSlopeByUserId(@Param("id") Long id);
}
