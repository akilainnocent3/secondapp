package defpackage;

import androidx.compose.runtime.k;

/* JADX INFO: loaded from: classes.dex */
public final class tzr {
    public final osw a;
    public final osw b;
    public boolean c;
    public Object d;
    public final sxr e;

    public tzr(int i, int i2) {
        this.a = k.a(i);
        this.b = k.a(i2);
        this.e = new sxr(i, 30, 100);
    }

    public final void a(int i, int i2) {
        if (i < 0.0f) {
            zkn.a("Index should be non-negative (" + i + ')');
        }
        ((u5a0) this.a).k(i);
        this.e.b(i);
        ((u5a0) this.b).k(i2);
    }
}
