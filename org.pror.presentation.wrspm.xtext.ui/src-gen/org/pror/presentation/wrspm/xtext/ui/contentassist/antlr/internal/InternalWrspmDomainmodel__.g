lexer grammar InternalWrspmDomainmodel;
@header {
package org.pror.presentation.wrspm.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '[' ;
T12 : ']' ;
T13 : '[[' ;
T14 : ']]' ;

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 489
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 491
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 493
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 495
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 497
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 499
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.pror.presentation.wrspm.xtext.ui/src-gen/org/pror/presentation/wrspm/xtext/ui/contentassist/antlr/internal/InternalWrspmDomainmodel.g" 501
RULE_ANY_OTHER : .;


