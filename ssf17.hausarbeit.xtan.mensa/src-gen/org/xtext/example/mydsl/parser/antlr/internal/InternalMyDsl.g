/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Mensamodel";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMensamodel
entryRuleMensamodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMensamodelRule()); }
	iv_ruleMensamodel=ruleMensamodel
	{ $current=$iv_ruleMensamodel.current; }
	EOF;

// Rule Mensamodel
ruleMensamodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMensamodelAccess().getHeaderHeaderParserRuleCall_0_0());
				}
				lv_header_0_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMensamodelRule());
					}
					set(
						$current,
						"header",
						lv_header_0_0,
						"org.xtext.example.mydsl.MyDsl.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMensamodelAccess().getSiderbarSiderbarParserRuleCall_1_0());
				}
				lv_siderbar_1_0=ruleSiderbar
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMensamodelRule());
					}
					add(
						$current,
						"siderbar",
						lv_siderbar_1_0,
						"org.xtext.example.mydsl.MyDsl.Siderbar");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getMensamodelAccess().getFooterFooterParserRuleCall_2_0());
				}
				lv_footer_2_0=ruleFooter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMensamodelRule());
					}
					add(
						$current,
						"footer",
						lv_footer_2_0,
						"org.xtext.example.mydsl.MyDsl.Footer");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getMensamodelAccess().getMenusMenuParserRuleCall_3_0());
				}
				lv_menus_3_0=ruleMenu
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMensamodelRule());
					}
					add(
						$current,
						"menus",
						lv_menus_3_0,
						"org.xtext.example.mydsl.MyDsl.Menu");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='header'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getHeaderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeaderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getNavNAVParserRuleCall_4_0());
				}
				lv_nav_4_0=ruleNAV
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					add(
						$current,
						"nav",
						lv_nav_4_0,
						"org.xtext.example.mydsl.MyDsl.NAV");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleSiderbar
entryRuleSiderbar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSiderbarRule()); }
	iv_ruleSiderbar=ruleSiderbar
	{ $current=$iv_ruleSiderbar.current; }
	EOF;

// Rule Siderbar
ruleSiderbar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='siderbar'
		{
			newLeafNode(otherlv_0, grammarAccess.getSiderbarAccess().getSiderbarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSiderbarAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSiderbarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSiderbarAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSiderbarAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSiderbarRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSiderbarAccess().getRadioRadioParserRuleCall_4_0());
				}
				lv_radio_4_0=ruleRadio
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSiderbarRule());
					}
					add(
						$current,
						"radio",
						lv_radio_4_0,
						"org.xtext.example.mydsl.MyDsl.Radio");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSiderbarAccess().getCheckboxCheckboxParserRuleCall_5_0());
				}
				lv_checkbox_5_0=ruleCheckbox
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSiderbarRule());
					}
					add(
						$current,
						"checkbox",
						lv_checkbox_5_0,
						"org.xtext.example.mydsl.MyDsl.Checkbox");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSiderbarAccess().getSelectorSelectorParserRuleCall_6_0());
				}
				lv_selector_6_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSiderbarRule());
					}
					add(
						$current,
						"selector",
						lv_selector_6_0,
						"org.xtext.example.mydsl.MyDsl.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSiderbarAccess().getButtonButtonParserRuleCall_7_0());
				}
				lv_button_7_0=ruleButton
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSiderbarRule());
					}
					add(
						$current,
						"button",
						lv_button_7_0,
						"org.xtext.example.mydsl.MyDsl.Button");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getSiderbarAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFooter
entryRuleFooter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFooterRule()); }
	iv_ruleFooter=ruleFooter
	{ $current=$iv_ruleFooter.current; }
	EOF;

// Rule Footer
ruleFooter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='footer'
		{
			newLeafNode(otherlv_0, grammarAccess.getFooterAccess().getFooterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFooterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFooterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getFooterAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFooterAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFooterRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFooterAccess().getLinksLinkParserRuleCall_4_0());
				}
				lv_links_4_0=ruleLink
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFooterRule());
					}
					add(
						$current,
						"links",
						lv_links_4_0,
						"org.xtext.example.mydsl.MyDsl.Link");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getFooterAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='description'
		{
			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleNAV
entryRuleNAV returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNAVRule()); }
	iv_ruleNAV=ruleNAV
	{ $current=$iv_ruleNAV.current; }
	EOF;

