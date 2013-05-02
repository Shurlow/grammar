package edu.macalester.cs124.grammar;

import java.util.List;
import java.util.ArrayList;


/**
 * A substitution rule that performs multiple child substitutions in order.
 */
public class Sequence implements Substitution {
    
	private List<Substitution> subList = new ArrayList<Substitution>();
	
    /**
     * Adds a new child substitution to the end of this sequence.
     */
    public void add(Substitution sub) {
        subList.add(sub);
    }
    
    /**
     * Calls generate() on each children substitution in turn.
     */
    @Override
    public void generate(GeneratorContext context) {
    	for(Substitution s : subList)
    		s.generate(context);
    }
}
