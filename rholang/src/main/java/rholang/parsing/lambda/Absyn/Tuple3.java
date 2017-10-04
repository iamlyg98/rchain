package rholang.parsing.lambda.Absyn; // Java Package generated by the BNF Converter.

public class Tuple3 extends Tuple {
  public final TypedExpr typedexpr_1, typedexpr_2, typedexpr_3;
  public Tuple3(TypedExpr p1, TypedExpr p2, TypedExpr p3) { typedexpr_1 = p1; typedexpr_2 = p2; typedexpr_3 = p3; }

  public <R,A> R accept(rholang.parsing.lambda.Absyn.Tuple.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.lambda.Absyn.Tuple3) {
      rholang.parsing.lambda.Absyn.Tuple3 x = (rholang.parsing.lambda.Absyn.Tuple3)o;
      return this.typedexpr_1.equals(x.typedexpr_1) && this.typedexpr_2.equals(x.typedexpr_2) && this.typedexpr_3.equals(x.typedexpr_3);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.typedexpr_1.hashCode())+this.typedexpr_2.hashCode())+this.typedexpr_3.hashCode();
  }


}
