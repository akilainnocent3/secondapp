package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ubi implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ubi(String str, hdi hdiVar, int i) {
        this.b = str;
        this.c = hdiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eci.d(this.b, (hdi) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarH = h.h(aVar2, 32.0f, 0.0f, 2);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarH);
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
                    lkf0.d(this.b, h.j(j.g(aVar2, 1.0f), 0.0f, 30.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B1_B, aVar), 0L, 0L, null, null, null, 0L, null, null, null, 0, mla.m(23.0f, aVar), null, null, 16646143), aVar, 48, 0, 131064);
                    String upperCase = cb40.a(R.string.common_functions__ok, new Object[0], aVar).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    lkf0.d(upperCase, h.f(g3w.f(new HorizontalAlignElement(ht.a.o), true, function0), 10.0f), c68.a(R.color.brand_secondary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, aVar), aVar, 0, 0, 130040);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ubi(String str, Function0 function0) {
        this.b = str;
        this.c = function0;
    }
}
