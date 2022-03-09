public class Recetas{
	public static void main (String []args){
	
		String ingredientePrincipal = args[0];
		switch(ingredientePrincipal){
			case "tomate":
				System.out.println("Picar tomate y alinnar");
				break;
			case "queso":		
				System.out.println("derretir e incorporar");
				break;
			default:
				System.out.println("no quedo la pizza");
							
		}
	}
}