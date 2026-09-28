package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$3$1", f = "BetslipButtonOverlay.kt", l = {194}, m = "invokeSuspend", v = 2)
public final class tl3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ gm3 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ wd0<Float, ij0> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl3(float f, gm3 gm3Var, float f2, float f3, wd0<Float, ij0> wd0Var, v1b<? super tl3> v1bVar) {
        super(2, v1bVar);
        this.b = f;
        this.c = gm3Var;
        this.d = f2;
        this.e = f3;
        this.f = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tl3(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tl3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            float fJ = ((t5a0) this.c.k).j() * this.d;
            float f = this.b;
            Float f2 = new Float(f.d(fJ + f, f, this.e));
            this.a = 1;
            if (this.f.f(this, f2) == y5bVar) {
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
