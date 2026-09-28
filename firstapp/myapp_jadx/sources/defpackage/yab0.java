package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$showFbgAlreadyAppliedToast$1$1", f = "SpinMatchFragment.kt", l = {3201}, m = "invokeSuspend", v = 1)
public final class yab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yab0(kab0 kab0Var, v1b<? super yab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yab0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fo80 fo80Var = this.b.c;
        if (fo80Var != null) {
            fo80Var.A.setVisibility(8);
        }
        return Unit.a;
    }
}
