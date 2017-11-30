package tse_validator;

import java.util.Arrays;
import java.util.Collection;

import report_validator.ReportError;

public class NoTestSpecifiedError implements ReportError {

	private String caseId;
	
	public NoTestSpecifiedError(String caseId) {
		this.caseId = caseId;
	}
	
	@Override
	public ErrorType getTypeOfError() {
		return ErrorType.ERROR;
	}

	@Override
	public String getErrorMessage() {
		return "No analytical result was specified in the case";
	}

	@Override
	public Collection<String> getInvolvedRowsIdsMessage() {
		return Arrays.asList(caseId);
	}

	@Override
	public String getCorrectExample() {
		return null;
	}

	@Override
	public Collection<String> getErroneousValues() {
		return null;
	}

}
