package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mxj0 extends z9g<kxj0> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, kxj0 kxj0Var) {
        kxj0 kxj0Var2 = kxj0Var;
        bge0Var.C0(1, kxj0Var2.a);
        bge0Var.C0(2, kxj0Var2.b);
    }
}
