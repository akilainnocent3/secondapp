package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zpd0 {
    public static final void a(final String str, final double d, final long j, final long j2, a aVar, final int i) {
        str.getClass();
        b bVarI = aVar.i(-1489465511);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.f(d) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.e(j2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final twd0 twd0VarB = xe0.b((float) d, yi0.e(500, 0, null, 6), null, null, bVarI, 48, 28);
            kod0 kod0Var = new kod0(130.0f, 108.0f, 28.0f, 102.0f, (int) (j >> 32), (int) (j & 4294967295L), (int) (j2 >> 32), (int) (4294967295L & j2), 768);
            if ((str.length() > 0 ? str : null) == null) {
                bVarI.N(-1358988848);
            } else {
                bVarI.N(-1358988847);
                mez.a(kod0Var, pp8.b(-1891403108, new iaj() { // from class: xpd0
                    @Override // defpackage.iaj
                    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i3;
                        g7f g7fVar = (g7f) obj;
                        g7f g7fVar2 = (g7f) obj2;
                        a aVar2 = (a) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if ((iIntValue & 6) == 0) {
                            i3 = (aVar2.c(g7fVar.a) ? 4 : 2) | iIntValue;
                        } else {
                            i3 = iIntValue;
                        }
                        if ((iIntValue & 48) == 0) {
                            i3 |= aVar2.c(g7fVar2.a) ? 32 : 16;
                        }
                        if (aVar2.q(i3 & 1, (i3 & 147) != 146)) {
                            float f = g7fVar.a;
                            float f2 = g7fVar2.a;
                            d.a aVar3 = d.a.b;
                            d dVarT = j.t(aVar3, f, f2);
                            aiv aivVarC = g75.c(ht.a.e, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarT);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, aVar3);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, d160VarA, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            long j3 = j58.f;
                            lkf0.b(str, null, j3, i7f.b(10.0f, aVar2), null, t9i.f, null, 0L, null, i7f.b(10.0f, aVar2), 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, new ix80(j3, 2, 0L, 20.0f), 0, 0L, null, null, 16769023), aVar2, 196992, 1572864, 64466);
                            ty0.a(aVar2, j.w(aVar3, 4.0f));
                            lkf0.b(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((Number) twd0VarB.getValue()).floatValue())}, 1)), null, j3, i7f.b(12.0f, aVar2), null, t9i.v, d1a.a(d9i.a(uld0.i0.h0, aVar2)), 0L, null, 0L, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, new ix80(j3, 2, 0L, 20.0f), 0, 0L, null, null, 16769023), aVar2, 196992, 1572864, 65426);
                            aVar2.s();
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, d, j, j2, i) { // from class: ypd0
                public final /* synthetic */ String a;
                public final /* synthetic */ double b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zpd0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
