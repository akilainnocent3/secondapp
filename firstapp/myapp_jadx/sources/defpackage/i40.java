package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class i40 {
    public static final Canvas a = new Canvas();

    public static final h40 a(t70 t70Var) {
        h40 h40Var = new h40();
        h40Var.a = new Canvas(w70.a(t70Var));
        return h40Var;
    }

    public static final h40 b(Canvas canvas) {
        h40 h40Var = new h40();
        h40Var.a = canvas;
        return h40Var;
    }

    public static final Canvas c(lc6 lc6Var) {
        lc6Var.getClass();
        return ((h40) lc6Var).a;
    }
}
