package section20;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	protected abstract void getReady();

	protected abstract void doTheDish();

	protected abstract void cleanup();
}