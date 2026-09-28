package defpackage;

import android.database.SQLException;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class aag<T> {
    public final y3l a;
    public final bjb0 b;

    public aag(y3l y3lVar, bjb0 bjb0Var) {
        this.a = y3lVar;
        this.b = bjb0Var;
    }

    public static void a(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!StringsKt.M(message, "unique", true) && !StringsKt.M(message, "2067", false) && !StringsKt.M(message, "1555", false)) {
            throw sQLException;
        }
    }

    public final void b(vp60 vp60Var, Iterable<? extends T> iterable) {
        vp60Var.getClass();
        if (iterable == null) {
            return;
        }
        for (T t : iterable) {
            try {
                this.a.m(vp60Var, t);
            } catch (SQLException e) {
                a(e);
                this.b.T(vp60Var, t);
            }
        }
    }

    public final void c(vp60 vp60Var, T t) {
        vp60Var.getClass();
        try {
            this.a.m(vp60Var, t);
        } catch (SQLException e) {
            a(e);
            this.b.T(vp60Var, t);
        }
    }
}
