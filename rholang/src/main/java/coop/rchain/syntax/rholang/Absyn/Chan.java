package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public abstract class Chan implements java.io.Serializable {
  public abstract <R,A> R accept(Chan.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(coop.rchain.syntax.rholang.Absyn.CVar p, A arg);
    public R visit(coop.rchain.syntax.rholang.Absyn.CQuote p, A arg);

  }

}
