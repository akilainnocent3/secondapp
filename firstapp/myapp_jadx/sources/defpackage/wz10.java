package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$showNetworkErrorToast$1", f = "PocketRocketFragment.kt", l = {6068}, m = "invokeSuspend", v = 1)
public final class wz10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zy10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz10(zy10 zy10Var, v1b<? super wz10> v1bVar) {
        super(2, v1bVar);
        this.b = zy10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wz10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wz10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(6000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        zt50 zt50Var = this.b.b;
        if (zt50Var != null) {
            zt50Var.O.setVisibility(8);
        }
        return Unit.a;
    }
}
