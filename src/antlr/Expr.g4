grammar Expr;

prog: 
  stat+                     
  ; 

stat:                       
  expr EOL                  # eval
  | VAR_ID ASG expr EOL     # assign 
  | EOL                     # eol 
  ;

expr:                        
  expr op=('*'|'/') expr    # muldiv 
  | expr op=('+'|'-') expr  # addsub 
  | NUMS                    # number 
  | func                    # fncall 
  | VAR_ID                  # varid 
  | '(' expr ')'            # paren 
  ;

func: 
  op=FUNC_ID WC* '(' NUMS (',' WC* NUMS)* ')';

FUNC_ID: MIN | MAX | POW | SORT;

MUL     : '*';
DIV     : '/';
ADD     : '+';
SUB     : '-';
ASG     : '=';
MIN     : 'min';
MAX     : 'max';
POW     : 'pow';
SORT    : 'sort';
VAR_ID  :[a-zA-Z]+;
NUMS    :'-'?[0-9]+('.'[0-9]+)?;

EOL     :';';
WC      :[ \r?\n\t]+ 
        -> skip;
