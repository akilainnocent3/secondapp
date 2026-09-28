package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n5a0 {
    public static final k5a0 a = new k5a0();
    public static final t6a0<c5a0> b = new t6a0<>();
    public static final Object c = new Object();
    public static i5a0 d;
    public static long e;
    public static final g5a0 f;
    public static final v6a0<nxd0> g;
    public static List<? extends Function2<? super Set<? extends Object>, ? super c5a0, Unit>> h;
    public static List<? extends Function1<Object, Unit>> i;
    public static final s2l j;
    public static final u11 k;

    static {
        i5a0 i5a0Var = i5a0.e;
        d = i5a0Var;
        e = 2L;
        g5a0 g5a0Var = new g5a0();
        g5a0Var.b = new long[16];
        g5a0Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        g5a0Var.d = iArr;
        f = g5a0Var;
        v6a0<nxd0> v6a0Var = new v6a0<>();
        v6a0Var.b = new int[16];
        v6a0Var.c = new myi0[16];
        g = v6a0Var;
        m2g m2gVar = m2g.a;
        h = m2gVar;
        i = m2gVar;
        long j2 = e;
        e = 1 + j2;
        s2l s2lVar = new s2l(j2, i5a0Var, null, new r2l());
        d = d.f(s2lVar.b);
        j = s2lVar;
        k = new u11(0);
    }

    public static final i5a0 a(i5a0 i5a0Var, long j2, long j3) {
        while (Intrinsics.i(j2, j3) < 0) {
            i5a0Var = i5a0Var.f(j2);
            j2++;
        }
        return i5a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[Catch: all -> 0x0086, LOOP:1: B:30:0x0056->B:42:0x0090, LOOP_END, TryCatch #1 {all -> 0x0086, blocks: (B:25:0x0047, B:27:0x004c, B:30:0x0056, B:32:0x0066, B:34:0x0072, B:36:0x007b, B:39:0x0088, B:42:0x0090, B:43:0x0093), top: B:52:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:43:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:42:0x0090], SYNTHETIC] */
    public static final <T> T b(Function1<? super i5a0, ? extends T> function1) {
        stw<nxd0> stwVar;
        T t;
        s2l s2lVar = j;
        synchronized (c) {
            try {
                stwVar = s2lVar.i;
                if (stwVar != null) {
                    k.addAndGet(1);
                }
                t = (T) t(s2lVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (stwVar != null) {
            try {
                List<? extends Function2<? super Set<? extends Object>, ? super c5a0, Unit>> list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke(new iz60(stwVar), s2lVar);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            try {
                c();
                if (stwVar != null) {
                    Object[] objArr = stwVar.b;
                    long[] jArr = stwVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        o((nxd0) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    Unit unit = Unit.a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t;
    }

    public static final void c() {
        v6a0<nxd0> v6a0Var = g;
        int i2 = v6a0Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            myi0<nxd0> myi0Var = v6a0Var.c[i3];
            nxd0 nxd0Var = myi0Var != null ? myi0Var.get() : null;
            if (nxd0Var != null && n(nxd0Var)) {
                if (i4 != i3) {
                    v6a0Var.c[i4] = myi0Var;
                    int[] iArr = v6a0Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            v6a0Var.c[i5] = null;
            v6a0Var.b[i5] = 0;
        }
        if (i4 != i2) {
            v6a0Var.a = i4;
        }
    }

    public static final c5a0 d(c5a0 c5a0Var, Function1<Object, Unit> function1, boolean z) {
        boolean z2 = c5a0Var instanceof wtw;
        if (z2 || c5a0Var == null) {
            return new jug0(z2 ? (wtw) c5a0Var : null, function1, null, false, z);
        }
        return new kug0(c5a0Var, function1, false, z);
    }

    public static final <T extends rxd0> T e(T t) {
        T t2;
        c5a0.e.getClass();
        c5a0 c5a0VarG = g();
        T t3 = (T) q(t, c5a0VarG.g(), c5a0VarG.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            c5a0 c5a0VarG2 = g();
            t2 = (T) q(t, c5a0VarG2.g(), c5a0VarG2.d());
        }
        if (t2 != null) {
            return t2;
        }
        p();
        throw null;
    }

    public static final <T extends rxd0> T f(T t, c5a0 c5a0Var) {
        T t2;
        T t3 = (T) q(t, c5a0Var.g(), c5a0Var.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) q(t, c5a0Var.g(), c5a0Var.d());
        }
        if (t2 != null) {
            return t2;
        }
        p();
        throw null;
    }

    public static final c5a0 g() {
        c5a0 c5a0VarA = b.a();
        return c5a0VarA == null ? j : c5a0VarA;
    }

    public static final Function1<Object, Unit> h(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2, boolean z) {
        if (!z) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: j5a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                function1.invoke(obj);
                function2.invoke(obj);
                return Unit.a;
            }
        };
    }

    public static final Function1<Object, Unit> i(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: l5a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                function1.invoke(obj);
                function2.invoke(obj);
                return Unit.a;
            }
        };
    }

    public static final <T extends rxd0> T j(T t, nxd0 nxd0Var) {
        long j2 = e;
        g5a0 g5a0Var = f;
        if (g5a0Var.a > 0) {
            j2 = g5a0Var.b[0];
        }
        long j3 = j2 - 1;
        T t2 = null;
        rxd0 rxd0Var = null;
        for (rxd0 rxd0VarV = nxd0Var.v(); rxd0VarV != null; rxd0VarV = rxd0VarV.b) {
            long j4 = rxd0VarV.a;
            if (j4 != 0) {
                if (j4 != 0 && Intrinsics.i(j4, j3) <= 0 && !i5a0.e.d(j4)) {
                    if (rxd0Var != null) {
                        if (Intrinsics.i(rxd0VarV.a, rxd0Var.a) >= 0) {
                            t2 = (T) rxd0Var;
                            break;
                        }
                        break;
                    }
                    rxd0Var = rxd0VarV;
                }
            }
            t2 = (T) rxd0VarV;
            break;
        }
        if (t2 != null) {
            t2.a = Long.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.c(Long.MAX_VALUE);
        t3.b = nxd0Var.v();
        nxd0Var.n(t3);
        return t3;
    }

    public static final void k(c5a0 c5a0Var, nxd0 nxd0Var) {
        c5a0Var.t(c5a0Var.h() + 1);
        Function1<Object, Unit> function1I = c5a0Var.i();
        if (function1I != null) {
            function1I.invoke(nxd0Var);
        }
    }

    public static final HashMap l(long j2, wtw wtwVar, i5a0 i5a0Var) {
        long[] jArr;
        i5a0 i5a0Var2;
        long[] jArr2;
        int i2;
        rxd0 rxd0VarQ;
        stw<nxd0> stwVarX = wtwVar.x();
        if (stwVarX != null) {
            i5a0 i5a0VarE = wtwVar.d().f(wtwVar.g()).e(wtwVar.k);
            Object[] objArr = stwVarX.b;
            long[] jArr3 = stwVarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & 255) < 128) {
                                nxd0 nxd0Var = (nxd0) objArr[(i3 << 3) + i6];
                                rxd0 rxd0VarV = nxd0Var.v();
                                jArr2 = jArr3;
                                i2 = i4;
                                rxd0 rxd0VarQ2 = q(rxd0VarV, j2, i5a0Var);
                                if (rxd0VarQ2 != null && (rxd0VarQ = q(rxd0VarV, j2, i5a0VarE)) != null && !rxd0VarQ2.equals(rxd0VarQ)) {
                                    rxd0 rxd0VarQ3 = q(rxd0VarV, wtwVar.g(), wtwVar.d());
                                    if (rxd0VarQ3 == null) {
                                        p();
                                        throw null;
                                    }
                                    rxd0 rxd0VarX = nxd0Var.x(rxd0VarQ, rxd0VarQ2, rxd0VarQ3);
                                    if (rxd0VarX == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(rxd0VarQ2, rxd0VarX);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j3 >>= i2;
                            i6++;
                            j2 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            i5a0VarE = i5a0VarE;
                        }
                        jArr = jArr3;
                        i5a0Var2 = i5a0VarE;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        i5a0Var2 = i5a0VarE;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    i5a0VarE = i5a0Var2;
                }
            }
        }
        return null;
    }

    public static final rxd0 m(rxd0 rxd0Var, oxd0 oxd0Var, c5a0 c5a0Var, rxd0 rxd0Var2) {
        rxd0 rxd0VarJ;
        if (c5a0Var.f()) {
            c5a0Var.n(oxd0Var);
        }
        long jG = c5a0Var.g();
        if (rxd0Var2.a == jG) {
            return rxd0Var2;
        }
        synchronized (c) {
            rxd0VarJ = j(rxd0Var, oxd0Var);
        }
        rxd0VarJ.a = jG;
        if (rxd0Var2.a != 1) {
            c5a0Var.n(oxd0Var);
        }
        return rxd0VarJ;
    }

    public static final boolean n(nxd0 nxd0Var) {
        rxd0 rxd0Var;
        long j2 = e;
        g5a0 g5a0Var = f;
        if (g5a0Var.a > 0) {
            j2 = g5a0Var.b[0];
        }
        rxd0 rxd0Var2 = null;
        rxd0 rxd0VarV = null;
        int i2 = 0;
        for (rxd0 rxd0VarV2 = nxd0Var.v(); rxd0VarV2 != null; rxd0VarV2 = rxd0VarV2.b) {
            long j3 = rxd0VarV2.a;
            if (j3 != 0) {
                if (Intrinsics.i(j3, j2) >= 0) {
                    i2++;
                } else if (rxd0Var2 == null) {
                    i2++;
                    rxd0Var2 = rxd0VarV2;
                } else {
                    if (Intrinsics.i(rxd0VarV2.a, rxd0Var2.a) < 0) {
                        rxd0Var = rxd0Var2;
                        rxd0Var2 = rxd0VarV2;
                    } else {
                        rxd0Var = rxd0VarV2;
                    }
                    if (rxd0VarV == null) {
                        rxd0VarV = nxd0Var.v();
                        rxd0 rxd0Var3 = rxd0VarV;
                        while (true) {
                            if (rxd0VarV == null) {
                                rxd0VarV = rxd0Var3;
                                break;
                            }
                            if (Intrinsics.i(rxd0VarV.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.i(rxd0Var3.a, rxd0VarV.a) < 0) {
                                rxd0Var3 = rxd0VarV;
                            }
                            rxd0VarV = rxd0VarV.b;
                        }
                    }
                    rxd0Var2.a = 0L;
                    rxd0Var2.a(rxd0VarV);
                    rxd0Var2 = rxd0Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void o(nxd0 nxd0Var) {
        if (n(nxd0Var)) {
            v6a0<nxd0> v6a0Var = g;
            int i2 = v6a0Var.a;
            int iIdentityHashCode = System.identityHashCode(nxd0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = v6a0Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = v6a0Var.b[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        myi0<nxd0> myi0Var = v6a0Var.c[i6];
                        if (nxd0Var == (myi0Var != null ? myi0Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || v6a0Var.b[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = v6a0Var.a;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(v6a0Var.a + 1);
                                        break;
                                    }
                                    if (v6a0Var.b[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    myi0<nxd0> myi0Var2 = v6a0Var.c[i6];
                                    if ((myi0Var2 != null ? myi0Var2.get() : null) == nxd0Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                myi0<nxd0> myi0Var3 = v6a0Var.c[i8];
                                if ((myi0Var3 != null ? myi0Var3.get() : null) == nxd0Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            myi0<nxd0>[] myi0VarArr = v6a0Var.c;
            int length = myi0VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                myi0<T>[] myi0VarArr2 = new myi0[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(myi0VarArr, i10, myi0VarArr2, i12, i2 - i10);
                System.arraycopy(v6a0Var.c, 0, myi0VarArr2, 0, i10);
                xx0.d(i12, i10, i2, v6a0Var.b, iArr);
                xx0.h(0, i10, 6, v6a0Var.b, iArr);
                v6a0Var.c = myi0VarArr2;
                v6a0Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(myi0VarArr, i10, myi0VarArr, i13, i2 - i10);
                int[] iArr2 = v6a0Var.b;
                xx0.d(i13, i10, i2, iArr2, iArr2);
            }
            v6a0Var.c[i10] = new myi0<>(nxd0Var);
            v6a0Var.b[i10] = iIdentityHashCode;
            v6a0Var.a++;
        }
    }

    public static final void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends rxd0> T q(T t, long j2, i5a0 i5a0Var) {
        T t2 = null;
        while (t != null) {
            long j3 = t.a;
            if (j3 != 0 && Intrinsics.i(j3, j2) <= 0 && !i5a0Var.d(j3) && (t2 == null || Intrinsics.i(t2.a, t.a) < 0)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends rxd0> T r(T t, nxd0 nxd0Var) {
        T t2;
        c5a0.e.getClass();
        c5a0 c5a0VarG = g();
        Function1<Object, Unit> function1E = c5a0VarG.e();
        if (function1E != null) {
            function1E.invoke(nxd0Var);
        }
        T t3 = (T) q(t, c5a0VarG.g(), c5a0VarG.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            c5a0 c5a0VarG2 = g();
            rxd0 rxd0VarV = nxd0Var.v();
            rxd0VarV.getClass();
            t2 = (T) q(rxd0VarV, c5a0VarG2.g(), c5a0VarG2.d());
            if (t2 == null) {
                p();
                throw null;
            }
        }
        return t2;
    }

    public static final void s(int i2) {
        g5a0 g5a0Var = f;
        int i3 = g5a0Var.d[i2];
        g5a0Var.b(i3, g5a0Var.a - 1);
        g5a0Var.a--;
        long[] jArr = g5a0Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.i(jArr[i5], j2) <= 0) {
                break;
            }
            g5a0Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = g5a0Var.b;
        int i6 = g5a0Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < g5a0Var.a && Intrinsics.i(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.i(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                g5a0Var.b(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.i(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                g5a0Var.b(i8, i3);
                i3 = i8;
            }
        }
        g5a0Var.d[i2] = g5a0Var.e;
        g5a0Var.e = i2;
    }

    public static final <T> T t(s2l s2lVar, Function1<? super i5a0, ? extends T> function1) {
        long j2 = s2lVar.b;
        T tInvoke = function1.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        i5a0 i5a0VarC = d.c(j2);
        d = i5a0VarC;
        s2lVar.b = j3;
        s2lVar.a = i5a0VarC;
        s2lVar.h = 0;
        s2lVar.i = null;
        s2lVar.o();
        d = d.f(j3);
        return tInvoke;
    }

    public static final void u(c5a0 c5a0Var) {
        long j2;
        if (d.d(c5a0Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(c5a0Var.g());
        sb.append(", disposed=");
        sb.append(c5a0Var.c);
        sb.append(", applied=");
        wtw wtwVar = c5a0Var instanceof wtw ? (wtw) c5a0Var : null;
        sb.append(wtwVar != null ? Boolean.valueOf(wtwVar.n) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            g5a0 g5a0Var = f;
            j2 = g5a0Var.a > 0 ? g5a0Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final <T extends rxd0> T v(T t, nxd0 nxd0Var, c5a0 c5a0Var) {
        T t2;
        if (c5a0Var.f()) {
            c5a0Var.n(nxd0Var);
        }
        long jG = c5a0Var.g();
        T t3 = (T) q(t, jG, c5a0Var.d());
        if (t3 == null) {
            p();
            throw null;
        }
        if (t3.a == c5a0Var.g()) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) q(nxd0Var.v(), jG, c5a0Var.d());
            if (t2 == null) {
                p();
                throw null;
            }
            if (t2.a != jG) {
                rxd0 rxd0VarJ = j(t2, nxd0Var);
                rxd0VarJ.a(t2);
                rxd0VarJ.a = c5a0Var.g();
                t2 = (T) rxd0VarJ;
            }
        }
        if (t3.a != 1) {
            c5a0Var.n(nxd0Var);
        }
        return t2;
    }
}
