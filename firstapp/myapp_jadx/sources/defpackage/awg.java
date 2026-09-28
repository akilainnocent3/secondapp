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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class awg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarF = h.f(j.g(aVar, 1.0f), 8.0f);
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar2, 48);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarF);
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
                    hlh0.a(aVar2, d160VarA, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    h9n.a(erz.a(R.drawable.ic_exit_popup_error, 0, aVar2), null, j.r(aVar, 22.0f), null, null, 0.0f, null, aVar2, 432, 120);
                    ty0.a(aVar2, j.w(aVar, 4.0f));
                    lkf0.b(str, null, c68.a(R.color.sb_black, aVar2), d2l.f(18), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar2, 199680, 0, 131026);
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                glc0 glc0Var = (glc0) obj3;
                a aVar4 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    h6n.b(erz.a(glc0Var.a, 0, aVar4), "mute button", j.r(aVar, 28.0f), ((lib0) aVar4.O(oib0.a)).a0, aVar4, 432, 0);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
