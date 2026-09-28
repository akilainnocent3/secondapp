package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qqt {
    public static final void a(d dVar, final String str, final gc3 gc3Var, final Function0 function0, a aVar, final int i) {
        final d dVar2;
        str.getClass();
        b bVarI = aVar.i(-600786730);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.A(gc3Var) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            ont ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/loyalty_progress_hint_animation_6003754d66.json"), bVarI, 6);
            final fmt fmtVarA = bf0.a(ontVarC.getValue(), true, false, 0.0f, 1, bVarI, 952);
            float fFloatValue = fmtVarA.getValue().floatValue() <= 0.2f ? fmtVarA.getValue().floatValue() / 0.2f : 1.0f;
            float fFloatValue2 = fmtVarA.getValue().floatValue() > 0.84f ? 1.0f - ((fmtVarA.getValue().floatValue() - 0.84f) / 0.16000003f) : 1.0f;
            Float fValueOf = Float.valueOf(fmtVarA.getValue().floatValue());
            boolean zM = ((i2 & 7168) == 2048) | bVarI.M(fmtVarA);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new pqt(function0, fmtVarA, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, fValueOf, (Function2) objY);
            d.a aVar2 = d.a.b;
            d dVarD = androidx.compose.foundation.d.d(aVar2, false, null, null, gc3Var, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            xmt value = ontVarC.getValue();
            boolean zM2 = bVarI.M(fmtVarA);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: mqt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(fmtVarA.getValue().floatValue());
                    }
                };
                bVarI.r(objY2);
            }
            final float f = fFloatValue2;
            final float f2 = fFloatValue;
            mmt.b(value, (Function0) objY2, null, false, false, false, false, v750.c, false, null, null, null, false, false, null, null, false, bVarI, 12582912, 0, 130940);
            d dVarC2 = g.c(androidx.compose.foundation.layout.d.a.b(j.t(aVar2, 40.0f, 36.0f), ht.a.f), -6.0f, -4.0f);
            boolean zC = bVarI.c(f2) | bVarI.c(f);
            Object objY3 = bVarI.y();
            if (zC || objY3 == c0042a) {
                objY3 = new Function1() { // from class: nqt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        float f3 = f2;
                        a7lVar.k(f3);
                        a7lVar.v(f3);
                        a7lVar.b(f);
                        a7lVar.z0(n09.a(1.0f, 0.5f));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            mw90.a(str, "Loyalty Tier", androidx.compose.ui.graphics.a.a(dVarC2, (Function1) objY3), null, null, null, null, bVarI, ((i2 >> 3) & 14) | 48, 2040);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, gc3Var, function0, i) { // from class: oqt
                public final /* synthetic */ String b;
                public final /* synthetic */ gc3 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qqt.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
