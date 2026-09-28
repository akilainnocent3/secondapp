package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mqe0 extends z9g<kqe0> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, kqe0 kqe0Var) {
        kqe0 kqe0Var2 = kqe0Var;
        bge0Var.C0(1, kqe0Var2.a);
        bge0Var.q(2, kqe0Var2.b);
        bge0Var.q(3, kqe0Var2.c);
    }
}
