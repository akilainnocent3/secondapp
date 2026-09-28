package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.login.INTLoginViewModel$login$3", f = "INTLoginViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class bwm extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<xdp>>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ dwm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwm(dwm dwmVar, v1b<? super bwm> v1bVar) {
        super(3, v1bVar);
        this.d = dwmVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends BaseResponse<xdp>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        bwm bwmVar = new bwm(this.d, v1bVar);
        bwmVar.b = myhVar;
        bwmVar.c = th;
        return bwmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            dwm.y1(this.d, "network_error", null, th, 2);
            lk50.a aVar = new lk50.a(th);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
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
