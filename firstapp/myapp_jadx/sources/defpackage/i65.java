package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i65 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ j590 a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ v5b d;
    public final /* synthetic */ boolean e;

    public i65(j590 j590Var, Function2 function2, op8 op8Var, v5b v5bVar, boolean z) {
        this.a = j590Var;
        this.b = function2;
        this.c = op8Var;
        this.d = v5bVar;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarA = androidx.compose.ui.graphics.a.a(j.g(d.a.b, 1.0f), new j55(this.a));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            Function2<a, Integer, Unit> function2 = this.b;
            if (function2 != null) {
                aVar2.N(-1044068159);
                b590.a(54, pp8.b(-511691176, new h65(this.a, this.d, this.e, xae0.a(R.string.m3c_bottom_sheet_expand_description, aVar2), xae0.a(R.string.m3c_bottom_sheet_collapse_description, aVar2), xae0.a(R.string.m3c_bottom_sheet_dismiss_description, aVar2), function2), aVar2), aVar2);
                aVar2.H();
            } else {
                aVar2.N(-1040260677);
                aVar2.H();
            }
            this.c.invoke(l78.a, aVar2, 6);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
