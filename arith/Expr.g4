grammar Expr;

prog: 
  stat+;

stat:                       
  expr EL              # eval 
  | ID ASG expr EL     # assign 
  | EL                 # blank
  ;

expr:                        
  expr op=('*'|'/') expr    # MulDiv
  | expr op=('+'|'-') expr  # AddSub
  | NUMS                    # Nums
  | func                    # funcCall
  | ID                      # id
  | '(' expr ')'            # parens
  ;

func: 
  op=func_name WS* '(' NUMS (',' WS* NUMS)* ')';

func_name:
  'sqrt' | 'max' | 'min' | 'sort' | 'pow';

MUL:
  '*';
DIV:
  '/';
ADD:
  '+';
SUB:
  '-';
ASG:
  '=';
SQRT:
  'sqrt';
MAX:
  'max';
MIN:
  'min';
SORT:
  'sort';
POW:
  'pow';

ID:
  [a-zA-Z]+;

NUMS:
  '-'?[0-9]+('.'[0-9]+)?;
EL:
  ';';
WS:
  [ \t]+ -> skip;

