package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$aboutToPay$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g2r extends tje0 implements iaj<String, rkd0, jfq, v1b<? super rkd0>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ BigDecimal b;
    public /* synthetic */ jfq c;

    @Override // defpackage.iaj
    public final Object d(String str, rkd0 rkd0Var, jfq jfqVar, v1b<? super rkd0> v1bVar) {
        BigDecimal bigDecimal = rkd0Var.a;
        g2r g2rVar = new g2r(4, v1bVar);
        g2rVar.a = str;
        g2rVar.b = bigDecimal;
        g2rVar.c = jfqVar;
        return g2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalB;
        String str = this.a;
        BigDecimal bigDecimal = this.b;
        jfq jfqVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (jfqVar == null || !jfqVar.a) {
            bigDecimalB = ukd0.b(str);
        } else {
            bigDecimalB = ukd0.b(str).subtract(bigDecimal);
            bigDecimalB.getClass();
            rkd0.a aVar = rkd0.Companion;
        }
        return new rkd0(bigDecimalB);
    }
}
