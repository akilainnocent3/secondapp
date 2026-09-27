package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class w9 implements Runnable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9 f75775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9 f75776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f75777c;

    public w9(d9 d9Var, g9 g9Var, n9 n9Var) {
        this.f75775a = d9Var;
        this.f75776b = g9Var;
        this.f75777c = n9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((w9) obj).f75776b.f74866c - this.f75776b.f74866c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int iA = a();
            n9 n9Var = this.f75777c;
            if (n9Var != null) {
                n9Var.a(this.f75775a, iA);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f75777c != null) {
                this.f75777c.a(this.f75775a, 0);
            }
        } catch (Throwable th2) {
            try {
                if (this.f75775a.f74672a != e9.f74723f) {
                    d9.a(th2);
                }
            } finally {
                n9 n9Var2 = this.f75777c;
                if (n9Var2 != null) {
                    n9Var2.a(this.f75775a, 0);
                }
            }
        }
    }
}
