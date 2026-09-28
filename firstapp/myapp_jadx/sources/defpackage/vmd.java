package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vmd extends z9g<qmd> {
    @Override // defpackage.v390
    public final String b() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.z9g
    public final void d(bge0 bge0Var, qmd qmdVar) {
        qmd qmdVar2 = qmdVar;
        bge0Var.C0(1, qmdVar2.a);
        bge0Var.C0(2, qmdVar2.b);
    }
}
