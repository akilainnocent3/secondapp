package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballQuickBetHandlerImpl$init$1", f = "ScheduledFootballQuickBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mf70 extends tje0 implements Function2<List<? extends bi70>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ff70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf70(v1b v1bVar, ff70 ff70Var) {
        super(2, v1bVar);
        this.b = ff70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mf70 mf70Var = new mf70(v1bVar, this.b);
        mf70Var.a = obj;
        return mf70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends bi70> list, v1b<? super Unit> v1bVar) {
        return ((mf70) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ff70.a aVar;
        Object value2;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ff70 ff70Var = this.b;
        wwd0 wwd0Var = ff70Var.i;
        do {
            value = wwd0Var.getValue();
            aVar = (ff70.a) value;
            if (list.isEmpty()) {
                aVar = ff70.a.b;
            } else if (aVar != ff70.a.c) {
                aVar = ff70.a.a;
            }
        } while (!wwd0Var.g(value, aVar));
        if (list.isEmpty()) {
            wwd0 wwd0Var2 = ff70Var.h;
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, null));
        }
        return Unit.a;
    }
}
