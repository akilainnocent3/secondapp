package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wpv extends upv {
    public static final wpv c = new wpv(11, 12);

    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        vfe0Var.z("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
