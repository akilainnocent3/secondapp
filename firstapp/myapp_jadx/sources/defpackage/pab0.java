package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment$observeLiveData$8$3", f = "SpinMatchFragment.kt", l = {1560}, m = "invokeSuspend", v = 1)
public final class pab0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kab0 b;
    public final /* synthetic */ zp40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pab0(kab0 kab0Var, zp40 zp40Var, v1b<? super pab0> v1bVar) {
        super(2, v1bVar);
        this.b = kab0Var;
        this.c = zp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pab0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pab0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kab0 kab0Var = this.b;
            fo80 fo80Var = kab0Var.c;
            TextView textView = fo80Var != null ? fo80Var.f : null;
            double dAbs = Math.abs(this.c.a);
            this.a = 1;
            if (kab0Var.m0(textView, dAbs, "down", this) == y5bVar) {
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
