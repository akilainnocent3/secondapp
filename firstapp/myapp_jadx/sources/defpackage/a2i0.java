package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.viewmodel.VersionCheckViewModel$refreshVersion$1", f = "VersionCheckViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class a2i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y1i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2i0(y1i0 y1i0Var, v1b<? super a2i0> v1bVar) {
        super(2, v1bVar);
        this.b = y1i0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a2i0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a2i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fhb0 fhb0Var = this.b.a;
            this.a = 1;
            if (fhb0Var.e(false, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
