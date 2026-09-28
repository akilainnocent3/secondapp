package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.datasource.OverrideLocalDataSource$getOverride$$inlined$flatMapLatest$1", f = "OverrideLocalDataSource.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ffz extends tje0 implements gaj<myh<? super String>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mfz d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffz(v1b v1bVar, mfz mfzVar, String str) {
        super(3, v1bVar);
        this.d = mfzVar;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super String> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        ffz ffzVar = new ffz(v1bVar, this.d, this.e);
        ffzVar.b = myhVar;
        ffzVar.c = bool;
        return ffzVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                gvh0 gvh0Var = this.d.a;
                String str = this.e;
                gzhVar = new yzh(new hfz(gvh0Var.d(str)), new gfz(str, null));
            } else {
                gzhVar = new gzh(null);
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
