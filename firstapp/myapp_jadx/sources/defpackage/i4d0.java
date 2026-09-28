package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySingleBetHandlerImpl$init$3", f = "SportyPenaltySingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i4d0 extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j4d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4d0(j4d0 j4d0Var, v1b<? super i4d0> v1bVar) {
        super(2, v1bVar);
        this.b = j4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i4d0 i4d0Var = new i4d0(this.b, v1bVar);
        i4d0Var.a = obj;
        return i4d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((i4d0) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        f4d0 f4d0Var;
        BigDecimal bigDecimalG2;
        Object value;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        j4d0 j4d0Var = this.b;
        wwd0 wwd0Var = j4d0Var.d;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null && (f4d0Var = (f4d0) CollectionsKt.p0((List) wwd0Var.getValue())) != null && (bigDecimalG2 = b.g(f4d0Var.b)) != null && bigDecimalG.compareTo(bigDecimalG2) > 0) {
            String string = bigDecimalG.toString();
            string.getClass();
            wwd0 wwd0Var2 = j4d0Var.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, string));
            wwd0Var.setValue(a.c(f4d0.c(f4d0Var, string)));
        }
        return Unit.a;
    }
}
