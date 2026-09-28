package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aqv extends upv {
    public static final aqv c = new aqv(1, 2);

    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        vfe0Var.z("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        vfe0Var.z("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        vfe0Var.z("DROP TABLE IF EXISTS alarmInfo");
        vfe0Var.z("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
