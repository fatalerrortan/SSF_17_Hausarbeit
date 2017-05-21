/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MensamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Mensamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeaderAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHeaderHeaderParserRuleCall_0_0 = (RuleCall)cHeaderAssignment_0.eContents().get(0);
		private final Assignment cSiderbarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSiderbarSiderbarParserRuleCall_1_0 = (RuleCall)cSiderbarAssignment_1.eContents().get(0);
		private final Assignment cFooterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFooterFooterParserRuleCall_2_0 = (RuleCall)cFooterAssignment_2.eContents().get(0);
		private final Assignment cMenusAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMenusMenuParserRuleCall_3_0 = (RuleCall)cMenusAssignment_3.eContents().get(0);
		
		/// *
		// * This Grammar defines that:
		// * A website consists of 
		// * 	- a header with title description and navigation links
		// * 	- multiple siderbars with necessary configurable components (Button, Checkbox, Radio and Select)
		// * 	- multiple menu blocks(each block contains a menu with Name, Description, Image and Price)
		// *  - footer with multiple links groups
		// * / Mensamodel:
		//	header=Header
		//	siderbar+=Siderbar*
		//	footer+=Footer*
		//	menus+=Menu*;
		@Override public ParserRule getRule() { return rule; }
		
		//header=Header siderbar+=Siderbar* footer+=Footer* menus+=Menu*
		public Group getGroup() { return cGroup; }
		
		//header=Header
		public Assignment getHeaderAssignment_0() { return cHeaderAssignment_0; }
		
		//Header
		public RuleCall getHeaderHeaderParserRuleCall_0_0() { return cHeaderHeaderParserRuleCall_0_0; }
		
		//siderbar+=Siderbar*
		public Assignment getSiderbarAssignment_1() { return cSiderbarAssignment_1; }
		
		//Siderbar
		public RuleCall getSiderbarSiderbarParserRuleCall_1_0() { return cSiderbarSiderbarParserRuleCall_1_0; }
		
		//footer+=Footer*
		public Assignment getFooterAssignment_2() { return cFooterAssignment_2; }
		
		//Footer
		public RuleCall getFooterFooterParserRuleCall_2_0() { return cFooterFooterParserRuleCall_2_0; }
		
		//menus+=Menu*
		public Assignment getMenusAssignment_3() { return cMenusAssignment_3; }
		
		//Menu
		public RuleCall getMenusMenuParserRuleCall_3_0() { return cMenusMenuParserRuleCall_3_0; }
	}
	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeaderKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cNavAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNavNAVParserRuleCall_4_0 = (RuleCall)cNavAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Header:
		//	'header' name=ID '{'
		//	description=Description
		//	nav+=NAV*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'header' name=ID '{' description=Description nav+=NAV* '}'
		public Group getGroup() { return cGroup; }
		
		//'header'
		public Keyword getHeaderKeyword_0() { return cHeaderKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//nav+=NAV*
		public Assignment getNavAssignment_4() { return cNavAssignment_4; }
		
		//NAV
		public RuleCall getNavNAVParserRuleCall_4_0() { return cNavNAVParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class SiderbarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Siderbar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSiderbarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cRadioAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRadioRadioParserRuleCall_4_0 = (RuleCall)cRadioAssignment_4.eContents().get(0);
		private final Assignment cCheckboxAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCheckboxCheckboxParserRuleCall_5_0 = (RuleCall)cCheckboxAssignment_5.eContents().get(0);
		private final Assignment cSelectorAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSelectorSelectorParserRuleCall_6_0 = (RuleCall)cSelectorAssignment_6.eContents().get(0);
		private final Assignment cButtonAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cButtonButtonParserRuleCall_7_0 = (RuleCall)cButtonAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Siderbar:
		//	'siderbar' name=ID '{'
		//	description=Description
		//	radio+=Radio*
		//	checkbox+=Checkbox*
		//	selector+=Selector*
		//	button+=Button*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'siderbar' name=ID '{' description=Description radio+=Radio* checkbox+=Checkbox* selector+=Selector* button+=Button* '}'
		public Group getGroup() { return cGroup; }
		
		//'siderbar'
		public Keyword getSiderbarKeyword_0() { return cSiderbarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//radio+=Radio*
		public Assignment getRadioAssignment_4() { return cRadioAssignment_4; }
		
		//Radio
		public RuleCall getRadioRadioParserRuleCall_4_0() { return cRadioRadioParserRuleCall_4_0; }
		
		//checkbox+=Checkbox*
		public Assignment getCheckboxAssignment_5() { return cCheckboxAssignment_5; }
		
		//Checkbox
		public RuleCall getCheckboxCheckboxParserRuleCall_5_0() { return cCheckboxCheckboxParserRuleCall_5_0; }
		
		//selector+=Selector*
		public Assignment getSelectorAssignment_6() { return cSelectorAssignment_6; }
		
		//Selector
		public RuleCall getSelectorSelectorParserRuleCall_6_0() { return cSelectorSelectorParserRuleCall_6_0; }
		
		//button+=Button*
		public Assignment getButtonAssignment_7() { return cButtonAssignment_7; }
		
		//Button
		public RuleCall getButtonButtonParserRuleCall_7_0() { return cButtonButtonParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class FooterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Footer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFooterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cLinksAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLinksLinkParserRuleCall_4_0 = (RuleCall)cLinksAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Footer:
		//	'footer' name=ID '{'
		//	description=Description
		//	links+=Link*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'footer' name=ID '{' description=Description links+=Link* '}'
		public Group getGroup() { return cGroup; }
		
		//'footer'
		public Keyword getFooterKeyword_0() { return cFooterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//links+=Link*
		public Assignment getLinksAssignment_4() { return cLinksAssignment_4; }
		
		//Link
		public RuleCall getLinksLinkParserRuleCall_4_0() { return cLinksLinkParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Description");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDescriptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Description:
		//	'description' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'description' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'description'
		public Keyword getDescriptionKeyword_0() { return cDescriptionKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class NAVElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.NAV");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Keyword cHrefKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cHrefAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cHrefSTRINGTerminalRuleCall_5_0 = (RuleCall)cHrefAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//NAV:
		//	'nav' name=ID '{'
		//	description=Description
		//	'href' href=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'nav' name=ID '{' description=Description 'href' href=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'nav'
		public Keyword getNavKeyword_0() { return cNavKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//'href'
		public Keyword getHrefKeyword_4() { return cHrefKeyword_4; }
		
		//href=STRING
		public Assignment getHrefAssignment_5() { return cHrefAssignment_5; }
		
		//STRING
		public RuleCall getHrefSTRINGTerminalRuleCall_5_0() { return cHrefSTRINGTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class RadioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Radio");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRadioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOptionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOptionsSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cOptionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Radio:
		//	'radio' name=ID '{'
		//	title=Description ('option' options+=STRING)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'radio' name=ID '{' title=Description ('option' options+=STRING)* '}'
		public Group getGroup() { return cGroup; }
		
		//'radio'
		public Keyword getRadioKeyword_0() { return cRadioKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//('option' options+=STRING)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'option'
		public Keyword getOptionKeyword_4_0() { return cOptionKeyword_4_0; }
		
		//options+=STRING
		public Assignment getOptionsAssignment_4_1() { return cOptionsAssignment_4_1; }
		
		//STRING
		public RuleCall getOptionsSTRINGTerminalRuleCall_4_1_0() { return cOptionsSTRINGTerminalRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class CheckboxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Checkbox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCheckboxKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOptionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOptionsSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cOptionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Checkbox:
		//	'checkbox' name=ID '{'
		//	title=Description ('option' options+=STRING)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'checkbox' name=ID '{' title=Description ('option' options+=STRING)* '}'
		public Group getGroup() { return cGroup; }
		
		//'checkbox'
		public Keyword getCheckboxKeyword_0() { return cCheckboxKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//('option' options+=STRING)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'option'
		public Keyword getOptionKeyword_4_0() { return cOptionKeyword_4_0; }
		
		//options+=STRING
		public Assignment getOptionsAssignment_4_1() { return cOptionsAssignment_4_1; }
		
		//STRING
		public RuleCall getOptionsSTRINGTerminalRuleCall_4_1_0() { return cOptionsSTRINGTerminalRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Keyword cHrefKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cHrefAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cHrefSTRINGTerminalRuleCall_5_0 = (RuleCall)cHrefAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Button:
		//	'button' name=ID '{'
		//	title=Description
		//	'href' href=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'button' name=ID '{' title=Description 'href' href=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'button'
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//'href'
		public Keyword getHrefKeyword_4() { return cHrefKeyword_4; }
		
		//href=STRING
		public Assignment getHrefAssignment_5() { return cHrefAssignment_5; }
		
		//STRING
		public RuleCall getHrefSTRINGTerminalRuleCall_5_0() { return cHrefSTRINGTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SelectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Selector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOptionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOptionsSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cOptionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Selector:
		//	'selector' name=ID '{'
		//	title=Description ('option' options+=STRING)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'selector' name=ID '{' title=Description ('option' options+=STRING)* '}'
		public Group getGroup() { return cGroup; }
		
		//'selector'
		public Keyword getSelectorKeyword_0() { return cSelectorKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//('option' options+=STRING)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'option'
		public Keyword getOptionKeyword_4_0() { return cOptionKeyword_4_0; }
		
		//options+=STRING
		public Assignment getOptionsAssignment_4_1() { return cOptionsAssignment_4_1; }
		
		//STRING
		public RuleCall getOptionsSTRINGTerminalRuleCall_4_1_0() { return cOptionsSTRINGTerminalRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Keyword cUrlKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cUrlAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cUrlSTRINGTerminalRuleCall_5_0 = (RuleCall)cUrlAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Link:
		//	'link' name=ID '{'
		//	description=Description
		//	'url' url=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'link' name=ID '{' description=Description 'url' url=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'link'
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//'url'
		public Keyword getUrlKeyword_4() { return cUrlKeyword_4; }
		
		//url=STRING
		public Assignment getUrlAssignment_5() { return cUrlAssignment_5; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_5_0() { return cUrlSTRINGTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class MenuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Menu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMenuKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNameKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMealAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMealSTRINGTerminalRuleCall_4_0 = (RuleCall)cMealAssignment_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDescriptionDescriptionParserRuleCall_5_0 = (RuleCall)cDescriptionAssignment_5.eContents().get(0);
		private final Keyword cPriceKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cPriceAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPriceSTRINGTerminalRuleCall_7_0 = (RuleCall)cPriceAssignment_7.eContents().get(0);
		private final Keyword cImageKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cImageAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cImageSTRINGTerminalRuleCall_9_0 = (RuleCall)cImageAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Menu:
		//	'menu' name=ID '{'
		//	'name' meal=STRING
		//	description=Description
		//	'price' price=STRING
		//	/ *
		// * plug will generate a imgs folder in runtime-EclipseApplication
		// * you should type mensa related image name after keyword 'image' and place the related images in the imgs folder
		// * /
		//	'image' image=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'menu' name=ID '{' 'name' meal=STRING description=Description 'price' price=STRING / *
		// * plug will generate a imgs folder in runtime-EclipseApplication
		// * you should type mensa related image name after keyword 'image' and place the related images in the imgs folder
		// * / 'image' image=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'menu'
		public Keyword getMenuKeyword_0() { return cMenuKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'name'
		public Keyword getNameKeyword_3() { return cNameKeyword_3; }
		
		//meal=STRING
		public Assignment getMealAssignment_4() { return cMealAssignment_4; }
		
		//STRING
		public RuleCall getMealSTRINGTerminalRuleCall_4_0() { return cMealSTRINGTerminalRuleCall_4_0; }
		
		//description=Description
		public Assignment getDescriptionAssignment_5() { return cDescriptionAssignment_5; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_5_0() { return cDescriptionDescriptionParserRuleCall_5_0; }
		
		//'price'
		public Keyword getPriceKeyword_6() { return cPriceKeyword_6; }
		
		//price=STRING
		public Assignment getPriceAssignment_7() { return cPriceAssignment_7; }
		
		//STRING
		public RuleCall getPriceSTRINGTerminalRuleCall_7_0() { return cPriceSTRINGTerminalRuleCall_7_0; }
		
		/// *
		// * plug will generate a imgs folder in runtime-EclipseApplication
		// * you should type mensa related image name after keyword 'image' and place the related images in the imgs folder
		// * / 'image'
		public Keyword getImageKeyword_8() { return cImageKeyword_8; }
		
		//image=STRING
		public Assignment getImageAssignment_9() { return cImageAssignment_9; }
		
		//STRING
		public RuleCall getImageSTRINGTerminalRuleCall_9_0() { return cImageSTRINGTerminalRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	
	
	private final MensamodelElements pMensamodel;
	private final HeaderElements pHeader;
	private final SiderbarElements pSiderbar;
	private final FooterElements pFooter;
	private final DescriptionElements pDescription;
	private final NAVElements pNAV;
	private final RadioElements pRadio;
	private final CheckboxElements pCheckbox;
	private final ButtonElements pButton;
	private final SelectorElements pSelector;
	private final LinkElements pLink;
	private final MenuElements pMenu;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMensamodel = new MensamodelElements();
		this.pHeader = new HeaderElements();
		this.pSiderbar = new SiderbarElements();
		this.pFooter = new FooterElements();
		this.pDescription = new DescriptionElements();
		this.pNAV = new NAVElements();
		this.pRadio = new RadioElements();
		this.pCheckbox = new CheckboxElements();
		this.pButton = new ButtonElements();
		this.pSelector = new SelectorElements();
		this.pLink = new LinkElements();
		this.pMenu = new MenuElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// *
	// * This Grammar defines that:
	// * A website consists of 
	// * 	- a header with title description and navigation links
	// * 	- multiple siderbars with necessary configurable components (Button, Checkbox, Radio and Select)
	// * 	- multiple menu blocks(each block contains a menu with Name, Description, Image and Price)
	// *  - footer with multiple links groups
	// * / Mensamodel:
	//	header=Header
	//	siderbar+=Siderbar*
	//	footer+=Footer*
	//	menus+=Menu*;
	public MensamodelElements getMensamodelAccess() {
		return pMensamodel;
	}
	
	public ParserRule getMensamodelRule() {
		return getMensamodelAccess().getRule();
	}
	
	//Header:
	//	'header' name=ID '{'
	//	description=Description
	//	nav+=NAV*
	//	'}';
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}
	
	//Siderbar:
	//	'siderbar' name=ID '{'
	//	description=Description
	//	radio+=Radio*
	//	checkbox+=Checkbox*
	//	selector+=Selector*
	//	button+=Button*
	//	'}';
	public SiderbarElements getSiderbarAccess() {
		return pSiderbar;
	}
	
	public ParserRule getSiderbarRule() {
		return getSiderbarAccess().getRule();
	}
	
	//Footer:
	//	'footer' name=ID '{'
	//	description=Description
	//	links+=Link*
	//	'}';
	public FooterElements getFooterAccess() {
		return pFooter;
	}
	
	public ParserRule getFooterRule() {
		return getFooterAccess().getRule();
	}
	
	//Description:
	//	'description' name=STRING;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//NAV:
	//	'nav' name=ID '{'
	//	description=Description
	//	'href' href=STRING
	//	'}';
	public NAVElements getNAVAccess() {
		return pNAV;
	}
	
	public ParserRule getNAVRule() {
		return getNAVAccess().getRule();
	}
	
	//Radio:
	//	'radio' name=ID '{'
	//	title=Description ('option' options+=STRING)*
	//	'}';
	public RadioElements getRadioAccess() {
		return pRadio;
	}
	
	public ParserRule getRadioRule() {
		return getRadioAccess().getRule();
	}
	
	//Checkbox:
	//	'checkbox' name=ID '{'
	//	title=Description ('option' options+=STRING)*
	//	'}';
	public CheckboxElements getCheckboxAccess() {
		return pCheckbox;
	}
	
	public ParserRule getCheckboxRule() {
		return getCheckboxAccess().getRule();
	}
	
	//Button:
	//	'button' name=ID '{'
	//	title=Description
	//	'href' href=STRING
	//	'}';
	public ButtonElements getButtonAccess() {
		return pButton;
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}
	
	//Selector:
	//	'selector' name=ID '{'
	//	title=Description ('option' options+=STRING)*
	//	'}';
	public SelectorElements getSelectorAccess() {
		return pSelector;
	}
	
	public ParserRule getSelectorRule() {
		return getSelectorAccess().getRule();
	}
	
	//Link:
	//	'link' name=ID '{'
	//	description=Description
	//	'url' url=STRING
	//	'}';
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//Menu:
	//	'menu' name=ID '{'
	//	'name' meal=STRING
	//	description=Description
	//	'price' price=STRING
	//	/ *
	// * plug will generate a imgs folder in runtime-EclipseApplication
	// * you should type mensa related image name after keyword 'image' and place the related images in the imgs folder
	// * /
	//	'image' image=STRING
	//	'}';
	public MenuElements getMenuAccess() {
		return pMenu;
	}
	
	public ParserRule getMenuRule() {
		return getMenuAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
