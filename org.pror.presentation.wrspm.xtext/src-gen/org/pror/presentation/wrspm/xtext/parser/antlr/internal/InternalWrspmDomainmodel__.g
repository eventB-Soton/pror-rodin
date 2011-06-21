lexer grammar InternalWrspmDomainmodel;
@header {
package org.pror.presentation.wrspm.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : '[' ;
T12 : ']' ;
T13 : '[[' ;
T14 : ']]' ;

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 322
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 324
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 326
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 328
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 330
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 332
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.pror.presentation.wrspm.xtext/src-gen/org/pror/presentation/wrspm/xtext/parser/antlr/internal/InternalWrspmDomainmodel.g" 334
RULE_ANY_OTHER : .;


