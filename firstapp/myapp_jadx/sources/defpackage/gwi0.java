package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gwi0 {
    public static final void a(final mz1 mz1Var, final float f, final boolean z, a aVar, final int i) {
        int i2;
        mz1Var.getClass();
        b bVarI = aVar.i(-761239039);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(mz1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarA = d.a.b;
            d dVarC = j.c(j.g(dVarA, 1.0f), 1.0f);
            if (mz1Var instanceof vq5) {
                dVarA = d35.a(dVarA, 1.0f, ((vq5) mz1Var).k2, j060.c(f * 2.0f));
            }
            d dVarA2 = s3w.a(dVarC.n(dVarA), "betButton_waiting");
            umz umzVar = ek5.a;
            ak5 ak5VarA = ek5.a(mz1Var.d(), 0L, 0L, 0L, bVarI, 14);
            i060 i060VarC = j060.c(f * 2.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new dwi0();
                bVarI.r(objY);
            }
            nk5.a((Function0) objY, dVarA2, false, i060VarC, ak5VarA, null, null, null, null, pp8.b(-188595727, new gaj() { // from class: ewi0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC2 = c.c(aVar2, aVar3);
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
                        hlh0.a(aVar2, i78VarA, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarG = j.g(aVar3, 1.0f);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarA3 = s3w.a(h.h(dVarG.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC3 = c.c(aVar2, dVarA3);
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
                        hlh0.a(aVar2, aivVarC, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC3, cVar);
                        imf0 imf0VarE = ni60.e(((sfd0) aVar2.O(ni60.b)).d);
                        if (z) {
                            imf0VarE = imf0.b(imf0VarE, 0L, 0L, null, new n9i(1), null, 0L, null, null, null, 0, 0L, null, null, 16777207);
                        }
                        wf1.a(op5.c(op5.a, pwo.e(R.string.waiting_for_next_round_cms, aVar2), pwo.e(R.string.waiting_for_next_round_to_start, aVar2)), s3w.a(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.e), "betButton_waiting_text"), imf0VarE, 3, d2l.f(10), null, 3, null, r58.d(4294967295L), aVar2, 100690944, 160);
                        aVar2.s();
                        ty0.a(aVar2, j.i(aVar3, 2.0f));
                        mz1 mz1Var2 = mz1Var;
                        int i3 = ((mz1Var2 instanceof vq5) || (mz1Var2 instanceof wg60)) ? R.drawable.cr_progess_bar : 2131233708;
                        d dVarC4 = j.C(aVar3, null, 3);
                        if (0.3f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        aha.a(i3, 0, aVar2, s3w.a(dVarC4.n(new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true)), "betButton_waiting_circle_progress"));
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805306374, 484);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fwi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gwi0.a(mz1Var, f, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
