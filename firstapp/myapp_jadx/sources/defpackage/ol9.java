package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ol9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarG = j.g(aVar2, 1.0f);
                    d160 d160VarA = b160.a(kw0.e, ht.a.k, aVar, 54);
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
                    hlh0.a(aVar, d160VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    h6n.b(erz.a(R.drawable.ic_add, 0, aVar), null, j.r(aVar2, 18.0f), c68.a(R.color.brand_quinary, aVar), aVar, 432, 0);
                    ty0.a(aVar, j.w(aVar2, 10.0f));
                    lkf0.d(cb40.a(R.string.gift__redeem_your_gift_code, new Object[0], aVar), null, c68.a(R.color.brand_quinary, aVar), null, mla.m(12.0f, aVar), null, t9i.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar, 1572864, 0, 262058);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                jmh0 jmh0Var = (jmh0) obj2;
                jmh0Var.getClass();
                String str = jmh0Var.a;
                String str2 = StringsKt.U(str) ? null : str;
                return str2 == null ? hce0.a(iIntValue2, "index_") : str2;
        }
    }
}
