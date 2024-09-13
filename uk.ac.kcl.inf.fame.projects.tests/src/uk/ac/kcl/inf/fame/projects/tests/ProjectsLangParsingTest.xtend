/*
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.fame.projects.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import uk.ac.kcl.inf.fame.projects.projectsLang.Project

@ExtendWith(InjectionExtension)
@InjectWith(ProjectsLangInjectorProvider)
class ProjectsLangParsingTest {
	@Inject
	ParseHelper<Project> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
