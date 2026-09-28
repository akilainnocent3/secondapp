package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$initSimulationSettlementHandler$2", f = "SimulationSettlementHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class go90 extends tje0 implements gaj<zta0, vm90, v1b<? super Unit>, Object> {
    public /* synthetic */ zta0 a;
    public /* synthetic */ vm90 b;
    public final /* synthetic */ do90 c;
    public final /* synthetic */ et7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go90(do90 do90Var, et7 et7Var, v1b v1bVar) {
        super(3, v1bVar);
        this.c = do90Var;
        this.d = et7Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(zta0 zta0Var, vm90 vm90Var, v1b<? super Unit> v1bVar) {
        go90 go90Var = new go90(this.c, this.d, v1bVar);
        go90Var.a = zta0Var;
        go90Var.b = vm90Var;
        return go90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        qn90 aVar;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        o2g o2gVar;
        Object value7;
        zta0 zta0Var = this.a;
        vm90 vm90Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(vm90Var instanceof vm90.d)) {
            return null;
        }
        do90 do90Var = this.c;
        wwd0 wwd0Var = do90Var.g;
        do {
            value = wwd0Var.getValue();
            z = zta0Var instanceof zta0.b;
            if (z) {
                aVar = qn90.b.a;
            } else {
                if (!(zta0Var instanceof zta0.a.C1422a) && !(zta0Var instanceof zta0.a.b)) {
                    uhc.a();
                    return null;
                }
                aVar = new qn90.a((zta0.a) zta0Var);
            }
        } while (!wwd0Var.g(value, aVar));
        wwd0 wwd0Var2 = do90Var.h;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, null));
        wwd0 wwd0Var3 = do90Var.i;
        do {
            value3 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value3, m2g.a));
        wwd0 wwd0Var4 = do90Var.o;
        do {
            value4 = wwd0Var4.getValue();
        } while (!wwd0Var4.g(value4, null));
        List<ys90> list = ((vm90.d) vm90Var).a;
        ys90 ys90Var = (ys90) CollectionsKt.firstOrNull(list);
        String str = ys90Var != null ? ys90Var.a : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        wwd0 wwd0Var5 = do90Var.l;
        do {
            value5 = wwd0Var5.getValue();
        } while (!wwd0Var5.g(value5, str2));
        wwd0 wwd0Var6 = do90Var.m;
        do {
            value6 = wwd0Var6.getValue();
            o2gVar = o2g.a;
            o2gVar.getClass();
        } while (!wwd0Var6.g(value6, o2gVar));
        wwd0 wwd0Var7 = do90Var.n;
        do {
            value7 = wwd0Var7.getValue();
        } while (!wwd0Var7.g(value7, wi80.b(str2)));
        zta0.a aVar2 = zta0Var instanceof zta0.a ? (zta0.a) zta0Var : null;
        if (aVar2 != null) {
            jvd0 jvd0Var = do90Var.j;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            do90Var.j = ej5.c(this.d, null, null, new io90(list, do90Var, aVar2, null), 3);
        }
        if (!z) {
            do90Var.b.a(new ki90(0), k00.d);
            y8j.a(do90Var.c, AnalyticsEvent.SIM_CUTSCENE_ANIMATION_PAGE);
        }
        return Unit.a;
    }
}
