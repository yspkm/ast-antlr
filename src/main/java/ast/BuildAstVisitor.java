import java.util.ArrayList;
import java.util.List;

public class BuildAstVisitor extends ExprBaseVisitor<ExprTree> {

    // Visit the "prog" rule and return a list of child nodes
    @Override
    public ExprTree visitProg(ExprParser.ProgContext ctx) {
        List<ExprTree> children = new ArrayList<ExprTree>();
        for (ExprParser.ExprContext exprCtx : ctx.expr()) {
            children.add(visit(exprCtx));
        }
        return new ExprTree(children);
    }

    // Visit the "infixExpr" rule and return a binary operation node
    @Override
    public ExprTree visitInfixExpr(ExprParser.InfixExprContext ctx) {
        ExprTree left = visit(ctx.expr(0));
        ExprTree right = visit(ctx.expr(1));
        return new ExprTree(ctx.op.getText(), left, right);
    }

    // Visit the "numberExpr" rule and return a leaf node
    @Override
    public ExprTree visitNumberExpr(ExprParser.NumberExprContext ctx) {
        return new ExprTree(ctx.num.getText());
    }

    // Visit the "parensExpr" rule and return the child node
    @Override
    public ExprTree visitParensExpr(ExprParser.ParensExprContext ctx) {
        return visit(ctx.expr());
    }

}
