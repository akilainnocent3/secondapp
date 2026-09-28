package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$dismissNewFeatureFilterPopup$1", f = "RealBetHistoryViewModel.kt", l = {562}, m = "invokeSuspend", v = 2)
public final class i740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.b = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i740(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        d740 d740Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = d740Var.d;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (m2lVar.a.putBoolean("key_new_feature_popup_filter", bool, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = d740Var.N;
        Boolean bool2 = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool2);
        return Unit.a;
    }
}
