package defpackage;

import defpackage.mj0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class g4d<T, V extends mj0> implements mh0<T, V> {
    public final wwh0 a;
    public final f0h0<T, V> b;
    public final T c;
    public final V d;
    public final V e;
    public final V f;
    public final T g;
    public final long h;

    public g4d(h4d<T> h4dVar, f0h0<T, V> f0h0Var, T t, V v) {
        wwh0 wwh0VarA = h4dVar.a();
        this.a = wwh0VarA;
        this.b = f0h0Var;
        this.c = t;
        V vInvoke = f0h0Var.a().invoke(t);
        this.d = vInvoke;
        this.e = (V) nj0.a(v);
        this.g = (T) f0h0Var.b().invoke(wwh0VarA.b(vInvoke, v));
        V v2 = wwh0VarA.c;
        if (v2 == null) {
            v2 = (V) vInvoke.c();
            wwh0VarA.c = v2;
        }
        int iB = v2.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            wwh wwhVar = wwh0VarA.a;
            vInvoke.getClass();
            jMax = Math.max(jMax, wwhVar.d(v.a(i)));
        }
        this.h = jMax;
        V v3 = (V) nj0.a(wwh0VarA.c(jMax, vInvoke, v));
        this.f = v3;
        int iB2 = v3.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            V v4 = this.f;
            v4.e(i2, f.d(v4.a(i2), -this.a.a(), this.a.a()));
        }
    }

    @Override // defpackage.mh0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.mh0
    public final V b(long j) {
        if (c(j)) {
            return this.f;
        }
        return (V) this.a.c(j, this.d, this.e);
    }

    @Override // defpackage.mh0
    public final long d() {
        return this.h;
    }

    @Override // defpackage.mh0
    public final f0h0<T, V> e() {
        return this.b;
    }

    @Override // defpackage.mh0
    public final T f(long j) {
        if (c(j)) {
            return this.g;
        }
        Function1<V, T> function1B = this.b.b();
        wwh0 wwh0Var = this.a;
        V v = wwh0Var.b;
        V v2 = this.d;
        if (v == null) {
            v = (V) v2.c();
            wwh0Var.b = v;
        }
        int iB = v.b();
        int i = 0;
        while (true) {
            V v3 = wwh0Var.b;
            if (i >= iB) {
                if (v3 != null) {
                    return function1B.invoke(v3);
                }
                Intrinsics.n("valueVector");
                throw null;
            }
            if (v3 == null) {
                Intrinsics.n("valueVector");
                throw null;
            }
            v3.e(i, wwh0Var.a.b(v2.a(i), this.e.a(i), j));
            i++;
        }
    }

    @Override // defpackage.mh0
    public final T g() {
        return this.g;
    }
}
