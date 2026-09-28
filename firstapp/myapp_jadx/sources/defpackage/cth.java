package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.firebase.FirebaseUseCase$getAvailableTopics$4", f = "FirebaseUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cth extends tje0 implements Function2<lk50<? extends List<? extends xsh>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ qoh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cth(qoh qohVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = qohVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cth cthVar = new cth(this.b, v1bVar);
        cthVar.a = obj;
        return cthVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends xsh>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((cth) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
