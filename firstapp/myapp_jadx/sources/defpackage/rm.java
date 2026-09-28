package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class rm {
    public static final void a(d dVar, z2q z2qVar, Function1 function1, final List list, a aVar, int i) {
        int i2;
        Function1 function2;
        z2qVar.getClass();
        list.getClass();
        b bVarI = aVar.i(-455280002);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(z2qVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(list) : bVarI.A(list) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new i20(i590.a);
                bVarI.r(objY);
            }
            final i20 i20Var = (i20) objY;
            gzg0 gzg0Var = v00.a;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new jm();
                bVarI.r(objY2);
            }
            l5f0 l5f0VarA = v00.a(i20Var, (Function1) objY2, yi0.d(0.0f, 200.0f, null, 5), bVarI, 3510);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(0.0f);
                bVarI.r(objY3);
            }
            final isw iswVar = (isw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = j.a(0.0f);
                bVarI.r(objY4);
            }
            final isw iswVar2 = (isw) objY4;
            boolean z = (i2 & 112) == 32;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                objY5 = new qm(z2qVar, i20Var, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, z2qVar, (Function2) objY5);
            i3z i3zVar = i3z.a;
            d dVarC = androidx.compose.foundation.gestures.a.c(dVar, i20Var, l5f0VarA, 56);
            boolean zM = ((i2 & 896) == 256) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && bVarI.A(list))) | bVarI.M(mmdVar);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                final Function1 function3 = function2;
                Function2 function4 = new Function2() { // from class: km
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i3;
                        Object value;
                        final rce0 rce0Var = (rce0) obj;
                        kxa kxaVar = (kxa) obj2;
                        rce0Var.getClass();
                        final int i4 = kxa.i(kxaVar.a);
                        int i5 = 0;
                        long jB = kxa.b(0, 0, 0, Reader.READ_DONE, 3, kxaVar.a);
                        final List list2 = list;
                        final ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                        int i6 = 0;
                        for (Object obj3 : list2) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            hm hmVar = (hm) obj3;
                            vhv vhvVar = (vhv) CollectionsKt.firstOrNull(rce0Var.K(hce0.a(i6, "c_"), new op8(133412552, new mm(hmVar, i5), true)));
                            int i8 = vhvVar != null ? vhvVar.d0(jB).b : 0;
                            vhv vhvVar2 = (vhv) CollectionsKt.firstOrNull(rce0Var.K(hce0.a(i6, "e_"), new op8(-326803894, new nm(hmVar), true)));
                            arrayList.add(new o2p(i8, vhvVar2 != null ? vhvVar2.d0(jB).b : 0));
                            i6 = i7;
                            i5 = 0;
                        }
                        int size = arrayList.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj4 = arrayList.get(i10);
                            i10++;
                            i9 += ((o2p) obj4).a;
                        }
                        float f = i9;
                        int size2 = arrayList.size();
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj5 = arrayList.get(i12);
                            i12++;
                            i11 += ((o2p) obj5).b;
                        }
                        float f2 = i11;
                        isw iswVar3 = iswVar;
                        float fJ = iswVar3.j();
                        i20 i20Var2 = i20Var;
                        isw iswVar4 = iswVar2;
                        if (f == fJ && f2 == iswVar4.j()) {
                            i3 = 0;
                        } else {
                            iswVar3.A(f);
                            iswVar4.A(f2);
                            p9f p9fVar = new p9f();
                            p9fVar.a(i590.a, f);
                            p9fVar.a(i590.b, f2);
                            Unit unit = Unit.a;
                            float[] fArr = p9fVar.b;
                            ArrayList arrayList2 = p9fVar.a;
                            int size3 = arrayList2.size();
                            fArr.getClass();
                            vx0.a(size3, fArr.length);
                            i3 = 0;
                            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size3);
                            fArrCopyOfRange.getClass();
                            vbd vbdVar = new vbd(arrayList2, fArrCopyOfRange);
                            isw iswVar5 = i20Var2.j;
                            mae maeVar = i20Var2.i;
                            if (Float.isNaN(((t5a0) iswVar5).j()) || (value = vbdVar.c(((t5a0) i20Var2.j).j())) == null) {
                                value = maeVar.getValue();
                            }
                            i20Var2.g(vbdVar, value);
                        }
                        float fJ2 = Float.isNaN(((t5a0) i20Var2.j).j()) ? f : ((t5a0) i20Var2.j).j();
                        float f3 = 0.0f;
                        float fD = f2 > f ? f.d((fJ2 - f) / (f2 - f), 0.0f, 1.0f) : 0.0f;
                        function3.invoke(Float.valueOf(fD));
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
                        int size4 = arrayList.size();
                        int i13 = i3;
                        int i14 = i13;
                        while (i14 < size4) {
                            Object obj6 = arrayList.get(i14);
                            i14++;
                            int i15 = i13 + 1;
                            if (i13 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            o2p o2pVar = (o2p) obj6;
                            float f4 = f3;
                            int i16 = o2pVar.a - o2pVar.b;
                            if (i16 < 0) {
                                i16 = i3;
                            }
                            arrayList3.add(Float.valueOf(((hm) list2.get(i13)).a.a(fD) * i16));
                            f3 = f4;
                            i13 = i15;
                        }
                        float f5 = f3;
                        int size5 = arrayList3.size();
                        float fFloatValue = f5;
                        while (i3 < size5) {
                            Object obj7 = arrayList3.get(i3);
                            i3++;
                            fFloatValue += ((Number) obj7).floatValue();
                        }
                        final aq40 aq40Var = new aq40();
                        float f6 = fJ2 - f;
                        aq40Var.a = (f6 < f5 ? f5 : f6) + fFloatValue;
                        int i17 = (int) fJ2;
                        final mmd mmdVar2 = mmdVar;
                        final float f7 = fD;
                        return t.z1(rce0Var, i4, i17, new Function1() { // from class: om
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                int i18;
                                final float f8;
                                y.a aVar2 = (y.a) obj8;
                                aVar2.getClass();
                                int i19 = 0;
                                int i20 = 0;
                                for (Object obj9 : list2) {
                                    int i21 = i19 + 1;
                                    if (i19 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    final hm hmVar2 = (hm) obj9;
                                    final o2p o2pVar2 = (o2p) arrayList.get(i19);
                                    int i22 = o2pVar2.b;
                                    int i23 = o2pVar2.a;
                                    int i24 = i22 - i23;
                                    final float f9 = f7;
                                    if (i24 >= 0) {
                                        aq40 aq40Var2 = aq40Var;
                                        float f10 = i24;
                                        float fD2 = f.d(aq40Var2.a, 0.0f, f10);
                                        aq40Var2.a -= fD2;
                                        i18 = i23 + ((int) fD2);
                                        f8 = i24 > 0 ? fD2 / f10 : 1.0f;
                                    } else {
                                        float fA = hmVar2.a.a(f9);
                                        i18 = (int) ((i24 * fA) + i23);
                                        f8 = fA;
                                    }
                                    int i25 = i18;
                                    String strA = hce0.a(i19, "content_");
                                    final mmd mmdVar3 = mmdVar2;
                                    final int i26 = i4;
                                    for (vhv vhvVar3 : rce0Var.K(strA, new op8(1850370886, new Function2() { // from class: pm
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj10, Object obj11) {
                                            a aVar3 = (a) obj10;
                                            int iIntValue = ((Integer) obj11).intValue();
                                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                d.a aVar4 = d.a.b;
                                                mmd mmdVar4 = mmdVar3;
                                                d dVarW = androidx.compose.foundation.layout.j.w(aVar4, mmdVar4.u1(i26));
                                                o2p o2pVar3 = o2pVar2;
                                                d dVarB = ls7.b(androidx.compose.foundation.layout.j.i(dVarW, mmdVar4.u1(Math.max(o2pVar3.a, o2pVar3.b))));
                                                aiv aivVarC = g75.c(ht.a.a, false);
                                                int iHashCode = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO = aVar3.o();
                                                d dVarC2 = c.c(aVar3, dVarB);
                                                yka.k.getClass();
                                                tsr.a aVar5 = yka.a.b;
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar5);
                                                } else {
                                                    aVar3.p();
                                                }
                                                hlh0.a(aVar3, aivVarC, yka.a.f);
                                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                                }
                                                hlh0.a(aVar3, dVarC2, yka.a.d);
                                                hmVar2.b.d(Float.valueOf(f8), Float.valueOf(f9), aVar3, 0);
                                                aVar3.s();
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true))) {
                                        if (!((i26 >= 0) & (i25 >= 0))) {
                                            ykn.a("width and height must be >= 0");
                                        }
                                        y.a.A(aVar2, vhvVar3.d0(oxa.h(i26, i26, i25, i25)), 0, i20);
                                    }
                                    i20 += i25;
                                    i19 = i21;
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(function4);
                objY6 = function4;
            }
            f0.a(dVarC, (Function2) objY6, bVarI, 0, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new lm(dVar, z2qVar, function1, list, i, 0);
        }
    }
}
