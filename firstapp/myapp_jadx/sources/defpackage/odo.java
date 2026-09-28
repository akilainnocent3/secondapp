package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$checkIvOneCutReleased$1", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class odo extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odo(wdo wdoVar, v1b<? super odo> v1bVar) {
        super(2, v1bVar);
        this.b = wdoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        odo odoVar = new odo(this.b, v1bVar);
        odoVar.a = obj;
        return odoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((odo) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            return Unit.a;
        }
        Boolean bool = (Boolean) ((lk50.c) lk50Var).a;
        if (bool != null) {
            wwd0 wwd0Var = this.b.A;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
        }
        return Unit.a;
    }
}
