package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class EChar extends Value {
  public final Character char_;
  public EChar(Character p1) { char_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.EChar) {
      coop.rchain.syntax.rholang.Absyn.EChar x = (coop.rchain.syntax.rholang.Absyn.EChar)o;
      return this.char_.equals(x.char_);
    }
    return false;
  }

  public int hashCode() {
    return this.char_.hashCode();
  }


}
