package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.HandleUserLeavingLimitsUIUseCase$invoke$1", f = "HandleUserLeavingLimitsUIUseCase.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class pcl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qcl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcl(qcl qclVar, v1b<? super pcl> v1bVar) {
        super(2, v1bVar);
        this.b = qclVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pcl(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pcl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        qcl qclVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            lyh<fwf0> lyhVarK = qclVar.b.a.k();
            this.a = 1;
            obj = s0i.a(lyhVarK, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (((fwf0) obj).a()) {
            qclVar.a.a.e(o7d.a(wae.REACHED_LIMITS));
        }
        return Unit.a;
    }
}
