package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ov9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.h, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar, dVarC, cVar);
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 60.0f), c68.a(R.color.bg_brand_sub_highlight_primary, aVar), zk40.a);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar, 54);
            int iHashCode2 = Long.hashCode(aVar.m());
            ne00 ne00VarO2 = aVar.o();
            d dVarC2 = c.c(aVar, dVarB);
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, d160VarA, bVar);
            hlh0.a(aVar, ne00VarO2, dVar);
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
            }
            hlh0.a(aVar, dVarC2, cVar);
            q330.a(j.r(h.j(aVar2, 0.0f, 0.0f, 8.0f, 0.0f, 11), 18.0f), c68.a(R.color.text_inverse_primary, aVar), 2.0f, 0L, 0, 0.0f, aVar, 390, 56);
            lkf0.d(cb40.a(R.string.common_functions__submitting, new Object[0], aVar), null, c68.a(R.color.text_inverse_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar), aVar, 0, 0, 131066);
            aVar.s();
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
