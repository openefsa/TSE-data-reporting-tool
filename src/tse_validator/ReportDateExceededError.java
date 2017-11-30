package tse_validator;

import java.util.Arrays;
import java.util.Collection;

import report_validator.ReportError;

public class ReportDateExceededError implements ReportError {

	private String rowId;
	private String reportYear;
	private String reportMonth;
	private String birthYear;
	private String birthMonth;
	
	/**
	 * 
	 * @param rowId
	 * @param ageClass
	 * @param monthsFound
	 */
	public ReportDateExceededError(String rowId, String reportYear, 
			String reportMonth, String birthYear, String birthMonth) {
		this.rowId = rowId;
		this.reportYear = reportYear;
		this.reportMonth = reportMonth;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
	}
	
	@Override
	public ErrorType getTypeOfError() {
		return ErrorType.ERROR;
	}

	@Override
	public String getErrorMessage() {
		return "Invalid birth year/month selected. Birth should be prior to report date (" 
				+ reportMonth + " " + reportYear + ")";
	}

	@Override
	public Collection<String> getInvolvedRowsIdsMessage() {
		return Arrays.asList(rowId);
	}

	@Override
	public String getCorrectExample() {
		return null;
	}

	@Override
	public Collection<String> getErroneousValues() {
		return Arrays.asList(birthMonth + " " + birthYear);
	}

}
