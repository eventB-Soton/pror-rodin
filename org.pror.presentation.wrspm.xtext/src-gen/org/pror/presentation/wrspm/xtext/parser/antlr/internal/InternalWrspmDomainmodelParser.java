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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWrspmDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'[['", "']]'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalWrspmDomainmodelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g"; }



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



    // $ANTLR start entryRuleDomainModel
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:77:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:78:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:79:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();
            _fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:86:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= rulePart ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:91:6: ( ( (lv_elements_0_0= rulePart ) )* )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:92:1: ( (lv_elements_0_0= rulePart ) )*
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:92:1: ( (lv_elements_0_0= rulePart ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:93:1: (lv_elements_0_0= rulePart )
            	    {
            	    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:93:1: (lv_elements_0_0= rulePart )
            	    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:94:3: lv_elements_0_0= rulePart
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getElementsPartParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePart_in_ruleDomainModel130);
            	    lv_elements_0_0=rulePart();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_0_0, 
            	    	        		"Part", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRulePart
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:124:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:125:2: (iv_rulePart= rulePart EOF )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:126:2: iv_rulePart= rulePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPartRule(), currentNode); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart166);
            iv_rulePart=rulePart();
            _fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:133:1: rulePart returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Definition_1= ruleDefinition | this_AnyText_2= ruleAnyText ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Definition_1 = null;

        EObject this_AnyText_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:138:6: ( (this_Entity_0= ruleEntity | this_Definition_1= ruleDefinition | this_AnyText_2= ruleAnyText ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:139:1: (this_Entity_0= ruleEntity | this_Definition_1= ruleDefinition | this_AnyText_2= ruleAnyText )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:139:1: (this_Entity_0= ruleEntity | this_Definition_1= ruleDefinition | this_AnyText_2= ruleAnyText )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_Entity_0= ruleEntity | this_Definition_1= ruleDefinition | this_AnyText_2= ruleAnyText )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:140:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_rulePart223);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:150:5: this_Definition_1= ruleDefinition
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getDefinitionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDefinition_in_rulePart250);
                    this_Definition_1=ruleDefinition();
                    _fsp--;

                     
                            current = this_Definition_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:160:5: this_AnyText_2= ruleAnyText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPartAccess().getAnyTextParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAnyText_in_rulePart277);
                    this_AnyText_2=ruleAnyText();
                    _fsp--;

                     
                            current = this_AnyText_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRuleAnyText
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:176:1: entryRuleAnyText returns [EObject current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final EObject entryRuleAnyText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyText = null;


        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:177:2: (iv_ruleAnyText= ruleAnyText EOF )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:178:2: iv_ruleAnyText= ruleAnyText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAnyTextRule(), currentNode); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText312);
            iv_ruleAnyText=ruleAnyText();
            _fsp--;

             current =iv_ruleAnyText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnyText


    // $ANTLR start ruleAnyText
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:185:1: ruleAnyText returns [EObject current=null] : ( (lv_content_0_0= RULE_ID ) ) ;
    public final EObject ruleAnyText() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:190:6: ( ( (lv_content_0_0= RULE_ID ) ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:191:1: ( (lv_content_0_0= RULE_ID ) )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:191:1: ( (lv_content_0_0= RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:192:1: (lv_content_0_0= RULE_ID )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:192:1: (lv_content_0_0= RULE_ID )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:193:3: lv_content_0_0= RULE_ID
            {
            lv_content_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnyText363); 

            			createLeafNode(grammarAccess.getAnyTextAccess().getContentIDTerminalRuleCall_0(), "content"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAnyTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"content",
            	        		lv_content_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnyText


    // $ANTLR start entryRuleEntity
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:223:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:224:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:225:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity403);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity413); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:232:1: ruleEntity returns [EObject current=null] : ( '[' ( ( RULE_ID ) ) ']' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:237:6: ( ( '[' ( ( RULE_ID ) ) ']' ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:238:1: ( '[' ( ( RULE_ID ) ) ']' )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:238:1: ( '[' ( ( RULE_ID ) ) ']' )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:238:3: '[' ( ( RULE_ID ) ) ']'
            {
            match(input,11,FOLLOW_11_in_ruleEntity448); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:242:1: ( ( RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:243:1: ( RULE_ID )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:243:1: ( RULE_ID )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:244:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity466); 

            		createLeafNode(grammarAccess.getEntityAccess().getRefDefinitionCrossReference_1_0(), "ref"); 
            	

            }


            }

            match(input,12,FOLLOW_12_in_ruleEntity476); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleDefinition
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:268:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:269:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:270:2: iv_ruleDefinition= ruleDefinition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition512);
            iv_ruleDefinition=ruleDefinition();
            _fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDefinition


    // $ANTLR start ruleDefinition
    // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:277:1: ruleDefinition returns [EObject current=null] : ( '[[' ( (lv_name_1_0= RULE_ID ) ) ']]' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:282:6: ( ( '[[' ( (lv_name_1_0= RULE_ID ) ) ']]' ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:283:1: ( '[[' ( (lv_name_1_0= RULE_ID ) ) ']]' )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:283:1: ( '[[' ( (lv_name_1_0= RULE_ID ) ) ']]' )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:283:3: '[[' ( (lv_name_1_0= RULE_ID ) ) ']]'
            {
            match(input,13,FOLLOW_13_in_ruleDefinition557); 

                    createLeafNode(grammarAccess.getDefinitionAccess().getLeftSquareBracketLeftSquareBracketKeyword_0(), null); 
                
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:288:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:288:1: (lv_name_1_0= RULE_ID )
            // ../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinition574); 

            			createLeafNode(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDefinitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleDefinition589); 

                    createLeafNode(grammarAccess.getDefinitionAccess().getRightSquareBracketRightSquareBracketKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDefinition


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePart223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rulePart250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rulePart277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnyText363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity466 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDefinition557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition574 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDefinition589 = new BitSet(new long[]{0x0000000000000002L});

}