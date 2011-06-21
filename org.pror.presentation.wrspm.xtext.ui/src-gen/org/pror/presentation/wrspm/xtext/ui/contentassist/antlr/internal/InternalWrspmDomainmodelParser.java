package org.pror.presentation.wrspm.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.pror.presentation.wrspm.xtext.services.WrspmDomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWrspmDomainmodelParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g"; }


     
     	private WrspmDomainmodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WrspmDomainmodelGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleDomainModel
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:61:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:62:1: ( ruleDomainModel EOF )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:63:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();
            _fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:70:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:74:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:76:1: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:77:1: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:77:2: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94);
            	    rule__DomainModel__ElementsAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRulePart
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:89:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:90:1: ( rulePart EOF )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:91:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart122);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePart


    // $ANTLR start rulePart
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:98:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:102:2: ( ( ( rule__Part__Alternatives ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:103:1: ( ( rule__Part__Alternatives ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:103:1: ( ( rule__Part__Alternatives ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:104:1: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:105:1: ( rule__Part__Alternatives )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:105:2: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_in_rulePart155);
            rule__Part__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePart


    // $ANTLR start entryRuleAnyText
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:117:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:118:1: ( ruleAnyText EOF )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:119:1: ruleAnyText EOF
            {
             before(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText182);
            ruleAnyText();
            _fsp--;

             after(grammarAccess.getAnyTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAnyText


    // $ANTLR start ruleAnyText
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:126:1: ruleAnyText : ( ( rule__AnyText__ContentAssignment ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:130:2: ( ( ( rule__AnyText__ContentAssignment ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:131:1: ( ( rule__AnyText__ContentAssignment ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:131:1: ( ( rule__AnyText__ContentAssignment ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:132:1: ( rule__AnyText__ContentAssignment )
            {
             before(grammarAccess.getAnyTextAccess().getContentAssignment()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:133:1: ( rule__AnyText__ContentAssignment )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:133:2: rule__AnyText__ContentAssignment
            {
            pushFollow(FOLLOW_rule__AnyText__ContentAssignment_in_ruleAnyText215);
            rule__AnyText__ContentAssignment();
            _fsp--;


            }

             after(grammarAccess.getAnyTextAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnyText


    // $ANTLR start entryRuleEntity
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:145:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:146:1: ( ruleEntity EOF )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:147:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity242);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:154:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:158:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:159:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:159:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:160:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:161:1: ( rule__Entity__Group__0 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:161:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity275);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleDefinition
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:173:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:174:1: ( ruleDefinition EOF )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:175:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition302);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDefinition


    // $ANTLR start ruleDefinition
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:182:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:186:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:187:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:187:1: ( ( rule__Definition__Group__0 ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:188:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:189:1: ( rule__Definition__Group__0 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:189:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition335);
            rule__Definition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefinition


    // $ANTLR start rule__Part__Alternatives
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:201:1: rule__Part__Alternatives : ( ( ruleEntity ) | ( ruleDefinition ) | ( ruleAnyText ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:205:1: ( ( ruleEntity ) | ( ruleDefinition ) | ( ruleAnyText ) )
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
                    new NoViableAltException("201:1: rule__Part__Alternatives : ( ( ruleEntity ) | ( ruleDefinition ) | ( ruleAnyText ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:206:1: ( ruleEntity )
                    {
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:206:1: ( ruleEntity )
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:207:1: ruleEntity
                    {
                     before(grammarAccess.getPartAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Part__Alternatives371);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:212:6: ( ruleDefinition )
                    {
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:212:6: ( ruleDefinition )
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:213:1: ruleDefinition
                    {
                     before(grammarAccess.getPartAccess().getDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefinition_in_rule__Part__Alternatives388);
                    ruleDefinition();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:218:6: ( ruleAnyText )
                    {
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:218:6: ( ruleAnyText )
                    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:219:1: ruleAnyText
                    {
                     before(grammarAccess.getPartAccess().getAnyTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAnyText_in_rule__Part__Alternatives405);
                    ruleAnyText();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getAnyTextParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Part__Alternatives


    // $ANTLR start rule__Entity__Group__0
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:231:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:235:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:236:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0435);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0438);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:243:1: rule__Entity__Group__0__Impl : ( '[' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:247:1: ( ( '[' ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:248:1: ( '[' )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:248:1: ( '[' )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:249:1: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Entity__Group__0__Impl466); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:262:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:266:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:267:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1497);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1500);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:274:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__RefAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:278:1: ( ( ( rule__Entity__RefAssignment_1 ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:279:1: ( ( rule__Entity__RefAssignment_1 ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:279:1: ( ( rule__Entity__RefAssignment_1 ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:280:1: ( rule__Entity__RefAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getRefAssignment_1()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:281:1: ( rule__Entity__RefAssignment_1 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:281:2: rule__Entity__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__RefAssignment_1_in_rule__Entity__Group__1__Impl527);
            rule__Entity__RefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:291:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:295:1: ( rule__Entity__Group__2__Impl )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:296:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2557);
            rule__Entity__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:302:1: rule__Entity__Group__2__Impl : ( ']' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:306:1: ( ( ']' ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:307:1: ( ']' )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:307:1: ( ']' )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:308:1: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__2__Impl585); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Definition__Group__0
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:327:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:331:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:332:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0622);
            rule__Definition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0625);
            rule__Definition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__0


    // $ANTLR start rule__Definition__Group__0__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:339:1: rule__Definition__Group__0__Impl : ( '[[' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:343:1: ( ( '[[' ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:344:1: ( '[[' )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:344:1: ( '[[' )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:345:1: '[['
            {
             before(grammarAccess.getDefinitionAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Definition__Group__0__Impl653); 
             after(grammarAccess.getDefinitionAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__0__Impl


    // $ANTLR start rule__Definition__Group__1
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:358:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:362:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:363:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1684);
            rule__Definition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1687);
            rule__Definition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__1


    // $ANTLR start rule__Definition__Group__1__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:370:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:374:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:375:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:375:1: ( ( rule__Definition__NameAssignment_1 ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:376:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:377:1: ( rule__Definition__NameAssignment_1 )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:377:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl714);
            rule__Definition__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__1__Impl


    // $ANTLR start rule__Definition__Group__2
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:387:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:391:1: ( rule__Definition__Group__2__Impl )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:392:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2744);
            rule__Definition__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__2


    // $ANTLR start rule__Definition__Group__2__Impl
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:398:1: rule__Definition__Group__2__Impl : ( ']]' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:402:1: ( ( ']]' ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:403:1: ( ']]' )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:403:1: ( ']]' )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:404:1: ']]'
            {
             before(grammarAccess.getDefinitionAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Definition__Group__2__Impl772); 
             after(grammarAccess.getDefinitionAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__2__Impl


    // $ANTLR start rule__DomainModel__ElementsAssignment
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:424:1: rule__DomainModel__ElementsAssignment : ( rulePart ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:428:1: ( ( rulePart ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:429:1: ( rulePart )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:429:1: ( rulePart )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:430:1: rulePart
            {
             before(grammarAccess.getDomainModelAccess().getElementsPartParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__DomainModel__ElementsAssignment814);
            rulePart();
            _fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsPartParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainModel__ElementsAssignment


    // $ANTLR start rule__AnyText__ContentAssignment
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:439:1: rule__AnyText__ContentAssignment : ( RULE_ID ) ;
    public final void rule__AnyText__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:443:1: ( ( RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:444:1: ( RULE_ID )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:444:1: ( RULE_ID )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:445:1: RULE_ID
            {
             before(grammarAccess.getAnyTextAccess().getContentIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnyText__ContentAssignment845); 
             after(grammarAccess.getAnyTextAccess().getContentIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnyText__ContentAssignment


    // $ANTLR start rule__Entity__RefAssignment_1
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:454:1: rule__Entity__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:458:1: ( ( ( RULE_ID ) ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:459:1: ( ( RULE_ID ) )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:459:1: ( ( RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:460:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getRefDefinitionCrossReference_1_0()); 
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:461:1: ( RULE_ID )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:462:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getRefDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__RefAssignment_1880); 
             after(grammarAccess.getEntityAccess().getRefDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getRefDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__RefAssignment_1


    // $ANTLR start rule__Definition__NameAssignment_1
    // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:473:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:477:1: ( ( RULE_ID ) )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:478:1: ( RULE_ID )
            {
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:478:1: ( RULE_ID )
            // ../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g:479:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_1915); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__NameAssignment_1


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_in_rulePart155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyText__ContentAssignment_in_ruleAnyText215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Part__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Part__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__Part__Alternatives405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Entity__Group__0__Impl466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__RefAssignment_1_in_rule__Entity__Group__1__Impl527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__2__Impl585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Definition__Group__0__Impl653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1684 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Definition__Group__2__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__DomainModel__ElementsAssignment814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnyText__ContentAssignment845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__RefAssignment_1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_1915 = new BitSet(new long[]{0x0000000000000002L});

}