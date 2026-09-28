package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$2", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v2u extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
    public final /* synthetic */ b3u a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.a = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v2u(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
        return ((v2u) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.J1();
        return Unit.a;
    }
}
