package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pqe0 implements lqe0 {
    public final WorkDatabase_Impl a;
    public final mqe0 b;
    public final nqe0 c;
    public final oqe0 d;

    public pqe0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new mqe0(workDatabase_Impl);
        this.c = new nqe0(workDatabase_Impl);
        this.d = new oqe0(workDatabase_Impl);
    }

    @Override // defpackage.lqe0
    public final kqe0 a(int i, String str) {
        dw50 dw50VarG = dw50.g(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        dw50VarG.C0(1, str);
        dw50VarG.q(2, i);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            return cursorD.moveToFirst() ? new kqe0(cursorD.getString(q5c.a(cursorD, "work_spec_id")), cursorD.getInt(q5c.a(cursorD, "generation")), cursorD.getInt(q5c.a(cursorD, "system_id"))) : null;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }

    @Override // defpackage.lqe0
    public final ArrayList c() {
        dw50 dw50VarG = dw50.g(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
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

    @Override // defpackage.lqe0
    public final void e(kqe0 kqe0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(kqe0Var);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    @Override // defpackage.lqe0
    public final void f(int i, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        nqe0 nqe0Var = this.c;
        bge0 bge0VarA = nqe0Var.a();
        bge0VarA.C0(1, str);
        bge0VarA.q(2, i);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                nqe0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            nqe0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.lqe0
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        oqe0 oqe0Var = this.d;
        bge0 bge0VarA = oqe0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                oqe0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            oqe0Var.c(bge0VarA);
            throw th2;
        }
    }
}
