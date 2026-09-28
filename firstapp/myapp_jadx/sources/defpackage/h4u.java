package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$flatMapLatest$4", f = "LoyaltyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class h4u extends tje0 implements gaj<myh<? super List<? extends bv0>>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zvt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4u(v1b v1bVar, zvt zvtVar) {
        super(3, v1bVar);
        this.d = zvtVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends bv0>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        h4u h4uVar = new h4u(v1bVar, this.d);
        h4uVar.b = myhVar;
        h4uVar.c = bool;
        return h4uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVarF = ((Boolean) this.c).booleanValue() ? bm50.f(this.d.a()) : new gzh(m2g.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarF, this) == y5bVar) {
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
