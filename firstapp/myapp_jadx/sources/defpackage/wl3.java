package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$6$1", f = "BetslipButtonOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wl3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ gm3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl3(gm3 gm3Var, boolean z, ytw<Boolean> ytwVar, v1b<? super wl3> v1bVar) {
        super(2, v1bVar);
        this.a = gm3Var;
        this.b = z;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wl3(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wl3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.a() && !this.b) {
            this.c.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
