package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$resetCarAndCoeff$1$2", f = "CrashInitiatedFragment.kt", l = {2966}, m = "invokeSuspend", v = 1)
public final class snb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zqy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snb(zqy zqyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zqyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new snb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((snb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        zqy zqyVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            zqyVar.J0();
            this.a = 1;
            if (hkd.b(200L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((x5a0) zqyVar.p0().V).setValue("punch-Looking-up-final");
        return Unit.a;
    }
}
