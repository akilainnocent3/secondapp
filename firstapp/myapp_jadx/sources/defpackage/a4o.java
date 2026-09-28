package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSingleBetHandlerImpl$init$3", f = "InstantRacingSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a4o extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b4o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4o(b4o b4oVar, v1b<? super a4o> v1bVar) {
        super(2, v1bVar);
        this.b = b4oVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a4o a4oVar = new a4o(this.b, v1bVar);
        a4oVar.a = obj;
        return a4oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((a4o) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        x3o x3oVar;
        BigDecimal bigDecimalG2;
        Object value;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b4o b4oVar = this.b;
        wwd0 wwd0Var = b4oVar.d;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null && (x3oVar = (x3o) CollectionsKt.p0((List) wwd0Var.getValue())) != null && (bigDecimalG2 = b.g(x3oVar.b)) != null && bigDecimalG.compareTo(bigDecimalG2) > 0) {
            String string = bigDecimalG.toString();
            string.getClass();
            wwd0 wwd0Var2 = b4oVar.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, string));
            wwd0Var.setValue(a.c(x3o.c(x3oVar, string)));
        }
        return Unit.a;
    }
}
