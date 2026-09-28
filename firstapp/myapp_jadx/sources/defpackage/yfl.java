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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yfl {
    public static final void a(final q2i0 q2i0Var, a aVar, final int i) {
        d6f0 d6f0Var = q2i0Var.a;
        b bVarI = aVar.i(-1886425585);
        int i2 = i | (bVarI.M(q2i0Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            kw0.i iVar = new kw0.i(12.0f, true, new hw0());
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var = f160.a;
            d dVarA = f160Var.a(1.0f, aVar2, true);
            kw0.j jVar = kw0.a;
            d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            b(f160Var.a(1.0f, aVar2, true), c68.a(R.color.brand_secondary_variable_type3, bVarI), bVarI, 0);
            d dVarR = j.r(h.j(aVar2, 2.0f, 0.0f, 6.0f, 0.0f, 10), 28.0f);
            d6f0 d6f0Var2 = q2i0Var.b;
            mw90.b(d6f0Var.b, "Home team logo", dVarR, erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            lkf0.d(d6f0Var.a, null, c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 131066);
            bVarI.X(true);
            c(0, bVarI);
            d dVarA2 = f160Var.a(1.0f, aVar2, true);
            d160 d160VarA3 = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(d6f0Var2.a, null, c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            mw90.b(d6f0Var2.b, "Away team logo", j.r(h.j(aVar2, 6.0f, 0.0f, 2.0f, 0.0f, 10), 28.0f), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), erz.a(R.drawable.ic_default_team_logo_home, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new wfl();
                bVarI.r(objY);
            }
            b(f160Var.a(1.0f, androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY), true), c68.a(R.color.brand_primary, bVarI), bVarI, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: xfl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yfl.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final long j, a aVar, final int i) {
        b bVarI = aVar.i(-500903303);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.e(j) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarI = j.i(dVar, 10.0f);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: ufl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        j90VarA.a(0.0f, 0.0f);
                        j90VarA.c(fIntBitsToFloat, 0.0f);
                        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                        j90VarA.c(tcfVar.C1(8.0f), fIntBitsToFloat2);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarI, (Function1) objY, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, i) { // from class: vfl
                public final /* synthetic */ long b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yfl.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(497861546);
        if (bVarI.q(i & 1, i != 0)) {
            d dVarB = androidx.compose.foundation.a.b(ls7.a(j.r(d.a.b, 28.0f), j060.a), c68.a(R.color.line_type2_secondary, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.bet_history__vs, new Object[0], bVarI);
            imf0 imf0VarL = mla.l(R.style.H3_B, bVarI);
            olf0 olf0VarA = plf0.a(bVarI);
            boolean zM = bVarI.M(strA);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = olf0.a(olf0VarA, strA, imf0VarL, 0L, 1020);
                bVarI.r(objY);
            }
            ukf0 ukf0Var = (ukf0) objY;
            float fMax = Math.max(mla.f((int) (ukf0Var.c >> 32), bVarI), mla.f((int) (ukf0Var.c & 4294967295L), bVarI));
            long jA = c68.a(R.color.text_type2_secondary, bVarI);
            if (Float.compare(fMax, 28.0f) < 0) {
                bVarI.N(-2068493956);
            } else {
                bVarI.N(-2068434002);
                imf0VarL = mla.l(R.style.C1_R, bVarI);
            }
            bVarI.X(false);
            lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, 0, 0, 131066);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new tfl();
        }
    }
}
