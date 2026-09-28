package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$updateViewedDobBenefit$1", f = "LoyaltyViewModel.kt", l = {1837}, m = "invokeSuspend", v = 2)
public final class k4u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Set<String> b;
    public final /* synthetic */ Set<String> c;
    public final /* synthetic */ b3u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4u(Set<String> set, Set<String> set2, b3u b3uVar, v1b<? super k4u> v1bVar) {
        super(2, v1bVar);
        this.b = set;
        this.c = set2;
        this.d = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k4u(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k4u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            LinkedHashSet linkedHashSetE = yi80.e(this.b, this.c);
            b3u b3uVar = this.d;
            String json = b3uVar.w.toJson(linkedHashSetE);
            vxt vxtVar = b3uVar.f;
            wm20 wm20VarA = vxtVar.g.a(vxtVar, vxt.h[5]);
            json.getClass();
            this.a = 1;
            if (wm20VarA.g(this, json) == y5bVar) {
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
