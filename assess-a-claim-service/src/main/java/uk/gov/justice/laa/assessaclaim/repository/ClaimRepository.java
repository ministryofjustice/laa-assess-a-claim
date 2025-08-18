package uk.gov.justice.laa.assessaclaim.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.gov.justice.laa.assessaclaim.entity.ClaimEntity;

/** Repository for managing claim entities. */
@Repository
public interface ClaimRepository extends JpaRepository<ClaimEntity, Long> {

  List<ClaimEntity> findBySubmissionId(UUID submissionId);
}
