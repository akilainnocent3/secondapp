package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.event.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d.a aVar;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                i91 i91Var = (i91) obj3;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d.a aVar3 = d.a.b;
                    d dVarC = c.c(aVar2, aVar3);
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
                    hlh0.a(aVar2, d160VarA, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    String str = i91Var.j;
                    if (str == null || str.length() <= 0) {
                        aVar = aVar3;
                        aVar2.N(1900630229);
                        h6n.b(erz.a(R.drawable.ic_sport_default, 0, aVar2), null, j.r(aVar, 16.0f), c68.a(R.color.icon_primary, aVar2), aVar2, 432, 0);
                        aVar2.H();
                    } else {
                        aVar2.N(1900117861);
                        aVar = aVar3;
                        mw90.b(i91Var.j, null, j.r(aVar3, 16.0f), null, erz.a(R.drawable.ic_sport_default, 0, aVar2), null, null, null, d0b.a.b, 0.0f, new gf4(c68.a(R.color.icon_primary, aVar2), 5), aVar2, 432, 6, 27624);
                        aVar2 = aVar2;
                        aVar2.H();
                    }
                    ty0.a(aVar2, j.w(aVar, 2.0f));
                    a aVar5 = aVar2;
                    lkf0.d(i91Var.i, null, c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar5, 0, 0, 131066);
                    aVar5.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                i iVar = (i) obj3;
                a aVar6 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-425441427, new z3f(iVar), aVar6), aVar6, 196608);
                } else {
                    aVar6.G();
                }
                return Unit.a;
        }
    }
}
