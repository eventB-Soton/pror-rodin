/*
* generated by Xtext
*/
grammar InternalWrspmDomainmodel;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.pror.presentation.wrspm.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.pror.presentation.wrspm.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.pror.presentation.wrspm.xtext.services.WrspmDomainmodelGrammarAccess;

}

@parser::members {

 	private WrspmDomainmodelGrammarAccess grammarAccess;
 	
    public InternalWrspmDomainmodelParser(TokenStream input, IAstFactory factory, WrspmDomainmodelGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "DomainModel";	
   	}
   	
   	@Override
   	protected WrspmDomainmodelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); }
	 iv_ruleDomainModel=ruleDomainModel 
	 { $current=$iv_ruleDomainModel.current; } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getElementsPartParserRuleCall_0(), currentNode); 
	    }
		lv_elements_0_0=rulePart		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"elements",
	        		lv_elements_0_0, 
	        		"Part", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*
;





// Entry rule entryRulePart
entryRulePart returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); }
	 iv_rulePart=rulePart 
	 { $current=$iv_rulePart.current; } 
	 EOF 
;

// Rule Part
rulePart returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getPartAccess().getEntityParserRuleCall_0(), currentNode); 
    }
    this_Entity_0=ruleEntity
    { 
        $current = $this_Entity_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getPartAccess().getDefinitionParserRuleCall_1(), currentNode); 
    }
    this_Definition_1=ruleDefinition
    { 
        $current = $this_Definition_1.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getPartAccess().getAnyTextParserRuleCall_2(), currentNode); 
    }
    this_AnyText_2=ruleAnyText
    { 
        $current = $this_AnyText_2.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleAnyText
entryRuleAnyText returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAnyTextRule(), currentNode); }
	 iv_ruleAnyText=ruleAnyText 
	 { $current=$iv_ruleAnyText.current; } 
	 EOF 
;

// Rule AnyText
ruleAnyText returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
(
		lv_content_0_0=RULE_ID
		{
			createLeafNode(grammarAccess.getAnyTextAccess().getContentIDTerminalRuleCall_0(), "content"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAnyTextRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"content",
	        		lv_content_0_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'[' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getEntityAccess().getRefDefinitionCrossReference_1_0(), "ref"); 
	}

)
)	']' 
    {
        createLeafNode(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2(), null); 
    }
)
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'[[' 
    {
        createLeafNode(grammarAccess.getDefinitionAccess().getLeftSquareBracketLeftSquareBracketKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	']]' 
    {
        createLeafNode(grammarAccess.getDefinitionAccess().getRightSquareBracketRightSquareBracketKeyword_2(), null); 
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


