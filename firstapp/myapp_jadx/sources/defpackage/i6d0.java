package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyViewModel$observeSessionDataStatusFlow$4", f = "SportyPenaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i6d0 extends tje0 implements Function2<i1d0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6d0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i6d0 i6d0Var = new i6d0(v1bVar, this.b);
        i6d0Var.a = obj;
        return i6d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(i1d0 i1d0Var, v1b<? super Unit> v1bVar) {
        return ((i6d0) create(i1d0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        i1d0 i1d0Var = (i1d0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        d dVar = this.b;
        dVar.A1();
        jpk jpkVar = dVar.e;
        jpkVar.R0(i1d0Var.a.d);
        jpkVar.T0(i1d0Var.a.b);
        return Unit.a;
    }
}
