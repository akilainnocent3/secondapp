package defpackage;

import com.sportybet.android.instantwin.presentation.legends.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$observeSelectionCountSnapshotFlow$1", f = "SportyLegendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mqc0 extends tje0 implements Function2<d880, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqc0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mqc0 mqc0Var = new mqc0(v1bVar, this.b);
        mqc0Var.a = obj;
        return mqc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d880 d880Var, v1b<? super Unit> v1bVar) {
        return ((mqc0) create(d880Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        d880 d880Var = (d880) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.T;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new hm3(d880Var.b)));
        return Unit.a;
    }
}
