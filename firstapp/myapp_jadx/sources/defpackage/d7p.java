package defpackage;

import android.os.CountDownTimer;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.jackpot.data.Order;

/* JADX INFO: loaded from: classes4.dex */
public final class d7p extends CountDownTimer {
    public final /* synthetic */ c7p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7p(c7p c7pVar) {
        super(10000L, 1000L);
        this.a = c7pVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        c7p c7pVar = this.a;
        su5<BaseResponse<Order>> su5Var = c7pVar.L;
        if (su5Var != null) {
            su5Var.cancel();
        }
        c7pVar.y0(q5p.b.REQUEST_TIMEOUT);
        c7pVar.v0(10, null);
        c7pVar.r0();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
