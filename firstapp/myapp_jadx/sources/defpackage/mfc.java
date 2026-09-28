package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class mfc {
    public static final gzg0 a = yi0.e(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 0, xkf.a, 2);

    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:110:0x0195  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    public static final void a(final int i, d dVar, final long j, final long j2, final float f, float f2, boolean z, gaj gajVar, Function2 function2, final op8 op8Var, a aVar, final int i2, final int i3) {
        d dVar2;
        int i4;
        float f3;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        b bVar;
        final gaj gajVar2;
        final Function2 function3;
        final d dVar3;
        final float f4;
        final boolean z4;
        e eVarZ;
        boolean z5;
        gaj gajVarB;
        final gaj gajVar3;
        d dVar4;
        final float f5;
        final boolean z6;
        final Function2 function4;
        int i15;
        int i16;
        int i17;
        b bVarI = aVar.i(1687949227);
        int i18 = (bVarI.d(i) ? 4 : 2) | i2;
        int i19 = i3 & 2;
        if (i19 == 0) {
            if ((i2 & 48) == 0) {
                dVar2 = dVar;
                i18 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (bVarI.e(j)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            if ((i2 & 3072) == 0) {
                if (bVarI.e(j2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i18 |= i16;
            }
            if ((i2 & 24576) == 0) {
                if (bVarI.c(f)) {
                    i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i15 = 8192;
                }
                i18 |= i15;
            }
            i4 = i3 & 32;
            if (i4 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (bVarI.c(f3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i18 |= i5;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    if ((1572864 & i2) == 0) {
                        z2 = z;
                        if (bVarI.b(z2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i18 |= i7;
                    }
                    i8 = i18;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                        i10 = i8 | 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (bVarI.A(gajVar)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i10 = i8 | i11;
                    } else {
                        i10 = i8;
                    }
                    i12 = i3 & 256;
                    if (i12 != 0) {
                        i12 = i12;
                        i13 = i10 | 100663296;
                    } else {
                        if ((i2 & 100663296) != 0) {
                            if (bVarI.A(function2)) {
                                i14 = 67108864;
                            } else {
                                i14 = 33554432;
                            }
                            i10 |= i14;
                        }
                        i13 = i10;
                    }
                    if ((306783379 & i13) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i13 & 1, z3)) {
                        bVarI.A0();
                        if ((i2 & 1) != 0 || bVarI.h0()) {
                            if (i19 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i4 != 0) {
                                f3 = 44.0f;
                            }
                            z5 = i6 == 0 ? z2 : false;
                            if (i9 != 0) {
                                gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        List list = (List) obj;
                                        a aVar2 = (a) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        list.getClass();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                        }
                                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                            h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, bVarI);
                            } else {
                                gajVarB = gajVar;
                            }
                            if (i12 != 0) {
                                gajVar3 = gajVarB;
                                dVar4 = dVar2;
                                f5 = f3;
                                z6 = z5;
                                function4 = uw8.a;
                            } else {
                                gajVar3 = gajVarB;
                                dVar4 = dVar2;
                                f5 = f3;
                                z6 = z5;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    a aVar2 = (a) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        zp70 zp70VarA = op70.a(aVar2);
                                        Object objY = aVar2.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (objY == c0042a) {
                                            objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                            aVar2.r(objY);
                                        }
                                        v5b v5bVar = (v5b) objY;
                                        boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                                        Object objY2 = aVar2.y();
                                        if (zM || objY2 == c0042a) {
                                            objY2 = new ir70(zp70VarA, v5bVar);
                                            aVar2.r(objY2);
                                        }
                                        final ir70 ir70Var = (ir70) objY2;
                                        d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                                        final float f6 = f;
                                        boolean zC = aVar2.c(f6);
                                        final float f7 = f5;
                                        boolean zC2 = zC | aVar2.c(f7);
                                        final op8 op8Var2 = op8Var;
                                        boolean zM2 = zC2 | aVar2.M(op8Var2);
                                        final Function2 function5 = function4;
                                        boolean zM3 = zM2 | aVar2.M(function5);
                                        final gaj gajVar4 = gajVar3;
                                        boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                                        final int i20 = i;
                                        boolean zD = zM4 | aVar2.d(i20);
                                        Object objY3 = aVar2.y();
                                        if (zD || objY3 == c0042a) {
                                            Function2 function6 = new Function2() { // from class: jfc
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    final rce0 rce0Var = (rce0) obj3;
                                                    final kxa kxaVar = (kxa) obj4;
                                                    rce0Var.getClass();
                                                    final int iY0 = rce0Var.y0(f6);
                                                    long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                                    List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                                    final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                                    Iterator<T> it = listK.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((vhv) it.next()).d0(jB));
                                                    }
                                                    final bq40 bq40Var = new bq40();
                                                    bq40Var.a = iY0 * 2;
                                                    final bq40 bq40Var2 = new bq40();
                                                    int size = arrayList.size();
                                                    int i21 = 0;
                                                    while (i21 < size) {
                                                        Object obj5 = arrayList.get(i21);
                                                        i21++;
                                                        y yVar = (y) obj5;
                                                        bq40Var.a += yVar.a;
                                                        bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                                    }
                                                    int i22 = bq40Var.a;
                                                    int i23 = bq40Var2.a;
                                                    final Function2 function7 = function5;
                                                    final ir70 ir70Var2 = ir70Var;
                                                    final int i24 = i20;
                                                    final gaj gajVar5 = gajVar4;
                                                    return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj6) {
                                                            bq40 bq40Var3;
                                                            bq40 bq40Var4;
                                                            y.a aVar3 = (y.a) obj6;
                                                            aVar3.getClass();
                                                            final ArrayList arrayList2 = new ArrayList();
                                                            ArrayList arrayList3 = arrayList;
                                                            int size2 = arrayList3.size();
                                                            int i25 = iY0;
                                                            int i26 = i25;
                                                            int i27 = 0;
                                                            while (i27 < size2) {
                                                                Object obj7 = arrayList3.get(i27);
                                                                i27++;
                                                                y yVar2 = (y) obj7;
                                                                y.a.A(aVar3, yVar2, i26, 0);
                                                                arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                                i26 += yVar2.a;
                                                            }
                                                            k3f0 k3f0Var = k3f0.b;
                                                            rce0 rce0Var2 = rce0Var;
                                                            Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                            while (true) {
                                                                boolean zHasNext = it2.hasNext();
                                                                bq40Var3 = bq40Var;
                                                                bq40Var4 = bq40Var2;
                                                                if (!zHasNext) {
                                                                    break;
                                                                }
                                                                vhv vhvVar = (vhv) it2.next();
                                                                long j3 = kxaVar.a;
                                                                int i28 = bq40Var3.a;
                                                                y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                                y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                            }
                                                            k3f0 k3f0Var2 = k3f0.c;
                                                            final gaj gajVar6 = gajVar5;
                                                            for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(Object obj8, Object obj9) {
                                                                    a aVar4 = (a) obj8;
                                                                    int iIntValue2 = ((Integer) obj9).intValue();
                                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                        gajVar6.invoke(arrayList2, aVar4, 0);
                                                                    } else {
                                                                        aVar4.G();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, true))) {
                                                                int i29 = bq40Var3.a;
                                                                int i30 = bq40Var4.a;
                                                                if (!((i29 >= 0) & (i30 >= 0))) {
                                                                    ykn.a("width and height must be >= 0");
                                                                }
                                                                y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                            }
                                                            ir70 ir70Var3 = ir70Var2;
                                                            zp70 zp70Var = ir70Var3.a;
                                                            Integer num = ir70Var3.c;
                                                            int i31 = i24;
                                                            if (num == null || num.intValue() != i31) {
                                                                ir70Var3.c = Integer.valueOf(i31);
                                                                y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                                if (y1f0Var != null) {
                                                                    y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                                    int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                                    int iH = iY1 - zp70Var.h();
                                                                    int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                                    int i32 = iY1 - iH;
                                                                    if (i32 < 0) {
                                                                        i32 = 0;
                                                                    }
                                                                    int iE = f.e(iY2, 0, i32);
                                                                    if (((u5a0) zp70Var.a).D() != iE) {
                                                                        ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                                    }
                                                                }
                                                            }
                                                            return Unit.a;
                                                        }
                                                    });
                                                }
                                            };
                                            aVar2.r(function6);
                                            objY3 = function6;
                                        }
                                        f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                            z4 = z6;
                            f4 = f5;
                            function3 = function4;
                            gajVar2 = gajVar3;
                            dVar3 = dVar4;
                        } else {
                            bVarI.G();
                            gajVar3 = gajVar;
                            z6 = z2;
                            dVar4 = dVar2;
                            f5 = f3;
                        }
                        function4 = function2;
                        bVarI.Y();
                        bVar = bVarI;
                        ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    zp70 zp70VarA = op70.a(aVar2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (objY == c0042a) {
                                        objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                        aVar2.r(objY);
                                    }
                                    v5b v5bVar = (v5b) objY;
                                    boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                                    Object objY2 = aVar2.y();
                                    if (zM || objY2 == c0042a) {
                                        objY2 = new ir70(zp70VarA, v5bVar);
                                        aVar2.r(objY2);
                                    }
                                    final ir70 ir70Var = (ir70) objY2;
                                    d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                                    final float f6 = f;
                                    boolean zC = aVar2.c(f6);
                                    final float f7 = f5;
                                    boolean zC2 = zC | aVar2.c(f7);
                                    final op8 op8Var2 = op8Var;
                                    boolean zM2 = zC2 | aVar2.M(op8Var2);
                                    final Function2 function5 = function4;
                                    boolean zM3 = zM2 | aVar2.M(function5);
                                    final gaj gajVar4 = gajVar3;
                                    boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                                    final int i20 = i;
                                    boolean zD = zM4 | aVar2.d(i20);
                                    Object objY3 = aVar2.y();
                                    if (zD || objY3 == c0042a) {
                                        Function2 function6 = new Function2() { // from class: jfc
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj3, Object obj4) {
                                                final rce0 rce0Var = (rce0) obj3;
                                                final kxa kxaVar = (kxa) obj4;
                                                rce0Var.getClass();
                                                final int iY0 = rce0Var.y0(f6);
                                                long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                                List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                                final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                                Iterator<T> it = listK.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((vhv) it.next()).d0(jB));
                                                }
                                                final bq40 bq40Var = new bq40();
                                                bq40Var.a = iY0 * 2;
                                                final bq40 bq40Var2 = new bq40();
                                                int size = arrayList.size();
                                                int i21 = 0;
                                                while (i21 < size) {
                                                    Object obj5 = arrayList.get(i21);
                                                    i21++;
                                                    y yVar = (y) obj5;
                                                    bq40Var.a += yVar.a;
                                                    bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                                }
                                                int i22 = bq40Var.a;
                                                int i23 = bq40Var2.a;
                                                final Function2 function7 = function5;
                                                final ir70 ir70Var2 = ir70Var;
                                                final int i24 = i20;
                                                final gaj gajVar5 = gajVar4;
                                                return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj6) {
                                                        bq40 bq40Var3;
                                                        bq40 bq40Var4;
                                                        y.a aVar3 = (y.a) obj6;
                                                        aVar3.getClass();
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        ArrayList arrayList3 = arrayList;
                                                        int size2 = arrayList3.size();
                                                        int i25 = iY0;
                                                        int i26 = i25;
                                                        int i27 = 0;
                                                        while (i27 < size2) {
                                                            Object obj7 = arrayList3.get(i27);
                                                            i27++;
                                                            y yVar2 = (y) obj7;
                                                            y.a.A(aVar3, yVar2, i26, 0);
                                                            arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                            i26 += yVar2.a;
                                                        }
                                                        k3f0 k3f0Var = k3f0.b;
                                                        rce0 rce0Var2 = rce0Var;
                                                        Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                        while (true) {
                                                            boolean zHasNext = it2.hasNext();
                                                            bq40Var3 = bq40Var;
                                                            bq40Var4 = bq40Var2;
                                                            if (!zHasNext) {
                                                                break;
                                                            }
                                                            vhv vhvVar = (vhv) it2.next();
                                                            long j3 = kxaVar.a;
                                                            int i28 = bq40Var3.a;
                                                            y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                            y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                        }
                                                        k3f0 k3f0Var2 = k3f0.c;
                                                        final gaj gajVar6 = gajVar5;
                                                        for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj8, Object obj9) {
                                                                a aVar4 = (a) obj8;
                                                                int iIntValue2 = ((Integer) obj9).intValue();
                                                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                    gajVar6.invoke(arrayList2, aVar4, 0);
                                                                } else {
                                                                    aVar4.G();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, true))) {
                                                            int i29 = bq40Var3.a;
                                                            int i30 = bq40Var4.a;
                                                            if (!((i29 >= 0) & (i30 >= 0))) {
                                                                ykn.a("width and height must be >= 0");
                                                            }
                                                            y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                        }
                                                        ir70 ir70Var3 = ir70Var2;
                                                        zp70 zp70Var = ir70Var3.a;
                                                        Integer num = ir70Var3.c;
                                                        int i31 = i24;
                                                        if (num == null || num.intValue() != i31) {
                                                            ir70Var3.c = Integer.valueOf(i31);
                                                            y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                            if (y1f0Var != null) {
                                                                y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                                int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                                int iH = iY1 - zp70Var.h();
                                                                int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                                int i32 = iY1 - iH;
                                                                if (i32 < 0) {
                                                                    i32 = 0;
                                                                }
                                                                int iE = f.e(iY2, 0, i32);
                                                                if (((u5a0) zp70Var.a).D() != iE) {
                                                                    ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                                }
                                                            }
                                                        }
                                                        return Unit.a;
                                                    }
                                                });
                                            }
                                        };
                                        aVar2.r(function6);
                                        objY3 = function6;
                                    }
                                    f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                        z4 = z6;
                        f4 = f5;
                        function3 = function4;
                        gajVar2 = gajVar3;
                        dVar3 = dVar4;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        gajVar2 = gajVar;
                        function3 = function2;
                        dVar3 = dVar2;
                        f4 = f3;
                        z4 = z2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: gfc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i2 | 1);
                                mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                                return Unit.a;
                            }
                        };
                    }
                }
                i18 |= 1572864;
                z2 = z;
                i8 = i18;
                i9 = i3 & 128;
                if (i9 != 0) {
                    i10 = i8 | 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (bVarI.A(gajVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i10 = i8 | i11;
                } else {
                    i10 = i8;
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    i12 = i12;
                    i13 = i10 | 100663296;
                } else {
                    if ((i2 & 100663296) != 0) {
                        if (bVarI.A(function2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    }
                    i13 = i10;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i13 & 1, z3)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    } else {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zp70 zp70VarA = op70.a(aVar2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                    aVar2.r(objY);
                                }
                                v5b v5bVar = (v5b) objY;
                                boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                                Object objY2 = aVar2.y();
                                if (zM || objY2 == c0042a) {
                                    objY2 = new ir70(zp70VarA, v5bVar);
                                    aVar2.r(objY2);
                                }
                                final ir70 ir70Var = (ir70) objY2;
                                d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                                final float f6 = f;
                                boolean zC = aVar2.c(f6);
                                final float f7 = f5;
                                boolean zC2 = zC | aVar2.c(f7);
                                final op8 op8Var2 = op8Var;
                                boolean zM2 = zC2 | aVar2.M(op8Var2);
                                final Function2 function5 = function4;
                                boolean zM3 = zM2 | aVar2.M(function5);
                                final gaj gajVar4 = gajVar3;
                                boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                                final int i20 = i;
                                boolean zD = zM4 | aVar2.d(i20);
                                Object objY3 = aVar2.y();
                                if (zD || objY3 == c0042a) {
                                    Function2 function6 = new Function2() { // from class: jfc
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            final rce0 rce0Var = (rce0) obj3;
                                            final kxa kxaVar = (kxa) obj4;
                                            rce0Var.getClass();
                                            final int iY0 = rce0Var.y0(f6);
                                            long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                            List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                            final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                            Iterator<T> it = listK.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((vhv) it.next()).d0(jB));
                                            }
                                            final bq40 bq40Var = new bq40();
                                            bq40Var.a = iY0 * 2;
                                            final bq40 bq40Var2 = new bq40();
                                            int size = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj5 = arrayList.get(i21);
                                                i21++;
                                                y yVar = (y) obj5;
                                                bq40Var.a += yVar.a;
                                                bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                            }
                                            int i22 = bq40Var.a;
                                            int i23 = bq40Var2.a;
                                            final Function2 function7 = function5;
                                            final ir70 ir70Var2 = ir70Var;
                                            final int i24 = i20;
                                            final gaj gajVar5 = gajVar4;
                                            return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj6) {
                                                    bq40 bq40Var3;
                                                    bq40 bq40Var4;
                                                    y.a aVar3 = (y.a) obj6;
                                                    aVar3.getClass();
                                                    final ArrayList arrayList2 = new ArrayList();
                                                    ArrayList arrayList3 = arrayList;
                                                    int size2 = arrayList3.size();
                                                    int i25 = iY0;
                                                    int i26 = i25;
                                                    int i27 = 0;
                                                    while (i27 < size2) {
                                                        Object obj7 = arrayList3.get(i27);
                                                        i27++;
                                                        y yVar2 = (y) obj7;
                                                        y.a.A(aVar3, yVar2, i26, 0);
                                                        arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                        i26 += yVar2.a;
                                                    }
                                                    k3f0 k3f0Var = k3f0.b;
                                                    rce0 rce0Var2 = rce0Var;
                                                    Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                    while (true) {
                                                        boolean zHasNext = it2.hasNext();
                                                        bq40Var3 = bq40Var;
                                                        bq40Var4 = bq40Var2;
                                                        if (!zHasNext) {
                                                            break;
                                                        }
                                                        vhv vhvVar = (vhv) it2.next();
                                                        long j3 = kxaVar.a;
                                                        int i28 = bq40Var3.a;
                                                        y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                        y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                    }
                                                    k3f0 k3f0Var2 = k3f0.c;
                                                    final gaj gajVar6 = gajVar5;
                                                    for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj8, Object obj9) {
                                                            a aVar4 = (a) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                gajVar6.invoke(arrayList2, aVar4, 0);
                                                            } else {
                                                                aVar4.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, true))) {
                                                        int i29 = bq40Var3.a;
                                                        int i30 = bq40Var4.a;
                                                        if (!((i29 >= 0) & (i30 >= 0))) {
                                                            ykn.a("width and height must be >= 0");
                                                        }
                                                        y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                    }
                                                    ir70 ir70Var3 = ir70Var2;
                                                    zp70 zp70Var = ir70Var3.a;
                                                    Integer num = ir70Var3.c;
                                                    int i31 = i24;
                                                    if (num == null || num.intValue() != i31) {
                                                        ir70Var3.c = Integer.valueOf(i31);
                                                        y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                        if (y1f0Var != null) {
                                                            y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                            int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                            int iH = iY1 - zp70Var.h();
                                                            int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                            int i32 = iY1 - iH;
                                                            if (i32 < 0) {
                                                                i32 = 0;
                                                            }
                                                            int iE = f.e(iY2, 0, i32);
                                                            if (((u5a0) zp70Var.a).D() != iE) {
                                                                ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                            }
                                                        }
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    };
                                    aVar2.r(function6);
                                    objY3 = function6;
                                }
                                f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                    z4 = z6;
                    f4 = f5;
                    function3 = function4;
                    gajVar2 = gajVar3;
                    dVar3 = dVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar2 = gajVar;
                    function3 = function2;
                    dVar3 = dVar2;
                    f4 = f3;
                    z4 = z2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: gfc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            f3 = f2;
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i18 |= i7;
                }
                i8 = i18;
                i9 = i3 & 128;
                if (i9 != 0) {
                    i10 = i8 | 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (bVarI.A(gajVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i10 = i8 | i11;
                } else {
                    i10 = i8;
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    i12 = i12;
                    i13 = i10 | 100663296;
                } else {
                    if ((i2 & 100663296) != 0) {
                        if (bVarI.A(function2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    }
                    i13 = i10;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i13 & 1, z3)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    } else {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zp70 zp70VarA = op70.a(aVar2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                    aVar2.r(objY);
                                }
                                v5b v5bVar = (v5b) objY;
                                boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                                Object objY2 = aVar2.y();
                                if (zM || objY2 == c0042a) {
                                    objY2 = new ir70(zp70VarA, v5bVar);
                                    aVar2.r(objY2);
                                }
                                final ir70 ir70Var = (ir70) objY2;
                                d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                                final float f6 = f;
                                boolean zC = aVar2.c(f6);
                                final float f7 = f5;
                                boolean zC2 = zC | aVar2.c(f7);
                                final op8 op8Var2 = op8Var;
                                boolean zM2 = zC2 | aVar2.M(op8Var2);
                                final Function2 function5 = function4;
                                boolean zM3 = zM2 | aVar2.M(function5);
                                final gaj gajVar4 = gajVar3;
                                boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                                final int i20 = i;
                                boolean zD = zM4 | aVar2.d(i20);
                                Object objY3 = aVar2.y();
                                if (zD || objY3 == c0042a) {
                                    Function2 function6 = new Function2() { // from class: jfc
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            final rce0 rce0Var = (rce0) obj3;
                                            final kxa kxaVar = (kxa) obj4;
                                            rce0Var.getClass();
                                            final int iY0 = rce0Var.y0(f6);
                                            long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                            List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                            final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                            Iterator<T> it = listK.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((vhv) it.next()).d0(jB));
                                            }
                                            final bq40 bq40Var = new bq40();
                                            bq40Var.a = iY0 * 2;
                                            final bq40 bq40Var2 = new bq40();
                                            int size = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj5 = arrayList.get(i21);
                                                i21++;
                                                y yVar = (y) obj5;
                                                bq40Var.a += yVar.a;
                                                bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                            }
                                            int i22 = bq40Var.a;
                                            int i23 = bq40Var2.a;
                                            final Function2 function7 = function5;
                                            final ir70 ir70Var2 = ir70Var;
                                            final int i24 = i20;
                                            final gaj gajVar5 = gajVar4;
                                            return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj6) {
                                                    bq40 bq40Var3;
                                                    bq40 bq40Var4;
                                                    y.a aVar3 = (y.a) obj6;
                                                    aVar3.getClass();
                                                    final ArrayList arrayList2 = new ArrayList();
                                                    ArrayList arrayList3 = arrayList;
                                                    int size2 = arrayList3.size();
                                                    int i25 = iY0;
                                                    int i26 = i25;
                                                    int i27 = 0;
                                                    while (i27 < size2) {
                                                        Object obj7 = arrayList3.get(i27);
                                                        i27++;
                                                        y yVar2 = (y) obj7;
                                                        y.a.A(aVar3, yVar2, i26, 0);
                                                        arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                        i26 += yVar2.a;
                                                    }
                                                    k3f0 k3f0Var = k3f0.b;
                                                    rce0 rce0Var2 = rce0Var;
                                                    Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                    while (true) {
                                                        boolean zHasNext = it2.hasNext();
                                                        bq40Var3 = bq40Var;
                                                        bq40Var4 = bq40Var2;
                                                        if (!zHasNext) {
                                                            break;
                                                        }
                                                        vhv vhvVar = (vhv) it2.next();
                                                        long j3 = kxaVar.a;
                                                        int i28 = bq40Var3.a;
                                                        y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                        y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                    }
                                                    k3f0 k3f0Var2 = k3f0.c;
                                                    final gaj gajVar6 = gajVar5;
                                                    for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj8, Object obj9) {
                                                            a aVar4 = (a) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                gajVar6.invoke(arrayList2, aVar4, 0);
                                                            } else {
                                                                aVar4.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, true))) {
                                                        int i29 = bq40Var3.a;
                                                        int i30 = bq40Var4.a;
                                                        if (!((i29 >= 0) & (i30 >= 0))) {
                                                            ykn.a("width and height must be >= 0");
                                                        }
                                                        y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                    }
                                                    ir70 ir70Var3 = ir70Var2;
                                                    zp70 zp70Var = ir70Var3.a;
                                                    Integer num = ir70Var3.c;
                                                    int i31 = i24;
                                                    if (num == null || num.intValue() != i31) {
                                                        ir70Var3.c = Integer.valueOf(i31);
                                                        y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                        if (y1f0Var != null) {
                                                            y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                            int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                            int iH = iY1 - zp70Var.h();
                                                            int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                            int i32 = iY1 - iH;
                                                            if (i32 < 0) {
                                                                i32 = 0;
                                                            }
                                                            int iE = f.e(iY2, 0, i32);
                                                            if (((u5a0) zp70Var.a).D() != iE) {
                                                                ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                            }
                                                        }
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    };
                                    aVar2.r(function6);
                                    objY3 = function6;
                                }
                                f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                    z4 = z6;
                    f4 = f5;
                    function3 = function4;
                    gajVar2 = gajVar3;
                    dVar3 = dVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar2 = gajVar;
                    function3 = function2;
                    dVar3 = dVar2;
                    f4 = f3;
                    z4 = z2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: gfc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i18 |= 1572864;
            z2 = z;
            i8 = i18;
            i9 = i3 & 128;
            if (i9 != 0) {
                i10 = i8 | 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (bVarI.A(gajVar)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i10 = i8 | i11;
            } else {
                i10 = i8;
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                i12 = i12;
                i13 = i10 | 100663296;
            } else {
                if ((i2 & 100663296) != 0) {
                    if (bVarI.A(function2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i13 = i10;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i13 & 1, z3)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                }
                bVarI.Y();
                bVar = bVarI;
                ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            zp70 zp70VarA = op70.a(aVar2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                aVar2.r(objY);
                            }
                            v5b v5bVar = (v5b) objY;
                            boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new ir70(zp70VarA, v5bVar);
                                aVar2.r(objY2);
                            }
                            final ir70 ir70Var = (ir70) objY2;
                            d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                            final float f6 = f;
                            boolean zC = aVar2.c(f6);
                            final float f7 = f5;
                            boolean zC2 = zC | aVar2.c(f7);
                            final op8 op8Var2 = op8Var;
                            boolean zM2 = zC2 | aVar2.M(op8Var2);
                            final Function2 function5 = function4;
                            boolean zM3 = zM2 | aVar2.M(function5);
                            final gaj gajVar4 = gajVar3;
                            boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                            final int i20 = i;
                            boolean zD = zM4 | aVar2.d(i20);
                            Object objY3 = aVar2.y();
                            if (zD || objY3 == c0042a) {
                                Function2 function6 = new Function2() { // from class: jfc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        final rce0 rce0Var = (rce0) obj3;
                                        final kxa kxaVar = (kxa) obj4;
                                        rce0Var.getClass();
                                        final int iY0 = rce0Var.y0(f6);
                                        long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                        List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                        final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                        Iterator<T> it = listK.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((vhv) it.next()).d0(jB));
                                        }
                                        final bq40 bq40Var = new bq40();
                                        bq40Var.a = iY0 * 2;
                                        final bq40 bq40Var2 = new bq40();
                                        int size = arrayList.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Object obj5 = arrayList.get(i21);
                                            i21++;
                                            y yVar = (y) obj5;
                                            bq40Var.a += yVar.a;
                                            bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                        }
                                        int i22 = bq40Var.a;
                                        int i23 = bq40Var2.a;
                                        final Function2 function7 = function5;
                                        final ir70 ir70Var2 = ir70Var;
                                        final int i24 = i20;
                                        final gaj gajVar5 = gajVar4;
                                        return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                bq40 bq40Var3;
                                                bq40 bq40Var4;
                                                y.a aVar3 = (y.a) obj6;
                                                aVar3.getClass();
                                                final ArrayList arrayList2 = new ArrayList();
                                                ArrayList arrayList3 = arrayList;
                                                int size2 = arrayList3.size();
                                                int i25 = iY0;
                                                int i26 = i25;
                                                int i27 = 0;
                                                while (i27 < size2) {
                                                    Object obj7 = arrayList3.get(i27);
                                                    i27++;
                                                    y yVar2 = (y) obj7;
                                                    y.a.A(aVar3, yVar2, i26, 0);
                                                    arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                    i26 += yVar2.a;
                                                }
                                                k3f0 k3f0Var = k3f0.b;
                                                rce0 rce0Var2 = rce0Var;
                                                Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                while (true) {
                                                    boolean zHasNext = it2.hasNext();
                                                    bq40Var3 = bq40Var;
                                                    bq40Var4 = bq40Var2;
                                                    if (!zHasNext) {
                                                        break;
                                                    }
                                                    vhv vhvVar = (vhv) it2.next();
                                                    long j3 = kxaVar.a;
                                                    int i28 = bq40Var3.a;
                                                    y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                    y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                }
                                                k3f0 k3f0Var2 = k3f0.c;
                                                final gaj gajVar6 = gajVar5;
                                                for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj8, Object obj9) {
                                                        a aVar4 = (a) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                            gajVar6.invoke(arrayList2, aVar4, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true))) {
                                                    int i29 = bq40Var3.a;
                                                    int i30 = bq40Var4.a;
                                                    if (!((i29 >= 0) & (i30 >= 0))) {
                                                        ykn.a("width and height must be >= 0");
                                                    }
                                                    y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                }
                                                ir70 ir70Var3 = ir70Var2;
                                                zp70 zp70Var = ir70Var3.a;
                                                Integer num = ir70Var3.c;
                                                int i31 = i24;
                                                if (num == null || num.intValue() != i31) {
                                                    ir70Var3.c = Integer.valueOf(i31);
                                                    y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                    if (y1f0Var != null) {
                                                        y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                        int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                        int iH = iY1 - zp70Var.h();
                                                        int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                        int i32 = iY1 - iH;
                                                        if (i32 < 0) {
                                                            i32 = 0;
                                                        }
                                                        int iE = f.e(iY2, 0, i32);
                                                        if (((u5a0) zp70Var.a).D() != iE) {
                                                            ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                };
                                aVar2.r(function6);
                                objY3 = function6;
                            }
                            f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                z4 = z6;
                f4 = f5;
                function3 = function4;
                gajVar2 = gajVar3;
                dVar3 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar2 = gajVar;
                function3 = function2;
                dVar3 = dVar2;
                f4 = f3;
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gfc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i18 |= 48;
        dVar2 = dVar;
        if ((i2 & 384) == 0) {
            if (bVarI.e(j)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 |= i17;
        }
        if ((i2 & 3072) == 0) {
            if (bVarI.e(j2)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i18 |= i16;
        }
        if ((i2 & 24576) == 0) {
            if (bVarI.c(f)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i18 |= i15;
        }
        i4 = i3 & 32;
        if (i4 != 0) {
            if ((196608 & i2) == 0) {
                f3 = f2;
                if (bVarI.c(f3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i18 |= i5;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i18 |= i7;
                }
                i8 = i18;
                i9 = i3 & 128;
                if (i9 != 0) {
                    i10 = i8 | 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (bVarI.A(gajVar)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i10 = i8 | i11;
                } else {
                    i10 = i8;
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    i12 = i12;
                    i13 = i10 | 100663296;
                } else {
                    if ((i2 & 100663296) != 0) {
                        if (bVarI.A(function2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    }
                    i13 = i10;
                }
                if ((306783379 & i13) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i13 & 1, z3)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    } else {
                        if (i19 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i4 != 0) {
                            f3 = 44.0f;
                        }
                        if (i6 == 0) {
                        }
                        if (i9 != 0) {
                            gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    List list = (List) obj;
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    list.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                    }
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                        } else {
                            gajVarB = gajVar;
                        }
                        if (i12 != 0) {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = uw8.a;
                        } else {
                            gajVar3 = gajVarB;
                            dVar4 = dVar2;
                            f5 = f3;
                            z6 = z5;
                            function4 = function2;
                        }
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zp70 zp70VarA = op70.a(aVar2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                    aVar2.r(objY);
                                }
                                v5b v5bVar = (v5b) objY;
                                boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                                Object objY2 = aVar2.y();
                                if (zM || objY2 == c0042a) {
                                    objY2 = new ir70(zp70VarA, v5bVar);
                                    aVar2.r(objY2);
                                }
                                final ir70 ir70Var = (ir70) objY2;
                                d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                                final float f6 = f;
                                boolean zC = aVar2.c(f6);
                                final float f7 = f5;
                                boolean zC2 = zC | aVar2.c(f7);
                                final op8 op8Var2 = op8Var;
                                boolean zM2 = zC2 | aVar2.M(op8Var2);
                                final Function2 function5 = function4;
                                boolean zM3 = zM2 | aVar2.M(function5);
                                final gaj gajVar4 = gajVar3;
                                boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                                final int i20 = i;
                                boolean zD = zM4 | aVar2.d(i20);
                                Object objY3 = aVar2.y();
                                if (zD || objY3 == c0042a) {
                                    Function2 function6 = new Function2() { // from class: jfc
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            final rce0 rce0Var = (rce0) obj3;
                                            final kxa kxaVar = (kxa) obj4;
                                            rce0Var.getClass();
                                            final int iY0 = rce0Var.y0(f6);
                                            long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                            List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                            final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                            Iterator<T> it = listK.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((vhv) it.next()).d0(jB));
                                            }
                                            final bq40 bq40Var = new bq40();
                                            bq40Var.a = iY0 * 2;
                                            final bq40 bq40Var2 = new bq40();
                                            int size = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj5 = arrayList.get(i21);
                                                i21++;
                                                y yVar = (y) obj5;
                                                bq40Var.a += yVar.a;
                                                bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                            }
                                            int i22 = bq40Var.a;
                                            int i23 = bq40Var2.a;
                                            final Function2 function7 = function5;
                                            final ir70 ir70Var2 = ir70Var;
                                            final int i24 = i20;
                                            final gaj gajVar5 = gajVar4;
                                            return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj6) {
                                                    bq40 bq40Var3;
                                                    bq40 bq40Var4;
                                                    y.a aVar3 = (y.a) obj6;
                                                    aVar3.getClass();
                                                    final ArrayList arrayList2 = new ArrayList();
                                                    ArrayList arrayList3 = arrayList;
                                                    int size2 = arrayList3.size();
                                                    int i25 = iY0;
                                                    int i26 = i25;
                                                    int i27 = 0;
                                                    while (i27 < size2) {
                                                        Object obj7 = arrayList3.get(i27);
                                                        i27++;
                                                        y yVar2 = (y) obj7;
                                                        y.a.A(aVar3, yVar2, i26, 0);
                                                        arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                        i26 += yVar2.a;
                                                    }
                                                    k3f0 k3f0Var = k3f0.b;
                                                    rce0 rce0Var2 = rce0Var;
                                                    Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                    while (true) {
                                                        boolean zHasNext = it2.hasNext();
                                                        bq40Var3 = bq40Var;
                                                        bq40Var4 = bq40Var2;
                                                        if (!zHasNext) {
                                                            break;
                                                        }
                                                        vhv vhvVar = (vhv) it2.next();
                                                        long j3 = kxaVar.a;
                                                        int i28 = bq40Var3.a;
                                                        y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                        y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                    }
                                                    k3f0 k3f0Var2 = k3f0.c;
                                                    final gaj gajVar6 = gajVar5;
                                                    for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj8, Object obj9) {
                                                            a aVar4 = (a) obj8;
                                                            int iIntValue2 = ((Integer) obj9).intValue();
                                                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                gajVar6.invoke(arrayList2, aVar4, 0);
                                                            } else {
                                                                aVar4.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, true))) {
                                                        int i29 = bq40Var3.a;
                                                        int i30 = bq40Var4.a;
                                                        if (!((i29 >= 0) & (i30 >= 0))) {
                                                            ykn.a("width and height must be >= 0");
                                                        }
                                                        y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                    }
                                                    ir70 ir70Var3 = ir70Var2;
                                                    zp70 zp70Var = ir70Var3.a;
                                                    Integer num = ir70Var3.c;
                                                    int i31 = i24;
                                                    if (num == null || num.intValue() != i31) {
                                                        ir70Var3.c = Integer.valueOf(i31);
                                                        y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                        if (y1f0Var != null) {
                                                            y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                            int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                            int iH = iY1 - zp70Var.h();
                                                            int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                            int i32 = iY1 - iH;
                                                            if (i32 < 0) {
                                                                i32 = 0;
                                                            }
                                                            int iE = f.e(iY2, 0, i32);
                                                            if (((u5a0) zp70Var.a).D() != iE) {
                                                                ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                            }
                                                        }
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    };
                                    aVar2.r(function6);
                                    objY3 = function6;
                                }
                                f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                    z4 = z6;
                    f4 = f5;
                    function3 = function4;
                    gajVar2 = gajVar3;
                    dVar3 = dVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar2 = gajVar;
                    function3 = function2;
                    dVar3 = dVar2;
                    f4 = f3;
                    z4 = z2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: gfc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i18 |= 1572864;
            z2 = z;
            i8 = i18;
            i9 = i3 & 128;
            if (i9 != 0) {
                i10 = i8 | 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (bVarI.A(gajVar)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i10 = i8 | i11;
            } else {
                i10 = i8;
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                i12 = i12;
                i13 = i10 | 100663296;
            } else {
                if ((i2 & 100663296) != 0) {
                    if (bVarI.A(function2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i13 = i10;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i13 & 1, z3)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                }
                bVarI.Y();
                bVar = bVarI;
                ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            zp70 zp70VarA = op70.a(aVar2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                aVar2.r(objY);
                            }
                            v5b v5bVar = (v5b) objY;
                            boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new ir70(zp70VarA, v5bVar);
                                aVar2.r(objY2);
                            }
                            final ir70 ir70Var = (ir70) objY2;
                            d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                            final float f6 = f;
                            boolean zC = aVar2.c(f6);
                            final float f7 = f5;
                            boolean zC2 = zC | aVar2.c(f7);
                            final op8 op8Var2 = op8Var;
                            boolean zM2 = zC2 | aVar2.M(op8Var2);
                            final Function2 function5 = function4;
                            boolean zM3 = zM2 | aVar2.M(function5);
                            final gaj gajVar4 = gajVar3;
                            boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                            final int i20 = i;
                            boolean zD = zM4 | aVar2.d(i20);
                            Object objY3 = aVar2.y();
                            if (zD || objY3 == c0042a) {
                                Function2 function6 = new Function2() { // from class: jfc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        final rce0 rce0Var = (rce0) obj3;
                                        final kxa kxaVar = (kxa) obj4;
                                        rce0Var.getClass();
                                        final int iY0 = rce0Var.y0(f6);
                                        long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                        List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                        final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                        Iterator<T> it = listK.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((vhv) it.next()).d0(jB));
                                        }
                                        final bq40 bq40Var = new bq40();
                                        bq40Var.a = iY0 * 2;
                                        final bq40 bq40Var2 = new bq40();
                                        int size = arrayList.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Object obj5 = arrayList.get(i21);
                                            i21++;
                                            y yVar = (y) obj5;
                                            bq40Var.a += yVar.a;
                                            bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                        }
                                        int i22 = bq40Var.a;
                                        int i23 = bq40Var2.a;
                                        final Function2 function7 = function5;
                                        final ir70 ir70Var2 = ir70Var;
                                        final int i24 = i20;
                                        final gaj gajVar5 = gajVar4;
                                        return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                bq40 bq40Var3;
                                                bq40 bq40Var4;
                                                y.a aVar3 = (y.a) obj6;
                                                aVar3.getClass();
                                                final ArrayList arrayList2 = new ArrayList();
                                                ArrayList arrayList3 = arrayList;
                                                int size2 = arrayList3.size();
                                                int i25 = iY0;
                                                int i26 = i25;
                                                int i27 = 0;
                                                while (i27 < size2) {
                                                    Object obj7 = arrayList3.get(i27);
                                                    i27++;
                                                    y yVar2 = (y) obj7;
                                                    y.a.A(aVar3, yVar2, i26, 0);
                                                    arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                    i26 += yVar2.a;
                                                }
                                                k3f0 k3f0Var = k3f0.b;
                                                rce0 rce0Var2 = rce0Var;
                                                Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                while (true) {
                                                    boolean zHasNext = it2.hasNext();
                                                    bq40Var3 = bq40Var;
                                                    bq40Var4 = bq40Var2;
                                                    if (!zHasNext) {
                                                        break;
                                                    }
                                                    vhv vhvVar = (vhv) it2.next();
                                                    long j3 = kxaVar.a;
                                                    int i28 = bq40Var3.a;
                                                    y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                    y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                }
                                                k3f0 k3f0Var2 = k3f0.c;
                                                final gaj gajVar6 = gajVar5;
                                                for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj8, Object obj9) {
                                                        a aVar4 = (a) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                            gajVar6.invoke(arrayList2, aVar4, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true))) {
                                                    int i29 = bq40Var3.a;
                                                    int i30 = bq40Var4.a;
                                                    if (!((i29 >= 0) & (i30 >= 0))) {
                                                        ykn.a("width and height must be >= 0");
                                                    }
                                                    y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                }
                                                ir70 ir70Var3 = ir70Var2;
                                                zp70 zp70Var = ir70Var3.a;
                                                Integer num = ir70Var3.c;
                                                int i31 = i24;
                                                if (num == null || num.intValue() != i31) {
                                                    ir70Var3.c = Integer.valueOf(i31);
                                                    y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                    if (y1f0Var != null) {
                                                        y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                        int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                        int iH = iY1 - zp70Var.h();
                                                        int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                        int i32 = iY1 - iH;
                                                        if (i32 < 0) {
                                                            i32 = 0;
                                                        }
                                                        int iE = f.e(iY2, 0, i32);
                                                        if (((u5a0) zp70Var.a).D() != iE) {
                                                            ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                };
                                aVar2.r(function6);
                                objY3 = function6;
                            }
                            f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                z4 = z6;
                f4 = f5;
                function3 = function4;
                gajVar2 = gajVar3;
                dVar3 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar2 = gajVar;
                function3 = function2;
                dVar3 = dVar2;
                f4 = f3;
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gfc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i18 |= 196608;
        f3 = f2;
        i6 = i3 & 64;
        if (i6 != 0) {
            if ((1572864 & i2) == 0) {
                z2 = z;
                if (bVarI.b(z2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i18 |= i7;
            }
            i8 = i18;
            i9 = i3 & 128;
            if (i9 != 0) {
                i10 = i8 | 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (bVarI.A(gajVar)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i10 = i8 | i11;
            } else {
                i10 = i8;
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                i12 = i12;
                i13 = i10 | 100663296;
            } else {
                if ((i2 & 100663296) != 0) {
                    if (bVarI.A(function2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i13 = i10;
            }
            if ((306783379 & i13) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i13 & 1, z3)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                } else {
                    if (i19 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i4 != 0) {
                        f3 = 44.0f;
                    }
                    if (i6 == 0) {
                    }
                    if (i9 != 0) {
                        gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                List list = (List) obj;
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                list.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                                }
                                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                    } else {
                        gajVarB = gajVar;
                    }
                    if (i12 != 0) {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = uw8.a;
                    } else {
                        gajVar3 = gajVarB;
                        dVar4 = dVar2;
                        f5 = f3;
                        z6 = z5;
                        function4 = function2;
                    }
                }
                bVarI.Y();
                bVar = bVarI;
                ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            zp70 zp70VarA = op70.a(aVar2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                                aVar2.r(objY);
                            }
                            v5b v5bVar = (v5b) objY;
                            boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new ir70(zp70VarA, v5bVar);
                                aVar2.r(objY2);
                            }
                            final ir70 ir70Var = (ir70) objY2;
                            d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                            final float f6 = f;
                            boolean zC = aVar2.c(f6);
                            final float f7 = f5;
                            boolean zC2 = zC | aVar2.c(f7);
                            final op8 op8Var2 = op8Var;
                            boolean zM2 = zC2 | aVar2.M(op8Var2);
                            final Function2 function5 = function4;
                            boolean zM3 = zM2 | aVar2.M(function5);
                            final gaj gajVar4 = gajVar3;
                            boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                            final int i20 = i;
                            boolean zD = zM4 | aVar2.d(i20);
                            Object objY3 = aVar2.y();
                            if (zD || objY3 == c0042a) {
                                Function2 function6 = new Function2() { // from class: jfc
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        final rce0 rce0Var = (rce0) obj3;
                                        final kxa kxaVar = (kxa) obj4;
                                        rce0Var.getClass();
                                        final int iY0 = rce0Var.y0(f6);
                                        long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                        List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                        final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                        Iterator<T> it = listK.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((vhv) it.next()).d0(jB));
                                        }
                                        final bq40 bq40Var = new bq40();
                                        bq40Var.a = iY0 * 2;
                                        final bq40 bq40Var2 = new bq40();
                                        int size = arrayList.size();
                                        int i21 = 0;
                                        while (i21 < size) {
                                            Object obj5 = arrayList.get(i21);
                                            i21++;
                                            y yVar = (y) obj5;
                                            bq40Var.a += yVar.a;
                                            bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                        }
                                        int i22 = bq40Var.a;
                                        int i23 = bq40Var2.a;
                                        final Function2 function7 = function5;
                                        final ir70 ir70Var2 = ir70Var;
                                        final int i24 = i20;
                                        final gaj gajVar5 = gajVar4;
                                        return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                bq40 bq40Var3;
                                                bq40 bq40Var4;
                                                y.a aVar3 = (y.a) obj6;
                                                aVar3.getClass();
                                                final ArrayList arrayList2 = new ArrayList();
                                                ArrayList arrayList3 = arrayList;
                                                int size2 = arrayList3.size();
                                                int i25 = iY0;
                                                int i26 = i25;
                                                int i27 = 0;
                                                while (i27 < size2) {
                                                    Object obj7 = arrayList3.get(i27);
                                                    i27++;
                                                    y yVar2 = (y) obj7;
                                                    y.a.A(aVar3, yVar2, i26, 0);
                                                    arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                    i26 += yVar2.a;
                                                }
                                                k3f0 k3f0Var = k3f0.b;
                                                rce0 rce0Var2 = rce0Var;
                                                Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                                while (true) {
                                                    boolean zHasNext = it2.hasNext();
                                                    bq40Var3 = bq40Var;
                                                    bq40Var4 = bq40Var2;
                                                    if (!zHasNext) {
                                                        break;
                                                    }
                                                    vhv vhvVar = (vhv) it2.next();
                                                    long j3 = kxaVar.a;
                                                    int i28 = bq40Var3.a;
                                                    y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                    y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                                }
                                                k3f0 k3f0Var2 = k3f0.c;
                                                final gaj gajVar6 = gajVar5;
                                                for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj8, Object obj9) {
                                                        a aVar4 = (a) obj8;
                                                        int iIntValue2 = ((Integer) obj9).intValue();
                                                        if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                            gajVar6.invoke(arrayList2, aVar4, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true))) {
                                                    int i29 = bq40Var3.a;
                                                    int i30 = bq40Var4.a;
                                                    if (!((i29 >= 0) & (i30 >= 0))) {
                                                        ykn.a("width and height must be >= 0");
                                                    }
                                                    y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                                }
                                                ir70 ir70Var3 = ir70Var2;
                                                zp70 zp70Var = ir70Var3.a;
                                                Integer num = ir70Var3.c;
                                                int i31 = i24;
                                                if (num == null || num.intValue() != i31) {
                                                    ir70Var3.c = Integer.valueOf(i31);
                                                    y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                    if (y1f0Var != null) {
                                                        y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                        int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                        int iH = iY1 - zp70Var.h();
                                                        int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                        int i32 = iY1 - iH;
                                                        if (i32 < 0) {
                                                            i32 = 0;
                                                        }
                                                        int iE = f.e(iY2, 0, i32);
                                                        if (((u5a0) zp70Var.a).D() != iE) {
                                                            ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                };
                                aVar2.r(function6);
                                objY3 = function6;
                            }
                            f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
                z4 = z6;
                f4 = f5;
                function3 = function4;
                gajVar2 = gajVar3;
                dVar3 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar2 = gajVar;
                function3 = function2;
                dVar3 = dVar2;
                f4 = f3;
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gfc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i18 |= 1572864;
        z2 = z;
        i8 = i18;
        i9 = i3 & 128;
        if (i9 != 0) {
            i10 = i8 | 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (bVarI.A(gajVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 = i8 | i11;
        } else {
            i10 = i8;
        }
        i12 = i3 & 256;
        if (i12 != 0) {
            i12 = i12;
            i13 = i10 | 100663296;
        } else {
            if ((i2 & 100663296) != 0) {
                if (bVarI.A(function2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i10 |= i14;
            }
            i13 = i10;
        }
        if ((306783379 & i13) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i13 & 1, z3)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    dVar2 = d.a.b;
                }
                if (i4 != 0) {
                    f3 = 44.0f;
                }
                if (i6 == 0) {
                }
                if (i9 != 0) {
                    gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                } else {
                    gajVarB = gajVar;
                }
                if (i12 != 0) {
                    gajVar3 = gajVarB;
                    dVar4 = dVar2;
                    f5 = f3;
                    z6 = z5;
                    function4 = uw8.a;
                } else {
                    gajVar3 = gajVarB;
                    dVar4 = dVar2;
                    f5 = f3;
                    z6 = z5;
                    function4 = function2;
                }
            } else {
                if (i19 != 0) {
                    dVar2 = d.a.b;
                }
                if (i4 != 0) {
                    f3 = 44.0f;
                }
                if (i6 == 0) {
                }
                if (i9 != 0) {
                    gajVarB = pp8.b(-1550310800, new gaj() { // from class: efc
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            List list = (List) obj;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            list.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                h2f0.a.b(h2f0.c((y1f0) list.get(i)), 0.0f, 0L, aVar2, 3072, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                } else {
                    gajVarB = gajVar;
                }
                if (i12 != 0) {
                    gajVar3 = gajVarB;
                    dVar4 = dVar2;
                    f5 = f3;
                    z6 = z5;
                    function4 = uw8.a;
                } else {
                    gajVar3 = gajVarB;
                    dVar4 = dVar2;
                    f5 = f3;
                    z6 = z5;
                    function4 = function2;
                }
            }
            bVarI.Y();
            bVar = bVarI;
            ihe0.a(dVar4, null, j, j2, 0.0f, 0.0f, null, pp8.b(-987641466, new Function2() { // from class: ffc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zp70 zp70VarA = op70.a(aVar2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = xvf.i(kotlin.coroutines.e.a, aVar2);
                            aVar2.r(objY);
                        }
                        v5b v5bVar = (v5b) objY;
                        boolean zM = aVar2.M(zp70VarA) | aVar2.M(v5bVar);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new ir70(zp70VarA, v5bVar);
                            aVar2.r(objY2);
                        }
                        final ir70 ir70Var = (ir70) objY2;
                        d dVarB = ls7.b(i780.a(op70.b(j.C(g3w.a(d.a.b, z6, new hfc(), new ifc(), aVar2, 6, 0), ht.a.d, 2), zp70VarA, false, true, false)));
                        final float f6 = f;
                        boolean zC = aVar2.c(f6);
                        final float f7 = f5;
                        boolean zC2 = zC | aVar2.c(f7);
                        final op8 op8Var2 = op8Var;
                        boolean zM2 = zC2 | aVar2.M(op8Var2);
                        final Function2 function5 = function4;
                        boolean zM3 = zM2 | aVar2.M(function5);
                        final gaj gajVar4 = gajVar3;
                        boolean zM4 = zM3 | aVar2.M(gajVar4) | aVar2.A(ir70Var);
                        final int i20 = i;
                        boolean zD = zM4 | aVar2.d(i20);
                        Object objY3 = aVar2.y();
                        if (zD || objY3 == c0042a) {
                            Function2 function6 = new Function2() { // from class: jfc
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    final rce0 rce0Var = (rce0) obj3;
                                    final kxa kxaVar = (kxa) obj4;
                                    rce0Var.getClass();
                                    final int iY0 = rce0Var.y0(f6);
                                    long jB = kxa.b(rce0Var.y0(f7), 0, 0, 0, 14, kxaVar.a);
                                    List<vhv> listK = rce0Var.K(k3f0.a, op8Var2);
                                    final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                    Iterator<T> it = listK.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((vhv) it.next()).d0(jB));
                                    }
                                    final bq40 bq40Var = new bq40();
                                    bq40Var.a = iY0 * 2;
                                    final bq40 bq40Var2 = new bq40();
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (i21 < size) {
                                        Object obj5 = arrayList.get(i21);
                                        i21++;
                                        y yVar = (y) obj5;
                                        bq40Var.a += yVar.a;
                                        bq40Var2.a = Math.max(bq40Var2.a, yVar.b);
                                    }
                                    int i22 = bq40Var.a;
                                    int i23 = bq40Var2.a;
                                    final Function2 function7 = function5;
                                    final ir70 ir70Var2 = ir70Var;
                                    final int i24 = i20;
                                    final gaj gajVar5 = gajVar4;
                                    return t.z1(rce0Var, i22, i23, new Function1() { // from class: kfc
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            bq40 bq40Var3;
                                            bq40 bq40Var4;
                                            y.a aVar3 = (y.a) obj6;
                                            aVar3.getClass();
                                            final ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = arrayList;
                                            int size2 = arrayList3.size();
                                            int i25 = iY0;
                                            int i26 = i25;
                                            int i27 = 0;
                                            while (i27 < size2) {
                                                Object obj7 = arrayList3.get(i27);
                                                i27++;
                                                y yVar2 = (y) obj7;
                                                y.a.A(aVar3, yVar2, i26, 0);
                                                arrayList2.add(new y1f0(aVar3.u1(i26), aVar3.u1(yVar2.a)));
                                                i26 += yVar2.a;
                                            }
                                            k3f0 k3f0Var = k3f0.b;
                                            rce0 rce0Var2 = rce0Var;
                                            Iterator<T> it2 = rce0Var2.K(k3f0Var, function7).iterator();
                                            while (true) {
                                                boolean zHasNext = it2.hasNext();
                                                bq40Var3 = bq40Var;
                                                bq40Var4 = bq40Var2;
                                                if (!zHasNext) {
                                                    break;
                                                }
                                                vhv vhvVar = (vhv) it2.next();
                                                long j3 = kxaVar.a;
                                                int i28 = bq40Var3.a;
                                                y yVarD0 = vhvVar.d0(kxa.b(i28, i28, 0, 0, 8, j3));
                                                y.a.A(aVar3, yVarD0, 0, bq40Var4.a - yVarD0.b);
                                            }
                                            k3f0 k3f0Var2 = k3f0.c;
                                            final gaj gajVar6 = gajVar5;
                                            for (vhv vhvVar2 : rce0Var2.K(k3f0Var2, new op8(1905025133, new Function2() { // from class: lfc
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj8, Object obj9) {
                                                    a aVar4 = (a) obj8;
                                                    int iIntValue2 = ((Integer) obj9).intValue();
                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        gajVar6.invoke(arrayList2, aVar4, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true))) {
                                                int i29 = bq40Var3.a;
                                                int i30 = bq40Var4.a;
                                                if (!((i29 >= 0) & (i30 >= 0))) {
                                                    ykn.a("width and height must be >= 0");
                                                }
                                                y.a.A(aVar3, vhvVar2.d0(oxa.h(i29, i29, i30, i30)), 0, 0);
                                            }
                                            ir70 ir70Var3 = ir70Var2;
                                            zp70 zp70Var = ir70Var3.a;
                                            Integer num = ir70Var3.c;
                                            int i31 = i24;
                                            if (num == null || num.intValue() != i31) {
                                                ir70Var3.c = Integer.valueOf(i31);
                                                y1f0 y1f0Var = (y1f0) CollectionsKt.V(i31, arrayList2);
                                                if (y1f0Var != null) {
                                                    y1f0 y1f0Var2 = (y1f0) CollectionsKt.b0(arrayList2);
                                                    int iY1 = rce0Var2.y0(y1f0Var2.a + y1f0Var2.b) + i25;
                                                    int iH = iY1 - zp70Var.h();
                                                    int iY2 = rce0Var2.y0(y1f0Var.a) - ((iH / 2) - (rce0Var2.y0(y1f0Var.b) / 2));
                                                    int i32 = iY1 - iH;
                                                    if (i32 < 0) {
                                                        i32 = 0;
                                                    }
                                                    int iE = f.e(iY2, 0, i32);
                                                    if (((u5a0) zp70Var.a).D() != iE) {
                                                        ej5.c(ir70Var3.b, null, null, new gr70(ir70Var3, iE, null), 3);
                                                    }
                                                }
                                            }
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            aVar2.r(function6);
                            objY3 = function6;
                        }
                        f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i13 >> 3) & 14) | 12582912 | (i13 & 896) | (i13 & 7168), 114);
            z4 = z6;
            f4 = f5;
            function3 = function4;
            gajVar2 = gajVar3;
            dVar3 = dVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            gajVar2 = gajVar;
            function3 = function2;
            dVar3 = dVar2;
            f4 = f3;
            z4 = z2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gfc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    mfc.a(i, dVar3, j, j2, f, f4, z4, gajVar2, function3, op8Var, (a) obj, iA, i3);
                    return Unit.a;
                }
            };
        }
    }
}
