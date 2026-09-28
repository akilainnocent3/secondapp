package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.HeadToHeadStatsViewModel$getViewState$$inlined$flatMapLatest$1", f = "HeadToHeadStatsViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ehl extends tje0 implements gaj<myh<? super ihl>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dhl d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehl(v1b v1bVar, dhl dhlVar, String str, String str2) {
        super(3, v1bVar);
        this.d = dhlVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super ihl> myhVar, Long l, v1b<? super Unit> v1bVar) {
        ehl ehlVar = new ehl(v1bVar, this.d, this.e, this.f);
        ehlVar.b = myhVar;
        ehlVar.c = l;
        return ehlVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            dhl dhlVar = this.d;
            fhl fhlVar = new fhl(bm50.a(dhlVar.a.d(this.e, this.f)), dhlVar);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, fhlVar, this) == y5bVar) {
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
