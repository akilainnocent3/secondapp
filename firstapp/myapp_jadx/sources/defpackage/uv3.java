package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;

/* JADX INFO: loaded from: classes7.dex */
public final class uv3 {
    public final jrm a;
    public final ww2 b;
    public final j1b c;
    public final b390 d;
    public final t340 e;
    public final pv3 f;

    /* JADX WARN: Type inference failed for: r5v4, types: [pv3] */
    public uv3(jrm jrmVar, ww2 ww2Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        jrmVar.getClass();
        ww2Var.getClass();
        this.a = jrmVar;
        this.b = ww2Var;
        j1b j1bVarA = w5b.a(oddVar.plus(lfe0.a()));
        this.c = j1bVarA;
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.d = b390VarB;
        this.e = e1i.a(b390VarB);
        this.f = new Subscriber() { // from class: pv3
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
                if (socketMarketMessageCreate == null) {
                    return;
                }
                uv3 uv3Var = this.a;
                ej5.c(uv3Var.c, null, null, new tv3(uv3Var, socketMarketMessageCreate, null), 3);
            }
        };
        jrmVar.m1(new iu2.b() { // from class: qv3
            @Override // iu2.a
            public final void C() {
                uv3 uv3Var = this.a;
                if (((Number) ((cee0) uv3Var.d.b()).getValue()).intValue() == 0) {
                    return;
                }
                ej5.c(uv3Var.c, null, null, new rv3(uv3Var, null), 3);
            }
        });
        ej5.c(j1bVarA, null, null, new sv3(this, null), 3);
    }
}
