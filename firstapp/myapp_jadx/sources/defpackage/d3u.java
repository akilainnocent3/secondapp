package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$ackBetslipTooltip$1", f = "LoyaltyViewModel.kt", l = {1688}, m = "invokeSuspend", v = 2)
public final class d3u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.b = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d3u(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d3u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vxt vxtVar = this.b.f;
            wm20 wm20VarA = vxtVar.d.a(vxtVar, vxt.h[2]);
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (wm20VarA.g(this, bool) == y5bVar) {
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
