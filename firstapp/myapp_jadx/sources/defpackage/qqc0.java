package defpackage;

import com.sportybet.android.instantwin.presentation.legends.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$observeSessionDataStatusFlow$2", f = "SportyLegendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qqc0 extends tje0 implements Function2<zs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqc0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qqc0 qqc0Var = new qqc0(v1bVar, this.b);
        qqc0Var.a = obj;
        return qqc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zs zsVar, v1b<? super Unit> v1bVar) {
        return ((qqc0) create(zsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        zs zsVar = (zs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.Y;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zsVar));
        return Unit.a;
    }
}
