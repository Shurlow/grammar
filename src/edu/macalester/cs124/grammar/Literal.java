package edu.macalester.cs124.grammar;

/**
 * A substitution that always generates the same string.
 */
public class Literal implements Substitution {
	
	private String rememberValue;
    
    /**
     * @param value The output of this generator.
     */
    public Literal(String value) {
        rememberValue = value;
    }
    
    /**
     * Appends this literal's value to the context's result.
     */
    @Override
    public void generate(GeneratorContext context) {
        context.getResult().append(rememberValue);
    }
}




//Substitution pope = new Literal("POPE");
//

// pope.generate(context);
//pope.generate(context);
//pope.generate(context);

