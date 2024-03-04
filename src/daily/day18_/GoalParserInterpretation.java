package daily.day18_;

// 1678. Goal Parser Interpretation
public class GoalParserInterpretation {
	public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
