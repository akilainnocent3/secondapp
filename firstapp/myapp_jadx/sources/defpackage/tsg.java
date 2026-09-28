package defpackage;

import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$updateEventFromSocket$1", f = "EventViewModel.kt", l = {565}, m = "invokeSuspend", v = 2)
public final class tsg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsg(v1b v1bVar, e eVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tsg(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tsg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            e eVar = this.b;
            csg csgVar = eVar.e;
            Event eventF1 = eVar.F1();
            int i2 = eVar.P;
            this.a = 1;
            if (csgVar.b(eventF1, i2, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        return Unit.a;
    }
}
