import java.util.HashMap;
import java.lang.Math;

public class Evaluate extends ExprBaseVisitor<Double> {
  HashMap<String, Double> var_map = new HashMap<String, Double>();

  @Override
  public Double visitAsg(ExprParser.AsgContext cur){
    var_map.put(cur.VAR_ID().getText(), (Double)visit(cur.expr()));
    System.out.println("0.0");
    return 0.0; // 할당문의 결과 값은 0.0 (p.20)
  }

  @Override
  public Double visitEval(ExprParser.EvalContext cur){
    System.out.println(visit(cur.expr()));
    return 0.0;
  }

  @Override
  public Double visitNumber(ExprParser.NumberContext cur){

    return Double.valueOf(cur.NUMS().getText());
  }

  @Override
  public Double visitVarid(ExprParser.VaridContext cur){
    return var_map.getOrDefault(cur.VAR_ID().getText(), 0.0);
  }

  // High Arithmetic function: *, /
  @Override 
  public Double visitHiarith(ExprParser.HiarithContext cur){
    Double src0, src1, dst=0.0;
    src0 = (Double) visit(cur.expr(0));
    src1 = (Double) visit(cur.expr(1));
    switch(cur.id.getType()){
      case ExprParser.MUL:
        dst = src0 * src1;
        break;
      case ExprParser.DIV:
        dst = src0 / src1;
        break;
    }
    return dst;
  }
  // High Arithmetic function: *, /
  @Override 
  public Double visitLoarith(ExprParser.LoarithContext cur){
    Double src0, src1, dst=0.0;
    src0 = (Double) visit(cur.expr(0));
    src1 = (Double) visit(cur.expr(1));
    switch(cur.id.getType()){
      case ExprParser.SUB:
        dst = src0 - src1;
        break;
      case ExprParser.ADD:
        dst = src0 + src1;
        break;
    }
    return dst;
  }

  // Chunk (expr)
  @Override
  public Double visitChunk(ExprParser.ChunkContext cur){
    return (Double) visit(cur.expr());
  }

  // function call 
  @Override
  public Double visitFncall(ExprParser.FncallContext cur){
  Double ret=0.0, src0=0.0, src1=0.0;
  src0 = (Double) visit(cur.expr(0));
  if (cur.expr().size() > 1){
      src1 = (Double) visit(cur.expr(1));
  }
  switch((Integer) cur.id.getType()){
    case ExprParser.SQRT:
      ret = Math.sqrt(src0);
      break;
    case ExprParser.MAX:
      ret = Math.max(src0, src1);
      break;
    case ExprParser.MIN:
      ret = Math.min(src0, src1);
      break;
    case ExprParser.POW:
      ret = Math.pow(src0, src1);
      break;
  }
  return ret;
  }
}
























