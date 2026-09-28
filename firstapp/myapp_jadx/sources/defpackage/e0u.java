package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0u {
    public static final void a(final tyt tytVar, final tyt tytVar2, a aVar, final int i) {
        b bVarI = aVar.i(-1563427263);
        int i2 = ((i & 8) == 0 ? bVarI.M(tytVar) : bVarI.A(tytVar) ? 4 : 2) | i | ((i & 64) == 0 ? bVarI.M(tytVar2) : bVarI.A(tytVar2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ju1.b(kd9.b, null, pp8.b(1385635463, new gaj() { // from class: c0u
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3;
                    int i4;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarJ = h.j(d.a.b, 0.0f, 4.0f, 8.0f, 0.0f, 9);
                        tyt tytVar3 = tytVar;
                        String strA = cb40.a(tytVar3.a, new Object[0], aVar2);
                        imf0 imf0VarL = mla.l(R.style.B1_B, aVar2);
                        if (tytVar3.equals(tytVar2)) {
                            i3 = 535631080;
                            i4 = R.color.text_type2_primary;
                        } else {
                            i3 = 535719430;
                            i4 = R.color.text_type1_secondary;
                        }
                        lkf0.d(strA, dVarJ, m7b.a(aVar2, i3, i4, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 1, 0, null, imf0VarL, aVar2, 48, 24576, 113656);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 390, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d0u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e0u.a(tytVar, tytVar2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final m3f0 m3f0Var, final Function1<? super tyt, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        dVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1801359378);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(m3f0Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVar = bVarI;
            j3f0.e(m3f0Var.c, j.g(h.j(dVar, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), null, j58.l, c68.a(R.color.text_type2_primary, bVarI), 16.0f, pp8.b(438958833, new gaj() { // from class: xzt
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    k1f0 k1f0Var = (k1f0) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    k1f0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(k1f0Var) : aVar2.A(k1f0Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        i2f0.a.c(k1f0Var.a(m3f0Var.c, false), 3.0f, c68.a(R.color.text_type2_primary, aVar2), aVar2, 3120, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), kd9.a, 0.0f, pp8.b(72655802, new Function2() { // from class: yzt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final m3f0 m3f0Var2 = m3f0Var;
                        int i4 = 0;
                        for (tyt tytVar : m3f0Var2.a) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final tyt tytVar2 = tytVar;
                            d dVarH = g3w.h(d.a.b, tytVar2.b);
                            boolean z = i4 == m3f0Var2.c;
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.A(tytVar2);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: a0u
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(tytVar2);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            w1f0.a(z, (Function0) objY, dVarH, false, 0L, 0L, pp8.b(-67410849, new gaj() { // from class: b0u
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int i6;
                                    int i7;
                                    a aVar3;
                                    tyt tytVar3 = m3f0Var2.b;
                                    a aVar4 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((j78) obj3).getClass();
                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        d dVarH2 = h.h(j.i(d.a.b, 48.0f), 20.0f, 0.0f, 2);
                                        aiv aivVarC = g75.c(ht.a.e, false);
                                        int iHashCode = Long.hashCode(aVar4.m());
                                        ne00 ne00VarO = aVar4.o();
                                        d dVarC = c.c(aVar4, dVarH2);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar4.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar4.D();
                                        if (aVar4.g()) {
                                            aVar4.F(aVar5);
                                        } else {
                                            aVar4.p();
                                        }
                                        hlh0.a(aVar4, aivVarC, yka.a.f);
                                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                                        }
                                        hlh0.a(aVar4, dVarC, yka.a.d);
                                        tyt tytVar4 = tytVar2;
                                        if (tytVar4.c) {
                                            aVar4.N(1662094057);
                                            e0u.a(tytVar4, tytVar3, aVar4, 72);
                                            aVar4.H();
                                            aVar3 = aVar4;
                                        } else {
                                            aVar4.N(1662224598);
                                            String strA = cb40.a(tytVar4.a, new Object[0], aVar4);
                                            imf0 imf0VarL = mla.l(R.style.B1_B, aVar4);
                                            if (tytVar4.equals(tytVar3)) {
                                                i6 = 1662427338;
                                                i7 = R.color.text_type2_primary;
                                            } else {
                                                i6 = 1662547432;
                                                i7 = R.color.text_type1_secondary;
                                            }
                                            aVar3 = aVar4;
                                            lkf0.d(strA, null, m7b.a(aVar4, i6, i7, aVar4), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 1, 0, null, imf0VarL, aVar3, 0, 24576, 113658);
                                            aVar3.H();
                                        }
                                        aVar3.s();
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 12582912, 120);
                            i4 = i5;
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 819661824, 260);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zzt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e0u.b(dVar, m3f0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
