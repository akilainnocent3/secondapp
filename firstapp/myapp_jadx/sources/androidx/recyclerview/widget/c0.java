package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import defpackage.hb5;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public final RecyclerView.o a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public c0(RecyclerView.o oVar) {
        this.a = oVar;
    }

    public static c0 a(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return new a0(oVar);
        }
        if (i == 1) {
            return new b0(oVar);
        }
        hb5.a("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return l() - this.b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);
}
