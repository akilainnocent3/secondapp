package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.android.firebase.FirebaseUseCase$getLiveEventFeatureStatus$1", f = "FirebaseUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dth extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ muc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dth(muc mucVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = mucVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dth dthVar = new dth(this.b, v1bVar);
        dthVar.a = obj;
        return dthVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dth) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
