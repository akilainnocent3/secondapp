package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ujc<T> implements d5f0<T> {
    public final int a;
    public final int b;
    public ca50 c;

    public ujc(int i, int i2) {
        if (!erh0.i(i, i2)) {
            hb5.a(whs.b(i, i2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.d5f0
    public final ca50 a() {
        return this.c;
    }

    @Override // defpackage.d5f0
    public final void i(pv90 pv90Var) throws Throwable {
        pv90Var.d(this.a, this.b);
    }

    @Override // defpackage.d5f0
    public final void j(ca50 ca50Var) {
        this.c = ca50Var;
    }

    @Override // defpackage.gbs
    public final void b() {
    }

    @Override // defpackage.gbs
    public final void c() {
    }

    @Override // defpackage.gbs
    public final void onDestroy() {
    }

    @Override // defpackage.d5f0
    public final void d(pv90 pv90Var) {
    }

    @Override // defpackage.d5f0
    public void g(Drawable drawable) {
    }

    @Override // defpackage.d5f0
    public final void m(Drawable drawable) {
    }

    public ujc() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
