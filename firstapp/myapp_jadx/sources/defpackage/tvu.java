package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$fetchIsMatchAlertAvailable$1", f = "MatchAlertViewModel.kt", l = {112}, m = "invokeSuspend", v = 2)
public final class tvu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ rvu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvu(rvu rvuVar, v1b<? super tvu> v1bVar) {
        super(2, v1bVar);
        this.c = rvuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tvu(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tvu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            rvu rvuVar = this.c;
            boolean zG = Intrinsics.g(rvuVar.d, "sr:sport:1");
            wwd0 wwd0Var2 = rvuVar.z;
            if (!zG) {
                Boolean bool = Boolean.FALSE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
                return Unit.a;
            }
            muu muuVar = rvuVar.b;
            this.a = wwd0Var2;
            this.b = 1;
            obj = muuVar.e(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(obj);
        return Unit.a;
    }
}
