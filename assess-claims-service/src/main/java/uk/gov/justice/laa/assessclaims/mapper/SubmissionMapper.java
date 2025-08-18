package uk.gov.justice.laa.assessaclaim.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uk.gov.justice.laa.assessaclaim.entity.SubmissionEntity;
import uk.gov.justice.laa.assessaclaim.model.Submission;

/** The mapper between Submission and SubmissionEntity. */
@Mapper(componentModel = "spring")
public interface SubmissionMapper {

  /**
   * Maps the given submission entity to an submission.
   *
   * @param submissionEntity the submission entity without claims
   * @return the submission
   */
  @Mapping(target = "claims", ignore = true)
  Submission toSubmission(SubmissionEntity submissionEntity);

  /**
   * Maps the given submission to an submission entity.
   *
   * @param submission the submission
   * @return the submission entity
   */
  SubmissionEntity toSubmissionEntity(Submission submission);
}
