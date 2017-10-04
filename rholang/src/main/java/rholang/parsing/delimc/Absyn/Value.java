package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public abstract class Value implements java.io.Serializable {
  public abstract <R,A> R accept(Value.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.delimc.Absyn.VInt p, A arg);
    public R visit(rholang.parsing.delimc.Absyn.VString p, A arg);

  }

}
