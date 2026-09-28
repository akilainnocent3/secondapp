package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq7 extends lv50.b {
    public final dqe0 a;

    public qq7(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    @Override // lv50.b
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        vfe0Var.v();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.a.getClass();
            sb.append(System.currentTimeMillis() - 86400000);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            vfe0Var.z(sb.toString());
            vfe0Var.N();
        } finally {
            vfe0Var.W();
        }
    }
}
