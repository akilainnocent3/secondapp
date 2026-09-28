package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class awj0 implements yvj0 {
    public final WorkDatabase_Impl a;
    public final zvj0 b;

    public awj0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new zvj0(workDatabase_Impl);
    }

    @Override // defpackage.yvj0
    public final void a(xvj0 xvj0Var) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.e(xvj0Var);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    @Override // defpackage.yvj0
    public final ArrayList b(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT name FROM workname WHERE work_spec_id=?");
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
}
