package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$9", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a3u extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ b3u a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.a = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a3u(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((a3u) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.C.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, Integer.valueOf(((Number) value).intValue() + 1)));
        return Unit.a;
    }
}
