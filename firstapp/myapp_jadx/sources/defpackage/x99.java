package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x99 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(aVar, aVar2);
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
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            String strA = cb40.a(R.string.page_lucky_numbers__no_available_draws, new Object[0], aVar);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) aVar.O(qyd0Var)).d;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, null, ((lib0) aVar.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__no_content_yet_description, new Object[0], aVar), h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((lib0) aVar.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(qyd0Var)).o, aVar, 48, 0, 131064);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
