package uk.gov.justice.laa.assessaclaim.exception;

/**
 * The exception thrown when claim not found.
 */
public class ClaimNotFoundException extends RuntimeException {

  /**
   * Constructor for ClaimNotFoundException.
   *
   * @param message the error message
   */
  public ClaimNotFoundException(String message) {
    super(message);
  }
}
