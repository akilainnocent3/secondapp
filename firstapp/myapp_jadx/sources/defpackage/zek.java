package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetStreamScheduleUseCase$invoke$lambda$0$$inlined$flatMapLatest$1", f = "GetStreamScheduleUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class zek extends tje0 implements gaj<myh<? super fgr>, dsq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zek(v1b v1bVar, bfk bfkVar) {
        super(3, v1bVar);
        this.d = bfkVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fgr> myhVar, dsq dsqVar, v1b<? super Unit> v1bVar) {
        zek zekVar = new zek(v1bVar, this.d);
        zekVar.b = myhVar;
        zekVar.c = dsqVar;
        return zekVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            or60 or60Var = new or60(new xek(this.d, ((dsq) this.c).h, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, or60Var, this) == y5bVar) {
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
