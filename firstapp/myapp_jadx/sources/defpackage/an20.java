package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an20 extends z9g<ym20> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, ym20 ym20Var) {
        ym20 ym20Var2 = ym20Var;
        bge0Var.C0(1, ym20Var2.a);
        bge0Var.q(2, ym20Var2.b.longValue());
    }
}
