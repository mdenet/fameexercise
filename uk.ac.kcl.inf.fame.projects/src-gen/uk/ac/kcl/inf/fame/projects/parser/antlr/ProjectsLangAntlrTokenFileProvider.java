/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.fame.projects.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ProjectsLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/fame/projects/parser/antlr/internal/InternalProjectsLang.tokens");
	}
}
