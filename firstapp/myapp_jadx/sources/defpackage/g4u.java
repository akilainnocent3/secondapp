package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$flatMapLatest$3", f = "LoyaltyViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class g4u extends tje0 implements gaj<myh<? super b3u.a>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b3u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4u(v1b v1bVar, b3u b3uVar) {
        super(3, v1bVar);
        this.d = b3uVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super b3u.a> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        g4u g4uVar = new g4u(v1bVar, this.d);
        g4uVar.b = myhVar;
        g4uVar.c = bool;
        return g4uVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            b3u b3uVar = this.d;
            lyh lyhVarC = zBooleanValue ? ozh.c(new g3u((zed.d0) b3uVar.i.getStringByFlow("key_loyalty_unread", ""), b3uVar), b3uVar.v) : new h3u(b3uVar.c0);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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
