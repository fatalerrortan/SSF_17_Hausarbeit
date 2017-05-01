/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.example.mydsl.myDsl.Tag


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    
   	val html = '''
			<!DOCTYPE html>
			<html>
			<head>
				<title>Greetings, Earthlings!</title>
			</head>
			<body>
					«FOR Tag tag : resource.allContents.toIterable.filter(Tag)»
«««						<li>«person.name.escapeHtml4()» from «person.homeTown.escapeHtml4()»</li>
						<«tag.name» id="«tag.id.name»">
							«tag.content.name»
						<«tag.name»/>	
					«ENDFOR»
				
				
			</body>
			</html>
		'''
   	
   	
   	fsa.generateFile('mensa_speiseplan.html', html.toString());

	}
//	    def htmlGenerator(){
//    	
//    }
}