package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchEventMeta$1", f = "EventUseCase.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class trg extends tje0 implements Function2<aqg, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trg(csg csgVar, v1b<? super trg> v1bVar) {
        super(2, v1bVar);
        this.c = csgVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        trg trgVar = new trg(this.c, v1bVar);
        trgVar.b = obj;
        return trgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(aqg aqgVar, v1b<? super Unit> v1bVar) {
        return ((trg) create(aqgVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aqg aqgVar = (aqg) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.i;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(aqgVar);
            if (Unit.a == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
