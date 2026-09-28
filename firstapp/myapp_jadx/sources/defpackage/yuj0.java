package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yuj0 extends upv {
    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        vfe0Var.z("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
