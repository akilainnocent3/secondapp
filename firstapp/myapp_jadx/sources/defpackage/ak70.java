package defpackage;

import java.math.BigDecimal;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSingleBetHandlerImpl$init$7", f = "ScheduledFootballSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ak70 extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bk70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak70(bk70 bk70Var, v1b<? super ak70> v1bVar) {
        super(2, v1bVar);
        this.b = bk70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ak70 ak70Var = new ak70(this.b, v1bVar);
        ak70Var.a = obj;
        return ak70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((ak70) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        Map.Entry entry;
        Object value;
        Object value2;
        ft90 ft90Var;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bk70 bk70Var = this.b;
        wwd0 wwd0Var = bk70Var.e;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null && (entry = (Map.Entry) CollectionsKt.o0(((ft90) wwd0Var.getValue()).b.entrySet())) != null) {
            String str2 = (String) entry.getKey();
            BigDecimal bigDecimalG2 = b.g((String) entry.getValue());
            if (bigDecimalG2 != null && bigDecimalG.compareTo(bigDecimalG2) > 0) {
                String string = bigDecimalG.toString();
                string.getClass();
                wwd0 wwd0Var2 = bk70Var.g;
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, string));
                do {
                    value2 = wwd0Var.getValue();
                    ft90Var = (ft90) value2;
                } while (!wwd0Var.g(value2, ft90.a(ft90Var, kpu.i(ft90Var.b, new Pair(str2, string)))));
            }
        }
        return Unit.a;
    }
}
