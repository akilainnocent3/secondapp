package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.BetslipManager$2", f = "BetslipManager.kt", l = {214}, m = "invokeSuspend", v = 2)
public final class vq3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wq3 a;
    public int b;
    public final /* synthetic */ wq3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3Var, v1b<? super vq3> v1bVar) {
        super(2, v1bVar);
        this.c = wq3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vq3(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vq3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wq3 wq3Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            wq3 wq3Var2 = this.c;
            w43 w43Var = wq3Var2.i;
            this.a = wq3Var2;
            this.b = 1;
            Object objA = w43Var.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            wq3Var = wq3Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wq3Var = this.a;
            uj50.b(obj);
        }
        wq3Var.a0 = (BetTypeFlexiBetConfig) obj;
        return Unit.a;
    }
}
