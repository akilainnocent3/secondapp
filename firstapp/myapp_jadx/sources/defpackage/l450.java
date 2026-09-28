package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.remixbet.RemixBetRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class l450 implements i450 {
    public final g3z a;
    public final k5b b;

    public l450(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, g3z g3zVar) {
        g3zVar.getClass();
        this.a = g3zVar;
        this.b = k5bVar;
    }

    @Override // defpackage.i450
    public final Object a(RemixBetRequest remixBetRequest, a550 a550Var) {
        return ej5.d(this.b, new k450(this, remixBetRequest, null), a550Var);
    }

    @Override // defpackage.i450
    public final Object b(RemixBetOrderRequest remixBetOrderRequest, b550 b550Var) {
        return ej5.d(this.b, new j450(this, remixBetOrderRequest, null), b550Var);
    }
}
