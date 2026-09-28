package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$_listData$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c3u extends tje0 implements iaj<krf0, lk50<? extends List<? extends LoyaltyActivityData>>, tyt, v1b<? super b3u.b>, Object> {
    public /* synthetic */ krf0 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ tyt c;

    @Override // defpackage.iaj
    public final Object d(krf0 krf0Var, lk50<? extends List<? extends LoyaltyActivityData>> lk50Var, tyt tytVar, v1b<? super b3u.b> v1bVar) {
        c3u c3uVar = new c3u(4, v1bVar);
        c3uVar.a = krf0Var;
        c3uVar.b = lk50Var;
        c3uVar.c = tytVar;
        return c3uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        krf0 krf0Var = this.a;
        lk50 lk50Var = this.b;
        tyt tytVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new b3u.b(krf0Var, lk50Var, tytVar);
    }
}
