package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class wtw extends c5a0 {
    public static final int[] o = new int[0];
    public final Function1<Object, Unit> f;
    public final Function1<Object, Unit> g;
    public int h;
    public stw<nxd0> i;
    public ArrayList j;
    public i5a0 k;
    public int[] l;
    public int m;
    public boolean n;

    public wtw(long j, i5a0 i5a0Var, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        super(j, i5a0Var);
        this.f = function1;
        this.g = function2;
        this.k = i5a0.e;
        this.l = o;
        this.m = 1;
    }

    public final void A(long j) {
        synchronized (n5a0.c) {
            this.k = this.k.f(j);
            Unit unit = Unit.a;
        }
    }

    public void B(stw<nxd0> stwVar) {
        this.i = stwVar;
    }

    public wtw C(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        clx clxVar;
        if (this.c) {
            lm20.a("Cannot use a disposed snapshot");
        }
        if (this.n && this.d < 0) {
            lm20.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n5a0.c;
        synchronized (obj) {
            long j = n5a0.e;
            n5a0.e = j + 1;
            n5a0.d = n5a0.d.f(j);
            i5a0 i5a0VarD = d();
            r(i5a0VarD.f(j));
            clxVar = new clx(j, n5a0.a(i5a0VarD, g() + 1, j), n5a0.h(function1, e(), true), n5a0.i(function2, i()), this);
        }
        if (this.n || this.c) {
            return clxVar;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = n5a0.e;
            n5a0.e = j2 + 1;
            s(j2);
            n5a0.d = n5a0.d.f(g());
            Unit unit = Unit.a;
        }
        r(n5a0.a(d(), jG + 1, g()));
        return clxVar;
    }

    @Override // defpackage.c5a0
    public final void b() {
        n5a0.d = n5a0.d.c(g()).b(this.k);
    }

    @Override // defpackage.c5a0
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // defpackage.c5a0
    public boolean f() {
        return false;
    }

    @Override // defpackage.c5a0
    public int h() {
        return this.h;
    }

    @Override // defpackage.c5a0
    public Function1<Object, Unit> i() {
        return this.g;
    }

    @Override // defpackage.c5a0
    public void k() {
        this.m++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.c5a0
    public void l() {
        if (this.m <= 0) {
            lm20.a("no pending nested snapshots");
        }
        int i = this.m - 1;
        this.m = i;
        if (i != 0 || this.n) {
            return;
        }
        stw<nxd0> stwVarX = x();
        if (stwVarX != null) {
            if (this.n) {
                lm20.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = stwVarX.b;
            long[] jArr = stwVarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (rxd0 rxd0VarV = ((nxd0) objArr[(i2 << 3) + i4]).v(); rxd0VarV != null; rxd0VarV = rxd0VarV.b) {
                                    long j2 = rxd0VarV.a;
                                    if (j2 == jG || CollectionsKt.M(this.k, Long.valueOf(j2))) {
                                        k5a0 k5a0Var = n5a0.a;
                                        rxd0VarV.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.c5a0
    public void m() {
        if (this.n || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.c5a0
    public void n(nxd0 nxd0Var) {
        stw<nxd0> stwVarX = x();
        if (stwVarX == null) {
            stwVarX = hz60.a();
            B(stwVarX);
        }
        stwVarX.d(nxd0Var);
    }

    @Override // defpackage.c5a0
    public final void p() {
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            n5a0.s(this.l[i]);
        }
        o();
    }

    @Override // defpackage.c5a0
    public void t(int i) {
        this.h = i;
    }

    @Override // defpackage.c5a0
    public c5a0 u(Function1<Object, Unit> function1) {
        elx elxVar;
        if (this.c) {
            lm20.a("Cannot use a disposed snapshot");
        }
        if (this.n && this.d < 0) {
            lm20.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n5a0.c;
        synchronized (obj) {
            long j = n5a0.e;
            n5a0.e = j + 1;
            n5a0.d = n5a0.d.f(j);
            elxVar = new elx(j, n5a0.a(d(), jG + 1, j), n5a0.h(function1, e(), true), this);
        }
        if (this.n || this.c) {
            return elxVar;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = n5a0.e;
            n5a0.e = j2 + 1;
            s(j2);
            n5a0.d = n5a0.d.f(g());
            Unit unit = Unit.a;
        }
        r(n5a0.a(d(), jG2 + 1, g()));
        return elxVar;
    }

    public final void v() {
        A(g());
        Unit unit = Unit.a;
        if (this.n || this.c) {
            return;
        }
        long jG = g();
        synchronized (n5a0.c) {
            long j = n5a0.e;
            n5a0.e = j + 1;
            s(j);
            n5a0.d = n5a0.d.f(g());
        }
        r(n5a0.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014d A[EDGE_INSN: B:102:0x014d->B:77:0x014d BREAK  A[LOOP:4: B:66:0x011e->B:76:0x014a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: all -> 0x0100, LOOP:2: B:48:0x00d8->B:60:0x010b, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[Catch: all -> 0x0100, LOOP:4: B:66:0x011e->B:76:0x014a, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:43:0x00bc, B:45:0x00cc, B:48:0x00d8, B:50:0x00e4, B:52:0x00ee, B:54:0x00f4, B:57:0x0103, B:63:0x0114, B:66:0x011e, B:68:0x0128, B:70:0x0132, B:72:0x0138, B:73:0x0142, B:76:0x014a, B:77:0x014d, B:79:0x0151, B:81:0x0158, B:82:0x0164, B:60:0x010b), top: B:90:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112 A[EDGE_INSN: B:97:0x0112->B:62:0x0112 BREAK  A[LOOP:2: B:48:0x00d8->B:60:0x010b], SYNTHETIC] */
    public e5a0 w() {
        HashMap mapL;
        List<? extends Function2<? super Set<? extends Object>, ? super c5a0, Unit>> list;
        stw<nxd0> stwVar;
        long j;
        long j2;
        stw<nxd0> stwVarX = x();
        if (stwVarX != null) {
            long j3 = n5a0.j.b;
            mapL = n5a0.l(j3, this, n5a0.d.c(j3));
        } else {
            mapL = null;
        }
        m2g m2gVar = m2g.a;
        synchronized (n5a0.c) {
            try {
                n5a0.u(this);
                if (stwVarX == null || stwVarX.d == 0) {
                    b();
                    s2l s2lVar = n5a0.j;
                    stw<nxd0> stwVar2 = s2lVar.i;
                    n5a0.t(s2lVar, n5a0.a);
                    if (stwVar2 == null || !stwVar2.c()) {
                        list = m2gVar;
                        stwVar = null;
                    } else {
                        list = n5a0.h;
                        stwVar = stwVar2;
                    }
                } else {
                    s2l s2lVar2 = n5a0.j;
                    e5a0 e5a0VarZ = z(n5a0.e, stwVarX, mapL, n5a0.d.c(s2lVar2.b));
                    if (!Intrinsics.g(e5a0VarZ, e5a0.b.a)) {
                        return e5a0VarZ;
                    }
                    b();
                    stwVar = s2lVar2.i;
                    n5a0.t(s2lVar2, n5a0.a);
                    B(null);
                    s2lVar2.i = null;
                    list = n5a0.h;
                }
                Unit unit = Unit.a;
                this.n = true;
                if (stwVar != null) {
                    iz60 iz60Var = new iz60(stwVar);
                    if (!stwVar.b()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            list.get(i).invoke(iz60Var, this);
                        }
                    }
                }
                if (stwVarX != null && stwVarX.c()) {
                    iz60 iz60Var2 = new iz60(stwVarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).invoke(iz60Var2, this);
                    }
                }
                synchronized (n5a0.c) {
                    try {
                        p();
                        n5a0.c();
                        if (stwVar != null) {
                            Object[] objArr = stwVar.b;
                            long[] jArr = stwVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                n5a0.o((nxd0) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (stwVarX != null) {
                            Object[] objArr2 = stwVarX.b;
                            long[] jArr2 = stwVarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                n5a0.o((nxd0) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.j;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                n5a0.o((nxd0) arrayList.get(i9));
                            }
                        }
                        this.j = null;
                        Unit unit2 = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return e5a0.b.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public stw<nxd0> x() {
        return this.i;
    }

    @Override // defpackage.c5a0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> e() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final e5a0 z(long j, stw stwVar, HashMap map, i5a0 i5a0Var) {
        ArrayList arrayList;
        ArrayList arrayListI0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        nxd0 nxd0Var;
        rxd0 rxd0Var;
        i5a0 i5a0Var2;
        Object[] objArr;
        long[] jArr;
        i5a0 i5a0Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        rxd0 rxd0VarX;
        i5a0 i5a0VarE = d().f(g()).e(this.k);
        Object[] objArr3 = stwVar.b;
        long[] jArr3 = stwVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListI0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            nxd0 nxd0Var2 = (nxd0) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            rxd0 rxd0VarV = nxd0Var2.v();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            rxd0 rxd0VarQ = n5a0.q(rxd0VarV, j, i5a0Var);
                            if (rxd0VarQ == null) {
                                arrayList4 = arrayListI0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListI0;
                                j2 = j3;
                                rxd0 rxd0VarQ2 = n5a0.q(rxd0VarV, g(), i5a0VarE);
                                if (rxd0VarQ2 != null && rxd0VarQ2.a != 1 && !rxd0VarQ.equals(rxd0VarQ2)) {
                                    i5a0Var3 = i5a0VarE;
                                    rxd0 rxd0VarQ3 = n5a0.q(rxd0VarV, g(), d());
                                    if (rxd0VarQ3 == null) {
                                        n5a0.p();
                                        throw null;
                                    }
                                    if (map == null || (rxd0VarX = (rxd0) map.get(rxd0VarQ)) == null) {
                                        rxd0VarX = nxd0Var2.x(rxd0VarQ2, rxd0VarQ, rxd0VarQ3);
                                    }
                                    if (rxd0VarX == null) {
                                        return new e5a0.a(this);
                                    }
                                    if (!rxd0VarX.equals(rxd0VarQ3)) {
                                        if (rxd0VarX.equals(rxd0VarQ)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(nxd0Var2, rxd0VarQ.c(g())));
                                            arrayListI0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListI0.add(nxd0Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!rxd0VarX.equals(rxd0VarQ2) ? new Pair(nxd0Var2, rxd0VarX) : new Pair(nxd0Var2, rxd0VarQ2.c(g())));
                                        }
                                    }
                                    arrayListI0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListI0 = arrayList4;
                            }
                            i5a0Var3 = i5a0VarE;
                            arrayList2 = arrayList5;
                            arrayListI0 = arrayList4;
                        } else {
                            i5a0Var3 = i5a0VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        i5a0VarE = i5a0Var3;
                    }
                    i5a0Var2 = i5a0VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    i5a0Var2 = i5a0VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i5a0VarE = i5a0Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    Pair pair = (Pair) arrayList2.get(i2);
                    nxd0Var = (nxd0) pair.a;
                    rxd0Var = (rxd0) pair.b;
                    rxd0Var.a = j;
                    synchronized (n5a0.c) {
                        rxd0Var.b = nxd0Var.v();
                        nxd0Var.n(rxd0Var);
                        Unit unit = Unit.a;
                    }
                }
            }
            if (arrayListI0 != null) {
                size = arrayListI0.size();
                for (i = 0; i < size; i++) {
                    stwVar.l((nxd0) arrayListI0.get(i));
                }
                arrayList3 = this.j;
                if (arrayList3 != null) {
                    arrayListI0 = CollectionsKt.i0(arrayListI0, arrayList3);
                }
                this.j = arrayListI0;
            }
            return e5a0.b.a;
        }
        arrayList = null;
        arrayListI0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                Pair pair2 = (Pair) arrayList2.get(i2);
                nxd0Var = (nxd0) pair2.a;
                rxd0Var = (rxd0) pair2.b;
                rxd0Var.a = j;
                synchronized (n5a0.c) {
                    rxd0Var.b = nxd0Var.v();
                    nxd0Var.n(rxd0Var);
                    Unit unit2 = Unit.a;
                }
            }
        }
        if (arrayListI0 != null) {
            size = arrayListI0.size();
            while (i < size) {
                stwVar.l((nxd0) arrayListI0.get(i));
            }
            arrayList3 = this.j;
            if (arrayList3 != null) {
                arrayListI0 = CollectionsKt.i0(arrayListI0, arrayList3);
            }
            this.j = arrayListI0;
        }
        return e5a0.b.a;
    }
}
