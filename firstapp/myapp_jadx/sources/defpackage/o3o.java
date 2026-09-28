package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSessionDataHandlerImpl$init$$inlined$flatMapLatest$1", f = "InstantRacingSessionDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class o3o extends tje0 implements gaj<myh<? super AccountInfo>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s3o d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3o(v1b v1bVar, s3o s3oVar, String str) {
        super(3, v1bVar);
        this.d = s3oVar;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Long l, v1b<? super Unit> v1bVar) {
        o3o o3oVar = new o3o(v1bVar, this.d, this.e);
        o3oVar.b = myhVar;
        o3oVar.c = l;
        return o3oVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            s3o s3oVar = this.d;
            yzh yzhVar = new yzh(new g1i(s3oVar.c.getAccountInfoFlow(), new p3o(null, s3oVar, this.e)), new q3o(s3oVar, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, yzhVar, this) == y5bVar) {
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
