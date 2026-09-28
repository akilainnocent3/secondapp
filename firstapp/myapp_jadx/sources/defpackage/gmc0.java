package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSingleBetHandlerImpl$init$3", f = "SportyLegendsSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gmc0 extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hmc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc0(hmc0 hmc0Var, v1b<? super gmc0> v1bVar) {
        super(2, v1bVar);
        this.b = hmc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gmc0 gmc0Var = new gmc0(this.b, v1bVar);
        gmc0Var.a = obj;
        return gmc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((gmc0) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        dmc0 dmc0Var;
        BigDecimal bigDecimalG2;
        Object value;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hmc0 hmc0Var = this.b;
        wwd0 wwd0Var = hmc0Var.d;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null && (dmc0Var = (dmc0) CollectionsKt.p0((List) wwd0Var.getValue())) != null && (bigDecimalG2 = b.g(dmc0Var.b)) != null && bigDecimalG.compareTo(bigDecimalG2) > 0) {
            String string = bigDecimalG.toString();
            string.getClass();
            wwd0 wwd0Var2 = hmc0Var.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, string));
            wwd0Var.setValue(a.c(dmc0.c(dmc0Var, string)));
        }
        return Unit.a;
    }
}
