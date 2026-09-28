package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oxj0 implements lxj0 {
    public final WorkDatabase_Impl a;
    public final mxj0 b;

    public oxj0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new mxj0(workDatabase_Impl);
        new nxj0(workDatabase_Impl);
    }

    @Override // defpackage.lxj0
    public final ArrayList a(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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

    @Override // defpackage.lxj0
    public final void c(kxj0 kxj0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(kxj0Var);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }
}
