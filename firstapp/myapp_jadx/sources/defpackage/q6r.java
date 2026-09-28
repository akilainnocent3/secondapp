package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q6r implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q6r(c7r c7rVar, Function1 function1, int i) {
        this.b = c7rVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w6r.b((c7r) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                String str = (String) obj4;
                String str2 = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarG = j.g(aVar2, 1.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarG);
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
                    lkf0.d(str, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.brand_secondary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, aVar), aVar, 48, 0, 130040);
                    lkf0.d(str2, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar), 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 48, 0, 127992);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ q6r(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
