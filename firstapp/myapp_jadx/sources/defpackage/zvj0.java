package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zvj0 extends z9g<xvj0> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, xvj0 xvj0Var) {
        xvj0 xvj0Var2 = xvj0Var;
        bge0Var.C0(1, xvj0Var2.a);
        bge0Var.C0(2, xvj0Var2.b);
    }
}
