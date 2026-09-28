package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class bn20 implements zm20 {
    public final lv50 a;
    public final an20 b;

    public bn20(WorkDatabase workDatabase) {
        this.a = workDatabase;
        workDatabase.getClass();
        this.b = new an20(workDatabase);
    }

    @Override // defpackage.zm20
    public final Long a(String str) {
        dw50 dw50VarG = dw50.g(1, "SELECT long_value FROM Preference where `key`=?");
        dw50VarG.C0(1, str);
        lv50 lv50Var = this.a;
        lv50Var.b();
        Cursor cursorD = qlc.d(lv50Var, dw50VarG);
        try {
            Long lValueOf = null;
            if (cursorD.moveToFirst() && !cursorD.isNull(0)) {
                lValueOf = Long.valueOf(cursorD.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorD.close();
            dw50VarG.l();
        }
    }

    @Override // defpackage.zm20
    public final void b(ym20 ym20Var) {
        lv50 lv50Var = this.a;
        lv50Var.b();
        lv50Var.c();
        try {
            this.b.e(ym20Var);
            lv50Var.v();
        } finally {
            lv50Var.r();
        }
    }
}
