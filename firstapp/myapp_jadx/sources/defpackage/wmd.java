package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wmd implements umd {
    public final WorkDatabase_Impl a;
    public final vmd b;

    public wmd(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new vmd(workDatabase_Impl);
    }

    @Override // defpackage.umd
    public final ArrayList a(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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

    @Override // defpackage.umd
    public final boolean b(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            boolean z = false;
            if (cursorD.moveToFirst()) {
                z = cursorD.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }

    @Override // defpackage.umd
    public final void c(qmd qmdVar) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(qmdVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    @Override // defpackage.umd
    public final boolean d(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        dw50VarG.C0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        Cursor cursorD = qlc.d(workDatabase_Impl, dw50VarG);
        try {
            boolean z = false;
            if (cursorD.moveToFirst()) {
                z = cursorD.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }
}
