package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.BetDetailViewModel$fetchEditBetInfo$1", f = "BetDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gm2 extends tje0 implements Function2<lk50<? extends wlf>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ im2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(im2 im2Var, v1b<? super gm2> v1bVar) {
        super(2, v1bVar);
        this.b = im2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gm2 gm2Var = new gm2(this.b, v1bVar);
        gm2Var.a = obj;
        return gm2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends wlf> lk50Var, v1b<? super Unit> v1bVar) {
        return ((gm2) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<wlf> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.f.m(lk50Var);
        return Unit.a;
    }
}
