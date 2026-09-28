package defpackage;

import android.database.Cursor;
import androidx.window.layout.oKr.TEFcJcMqR;
import androidx.work.c;
import androidx.work.impl.WorkDatabase_Impl;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ixj0 implements pwj0 {
    public final WorkDatabase_Impl a;
    public final ywj0 b;
    public final bxj0 c;
    public final cxj0 d;
    public final dxj0 e;
    public final exj0 f;
    public final fxj0 g;
    public final gxj0 h;
    public final hxj0 i;
    public final qwj0 j;
    public final swj0 k;
    public final twj0 l;
    public final uwj0 m;
    public final xwj0 n;

    public ixj0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new ywj0(workDatabase_Impl);
        new axj0(workDatabase_Impl);
        this.c = new bxj0(workDatabase_Impl);
        this.d = new cxj0(workDatabase_Impl);
        this.e = new dxj0(workDatabase_Impl);
        this.f = new exj0(workDatabase_Impl);
        this.g = new fxj0(workDatabase_Impl);
        this.h = new gxj0(workDatabase_Impl);
        this.i = new hxj0(workDatabase_Impl);
        this.j = new qwj0(workDatabase_Impl);
        new rwj0(workDatabase_Impl);
        this.k = new swj0(workDatabase_Impl);
        this.l = new twj0(workDatabase_Impl);
        this.m = new uwj0(workDatabase_Impl);
        new vwj0(workDatabase_Impl);
        new wwj0(workDatabase_Impl);
        this.n = new xwj0(workDatabase_Impl);
    }

    @Override // defpackage.pwj0
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        bxj0 bxj0Var = this.c;
        bge0 bge0VarA = bxj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                bxj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            bxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        exj0 exj0Var = this.f;
        bge0 bge0VarA = exj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                exj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            exj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final int c(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        twj0 twj0Var = this.l;
        bge0 bge0VarA = twj0Var.a();
        bge0VarA.q(1, j);
        bge0VarA.C0(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                twj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            twj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList d(long j) throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        dw50VarG.q(1, j);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j2 = cursorD.getLong(iA7);
                    long j3 = cursorD.getLong(iA8);
                    long j4 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j5 = cursorD.getLong(iA12);
                    long j6 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j7 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j8 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j9 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j10 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j11 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j2, j3, j4, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j10, j11, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j5, j6, j7, j8, z, x7zVarD, i8, i10, j9, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final int e(jvj0 jvj0Var, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        cxj0 cxj0Var = this.d;
        bge0 bge0VarA = cxj0Var.a();
        bge0VarA.q(1, qxj0.f(jvj0Var));
        bge0VarA.C0(2, str);
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                cxj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            cxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final void f(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        swj0 swj0Var = this.k;
        bge0 bge0VarA = swj0Var.a();
        bge0VarA.C0(1, str);
        bge0VarA.q(2, i);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                swj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            swj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList g() throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, gvQvkPPtA.nvQnKpifjsSWPN);
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j = cursorD.getLong(iA7);
                    long j2 = cursorD.getLong(iA8);
                    long j3 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j4 = cursorD.getLong(iA12);
                    long j5 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j6 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j7 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j8 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j9 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j10 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j, j2, j3, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j9, j10, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j4, j5, j6, j7, z, x7zVarD, i8, i10, j8, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList h(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(cursorD.getString(0));
            }
            cursorD.close();
            dw50VarG.l();
            return arrayList;
        } catch (Throwable th) {
            cursorD.close();
            dw50VarG.l();
            throw th;
        }
    }

    @Override // defpackage.pwj0
    public final jvj0 i(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT state FROM workspec WHERE id=?");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            jvj0 jvj0VarE = null;
            if (cursorD.moveToFirst()) {
                Integer numValueOf = cursorD.isNull(0) ? null : Integer.valueOf(cursorD.getInt(0));
                if (numValueOf != null) {
                    jvj0VarE = qxj0.e(numValueOf.intValue());
                }
            }
            return jvj0VarE;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }

    @Override // defpackage.pwj0
    public final owj0 j(String str) throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(1, "SELECT * FROM workspec WHERE id=?");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                owj0 owj0Var = null;
                if (cursorD.moveToFirst()) {
                    owj0Var = new owj0(cursorD.getString(iA), qxj0.e(cursorD.getInt(iA2)), cursorD.getString(iA3), cursorD.getString(iA4), c.a(cursorD.getBlob(iA5)), c.a(cursorD.getBlob(iA6)), cursorD.getLong(iA7), cursorD.getLong(iA8), cursorD.getLong(iA9), new lxa(qxj0.g(cursorD.getBlob(iA25)), qxj0.c(cursorD.getInt(iA24)), cursorD.getInt(iA26) != 0, cursorD.getInt(iA27) != 0, cursorD.getInt(iA28) != 0, cursorD.getInt(iA29) != 0, cursorD.getLong(iA30), cursorD.getLong(iA31), qxj0.a(cursorD.getBlob(iA32))), cursorD.getInt(iA10), qxj0.b(cursorD.getInt(iA11)), cursorD.getLong(iA12), cursorD.getLong(iA13), cursorD.getLong(iA14), cursorD.getLong(iA15), cursorD.getInt(iA16) != 0, qxj0.d(cursorD.getInt(iA17)), cursorD.getInt(iA18), cursorD.getInt(iA19), cursorD.getLong(iA20), cursorD.getInt(iA21), cursorD.getInt(iA22), cursorD.isNull(iA23) ? null : cursorD.getString(iA23));
                }
                cursorD.close();
                dw50Var.l();
                return owj0Var;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final void k(owj0 owj0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(owj0Var);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    @Override // defpackage.pwj0
    public final int l(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        dxj0 dxj0Var = this.e;
        bge0 bge0VarA = dxj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                dxj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            dxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList m(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                arrayList.add(c.a(cursorD.getBlob(0)));
            }
            cursorD.close();
            dw50VarG.l();
            return arrayList;
        } catch (Throwable th) {
            cursorD.close();
            dw50VarG.l();
            throw th;
        }
    }

    @Override // defpackage.pwj0
    public final int n() {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        uwj0 uwj0Var = this.m;
        bge0 bge0VarA = uwj0Var.a();
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                uwj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            uwj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList o() throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        dw50VarG.q(1, 200L);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j = cursorD.getLong(iA7);
                    long j2 = cursorD.getLong(iA8);
                    long j3 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j4 = cursorD.getLong(iA12);
                    long j5 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j6 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j7 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j8 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j9 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j10 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j, j2, j3, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j9, j10, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j4, j5, j6, j7, z, x7zVarD, i8, i10, j8, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList p(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            ArrayList arrayList = new ArrayList(cursorD.getCount());
            while (cursorD.moveToNext()) {
                String string = cursorD.getString(0);
                jvj0 jvj0VarE = qxj0.e(cursorD.getInt(1));
                string.getClass();
                owj0.a aVar = new owj0.a();
                aVar.a = string;
                aVar.b = jvj0VarE;
                arrayList.add(aVar);
            }
            cursorD.close();
            dw50VarG.l();
            return arrayList;
        } catch (Throwable th) {
            cursorD.close();
            dw50VarG.l();
            throw th;
        }
    }

    @Override // defpackage.pwj0
    public final q2i q() {
        e6b e6bVar = new e6b(new zwj0(this, dw50.g(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")), 0);
        return s7n.a(this.a, new String[]{"workspec"}, e6bVar);
    }

    @Override // defpackage.pwj0
    public final void r(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        gxj0 gxj0Var = this.h;
        bge0 bge0VarA = gxj0Var.a();
        bge0VarA.q(1, j);
        bge0VarA.C0(2, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                gxj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            gxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final void s(String str, c cVar) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        fxj0 fxj0Var = this.g;
        bge0 bge0VarA = fxj0Var.a();
        c cVar2 = c.b;
        bge0VarA.Z0(1, c.b.b(cVar));
        bge0VarA.C0(2, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                fxj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            fxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList t() throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, TEFcJcMqR.nTzEFWSuRcmqt);
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j = cursorD.getLong(iA7);
                    long j2 = cursorD.getLong(iA8);
                    long j3 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j4 = cursorD.getLong(iA12);
                    long j5 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j6 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j7 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j8 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j9 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j10 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j, j2, j3, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j9, j10, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j4, j5, j6, j7, z, x7zVarD, i8, i10, j8, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final void u(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        xwj0 xwj0Var = this.n;
        bge0 bge0VarA = xwj0Var.a();
        bge0VarA.q(1, i);
        bge0VarA.C0(2, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                xwj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            xwj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList v() throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j = cursorD.getLong(iA7);
                    long j2 = cursorD.getLong(iA8);
                    long j3 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j4 = cursorD.getLong(iA12);
                    long j5 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j6 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j7 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j8 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j9 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j10 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j, j2, j3, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j9, j10, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j4, j5, j6, j7, z, x7zVarD, i8, i10, j8, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final int w(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        qwj0 qwj0Var = this.j;
        bge0 bge0VarA = qwj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                qwj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            qwj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final ArrayList x() throws Throwable {
        dw50 dw50Var;
        dw50 dw50VarG = dw50.g(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        dw50VarG.q(1, 20L);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            int iA = q5c.a(cursorD, AnalyticsParam.EVENT_PARAM_ID);
            int iA2 = q5c.a(cursorD, "state");
            int iA3 = q5c.a(cursorD, "worker_class_name");
            int iA4 = q5c.a(cursorD, "input_merger_class_name");
            int iA5 = q5c.a(cursorD, "input");
            int iA6 = q5c.a(cursorD, "output");
            int iA7 = q5c.a(cursorD, "initial_delay");
            int iA8 = q5c.a(cursorD, "interval_duration");
            int iA9 = q5c.a(cursorD, "flex_duration");
            int iA10 = q5c.a(cursorD, "run_attempt_count");
            int iA11 = q5c.a(cursorD, "backoff_policy");
            int iA12 = q5c.a(cursorD, "backoff_delay_duration");
            int iA13 = q5c.a(cursorD, "last_enqueue_time");
            int iA14 = q5c.a(cursorD, "minimum_retention_duration");
            dw50Var = dw50VarG;
            try {
                int iA15 = q5c.a(cursorD, "schedule_requested_at");
                int iA16 = q5c.a(cursorD, "run_in_foreground");
                int iA17 = q5c.a(cursorD, "out_of_quota_policy");
                int iA18 = q5c.a(cursorD, "period_count");
                int iA19 = q5c.a(cursorD, "generation");
                int iA20 = q5c.a(cursorD, "next_schedule_time_override");
                int iA21 = q5c.a(cursorD, "next_schedule_time_override_generation");
                int iA22 = q5c.a(cursorD, "stop_reason");
                int iA23 = q5c.a(cursorD, "trace_tag");
                int iA24 = q5c.a(cursorD, "required_network_type");
                int iA25 = q5c.a(cursorD, "required_network_request");
                int iA26 = q5c.a(cursorD, "requires_charging");
                int iA27 = q5c.a(cursorD, "requires_device_idle");
                int iA28 = q5c.a(cursorD, "requires_battery_not_low");
                int iA29 = q5c.a(cursorD, "requires_storage_not_low");
                int iA30 = q5c.a(cursorD, "trigger_content_update_delay");
                int iA31 = q5c.a(cursorD, "trigger_max_content_delay");
                int iA32 = q5c.a(cursorD, "content_uri_triggers");
                int i = iA14;
                ArrayList arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    String string = cursorD.getString(iA);
                    jvj0 jvj0VarE = qxj0.e(cursorD.getInt(iA2));
                    String string2 = cursorD.getString(iA3);
                    String string3 = cursorD.getString(iA4);
                    c cVarA = c.a(cursorD.getBlob(iA5));
                    c cVarA2 = c.a(cursorD.getBlob(iA6));
                    long j = cursorD.getLong(iA7);
                    long j2 = cursorD.getLong(iA8);
                    long j3 = cursorD.getLong(iA9);
                    int i2 = cursorD.getInt(iA10);
                    nt1 nt1VarB = qxj0.b(cursorD.getInt(iA11));
                    long j4 = cursorD.getLong(iA12);
                    long j5 = cursorD.getLong(iA13);
                    int i3 = i;
                    long j6 = cursorD.getLong(i3);
                    i = i3;
                    int i4 = iA15;
                    long j7 = cursorD.getLong(i4);
                    iA15 = i4;
                    int i5 = iA16;
                    boolean z = cursorD.getInt(i5) != 0;
                    iA16 = i5;
                    int i6 = iA17;
                    x7z x7zVarD = qxj0.d(cursorD.getInt(i6));
                    iA17 = i6;
                    int i7 = iA18;
                    int i8 = cursorD.getInt(i7);
                    iA18 = i7;
                    int i9 = iA19;
                    int i10 = cursorD.getInt(i9);
                    iA19 = i9;
                    int i11 = iA20;
                    long j8 = cursorD.getLong(i11);
                    iA20 = i11;
                    int i12 = iA21;
                    int i13 = cursorD.getInt(i12);
                    iA21 = i12;
                    int i14 = iA22;
                    int i15 = cursorD.getInt(i14);
                    iA22 = i14;
                    int i16 = iA23;
                    String string4 = cursorD.isNull(i16) ? null : cursorD.getString(i16);
                    iA23 = i16;
                    int i17 = iA24;
                    sox soxVarC = qxj0.c(cursorD.getInt(i17));
                    iA24 = i17;
                    int i18 = iA25;
                    ynx ynxVarG = qxj0.g(cursorD.getBlob(i18));
                    iA25 = i18;
                    int i19 = iA26;
                    boolean z2 = cursorD.getInt(i19) != 0;
                    iA26 = i19;
                    int i20 = iA27;
                    boolean z3 = cursorD.getInt(i20) != 0;
                    iA27 = i20;
                    int i21 = iA28;
                    boolean z4 = cursorD.getInt(i21) != 0;
                    iA28 = i21;
                    int i22 = iA29;
                    boolean z5 = cursorD.getInt(i22) != 0;
                    iA29 = i22;
                    int i23 = iA30;
                    long j9 = cursorD.getLong(i23);
                    iA30 = i23;
                    int i24 = iA31;
                    long j10 = cursorD.getLong(i24);
                    iA31 = i24;
                    int i25 = iA32;
                    iA32 = i25;
                    arrayList.add(new owj0(string, jvj0VarE, string2, string3, cVarA, cVarA2, j, j2, j3, new lxa(ynxVarG, soxVarC, z2, z3, z4, z5, j9, j10, qxj0.a(cursorD.getBlob(i25))), i2, nt1VarB, j4, j5, j6, j7, z, x7zVarD, i8, i10, j8, i13, i15, string4));
                }
                cursorD.close();
                dw50Var.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorD.close();
                dw50Var.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dw50Var = dw50VarG;
        }
    }

    @Override // defpackage.pwj0
    public final int y(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        hxj0 hxj0Var = this.i;
        bge0 bge0VarA = hxj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                int iD = bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                hxj0Var.c(bge0VarA);
                return iD;
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            hxj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.pwj0
    public final int z() {
        dw50 dw50VarG = dw50.g(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            return cursorD.moveToFirst() ? cursorD.getInt(0) : 0;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }
}
