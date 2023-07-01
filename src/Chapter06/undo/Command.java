package Chapter06.undo;

public interface Command {
	public void execute();
	public void undo();
}
