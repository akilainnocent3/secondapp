package defpackage;

import defpackage.mj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wwh0<V extends mj0> {
    public final wwh a;
    public V b;
    public V c;
    public V d;
    public final float e;

    public wwh0(wwh wwhVar) {
        this.a = wwhVar;
        this.e = wwhVar.c();
    }

    public final float a() {
        return this.e;
    }

    public final V b(V v, V v2) {
        V v3 = this.d;
        if (v3 == null) {
            v3 = (V) v.c();
            this.d = v3;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = this.d;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                Intrinsics.n("targetVector");
                throw null;
            }
            if (v4 == null) {
                Intrinsics.n("targetVector");
                throw null;
            }
            v4.e(i, this.a.e(v.a(i), v2.a(i)));
            i++;
        }
    }

    public final V c(long j, V v, V v2) {
        V v3 = this.c;
        if (v3 == null) {
            v3 = (V) v.c();
            this.c = v3;
        }
        int iB = v3.b();
        int i = 0;
        while (true) {
            V v4 = this.c;
            if (i >= iB) {
                if (v4 != null) {
                    return v4;
                }
                Intrinsics.n("velocityVector");
                throw null;
            }
            if (v4 == null) {
                Intrinsics.n("velocityVector");
                throw null;
            }
            v.getClass();
            v4.e(i, this.a.a(v2.a(i), j));
            i++;
        }
    }
}
