package defpackage;

import com.sporty.android.core.model.instantwin.BuildAndGoTabConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoHandlerImpl$initHandler$2", f = "BuildAndGoHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class me5 extends tje0 implements Function2<lk50<? extends BuildAndGoTabConfig>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ se5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me5(se5 se5Var, v1b<? super me5> v1bVar) {
        super(2, v1bVar);
        this.b = se5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        me5 me5Var = new me5(this.b, v1bVar);
        me5Var.a = obj;
        return me5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BuildAndGoTabConfig> lk50Var, v1b<? super Unit> v1bVar) {
        return ((me5) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lk50Var));
        return Unit.a;
    }
}
