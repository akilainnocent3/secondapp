package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$observeWalletInfo$1$2", f = "PingPongFragment.kt", l = {3009}, m = "invokeSuspend", v = 1)
public final class b510 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m410 b;
    public final /* synthetic */ zp40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b510(m410 m410Var, zp40 zp40Var, v1b<? super b510> v1bVar) {
        super(2, v1bVar);
        this.b = m410Var;
        this.c = zp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b510(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b510) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m410 m410Var = this.b;
            ixi ixiVar = (ixi) m410Var.b;
            TextView textView = ixiVar != null ? ixiVar.f : null;
            double dAbs = Math.abs(this.c.a);
            this.a = 1;
            if (m410Var.r0(textView, dAbs, "up", this) == y5bVar) {
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
