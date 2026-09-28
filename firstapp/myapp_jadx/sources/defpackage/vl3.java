package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$5$1", f = "BetslipButtonOverlay.kt", l = {213}, m = "invokeSuspend", v = 2)
public final class vl3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gm3 b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl3(gm3 gm3Var, ytw<Boolean> ytwVar, v1b<? super vl3> v1bVar) {
        super(2, v1bVar);
        this.b = gm3Var;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vl3(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vl3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (((Integer) ((x5a0) this.b.f).getValue()) != null) {
                ytwVar.setValue(Boolean.TRUE);
                this.a = 1;
                if (hkd.b(250L, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ytwVar.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
