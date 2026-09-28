package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$5$1", f = "ShowMissionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ka90 extends tje0 implements Function2<krv, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sa90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka90(v1b v1bVar, sa90 sa90Var) {
        super(2, v1bVar);
        this.b = sa90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ka90 ka90Var = new ka90(v1bVar, this.b);
        ka90Var.a = obj;
        return ka90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(krv krvVar, v1b<? super Unit> v1bVar) {
        return ((ka90) create(krvVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        krv krvVar = (krv) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = krvVar instanceof krv.c;
        sa90 sa90Var = this.b;
        if (z) {
            ej5.c(o8i0.d(sa90Var), sa90Var.a, null, new la90(null, sa90Var), 2);
        }
        sa90Var.B.setValue(krvVar);
        return Unit.a;
    }
}
