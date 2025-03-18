package protection.member.aqours_data.sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import protection.member.aqours_data.sql.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer> {
    UserData findByEmail(String email);
}
