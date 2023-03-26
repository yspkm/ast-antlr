import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class program {

  public static void main(String[] args) throws Exception {

    ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokens);

    // Make AST from prog and print the tree
    ParseTree ast = parser.prog();

    AstCall print_visitor = new AstCall();
    print_visitor.visit(ast);

    //Evaluate AST result
    Evaluate evaluate_visitor = new Evaluate();
    evaluate_visitor.visit(ast);

    // Evaluate Evaluator = new Evaluate();
    // AST.children.forEach(node -> System.out.println(Evaluator.evaluate(node)));
    //System.out.println(ast.toStringTree());
  }
}
