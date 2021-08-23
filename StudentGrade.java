// Austin Bennett
// CSC 160 Computer Science 1:
// August 9, 2021

package csc160Assignments;

public class StudentGrade {
	
	/**
	 * The StudentScores class stores all the scores that will be used in the
	 * calculations below.
	 */
	private StudentScores ss;
	
	// Default Constructor.
	public StudentGrade() throws ScoreTooHighException, ScoreTooLowException {
		StudentGradeInit(1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
	}
	
	// Constructor that accepts the StudentScores object
	public StudentGrade(StudentScores s) {
		ss = s;
	}

	// Constructor that initializes the six attributes in the StudentScores object.
	public StudentGrade(double a1, double a2, double a3, double t1, double t2, double pS)
			throws ScoreTooHighException, ScoreTooLowException {
		StudentGradeInit(a1, a2, a3, t1, t2, pS);
	}
	
	/**
	 *  Builds and helps simplify the constructors using StudentScores object.
	 * @param a1
	 * @param a2
	 * @param a3
	 * @param t1
	 * @param t2
	 * @param pS
	 * @throws ScoreTooHighException
	 * @throws ScoreTooLowException
	 */
	private void StudentGradeInit(double a1, double a2, double a3, double t1, double t2, double pS)
			throws ScoreTooHighException, ScoreTooLowException {
		ss.setAssignment1(a1);
		ss.setAssignment2(a2);
		ss.setAssignment3(a3);
		ss.setTest1(t1);
		ss.setTest2(t2);
		ss.setParticipationScore(pS);
	}
	
	// Calculates the final score, uses weights and weighted averages.
	public double calculateScore() {
		
		// First get the average of the three assignments, then takes 40% away.
		double assignmentsScores = 
				(ss.getAssignment1() + ss.getAssignment2() + ss.getAssignment3()) / 3 * 
				StudentScores.weightAssignments;
		
		// Takes 20% away of each test score.
		double test1Score = ss.getTest1() * StudentScores.weightTests;
		double test2Score = ss.getTest2() * StudentScores.weightTests;
		
		// Takes away 20% of Participation Score
		double participationFinal = ss.getParticipationScore() *
				StudentScores.weightParticipation;
		
		return assignmentsScores + test1Score + test2Score + participationFinal;
	}
	
	// This returns the grade letter you receive for you final score.
	public char calculateGrade(double tS) {
		if(tS >= 90) { // If tS is greater than 90, return A
			return 'A';
		}
		if(tS >= 80) { // If tS is greater than 80, return B
			return 'B';
		}
		if(tS >= 70) { // If tS is greater than 70, return C
			return 'C';
		}
		if(tS >= 60) { // If tS is greater than 60, return D
			return 'D';
		}
		return 'F'; // Default: return F.
	}
}
