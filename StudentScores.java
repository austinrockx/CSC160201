// Austin Bennett
// CSC 160 Computer Science 1:
// August 9, 2021

package csc160Assignments;

public class StudentScores {

	//The weight averages for the attributes.
	public static double weightAssignments = .4;
	public static double weightTests = .2;
	public static double weightParticipation = .2;
	
	private double [] assignments = new double[3]; //Extra Credit: An array of three assignments
	/**
	 * Decide to do extra extra credit:
	 * Holding the tests scores in an array as well.
	 */
	private double [] tests = new double[2];
	private double participationScore; // Participation score
	
	/**
	 * Down below are the setters and getters for each of the six attributes.
	 * Getters: @return (double) the attributes as they are.
	 * Setters: Sets the attributes and checks if the score is too high or too low.
	 * See CheckScoreEntry method down below.
	 */
	
	public double getAssignment1() { return this.assignments[0]; }
	public void setAssignment1(double a1)
			throws ScoreTooHighException, ScoreTooLowException {
		assignments[0] = CheckScoreEntry(a1);
	}
	
	public double getAssignment2() { return assignments[1]; }
	public void setAssignment2(double a2) 
			throws ScoreTooHighException, ScoreTooLowException {
		assignments[1] = CheckScoreEntry(a2);
	}
	
	public double getAssignment3() { return assignments[2]; }
	public void setAssignment3(double a3) 
			throws ScoreTooHighException, ScoreTooLowException {
		assignments[2] = CheckScoreEntry(a3);
	}
	
	public double getTest1() { return tests[0]; }
	public void setTest1(double t1) 
			throws ScoreTooHighException, ScoreTooLowException {
		tests[0] = CheckScoreEntry(t1);
	}
	
	public double getTest2() { return tests[1]; }
	public void setTest2(double t2) 
			throws ScoreTooHighException, ScoreTooLowException {
		tests[1] = CheckScoreEntry(t2);
	}
	
	public double getParticipationScore() { return participationScore; }
	public void setParticipationScore(double pS) 
			throws ScoreTooHighException, ScoreTooLowException {
		participationScore = CheckScoreEntry(pS);
	}

	/**
	 * Checks the provided score to ensure it is greater than or equal to zero
	 * and less than or equal to 100.
	 * 
	 * @param score - (double) Score to be checked
	 * @return (double) Returns a valid score.
	 * @throws ScoreTooHighException
	 * @throws ScoreTooLowException
	 */
	private double CheckScoreEntry(double score) throws ScoreTooHighException, ScoreTooLowException {
		if (score < 0.0) {
			throw new ScoreTooLowException();
		}
		if (score > 100.0) {
			throw new ScoreTooHighException();
		}
		return score;
	}
}
