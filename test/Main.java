import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

  public static void main(String[] args) throws Exception {

    ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokens);

    ParseTree ast = parser.prog();

    new AstPrinter().visit(ast);
    new AstEvaluator().visit(ast);
  }
}
