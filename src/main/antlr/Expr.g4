grammar Expr;

prog: 
  stat+                     
  ; 

stat:                       
  expr EOL                  # eval
  | VAR_ID ASG expr EOL     # asg 
  | EOL                     # eol 
  ;

expr:                        
  expr id=('*'|'/') expr                         # hiarith
  | expr id=('+'|'-') expr                       # loarith 
  | NUMS                                         # number 
  | id=('min'|'max'|'pow'|'sqrt') WC* 
      '(' WC* expr WC* (',' WC* expr WC*)* ')'   # fncall
  | VAR_ID                                       # varid 
  | '(' expr ')'                                 # chunk
  ;

MIN     : 'min';
MAX     : 'max';
POW     : 'pow';
SQRT    : 'sqrt';

MUL     : '*';
DIV     : '/';
ADD     : '+';
SUB     : '-';
ASG     : '=';

VAR_ID  :[a-zA-Z]+;
NUMS    :'-'?[0-9]+('.'[0-9]+)?;

EOL     :';';
WC      :[ \r?\n\t]+ 
        -> skip;
