package defpackage;

import java.math.BigDecimal;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSingleBetHandlerImpl$init$2", f = "ScheduledFootballSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wj70 extends tje0 implements Function2<ft90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bk70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj70(bk70 bk70Var, v1b<? super wj70> v1bVar) {
        super(2, v1bVar);
        this.b = bk70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wj70 wj70Var = new wj70(this.b, v1bVar);
        wj70Var.a = obj;
        return wj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ft90 ft90Var, v1b<? super Unit> v1bVar) {
        return ((wj70) create(ft90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ft90 ft90Var = (ft90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bk70 bk70Var = this.b;
        wwd0 wwd0Var = bk70Var.g;
        String strJ = bk70Var.b.j();
        strJ.getClass();
        boolean z = ft90Var.c;
        Map<String, String> map = ft90Var.b;
        if (!z) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, strJ));
        }
        boolean z2 = true;
        if (CollectionsKt.N(map.values()).size() > 1) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ""));
        }
        jpk jpkVar = bk70Var.c;
        String str = bk70Var.d;
        m780 m780VarT0 = jpkVar.t0(str);
        if (m780VarT0 != null) {
            String str2 = (String) CollectionsKt.o0(map.values());
            if (str2 != null) {
                BigDecimal bigDecimalG = b.g(str2);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(m780VarT0.b.getLeastOrderAmount());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                boolean z3 = bigDecimalA.compareTo(BigDecimal.ZERO) == 1;
                if (bigDecimalG != null && bigDecimalG.compareTo(bigDecimalA) >= 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    jpkVar.E(str);
                }
            } else {
                jpkVar.E(str);
            }
        }
        return Unit.a;
    }
}
