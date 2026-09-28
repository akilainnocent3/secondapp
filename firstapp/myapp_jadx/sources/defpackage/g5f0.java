package defpackage;

import defpackage.mj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g5f0<T, V extends mj0> implements mh0<T, V> {
    public final pwh0<V> a;
    public final f0h0<T, V> b;
    public T c;
    public T d;
    public V e;
    public V f;
    public final V g;
    public long h;
    public V i;

    public g5f0() {
        throw null;
    }

    public g5f0(xi0<T> xi0Var, f0h0<T, V> f0h0Var, T t, T t2, V v) {
        this.a = xi0Var.a(f0h0Var);
        this.b = f0h0Var;
        this.c = t2;
        this.d = t;
        this.e = f0h0Var.a().invoke(t);
        this.f = f0h0Var.a().invoke(t2);
        this.g = v != null ? (V) nj0.a(v) : (V) f0h0Var.a().invoke(t).c();
        this.h = -1L;
    }

    @Override // defpackage.mh0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.mh0
    public final V b(long j) {
        if (!c(j)) {
            return (V) this.a.f(j, this.e, this.f, this.g);
        }
        V v = this.i;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.a.e(this.e, this.f, this.g);
        this.i = v2;
        return v2;
    }

    @Override // defpackage.mh0
    public final long d() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jC = this.a.c(this.e, this.f, this.g);
        this.h = jC;
        return jC;
    }

    @Override // defpackage.mh0
    public final f0h0<T, V> e() {
        return this.b;
    }

    @Override // defpackage.mh0
    public final T f(long j) {
        if (c(j)) {
            return this.c;
        }
        mj0 mj0VarG = this.a.g(j, this.e, this.f, this.g);
        int iB = mj0VarG.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(mj0VarG.a(i))) {
                mm20.b("AnimationVector cannot contain a NaN. " + mj0VarG + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) this.b.b().invoke(mj0VarG);
    }

    @Override // defpackage.mh0
    public final T g() {
        return this.c;
    }

    public final void h(T t) {
        if (Intrinsics.g(t, this.d)) {
            return;
        }
        this.d = t;
        this.e = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    public final void i(T t) {
        if (Intrinsics.g(this.c, t)) {
            return;
        }
        this.c = t;
        this.f = this.b.a().invoke(t);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
