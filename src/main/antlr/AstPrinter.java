import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AstPrinter extends ExprBaseVisitor<Double> {
  Integer tab_cnt = 0;

  private void printTabs(){
    for (int i = 0; i < this.tab_cnt; i++){
      System.out.print("\t");
    }
  }

  @Override
  public Double visitAsg(ExprParser.AsgContext cur){
    this.printTabs();
    System.out.println("ASSIGN");
    tab_cnt++;
    this.printTabs();
    System.out.println(cur.getChild(0).getText());
    this.printTabs();
    System.out.println(Double.valueOf(cur.getChild(2).getText()));
    tab_cnt--;
    return 0.0;
  }

  @Override
  public Double visitEval(ExprParser.EvalContext cur){
    tab_cnt = 0;
    return visit(cur.expr());
  }

  @Override
  public Double visitNumber(ExprParser.NumberContext cur){
    this.printTabs();
    System.out.println(Double.valueOf(cur.NUMS().getText()));
    return 0.0;
  }

  @Override
  public Double visitVarid(ExprParser.VaridContext cur){
    this.printTabs();
    System.out.println(cur.VAR_ID().getText());
    return 0.0;
  }

  // High Arithmetic function: *, /
  @Override 
  public Double visitHiarith(ExprParser.HiarithContext cur){
    this.printTabs();
    switch(cur.id.getType()){
      case ExprParser.MUL:
        System.out.println("MUL");
        break;
      case ExprParser.DIV:
        System.out.println("DIV");
        break;
    }
    this.tab_cnt++;
    visit(cur.expr(0));
    visit(cur.expr(1));
    this.tab_cnt--;
    return 0.0;
  }
  // Low Arithmetic function: *, /
  @Override 
  public Double visitLoarith(ExprParser.LoarithContext cur){
    this.printTabs();
    switch(cur.id.getType()){
      case ExprParser.SUB:
        System.out.println("SUB");
        break;
      case ExprParser.ADD:
        System.out.println("ADD");
        break;
    }
    this.tab_cnt++;
    visit(cur.expr(0));
    visit(cur.expr(1));
    this.tab_cnt--;

    return 0.0;
  }

  // function call 
  @Override
  public Double visitFncall(ExprParser.FncallContext cur){
  this.printTabs();
  this.tab_cnt++;
    //visit(cur.expr(0));
    //visit(cur.expr(1));
  switch((Integer) cur.id.getType()){
    case ExprParser.SQRT:
      System.out.println("sqrt");
      visit(cur.expr(0));
      break;
    case ExprParser.MAX:
      System.out.println("max");
      visit(cur.expr(0));
      visit(cur.expr(1));
      break;
    case ExprParser.MIN:
      System.out.println("min");
      visit(cur.expr(0));
      visit(cur.expr(1));
      break;
    case ExprParser.POW:
      System.out.println("pow");
      visit(cur.expr(0));
      visit(cur.expr(1));
      break;
  }
  this.tab_cnt--;
  return 0.0;
  }
}
