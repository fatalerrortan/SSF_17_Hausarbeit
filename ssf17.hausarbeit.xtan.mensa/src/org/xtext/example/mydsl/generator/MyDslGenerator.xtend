/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Header
import org.xtext.example.mydsl.myDsl.NAV
import org.xtext.example.mydsl.myDsl.Siderbar
import org.xtext.example.mydsl.myDsl.Footer
import org.xtext.example.mydsl.myDsl.Link
import org.xtext.example.mydsl.myDsl.Button
import org.xtext.example.mydsl.myDsl.Selector
import org.xtext.example.mydsl.myDsl.Radio
import org.xtext.example.mydsl.myDsl.Checkbox
import org.xtext.example.mydsl.myDsl.Menu
//import java.io.FileReader
//import java.io.BufferedReader

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
//	@Inject extension IQualifiedNameProvider	
//	String fileName = "/ssf17.hausarbeit.xtan.mensa/styles/css/bootstrap.css";
//	FileReader fileReader = new FileReader(fileName);
//	BufferedReader bufferedReader = new BufferedReader(fileReader);
//	public String css_file = bufferedReader.toString();
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
   	val header_html = '''
   			    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
   			        <div class="container">
   			            <div class="navbar-header">
   			                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
   			                    <span class="sr-only">Toggle navigation</span>
   			                    <span class="icon-bar"></span>
   			                    <span class="icon-bar"></span>
   			                    <span class="icon-bar"></span>
   			                </button>
   			                <a class="navbar-brand" href="#">Mensa</a>
   			            </div>
   			            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
   			                <ul class="nav navbar-nav">
   			                   				«FOR Header header_html : resource.allContents.toIterable.filter(Header)»
   			                   					<h1>«header_html.description.name»</h1>
   			                   					«FOR NAV nav : header_html.nav»
   			                   						<li>
   			                   							<a href="«nav.href»">«nav.name»</a>
   			                   						</li>	
   			                   					«ENDFOR»
   			                   				«ENDFOR»
   			                </ul>
   			            </div>
   			        </div>
   			    </nav>  
		'''
	val siderbar_html = '''
				       <div class="col-md-4">
				                «FOR Siderbar siderbar_html : resource.allContents.toIterable.filter(Siderbar)»
				                <div class="well">				                 
				                     	<h4>«siderbar_html.description.name»</h4>
«««				                     	 Generator for Button
				                     	 «FOR Button tool : siderbar_html.button»
				                     	 	<div class='mensa_button'>
				                     	 		<h5>«tool.title.name»</h5>
				                     	 		<button type="button" class="btn btn-info">«tool.name»</button>
				                     	 	</div>
				                     	 «ENDFOR»
«««				                     	 Generator for select
				                     	 «FOR Selector tool : siderbar_html.selector»
				                     	 	<div class="mensa_select">
				                     	 		<h5>«tool.title.name»</h5>
				                     	 		<select>
				                     	 			«FOR option : tool.options»	
				                     	 				<option value="«option»">«option»</option>
				                     	 			«ENDFOR»			              	
				                     	 		</select>
				                     	 	</div>
				           				  «ENDFOR»
«««				           				  Generator for Radio
										  «FOR Radio tool : siderbar_html.radio»
											<div class="mensa_raido">
												<h5>«tool.title.name»</h5>								
														«FOR option : tool.options»	
														  <label class="radio-inline"><input type="radio" name="optradio">
														  	«option»
														  </label>
						                   	 			«ENDFOR»			              	
												</div>
				           				  «ENDFOR»
«««				           				  Generator for Checkbox
										  «FOR Checkbox tool : siderbar_html.checkbox»
											<div class="mensa_checkbox">
												<h5>«tool.title.name»</h5>								
														«FOR option : tool.options»	
															<label class="checkbox-inline"><input type="checkbox" value="">
														  	  «option»
														  	</label>
						                   	 			«ENDFOR»			              	
												</div>
				           				  «ENDFOR»
				                  		</div>
				                  		<br />
				                    «ENDFOR»
				            </div>
		'''
 	val footer_html = '''
 			        <footer>
 			        			<div class="col-md-2 placeholder"></div>
 			                    «FOR Footer footer_html : resource.allContents.toIterable.filter(Footer)»
 			                    <div class="col-md-2">
 			                       	<h4>«footer_html.description.name»</h4>
 			                     	«FOR Link link : footer_html.links»
 			                     	<p><a href="«link.url»">«link.name»</a></p>
 			                       «ENDFOR»
 			                     </div> 	
 			                    «ENDFOR»			          	      		          
 			        </footer>
		'''
	val menus_html = '''
			<div class="col-md-8">
				<div class="well">
					<h1>Speiseplan</h1>
					<ul>
					«FOR Menu menu_html : resource.allContents.toIterable.filter(Menu)»
«««					 	<h1>«footer_html.description.name»</h1>
«««					 		«FOR Link link : footer_html.links»
«««					 			<p><a href="«link.url»">«link.name»</a></p>
«««					 		«ENDFOR»
						<li>
							<h3>«menu_html.meal»</h3>
							<div class="row">
								<div class="col-md-3">
									<img src="./imgs/«menu_html.image»" alt="«menu_html.meal»" width="180px" height="180px" />
									<h5>«menu_html.price» €</h5>
								</div>
								<div class="col-md-9">
									<span style="border: 1px solid #4285F4;">«menu_html.description.name»</span>
								</div>	
							</div>	
						</li>
					  «ENDFOR»
					  </ul>
				</div>
			</div>
			<hr />
		'''
	val html = '''
			<!DOCTYPE html>
			<html>
				<head>
					<head>
					    <meta charset="utf-8">
					    <meta http-equiv="X-UA-Compatible" content="IE=edge">
					    <meta name="viewport" content="width=device-width, initial-scale=1">
					    <title>Mensa Speiseplan</title>
					    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
«««					    <link href="css/blog-home.css" rel="stylesheet">
					</head>
				</head>
				<body>
					<div class="row">
						«header_html»
					</div>	
					<br /><br /><br /><br /><br /><br /><br />
					<div class="row">
						«menus_html»
						«siderbar_html»
					</div>
					<div class="row">
						«footer_html»	
					</div>
					<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
				</body>
			</html>
		'''
//   	generate food menu html structure
   	fsa.generateFile('mensa_speiseplan.html', html.toString());
//   	generate image folder
//	fsa.generateFile('imgs/readme.txt', 'Please place mensa related images in this folder');	
	}
}