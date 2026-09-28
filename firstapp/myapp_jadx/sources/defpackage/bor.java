package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.LastHeroStandingTimerKt$TimerPrizeText$2$1", f = "LastHeroStandingTimer.kt", l = {147}, m = "invokeSuspend", v = 1)
public final class bor extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xsw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bor(String str, xsw xswVar, v1b<? super bor> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = xswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bor(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bor) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.b.equals("timer")) {
                return Unit.a;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        do {
            this.c.K(System.currentTimeMillis());
            this.a = 1;
        } while (hkd.b(1000L, this) != y5bVar);
        return y5bVar;
    }
}
