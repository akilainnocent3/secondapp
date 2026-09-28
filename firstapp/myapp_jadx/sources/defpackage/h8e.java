package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h8e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h8e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bc6 bc6Var = ((z7e.h) ((z7e) obj)).j;
                Unit unit = Unit.a;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(unit);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return unit;
            case 1:
                n2j n2jVar = (n2j) obj;
                n2j.H0(n2jVar, n2jVar.getContext(), 0.0f, 0.0f, 0.0f, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                return Unit.a;
            case 2:
                RouletteActivity rouletteActivity = RouletteActivity.this;
                if (rouletteActivity.X.a() > 1) {
                    rouletteActivity.R1();
                }
                rouletteActivity.L.setVisibility(8);
                rouletteActivity.X = null;
                return null;
            default:
                return (String) dj5.a(e.a, new drd0.b((drd0) obj, null));
        }
    }
}
