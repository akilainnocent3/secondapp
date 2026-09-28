package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetStreamScheduleUseCase$invoke$$inlined$flatMapLatest$1", f = "GetStreamScheduleUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class yek extends tje0 implements gaj<myh<? super fgr>, avq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfk d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yek(v1b v1bVar, bfk bfkVar, String str) {
        super(3, v1bVar);
        this.d = bfkVar;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fgr> myhVar, avq avqVar, v1b<? super Unit> v1bVar) {
        yek yekVar = new yek(v1bVar, this.d, this.e);
        yekVar.b = myhVar;
        yekVar.c = avqVar;
        return yekVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((avq) this.c).i) {
                bfk bfkVar = this.d;
                gzhVar = uzh.b(r0i.f(new afk(bfkVar.a.k.d, this.e), new zek(null, bfkVar)));
            } else {
                gzhVar = new gzh(fgr.a.a);
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
