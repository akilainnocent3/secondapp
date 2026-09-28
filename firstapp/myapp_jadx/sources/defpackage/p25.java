package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.repo.BoostInfoRepoImpl$fetchApi$2$1", f = "BoostInfoRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p25 extends tje0 implements gaj<myh<? super BaseResponse<BoostInfo>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ s25 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p25(s25 s25Var, v1b<? super p25> v1bVar) {
        super(3, v1bVar);
        this.a = s25Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BaseResponse<BoostInfo>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new p25(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.c = new BaseResponse<>();
        return Unit.a;
    }
}
