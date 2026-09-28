package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$1", f = "InstantWinPromotionManagerImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class lio extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ pio c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lio(v1b v1bVar, pio pioVar) {
        super(2, v1bVar);
        this.c = pioVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lio(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lio) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            pio pioVar = this.c;
            wwd0 wwd0Var2 = pioVar.i;
            this.a = wwd0Var2;
            this.b = 1;
            obj = pioVar.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(obj);
        return Unit.a;
    }
}
