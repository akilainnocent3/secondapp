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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oo1 {
    public static final void a(final so1 so1Var, final boolean z, d dVar, a aVar, final int i, final int i2) {
        so1Var.getClass();
        b bVarI = aVar.i(1430431917);
        int i3 = (bVarI.M(so1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                dVar = d.a.b;
            }
            if (so1Var instanceof so1.a) {
                bVarI.N(255542187);
                b(j.e(dVar, 1.0f), (so1.a) so1Var, bVarI, (i3 << 3) & 112);
                bVarI.X(false);
            } else if (so1Var instanceof so1.b) {
                bVarI.N(-668006141);
                c(j.e(dVar, 1.0f), pp8.b(-1118794264, new Function2() { // from class: ho1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarE = j.e(d.a.b, 1.0f);
                            i060 i060Var = j060.a;
                            d dVarA = ls7.a(dVarE, i060Var);
                            if (z) {
                                dVarA = d35.a(dVarA, 1.0f, j58.f, i060Var);
                            }
                            mw90.b(((so1.b) so1Var).a, "avatar", dVarA, erz.a(R.drawable.default_avatar, 0, aVar2), erz.a(R.drawable.default_avatar, 0, aVar2), null, null, null, d0b.a.b, 0.0f, null, aVar2, 48, 6, 31712);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
                bVarI.X(false);
            } else {
                if (!so1Var.equals(so1.c.a)) {
                    throw igf0.a(bVarI, 255542256, false);
                }
                bVarI.N(-667137893);
                c(j.e(dVar, 1.0f), pp8.b(-1759880407, new Function2() { // from class: io1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarE = j.e(d.a.b, 1.0f);
                            i060 i060Var = j060.a;
                            d dVarA = ls7.a(dVarE, i060Var);
                            if (z) {
                                dVarA = d35.a(dVarA, 1.0f, j58.f, i060Var);
                            }
                            h9n.a(pib0.a(R.drawable.ic__me_account, 0, aVar2), "avatar", dVarA, null, d0b.a.b, 0.0f, null, aVar2, 24624, 104);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jo1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oo1.a(so1Var, z, dVar2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final so1.a aVar, a aVar2, final int i) {
        int i2;
        final d dVar2;
        b bVarI = aVar2.i(734897491);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(aVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            q75.a(dVar2, ht.a.e, false, pp8.b(-248667223, new gaj() { // from class: ko1
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(r75Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d() / r75Var.e();
                        to1 to1Var = to1.a;
                        float fE = fD > 0.9231213f ? r75Var.e() / 69.33f : r75Var.d() / 64.0f;
                        long jA = fD > 0.9231213f ? jc1.a(64.0f * fE, r75Var.e()) : jc1.a(r75Var.d(), 69.33f * fE);
                        float f = 2.0f * fE;
                        so1.a aVar4 = aVar;
                        String str = aVar4.a;
                        String str2 = aVar4.b;
                        d.a aVar5 = d.a.b;
                        d dVarS = j.s(jA, aVar5);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarS);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar6);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        mw90.b(str, "avatar", ls7.a(j.g(h.f(androidx.compose.foundation.layout.d.a.b(aVar5, ht.a.b), f), 1.0f), j060.a), erz.a(R.drawable.default_avatar, 0, aVar3), erz.a(R.drawable.default_avatar, 0, aVar3), null, null, null, d0b.a.d, 0.0f, null, aVar3, 48, 6, 31712);
                        mw90.a(str2, "frame", j.e(aVar5, 1.0f), null, null, d0b.a.b, null, aVar3, 1573296, 1976);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 3120, 4);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lo1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    oo1.b(dVar2, aVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, op8 op8Var, a aVar, int i) {
        d dVar2;
        b bVarI = aVar.i(-1497300075);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            q75.a(dVar2, ht.a.e, false, pp8.b(1871679083, new mo1(op8Var, i3), bVarI), bVarI, (i2 & 14) | 3120, 4);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new no1(dVar2, op8Var, i, 0);
        }
    }
}
