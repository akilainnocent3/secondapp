package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class st4 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        long jR1 = tcfVar.R1();
        qc6.b bVarF1 = tcfVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.g(3.0f, 1.0f, jR1);
            tcf.V1(tcfVar, new vu30(b.k(new j58(j58.c(0.2f, r58.d(4294684736L))), new j58(j58.c(0.1f, r58.d(4294684736L))), new j58(j58.c(0.0f, r58.d(4290218048L)))), null, tcfVar.R1(), yw90.c(tcfVar.d())), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
            return Unit.a;
        } finally {
            hrh.a(bVarF1, jD);
        }
    }
}
