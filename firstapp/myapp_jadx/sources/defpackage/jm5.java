package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jm5 extends Exception {
    public final String a;
    public final String b;

    public jm5(String str, fm5 fm5Var) {
        super(str);
        this.a = str;
        if (fm5Var != null) {
            this.b = fm5Var.e();
        } else {
            this.b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.a + " (" + this.b + " at line 0)");
        return sb.toString();
    }
}
