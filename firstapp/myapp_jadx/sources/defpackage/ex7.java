package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lex7;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ex7 extends c82 {
    public final m2l d;
    public final uqm e;
    public final lq1 f;
    public final m1p i;
    public final odd v;
    public final lyh<Boolean> w;
    public final lyh<Boolean> y;

    public ex7(m2l m2lVar, uqm uqmVar, lq1 lq1Var, m1p m1pVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        m2lVar.getClass();
        uqmVar.getClass();
        lq1Var.getClass();
        this.d = m2lVar;
        this.e = uqmVar;
        this.f = lq1Var;
        this.i = m1pVar;
        this.v = oddVar;
        this.w = ozh.c(new dzh(new bx7(this, null)), oddVar);
        this.y = ozh.c(new or60(new dx7(this, null)), oddVar);
    }
}
