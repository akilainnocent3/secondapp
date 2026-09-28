package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$7", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x970 extends tje0 implements Function2<m780, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ aa70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x970(aa70 aa70Var, v1b<? super x970> v1bVar) {
        super(2, v1bVar);
        this.b = aa70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x970 x970Var = new x970(this.b, v1bVar);
        x970Var.a = obj;
        return x970Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m780 m780Var, v1b<? super Unit> v1bVar) {
        return ((x970) create(m780Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        BigDecimal bigDecimalG;
        BigDecimal bigDecimalG2;
        Object value;
        Object value2;
        m780 m780Var = (m780) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aa70 aa70Var = this.b;
        wwd0 wwd0Var = aa70Var.f;
        if (m780Var != null && (str = m780Var.a) != null && (bigDecimalG = b.g(str)) != null) {
            nmw nmwVar = (nmw) wwd0Var.getValue();
            if (!nmwVar.e && (bigDecimalG2 = b.g(nmwVar.b)) != null && bigDecimalG.compareTo(bigDecimalG2) > 0) {
                String string = bigDecimalG.toString();
                string.getClass();
                wwd0 wwd0Var2 = aa70Var.h;
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, string));
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, nmw.a((nmw) value2, string)));
            }
        }
        return Unit.a;
    }
}
