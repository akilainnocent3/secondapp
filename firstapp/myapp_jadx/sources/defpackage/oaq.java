package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetViewModel$betError$1", f = "LNFeatureMatchQuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class oaq extends tje0 implements gaj<String, rkd0, v1b<? super qrd0>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ BigDecimal b;
    public final /* synthetic */ uaq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaq(uaq uaqVar, v1b<? super oaq> v1bVar) {
        super(3, v1bVar);
        this.c = uaqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(String str, rkd0 rkd0Var, v1b<? super qrd0> v1bVar) {
        BigDecimal bigDecimal = rkd0Var.a;
        oaq oaqVar = new oaq(this.c, v1bVar);
        oaqVar.a = str;
        oaqVar.b = bigDecimal;
        return oaqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        BigDecimal bigDecimal = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimalX1 = uaq.x1(str);
        uaq uaqVar = this.c;
        BigDecimal bigDecimal2 = uaqVar.y;
        BigDecimal bigDecimal3 = uaqVar.z;
        String str2 = uaqVar.B;
        bigDecimalX1.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal.getClass();
        str2.getClass();
        if (bigDecimalX1.compareTo(bigDecimal2) < 0) {
            return new qrd0.b(bigDecimal2, str2);
        }
        if (bigDecimalX1.compareTo(bigDecimal3) > 0) {
            return new qrd0.c(bigDecimal3, str2);
        }
        if (bigDecimalX1.compareTo(bigDecimal) > 0) {
            return new qrd0.a(str2, bigDecimalX1, bigDecimal);
        }
        return null;
    }
}
