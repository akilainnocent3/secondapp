package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.pocketrocket.model.response.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.data.RocketRepository$getBetHistory$2", f = "RocketRepository.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 1)
public final class hu50 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends BetHistoryItem>>>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu50(int i, int i2, v1b<? super hu50> v1bVar) {
        super(1, v1bVar);
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new hu50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends BetHistoryItem>>> v1bVar) {
        return ((hu50) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        mpe0 mpe0Var = on0.a;
        au50 au50VarM = on0.m();
        this.a = 1;
        Object betHistory = au50VarM.getBetHistory(this.b, this.c, this);
        return betHistory == y5bVar ? y5bVar : betHistory;
    }
}
