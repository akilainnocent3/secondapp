package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eqv extends upv {
    public static final eqv c = new eqv(7, 8);

    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        vfe0Var.z("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
