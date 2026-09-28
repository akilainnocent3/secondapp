package defpackage;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zwj0 implements Callable<Boolean> {
    public final /* synthetic */ dw50 a;
    public final /* synthetic */ ixj0 b;

    public zwj0(ixj0 ixj0Var, dw50 dw50Var) {
        this.b = ixj0Var;
        this.a = dw50Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        Boolean boolValueOf;
        Cursor cursorD = qlc.d(this.b.a, this.a);
        try {
            if (cursorD.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorD.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            return boolValueOf;
        } finally {
            cursorD.close();
        }
    }

    public final void finalize() {
        this.a.l();
    }
}
