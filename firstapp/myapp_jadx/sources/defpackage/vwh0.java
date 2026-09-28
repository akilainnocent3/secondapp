package defpackage;

import defpackage.mj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vwh0<V extends mj0> implements uwh0<V> {
    public final hk0 a;
    public V b;
    public V c;
    public V d;

    public static final class a implements hk0 {
        public final /* synthetic */ nwh a;

        public a(nwh nwhVar) {
            this.a = nwhVar;
        }

        @Override // defpackage.hk0
        public final nwh get(int i) {
            return this.a;
        }
    }

    public vwh0(nwh nwhVar) {
        this(new a(nwhVar));
    }

    @Override // defpackage.pwh0
    public final long c(V v, V v2, V v3) {
        int iB = v.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.get(i).e(v.a(i), v2.a(i), v3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.pwh0
    public final V e(V v, V v2, V v3) {
        V v4 = this.d;
        if (v4 == null) {
            v4 = (V) v3.c();
            this.d = v4;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.d;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                Intrinsics.n("endVelocityVector");
                throw null;
            }
            if (v5 == null) {
                Intrinsics.n("endVelocityVector");
                throw null;
            }
            v5.e(i, this.a.get(i).b(v.a(i), v2.a(i), v3.a(i)));
            i++;
        }
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        V v4 = this.c;
        if (v4 == null) {
            v4 = (V) v3.c();
            this.c = v4;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.c;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                Intrinsics.n("velocityVector");
                throw null;
            }
            if (v5 == null) {
                Intrinsics.n("velocityVector");
                throw null;
            }
            long j2 = j;
            v5.e(i, this.a.get(i).d(j2, v.a(i), v2.a(i), v3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        V v4 = this.b;
        if (v4 == null) {
            v4 = (V) v.c();
            this.b = v4;
        }
        int iB = v4.b();
        int i = 0;
        while (true) {
            V v5 = this.b;
            if (i >= iB) {
                if (v5 != null) {
                    return v5;
                }
                Intrinsics.n("valueVector");
                throw null;
            }
            if (v5 == null) {
                Intrinsics.n("valueVector");
                throw null;
            }
            long j2 = j;
            v5.e(i, this.a.get(i).c(j2, v.a(i), v2.a(i), v3.a(i)));
            i++;
            j = j2;
        }
    }

    public vwh0(hk0 hk0Var) {
        this.a = hk0Var;
    }
}
