package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.handler.SportyLegendsSettlementAnimationModeStateHandlerImpl$initialAnimationModeStateHandler$3", f = "SportyLegendsSettlementAnimationModeStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mkc0 extends tje0 implements gaj<List<? extends ikc0>, sk3, v1b<? super Unit>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ sk3 b;
    public final /* synthetic */ jkc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc0(jkc0 jkc0Var, v1b<? super mkc0> v1bVar) {
        super(3, v1bVar);
        this.c = jkc0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(List<? extends ikc0> list, sk3 sk3Var, v1b<? super Unit> v1bVar) {
        mkc0 mkc0Var = new mkc0(this.c, v1bVar);
        mkc0Var.a = list;
        mkc0Var.b = sk3Var;
        return mkc0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        kk3 kk3Var;
        List list = this.a;
        sk3 sk3Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = list.size() > 1;
        if (sk3Var == null) {
            sk3.c.getClass();
            sk3Var = sk3.d;
        }
        wwd0 wwd0Var = this.c.g;
        do {
            value = wwd0Var.getValue();
            kk3Var = new kk3(sk3Var);
            if (!z) {
                kk3Var = null;
            }
        } while (!wwd0Var.g(value, kk3Var));
        return Unit.a;
    }
}
