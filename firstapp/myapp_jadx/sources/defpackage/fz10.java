package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$handleWalletData$2", f = "PocketRocketFragment.kt", l = {1773}, m = "invokeSuspend", v = 1)
public final class fz10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zy10 b;
    public final /* synthetic */ zp40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz10(zy10 zy10Var, zp40 zp40Var, v1b<? super fz10> v1bVar) {
        super(2, v1bVar);
        this.b = zy10Var;
        this.c = zp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fz10(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fz10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zy10 zy10Var = this.b;
            zt50 zt50Var = zy10Var.b;
            TextView textView = zt50Var != null ? zt50Var.A : null;
            double dAbs = Math.abs(this.c.a);
            this.a = 1;
            if (zy10Var.D0(textView, dAbs, "up", this) == y5bVar) {
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
