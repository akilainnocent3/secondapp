package defpackage;

import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.BetOddsUseCases", f = "BetOddsUseCases.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "validateOdds", v = 2)
public final class uw2 extends x1b {
    public ww2 a;
    public List b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ww2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw2(ww2 ww2Var, x1b x1bVar) {
        super(x1bVar);
        this.e = ww2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
