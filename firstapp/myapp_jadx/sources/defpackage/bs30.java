package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$markRemixBetRedDotDismissed$1", f = "RSportTicketDetailsViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class bs30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ds30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs30(ds30 ds30Var, v1b<? super bs30> v1bVar) {
        super(2, v1bVar);
        this.b = ds30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bs30(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bs30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ds30 ds30Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            h450 h450Var = ds30Var.f;
            this.a = 1;
            d450 d450Var = h450Var.a;
            if (d450Var.c.a(d450Var, d450.e[1]).g(this, Boolean.TRUE) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ds30Var.B.m(Boolean.FALSE);
        return Unit.a;
    }
}
