package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Overall;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$fetchOverAllConfig$1", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rdo extends tje0 implements Function2<Overall, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdo(wdo wdoVar, v1b<? super rdo> v1bVar) {
        super(2, v1bVar);
        this.b = wdoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rdo rdoVar = new rdo(this.b, v1bVar);
        rdoVar.a = obj;
        return rdoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Overall overall, v1b<? super Unit> v1bVar) {
        return ((rdo) create(overall, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Overall overall = (Overall) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.w;
        kcz.c cVar = new kcz.c(overall);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
