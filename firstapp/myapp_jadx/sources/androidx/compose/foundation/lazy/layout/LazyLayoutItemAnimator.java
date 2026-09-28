package androidx.compose.foundation.lazy.layout;

import defpackage.ej5;
import defpackage.fe9;
import defpackage.fz60;
import defpackage.goh;
import defpackage.hz60;
import defpackage.iwo;
import defpackage.iwr;
import defpackage.ixr;
import defpackage.kxa;
import defpackage.mdn;
import defpackage.o;
import defpackage.o48;
import defpackage.owr;
import defpackage.p3w;
import defpackage.pxr;
import defpackage.qc6;
import defpackage.qcf;
import defpackage.rcf;
import defpackage.rtw;
import defpackage.rwr;
import defpackage.stw;
import defpackage.t6l;
import defpackage.twr;
import defpackage.v5b;
import defpackage.v6l;
import defpackage.wsr;
import defpackage.wwr;
import defpackage.x5a0;
import defpackage.xwr;
import defpackage.y6l;
import defpackage.ywr;
import defpackage.zwr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends pxr> {
    public ixr b;
    public int c;
    public a j;
    public final rtw<Object, LazyLayoutItemAnimator<T>.b> a = fz60.b();
    public final stw<Object> d = hz60.a();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final androidx.compose.ui.d k = new DisplayingDisappearingItemsElement(this);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Lp3w;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends p3w<a> {
        public final LazyLayoutItemAnimator<?> b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.b = lazyLayoutItemAnimator;
        }

        @Override // defpackage.p3w
        public final androidx.compose.ui.d.c a() {
            a aVar = new a();
            aVar.D = this.b;
            return aVar;
        }

        @Override // defpackage.p3w
        public final void d(androidx.compose.ui.d.c cVar) {
            a aVar = (a) cVar;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = aVar.D;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = this.b;
            if (Intrinsics.g(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !aVar.a.C) {
                return;
            }
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator3 = aVar.D;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.b = null;
            lazyLayoutItemAnimator3.c = -1;
            lazyLayoutItemAnimator2.j = aVar;
            aVar.D = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && Intrinsics.g(this.b, ((DisplayingDisappearingItemsElement) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
        }
    }

    public static final class a extends androidx.compose.ui.d.c implements qcf {
        public LazyLayoutItemAnimator<?> D;

        public a() {
            throw null;
        }

        @Override // defpackage.qcf
        public final void A(wsr wsrVar) {
            qc6 qc6Var = wsrVar.a;
            ArrayList arrayList = this.D.i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                owr owrVar = (owr) arrayList.get(i);
                v6l v6lVar = owrVar.n;
                if (v6lVar != null) {
                    long j = owrVar.m;
                    long j2 = v6lVar.t;
                    float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                    float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                    qc6Var.b.a.i(f, f2);
                    try {
                        y6l.a(wsrVar, v6lVar);
                        qc6Var.b.a.i(-f, -f2);
                    } catch (Throwable th) {
                        qc6Var.b.a.i(-f, -f2);
                        throw th;
                    }
                }
            }
            wsrVar.b2();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.D, ((a) obj).D);
        }

        @Override // androidx.compose.ui.d.c
        public final void h2() {
            this.D.j = this;
        }

        public final int hashCode() {
            return this.D.hashCode();
        }

        @Override // androidx.compose.ui.d.c
        public final void i2() {
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.D;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
        }

        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.D + ')';
        }
    }

    public final class b {
        public kxa b;
        public int c;
        public int d;
        public int f;
        public int g;
        public owr[] a = fe9.b;
        public int e = 1;

        public b() {
        }

        public static void b(b bVar, pxr pxrVar, v5b v5bVar, t6l t6lVar, int i, int i2) {
            LazyLayoutItemAnimator.this.getClass();
            long jM = pxrVar.m(0);
            bVar.a(pxrVar, v5bVar, t6lVar, i, i2, (int) (!pxrVar.h() ? jM & 4294967295L : jM >> 32));
        }

        public final void a(T t, v5b v5bVar, t6l t6lVar, int i, int i2, int i3) {
            int i4;
            owr[] owrVarArr;
            owr[] owrVarArr2 = this.a;
            int length = owrVarArr2.length;
            int i5 = 0;
            while (true) {
                i4 = 1;
                if (i5 >= length) {
                    this.f = i;
                    this.g = i2;
                    break;
                } else {
                    owr owrVar = owrVarArr2[i5];
                    if (owrVar != null && owrVar.g) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int iB = t.b();
            int length2 = this.a.length;
            while (true) {
                owrVarArr = this.a;
                if (iB >= length2) {
                    break;
                }
                owr owrVar2 = owrVarArr[iB];
                if (owrVar2 != null) {
                    owrVar2.c();
                }
                iB++;
            }
            if (owrVarArr.length != t.b()) {
                this.a = (owr[]) Arrays.copyOf(this.a, t.b());
            }
            this.b = new kxa(t.c());
            this.c = i3;
            this.d = t.n();
            this.e = t.f();
            int iB2 = t.b();
            for (int i6 = 0; i6 < iB2; i6++) {
                Object objK = t.k(i6);
                iwr iwrVar = objK instanceof iwr ? (iwr) objK : null;
                owr[] owrVarArr3 = this.a;
                if (iwrVar == null) {
                    owr owrVar3 = owrVarArr3[i6];
                    if (owrVar3 != null) {
                        owrVar3.c();
                    }
                    this.a[i6] = null;
                } else {
                    owr owrVar4 = owrVarArr3[i6];
                    if (owrVar4 == null) {
                        owrVar4 = new owr(v5bVar, t6lVar, new mdn(LazyLayoutItemAnimator.this, i4));
                        this.a[i6] = owrVar4;
                    }
                    owrVar4.d = iwrVar.D;
                    owrVar4.e = iwrVar.E;
                    owrVar4.f = iwrVar.F;
                }
            }
        }
    }

    public static void c(pxr pxrVar, int i, b bVar) {
        int i2 = 0;
        long jM = pxrVar.m(0);
        long jA = pxrVar.h() ? iwo.a(0, i, 1, jM) : iwo.a(i, 0, 2, jM);
        owr[] owrVarArr = bVar.a;
        int length = owrVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            owr owrVar = owrVarArr[i2];
            int i4 = i3 + 1;
            if (owrVar != null) {
                owrVar.l = iwo.d(jA, iwo.c(pxrVar.m(i3), jM));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, pxr pxrVar) {
        int iN = pxrVar.n();
        int iF = pxrVar.f() + iN;
        int iMax = 0;
        while (iN < iF) {
            int iJ = pxrVar.j() + iArr[iN];
            iArr[iN] = iJ;
            iMax = Math.max(iMax, iJ);
            iN++;
        }
        return iMax;
    }

    public final owr a(int i, Object obj) {
        LazyLayoutItemAnimator<T>.b bVarD = this.a.d(obj);
        if (bVarD != null) {
            return bVarD.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            owr owrVar = (owr) arrayList.get(i);
            v6l v6lVar = owrVar.n;
            if (v6lVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (owrVar.l >> 32)) + ((int) (v6lVar.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (owrVar.l & 4294967295L)) + ((int) (v6lVar.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:269:0x00c9 A[EDGE_INSN: B:269:0x00c9->B:49:0x00c9 BREAK  A[LOOP:2: B:36:0x008d->B:48:0x00c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4 A[LOOP:2: B:36:0x008d->B:48:0x00c4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v36, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
    public final void d(int i, int i2, int i3, ArrayList arrayList, ixr ixrVar, o oVar, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, v5b v5bVar, t6l t6lVar) {
        rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ixr ixrVar2;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar2;
        boolean z4;
        ixr ixrVar3;
        int[] iArr2;
        rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar3;
        int iJ;
        int i7;
        ArrayList arrayList7;
        long[] jArr;
        int[] iArr3;
        int i8;
        long[] jArr2;
        long j;
        rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar4;
        boolean z5;
        ArrayList arrayList8;
        owr[] owrVarArr;
        int i9;
        int i10;
        ixr ixrVar4;
        int i11;
        owr[] owrVarArr2;
        ixr ixrVar5;
        int i12;
        int i13;
        ixr ixrVar6 = this.b;
        this.b = ixrVar;
        int size = arrayList.size();
        int i14 = 0;
        loop0: while (true) {
            rtwVar = this.a;
            if (i14 >= size) {
                obj = null;
                if (!rtwVar.e()) {
                    break;
                }
                e();
                return;
            }
            pxr pxrVar = (pxr) arrayList.get(i14);
            int iB = pxrVar.b();
            for (int i15 = 0; i15 < iB; i15++) {
                obj = null;
                Object objK = pxrVar.k(i15);
                if ((objK instanceof iwr ? (iwr) objK : null) != null) {
                    break loop0;
                }
            }
            i14++;
        }
        int i16 = this.c;
        pxr pxrVar2 = (pxr) CollectionsKt.firstOrNull(arrayList);
        this.c = pxrVar2 != null ? pxrVar2.getIndex() : 0;
        long j2 = z ? ((long) i) & 4294967295L : ((long) i) << 32;
        boolean z6 = z2 || !z3;
        Object[] objArr = rtwVar.b;
        long[] jArr3 = rtwVar.a;
        int length = jArr3.length - 2;
        stw<Object> stwVar = this.d;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j3 = jArr3[i17];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j3 & 255) < 128) {
                            stwVar.d(objArr[(i17 << 3) + i19]);
                        }
                        j3 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        int i20 = 0;
        while (true) {
            arrayList2 = this.i;
            arrayList3 = this.f;
            arrayList4 = this.e;
            if (i20 >= size2) {
                break;
            }
            pxr pxrVar3 = (pxr) arrayList.get(i20);
            stwVar.l(pxrVar3.getKey());
            int iB2 = pxrVar3.b();
            int i21 = size2;
            int i22 = 0;
            while (true) {
                if (i22 >= iB2) {
                    i10 = i20;
                    ixrVar4 = ixrVar6;
                    i11 = i16;
                    f(pxrVar3.getKey());
                    Unit unit = Unit.a;
                    break;
                }
                i10 = i20;
                Object objK2 = pxrVar3.k(i22);
                int i23 = i22;
                if ((objK2 instanceof iwr ? (iwr) objK2 : obj) != null) {
                    LazyLayoutItemAnimator<T>.b bVarD = rtwVar.d(pxrVar3.getKey());
                    int iC = ixrVar6 != null ? ixrVar6.c(pxrVar3.getKey()) : -1;
                    boolean z7 = iC == -1 && ixrVar6 != null;
                    if (bVarD != null) {
                        if (z6) {
                            b.b(bVarD, pxrVar3, v5bVar, t6lVar, i5, i6);
                            owr[] owrVarArr3 = bVarD.a;
                            int length2 = owrVarArr3.length;
                            int i24 = 0;
                            while (i24 < length2) {
                                boolean z8 = z7;
                                owr owrVar = owrVarArr3[i24];
                                if (owrVar != null) {
                                    i12 = i16;
                                    i13 = length2;
                                    owrVarArr2 = owrVarArr3;
                                    ixrVar5 = ixrVar6;
                                    if (!iwo.b(owrVar.l, 9223372034707292159L)) {
                                        owrVar.l = iwo.d(owrVar.l, j2);
                                    }
                                } else {
                                    owrVarArr2 = owrVarArr3;
                                    ixrVar5 = ixrVar6;
                                    i12 = i16;
                                    i13 = length2;
                                }
                                i24++;
                                z7 = z8;
                                length2 = i13;
                                i16 = i12;
                                ixrVar6 = ixrVar5;
                                owrVarArr3 = owrVarArr2;
                            }
                            ixrVar4 = ixrVar6;
                            i11 = i16;
                            if (z7) {
                                for (owr owrVar2 : bVarD.a) {
                                    if (owrVar2 != null) {
                                        if (owrVar2.b()) {
                                            arrayList2.remove(owrVar2);
                                            a aVar = this.j;
                                            if (aVar != null) {
                                                rcf.a(aVar);
                                                Unit unit2 = Unit.a;
                                            }
                                        }
                                        owrVar2.a();
                                    }
                                }
                            }
                            g(pxrVar3, false);
                        } else {
                            ixrVar4 = ixrVar6;
                            i11 = i16;
                        }
                        Unit unit3 = Unit.a;
                        break;
                    }
                    LazyLayoutItemAnimator<T>.b bVar = new b();
                    b.b(bVar, pxrVar3, v5bVar, t6lVar, i5, i6);
                    rtwVar.m(pxrVar3.getKey(), bVar);
                    if (pxrVar3.getIndex() == iC || iC == -1) {
                        long jM = pxrVar3.m(0);
                        c(pxrVar3, (int) (pxrVar3.h() ? jM & 4294967295L : jM >> 32), bVar);
                        if (z7) {
                            owr[] owrVarArr4 = bVar.a;
                            for (owr owrVar3 : owrVarArr4) {
                                if (owrVar3 != null) {
                                    owrVar3.a();
                                    Unit unit4 = Unit.a;
                                }
                            }
                        }
                        Unit unit5 = Unit.a;
                    } else if (iC < i16) {
                        arrayList4.add(pxrVar3);
                    } else {
                        arrayList3.add(pxrVar3);
                    }
                    ixrVar4 = ixrVar6;
                    i11 = i16;
                    break;
                }
                i22 = i23 + 1;
                i20 = i10;
            }
            i20 = i10 + 1;
            i16 = i11;
            ixrVar6 = ixrVar4;
            size2 = i21;
        }
        int i25 = i4;
        ixr ixrVar7 = ixrVar6;
        int[] iArr4 = new int[i25];
        if (!z6 || ixrVar7 == null) {
            ixrVar2 = ixrVar7;
        } else {
            if (arrayList4.isEmpty()) {
                ixrVar2 = ixrVar7;
            } else {
                if (arrayList4.size() > 1) {
                    ixrVar2 = ixrVar7;
                    o48.v(new ywr(ixrVar2), arrayList4);
                } else {
                    ixrVar2 = ixrVar7;
                }
                int size3 = arrayList4.size();
                for (int i26 = 0; i26 < size3; i26++) {
                    pxr pxrVar4 = (pxr) arrayList4.get(i26);
                    int iH = i5 - h(iArr4, pxrVar4);
                    LazyLayoutItemAnimator<T>.b bVarD2 = rtwVar.d(pxrVar4.getKey());
                    bVarD2.getClass();
                    c(pxrVar4, iH, bVarD2);
                    g(pxrVar4, false);
                }
                Arrays.fill(iArr4, 0, i25, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    o48.v(new wwr(ixrVar2), arrayList3);
                }
                int size4 = arrayList3.size();
                for (int i27 = 0; i27 < size4; i27++) {
                    pxr pxrVar5 = (pxr) arrayList3.get(i27);
                    int iH2 = (h(iArr4, pxrVar5) + i6) - pxrVar5.j();
                    LazyLayoutItemAnimator<T>.b bVarD3 = rtwVar.d(pxrVar5.getKey());
                    bVarD3.getClass();
                    c(pxrVar5, iH2, bVarD3);
                    g(pxrVar5, false);
                }
                Arrays.fill(iArr4, 0, i25, 0);
            }
        }
        Object[] objArr2 = stwVar.b;
        long[] jArr4 = stwVar.a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList9 = this.h;
        ArrayList arrayList10 = this.g;
        if (length3 >= 0) {
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            int i28 = 0;
            while (true) {
                long j4 = jArr4[i28];
                Object[] objArr3 = objArr2;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i29 = 8 - ((~(i28 - length3)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j4 & 255) < 128) {
                            i8 = i30;
                            Object obj2 = objArr3[(i28 << 3) + i30];
                            jArr2 = jArr4;
                            LazyLayoutItemAnimator<T>.b bVarD4 = rtwVar.d(obj2);
                            if (bVarD4 == 0) {
                                iArr3 = iArr4;
                                j = j4;
                                rtwVar4 = rtwVar;
                                z5 = z6;
                            } else {
                                j = j4;
                                int iC2 = ixrVar.c(obj2);
                                z5 = z6;
                                int iMin = Math.min(i25, bVarD4.e);
                                bVarD4.e = iMin;
                                bVarD4.d = Math.min(i25 - iMin, bVarD4.d);
                                if (iC2 == -1) {
                                    owr[] owrVarArr5 = bVarD4.a;
                                    int length4 = owrVarArr5.length;
                                    int i31 = 0;
                                    boolean z9 = false;
                                    int i32 = 0;
                                    while (i31 < length4) {
                                        int i33 = i31;
                                        owr owrVar4 = owrVarArr5[i33];
                                        int i34 = i32 + 1;
                                        if (owrVar4 != null) {
                                            if (owrVar4.b()) {
                                                Unit unit6 = Unit.a;
                                                iArr4 = iArr4;
                                                owrVarArr = owrVarArr5;
                                                rtwVar = rtwVar;
                                                i9 = length4;
                                                z9 = true;
                                            } else {
                                                owrVarArr = owrVarArr5;
                                                if (((Boolean) ((x5a0) owrVar4.k).getValue()).booleanValue()) {
                                                    owrVar4.c();
                                                    bVarD4.a[i32] = obj;
                                                    arrayList2.remove(owrVar4);
                                                    a aVar2 = this.j;
                                                    if (aVar2 != null) {
                                                        rcf.a(aVar2);
                                                        Unit unit7 = Unit.a;
                                                    }
                                                } else {
                                                    v6l v6lVar = owrVar4.n;
                                                    if (v6lVar != null) {
                                                        i9 = length4;
                                                        goh<Float> gohVar = owrVar4.f;
                                                        if (!owrVar4.b() && gohVar != null) {
                                                            ((x5a0) owrVar4.j).setValue(Boolean.TRUE);
                                                            ?? r9 = obj;
                                                            ej5.c(owrVar4.a, r9, r9, new rwr(owrVar4, gohVar, v6lVar, r9), 3);
                                                        }
                                                    } else {
                                                        i9 = length4;
                                                    }
                                                    if (owrVar4.b()) {
                                                        arrayList2.add(owrVar4);
                                                        a aVar3 = this.j;
                                                        if (aVar3 != null) {
                                                            rcf.a(aVar3);
                                                            Unit unit8 = Unit.a;
                                                        }
                                                        obj = null;
                                                        z9 = true;
                                                    } else {
                                                        owrVar4.c();
                                                        obj = null;
                                                        bVarD4.a[i32] = null;
                                                    }
                                                    Unit unit9 = Unit.a;
                                                }
                                            }
                                            i31 = i33 + 1;
                                            i32 = i34;
                                            owrVarArr5 = owrVarArr;
                                            length4 = i9;
                                            iArr4 = iArr4;
                                            rtwVar = rtwVar;
                                        } else {
                                            owrVarArr = owrVarArr5;
                                        }
                                        rtwVar = rtwVar;
                                        i9 = length4;
                                        i31 = i33 + 1;
                                        i32 = i34;
                                        owrVarArr5 = owrVarArr;
                                        length4 = i9;
                                        iArr4 = iArr4;
                                        rtwVar = rtwVar;
                                    }
                                    iArr3 = iArr4;
                                    rtwVar4 = rtwVar;
                                    if (!z9) {
                                        f(obj2);
                                    }
                                    Unit unit10 = Unit.a;
                                } else {
                                    iArr3 = iArr4;
                                    rtwVar4 = rtwVar;
                                    kxa kxaVar = bVarD4.b;
                                    kxaVar.getClass();
                                    arrayList8 = arrayList2;
                                    pxr pxrVarU = oVar.U(iC2, bVarD4.d, bVarD4.e, kxaVar.a);
                                    pxrVarU.l();
                                    owr[] owrVarArr6 = bVarD4.a;
                                    int length5 = owrVarArr6.length;
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < length5) {
                                            owr owrVar5 = owrVarArr6[i35];
                                            if (owrVar5 == null || !((Boolean) ((x5a0) owrVar5.h).getValue()).booleanValue()) {
                                                i35++;
                                            }
                                        } else if (ixrVar2 != null && iC2 == ixrVar2.c(obj2)) {
                                            f(obj2);
                                            Unit unit11 = Unit.a;
                                        }
                                        bVarD4.a(pxrVarU, v5bVar, t6lVar, i5, i6, bVarD4.c);
                                        if (iC2 < this.c) {
                                            arrayList10.add(pxrVarU);
                                        } else {
                                            arrayList9.add(pxrVarU);
                                        }
                                    }
                                }
                                arrayList2 = arrayList8;
                                j4 = j >> 8;
                                i30 = i8 + 1;
                                z6 = z5;
                                jArr4 = jArr2;
                                iArr4 = iArr3;
                                rtwVar = rtwVar4;
                                i25 = i4;
                            }
                        } else {
                            iArr3 = iArr4;
                            i8 = i30;
                            jArr2 = jArr4;
                            j = j4;
                            rtwVar4 = rtwVar;
                            z5 = z6;
                        }
                        arrayList8 = arrayList2;
                        arrayList2 = arrayList8;
                        j4 = j >> 8;
                        i30 = i8 + 1;
                        z6 = z5;
                        jArr4 = jArr2;
                        iArr4 = iArr3;
                        rtwVar = rtwVar4;
                        i25 = i4;
                    }
                    iArr = iArr4;
                    arrayList7 = arrayList2;
                    jArr = jArr4;
                    rtwVar2 = rtwVar;
                    z4 = z6;
                    if (i29 != 8) {
                        break;
                    }
                } else {
                    iArr = iArr4;
                    arrayList7 = arrayList2;
                    jArr = jArr4;
                    rtwVar2 = rtwVar;
                    z4 = z6;
                }
                if (i28 == length3) {
                    break;
                }
                i28++;
                i25 = i4;
                arrayList2 = arrayList7;
                objArr2 = objArr3;
                z6 = z4;
                jArr4 = jArr;
                iArr4 = iArr;
                rtwVar = rtwVar2;
            }
        } else {
            iArr = iArr4;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            rtwVar2 = rtwVar;
            z4 = z6;
        }
        if (arrayList10.isEmpty()) {
            ixrVar3 = ixrVar;
            iArr2 = iArr;
            rtwVar3 = rtwVar2;
        } else {
            if (arrayList10.size() > 1) {
                ixrVar3 = ixrVar;
                o48.v(new zwr(ixrVar3), arrayList10);
            } else {
                ixrVar3 = ixrVar;
            }
            int size5 = arrayList10.size();
            int i36 = 0;
            while (i36 < size5) {
                pxr pxrVar6 = (pxr) arrayList10.get(i36);
                rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar5 = rtwVar2;
                LazyLayoutItemAnimator<T>.b bVarD5 = rtwVar5.d(pxrVar6.getKey());
                bVarD5.getClass();
                LazyLayoutItemAnimator<T>.b bVar2 = bVarD5;
                int[] iArr5 = iArr;
                int iH3 = h(iArr5, pxrVar6);
                if (z2) {
                    pxr pxrVar7 = (pxr) CollectionsKt.T(arrayList);
                    long jM2 = pxrVar7.m(0);
                    i7 = (int) (pxrVar7.h() ? jM2 & 4294967295L : jM2 >> 32);
                } else {
                    i7 = bVar2.f;
                }
                pxrVar6.d(i7 - iH3, bVar2.c, i2, i3);
                if (z4) {
                    g(pxrVar6, true);
                }
                i36++;
                rtwVar2 = rtwVar5;
                iArr = iArr5;
            }
            iArr2 = iArr;
            rtwVar3 = rtwVar2;
            Arrays.fill(iArr2, 0, i4, 0);
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                o48.v(new xwr(ixrVar3), arrayList9);
            }
            int size6 = arrayList9.size();
            for (int i37 = 0; i37 < size6; i37++) {
                pxr pxrVar8 = (pxr) arrayList9.get(i37);
                LazyLayoutItemAnimator<T>.b bVarD6 = rtwVar3.d(pxrVar8.getKey());
                bVarD6.getClass();
                LazyLayoutItemAnimator<T>.b bVar3 = bVarD6;
                int iH4 = h(iArr2, pxrVar8);
                if (z2) {
                    pxr pxrVar9 = (pxr) CollectionsKt.b0(arrayList);
                    long jM3 = pxrVar9.m(0);
                    iJ = pxrVar9.j() + ((int) (pxrVar9.h() ? jM3 & 4294967295L : jM3 >> 32));
                } else {
                    iJ = bVar3.g;
                }
                pxrVar8.d((iJ - pxrVar8.j()) + iH4, bVar3.c, i2, i3);
                if (z4) {
                    g(pxrVar8, true);
                }
            }
        }
        Collections.reverse(arrayList10);
        Unit unit12 = Unit.a;
        arrayList.addAll(0, arrayList10);
        arrayList.addAll(arrayList9);
        arrayList6.clear();
        arrayList5.clear();
        arrayList10.clear();
        arrayList9.clear();
        stwVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[LOOP:0: B:7:0x0013->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[EDGE_INSN: B:26:0x005a->B:23:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0057], SYNTHETIC] */
    public final void e() {
        rtw<Object, LazyLayoutItemAnimator<T>.b> rtwVar = this.a;
        if (rtwVar.f()) {
            Object[] objArr = rtwVar.c;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (owr owrVar : ((b) objArr[(i << 3) + i3]).a) {
                                    if (owrVar != null) {
                                        owrVar.c();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            rtwVar.g();
        }
    }

    public final void f(Object obj) {
        LazyLayoutItemAnimator<T>.b bVarK = this.a.k(obj);
        if (bVarK != null) {
            for (owr owrVar : bVarK.a) {
                if (owrVar != null) {
                    owrVar.c();
                }
            }
        }
    }

    public final void g(T t, boolean z) {
        LazyLayoutItemAnimator<T>.b bVarD = this.a.d(t.getKey());
        bVarD.getClass();
        owr[] owrVarArr = bVarD.a;
        int length = owrVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            owr owrVar = owrVarArr[i];
            int i3 = i2 + 1;
            if (owrVar != null) {
                long jM = t.m(i2);
                long j = owrVar.l;
                if (!iwo.b(j, 9223372034707292159L) && !iwo.b(j, jM)) {
                    long jC = iwo.c(jM, j);
                    goh<iwo> gohVar = owrVar.e;
                    if (gohVar != null) {
                        long jC2 = iwo.c(((iwo) ((x5a0) owrVar.q).getValue()).a, jC);
                        owrVar.d(jC2);
                        ((x5a0) owrVar.h).setValue(Boolean.TRUE);
                        owrVar.g = z;
                        ej5.c(owrVar.a, null, null, new twr(owrVar, gohVar, jC2, null), 3);
                    }
                }
                owrVar.l = jM;
            }
            i++;
            i2 = i3;
        }
    }
}