// Rule NAV
ruleNAV returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='nav'
		{
			newLeafNode(otherlv_0, grammarAccess.getNAVAccess().getNavKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNAVAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNAVRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNAVAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNAVAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNAVRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='href'
		{
			newLeafNode(otherlv_4, grammarAccess.getNAVAccess().getHrefKeyword_4());
		}
		(
			(
				lv_href_5_0=RULE_STRING
				{
					newLeafNode(lv_href_5_0, grammarAccess.getNAVAccess().getHrefSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNAVRule());
					}
					setWithLastConsumed(
						$current,
						"href",
						lv_href_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getNAVAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleRadio
entryRuleRadio returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRadioRule()); }
	iv_ruleRadio=ruleRadio
	{ $current=$iv_ruleRadio.current; }
	EOF;

// Rule Radio
ruleRadio returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='radio'
		{
			newLeafNode(otherlv_0, grammarAccess.getRadioAccess().getRadioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRadioAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRadioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRadioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRadioAccess().getTitleDescriptionParserRuleCall_3_0());
				}
				lv_title_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRadioRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='option'
			{
				newLeafNode(otherlv_4, grammarAccess.getRadioAccess().getOptionKeyword_4_0());
			}
			(
				(
					lv_options_5_0=RULE_STRING
					{
						newLeafNode(lv_options_5_0, grammarAccess.getRadioAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRadioRule());
						}
						addWithLastConsumed(
							$current,
							"options",
							lv_options_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getRadioAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleCheckbox
entryRuleCheckbox returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckboxRule()); }
	iv_ruleCheckbox=ruleCheckbox
	{ $current=$iv_ruleCheckbox.current; }
	EOF;

// Rule Checkbox
ruleCheckbox returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='checkbox'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCheckboxRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getCheckboxAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCheckboxAccess().getTitleDescriptionParserRuleCall_3_0());
				}
				lv_title_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCheckboxRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='option'
			{
				newLeafNode(otherlv_4, grammarAccess.getCheckboxAccess().getOptionKeyword_4_0());
			}
			(
				(
					lv_options_5_0=RULE_STRING
					{
						newLeafNode(lv_options_5_0, grammarAccess.getCheckboxAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCheckboxRule());
						}
						addWithLastConsumed(
							$current,
							"options",
							lv_options_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getCheckboxAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='button'
		{
			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAccess().getTitleDescriptionParserRuleCall_3_0());
				}
				lv_title_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='href'
		{
			newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getHrefKeyword_4());
		}
		(
			(
				lv_href_5_0=RULE_STRING
				{
					newLeafNode(lv_href_5_0, grammarAccess.getButtonAccess().getHrefSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getButtonRule());
					}
					setWithLastConsumed(
						$current,
						"href",
						lv_href_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleSelector
entryRuleSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorRule()); }
	iv_ruleSelector=ruleSelector
	{ $current=$iv_ruleSelector.current; }
	EOF;

// Rule Selector
ruleSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='selector'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectorAccess().getTitleDescriptionParserRuleCall_3_0());
				}
				lv_title_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectorRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='option'
			{
				newLeafNode(otherlv_4, grammarAccess.getSelectorAccess().getOptionKeyword_4_0());
			}
			(
				(
					lv_options_5_0=RULE_STRING
					{
						newLeafNode(lv_options_5_0, grammarAccess.getSelectorAccess().getOptionsSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelectorRule());
						}
						addWithLastConsumed(
							$current,
							"options",
							lv_options_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSelectorAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinkRule()); }
	iv_ruleLink=ruleLink
	{ $current=$iv_ruleLink.current; }
	EOF;

// Rule Link
ruleLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='link'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLinkAccess().getDescriptionDescriptionParserRuleCall_3_0());
				}
				lv_description_3_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLinkRule());
					}
					set(
						$current,
						"description",
						lv_description_3_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='url'
		{
			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getUrlKeyword_4());
		}
		(
			(
				lv_url_5_0=RULE_STRING
				{
					newLeafNode(lv_url_5_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinkRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleMenu
entryRuleMenu returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMenuRule()); }
	iv_ruleMenu=ruleMenu
	{ $current=$iv_ruleMenu.current; }
	EOF;

// Rule Menu
ruleMenu returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='menu'
		{
			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMenuRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='name'
		{
			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getNameKeyword_3());
		}
		(
			(
				lv_meal_4_0=RULE_STRING
				{
					newLeafNode(lv_meal_4_0, grammarAccess.getMenuAccess().getMealSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMenuRule());
					}
					setWithLastConsumed(
						$current,
						"meal",
						lv_meal_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMenuAccess().getDescriptionDescriptionParserRuleCall_5_0());
				}
				lv_description_5_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMenuRule());
					}
					set(
						$current,
						"description",
						lv_description_5_0,
						"org.xtext.example.mydsl.MyDsl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='price'
		{
			newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getPriceKeyword_6());
		}
		(
			(
				lv_price_7_0=RULE_STRING
				{
					newLeafNode(lv_price_7_0, grammarAccess.getMenuAccess().getPriceSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMenuRule());
					}
					setWithLastConsumed(
						$current,
						"price",
						lv_price_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='image'
		{
			newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getImageKeyword_8());
		}
		(
			(
				lv_image_9_0=RULE_STRING
				{
					newLeafNode(lv_image_9_0, grammarAccess.getMenuAccess().getImageSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMenuRule());
					}
					setWithLastConsumed(
						$current,
						"image",
						lv_image_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
