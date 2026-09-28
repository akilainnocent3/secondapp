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
public final class yta0 {
    public static final void a(final pcb pcbVar, a aVar, final int i) {
        b bVarI = aVar.i(1252498703);
        int i2 = (bVarI.A(pcbVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final long j = fjb0.b(bVarI).N0;
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH = h.h(h.j(androidx.compose.foundation.a.b(ls7.a(j.y(aVar2, 0.0f, 256.0f, 1), j060.c(fjb0.c(bVarI).c)), j, zk40.a), fjb0.d(bVarI).e, 0.0f, fjb0.d(bVarI).d, 0.0f, 10), 0.0f, fjb0.d(bVarI).c, 1);
            d160 d160VarA = b160.a(new kw0.i(fjb0.d(bVarI).e, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(R.string.page_instant_virtual__speed_controller_hint, new Object[0], bVarI), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            h6n.b(erz.a(R.drawable.ic__cancel, 0, bVarI), "Close icon", j.r(h.f(androidx.compose.foundation.d.d(ls7.a(aVar2, j060.a), false, null, null, pcbVar, 15), fjb0.d(bVarI).c), 16.0f), fjb0.b(bVarI).a0, bVarI, 48, 0);
            bVarI.X(true);
            d dVarT = j.t(h.j(aVar2, fjb0.d(bVarI).e, 0.0f, 0.0f, 0.0f, 14), 16.0f, 12.0f);
            boolean zE = bVarI.e(j);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                objY = new Function1() { // from class: wta0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        j90VarA.c(fIntBitsToFloat, 0.0f);
                        j90VarA.c(fIntBitsToFloat / 2.0f, fIntBitsToFloat2);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarT, (Function1) objY, bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: xta0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    yta0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
