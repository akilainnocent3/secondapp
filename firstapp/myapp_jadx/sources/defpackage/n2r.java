package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$betPanelGiftState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n2r extends tje0 implements iaj<jfq, String, rkd0, v1b<? super g0q>, Object> {
    public /* synthetic */ jfq a;
    public /* synthetic */ String b;
    public /* synthetic */ BigDecimal c;

    @Override // defpackage.iaj
    public final Object d(jfq jfqVar, String str, rkd0 rkd0Var, v1b<? super g0q> v1bVar) {
        BigDecimal bigDecimal = rkd0Var.a;
        n2r n2rVar = new n2r(4, v1bVar);
        n2rVar.a = jfqVar;
        n2rVar.b = str;
        n2rVar.c = bigDecimal;
        return n2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jfq jfqVar = this.a;
        String str = this.b;
        BigDecimal bigDecimal = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (jfqVar == null) {
            return null;
        }
        BigDecimal bigDecimalB = ukd0.b(str);
        rkd0.Companion.getClass();
        return new g0q(bigDecimalB.compareTo(rkd0.b) > 0, jfqVar.a, oxc.a(jfqVar.c.d, " -", ukd0.a(2, bigDecimal, true, true)));
    }
}
