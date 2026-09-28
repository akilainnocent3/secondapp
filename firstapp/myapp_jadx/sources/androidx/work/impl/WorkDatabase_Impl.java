package androidx.work.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.avj0;
import defpackage.awj0;
import defpackage.bn20;
import defpackage.bvj0;
import defpackage.cvj0;
import defpackage.cwj0;
import defpackage.dvj0;
import defpackage.esc;
import defpackage.gwj0;
import defpackage.ixj0;
import defpackage.lqe0;
import defpackage.lxj0;
import defpackage.o0p;
import defpackage.o3f0;
import defpackage.oxj0;
import defpackage.pqe0;
import defpackage.pwj0;
import defpackage.rzi;
import defpackage.umd;
import defpackage.vuj0;
import defpackage.vv50;
import defpackage.w040;
import defpackage.wfe0;
import defpackage.wmd;
import defpackage.wuj0;
import defpackage.xuj0;
import defpackage.yuj0;
import defpackage.yvj0;
import defpackage.zm20;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile ixj0 l;
    public volatile wmd m;
    public volatile oxj0 n;
    public volatile pqe0 o;
    public volatile awj0 p;
    public volatile gwj0 q;
    public volatile bn20 r;

    public class a extends vv50.a {
        public a() {
        }

        public final void a(rzi rziVar) {
            SQLiteDatabase sQLiteDatabase = rziVar.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        public final vv50.b b(rzi rziVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new o3f0.a(1, 1, "work_spec_id", "TEXT", null, true));
            map.put("prerequisite_id", new o3f0.a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            hashSet.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new o3f0.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new o3f0.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            o3f0 o3f0Var = new o3f0("Dependency", map, hashSet, hashSet2);
            o3f0 o3f0VarA = o3f0.a(rziVar, "Dependency");
            if (!o3f0Var.equals(o3f0VarA)) {
                return new vv50.b(false, dvj0.a("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
            }
            HashMap map2 = new HashMap(32);
            map2.put(AnalyticsParam.EVENT_PARAM_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_ID, "TEXT", null, true));
            map2.put("state", new o3f0.a(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new o3f0.a(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new o3f0.a(0, 1, "input_merger_class_name", "TEXT", null, true));
            map2.put("input", new o3f0.a(0, 1, "input", "BLOB", null, true));
            map2.put("output", new o3f0.a(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new o3f0.a(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new o3f0.a(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new o3f0.a(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new o3f0.a(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new o3f0.a(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new o3f0.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("last_enqueue_time", new o3f0.a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
            map2.put("minimum_retention_duration", new o3f0.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new o3f0.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new o3f0.a(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new o3f0.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("period_count", new o3f0.a(0, 1, "period_count", "INTEGER", "0", true));
            map2.put("generation", new o3f0.a(0, 1, "generation", "INTEGER", "0", true));
            map2.put("next_schedule_time_override", new o3f0.a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
            map2.put("next_schedule_time_override_generation", new o3f0.a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
            map2.put("stop_reason", new o3f0.a(0, 1, "stop_reason", "INTEGER", "-256", true));
            map2.put("trace_tag", new o3f0.a(0, 1, "trace_tag", "TEXT", null, false));
            map2.put("required_network_type", new o3f0.a(0, 1, "required_network_type", "INTEGER", null, true));
            map2.put("required_network_request", new o3f0.a(0, 1, "required_network_request", "BLOB", "x''", true));
            map2.put("requires_charging", new o3f0.a(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new o3f0.a(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new o3f0.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new o3f0.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new o3f0.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new o3f0.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            map2.put("content_uri_triggers", new o3f0.a(0, 1, "content_uri_triggers", "BLOB", null, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new o3f0.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new o3f0.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            o3f0 o3f0Var2 = new o3f0("WorkSpec", map2, hashSet3, hashSet4);
            o3f0 o3f0VarA2 = o3f0.a(rziVar, "WorkSpec");
            if (!o3f0Var2.equals(o3f0VarA2)) {
                return new vv50.b(false, dvj0.a("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2));
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new o3f0.a(1, 1, "tag", "TEXT", null, true));
            map3.put("work_spec_id", new o3f0.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new o3f0.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            o3f0 o3f0Var3 = new o3f0("WorkTag", map3, hashSet5, hashSet6);
            o3f0 o3f0VarA3 = o3f0.a(rziVar, "WorkTag");
            if (!o3f0Var3.equals(o3f0VarA3)) {
                return new vv50.b(false, dvj0.a("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", o3f0Var3, "\n Found:\n", o3f0VarA3));
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new o3f0.a(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("generation", new o3f0.a(2, 1, "generation", "INTEGER", "0", true));
            map4.put("system_id", new o3f0.a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            o3f0 o3f0Var4 = new o3f0("SystemIdInfo", map4, hashSet7, new HashSet(0));
            o3f0 o3f0VarA4 = o3f0.a(rziVar, "SystemIdInfo");
            if (!o3f0Var4.equals(o3f0VarA4)) {
                return new vv50.b(false, dvj0.a("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", o3f0Var4, "\n Found:\n", o3f0VarA4));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new o3f0.a(1, 1, "name", "TEXT", null, true));
            map5.put("work_spec_id", new o3f0.a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new o3f0.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            o3f0 o3f0Var5 = new o3f0("WorkName", map5, hashSet8, hashSet9);
            o3f0 o3f0VarA5 = o3f0.a(rziVar, "WorkName");
            if (!o3f0Var5.equals(o3f0VarA5)) {
                return new vv50.b(false, dvj0.a("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", o3f0Var5, "\n Found:\n", o3f0VarA5));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new o3f0.a(1, 1, "work_spec_id", "TEXT", null, true));
            map6.put("progress", new o3f0.a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new o3f0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(AnalyticsParam.EVENT_PARAM_ID)));
            o3f0 o3f0Var6 = new o3f0("WorkProgress", map6, hashSet10, new HashSet(0));
            o3f0 o3f0VarA6 = o3f0.a(rziVar, "WorkProgress");
            if (!o3f0Var6.equals(o3f0VarA6)) {
                return new vv50.b(false, dvj0.a("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", o3f0Var6, "\n Found:\n", o3f0VarA6));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new o3f0.a(1, 1, "key", "TEXT", null, true));
            map7.put("long_value", new o3f0.a(0, 1, "long_value", "INTEGER", null, false));
            o3f0 o3f0Var7 = new o3f0("Preference", map7, new HashSet(0), new HashSet(0));
            o3f0 o3f0VarA7 = o3f0.a(rziVar, "Preference");
            return !o3f0Var7.equals(o3f0VarA7) ? new vv50.b(false, dvj0.a(oAudzpbdOhCI.HqshMqNgW, o3f0Var7, "\n Found:\n", o3f0VarA7)) : new vv50.b(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public final yvj0 A() {
        awj0 awj0Var;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new awj0(this);
                }
                awj0Var = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return awj0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cwj0 B() {
        gwj0 gwj0Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new gwj0(this);
                }
                gwj0Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gwj0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pwj0 C() {
        ixj0 ixj0Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new ixj0(this);
                }
                ixj0Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ixj0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final lxj0 D() {
        oxj0 oxj0Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new oxj0(this);
                }
                oxj0Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oxj0Var;
    }

    @Override // defpackage.lv50
    public final o0p e() {
        return new o0p(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.lv50
    public final wfe0 g(esc escVar) {
        vv50 vv50Var = new vv50(escVar, new a());
        Context context = escVar.a;
        context.getClass();
        return escVar.c.a(new wfe0.b(context, escVar.b, vv50Var, false, false));
    }

    @Override // defpackage.lv50
    public final List h(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vuj0(13, 14));
        arrayList.add(new wuj0(14, 15));
        arrayList.add(new xuj0(16, 17));
        arrayList.add(new yuj0(17, 18));
        arrayList.add(new zuj0(18, 19));
        arrayList.add(new avj0(19, 20));
        arrayList.add(new bvj0(20, 21));
        arrayList.add(new cvj0(22, 23));
        return arrayList;
    }

    @Override // defpackage.lv50
    public final Set<Class<Object>> m() {
        return new HashSet();
    }

    @Override // defpackage.lv50
    public final Map<Class<?>, List<Class<?>>> o() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(pwj0.class, list);
        map.put(umd.class, list);
        map.put(lxj0.class, list);
        map.put(lqe0.class, list);
        map.put(yvj0.class, list);
        map.put(cwj0.class, list);
        map.put(zm20.class, list);
        map.put(w040.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final umd x() {
        wmd wmdVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new wmd(this);
                }
                wmdVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wmdVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final zm20 y() {
        bn20 bn20Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new bn20(this);
                }
                bn20Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bn20Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final lqe0 z() {
        pqe0 pqe0Var;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new pqe0(this);
                }
                pqe0Var = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pqe0Var;
    }
}
