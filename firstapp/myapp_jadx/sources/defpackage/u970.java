package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$2", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u970 extends tje0 implements Function2<nmw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ aa70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u970(aa70 aa70Var, v1b<? super u970> v1bVar) {
        super(2, v1bVar);
        this.b = aa70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u970 u970Var = new u970(this.b, v1bVar);
        u970Var.a = obj;
        return u970Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(nmw nmwVar, v1b<? super Unit> v1bVar) {
        return ((u970) create(nmwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        nmw nmwVar = (nmw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aa70 aa70Var = this.b;
        String strJ = aa70Var.b.j();
        strJ.getClass();
        if (!nmwVar.d) {
            wwd0 wwd0Var = aa70Var.h;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strJ));
        }
        jpk jpkVar = aa70Var.c;
        String str = aa70Var.e;
        m780 m780VarT0 = jpkVar.t0(str);
        if (m780VarT0 != null) {
            if (nmwVar.f) {
                BigDecimal bigDecimalG = b.g(nmwVar.b);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(m780VarT0.b.getLeastOrderAmount());
                bigDecimalValueOf.getClass();
                BigDecimal bigDecimalA = s5y.a(bigDecimalValueOf);
                boolean z = bigDecimalA.compareTo(BigDecimal.ZERO) == 1;
                boolean z2 = bigDecimalG == null || bigDecimalG.compareTo(bigDecimalA) < 0;
                if (z && z2) {
                    jpkVar.E(str);
                }
            } else {
                jpkVar.E(str);
            }
        }
        return Unit.a;
    }
}
