package section20;

public class Recipe1 extends AbstractRecipe {

	@Override
	protected void getReady() {
		System.out.println("ready 1");
		
	}

	@Override
	protected void doTheDish() {
		System.out.println("dotheDish 1");
		
	}

	@Override
	protected void cleanup() {
		System.out.println("cleanup 1");
		
	}
	
	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
	}
}
