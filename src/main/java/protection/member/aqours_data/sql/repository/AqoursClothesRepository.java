package protection.member.aqours_data.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import protection.member.aqours_data.sql.AqoursClothesData;

public interface AqoursClothesRepository extends JpaRepository<AqoursClothesData, Integer> {
}
