package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln5g;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n5g extends j8i0 {
    public final t4g a;
    public final odd b;
    public final t340 c;

    public n5g(t4g t4gVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        lyh<kqz<Value>> lyhVar;
        lyh lyhVarC;
        this.a = t4gVar;
        this.b = oddVar;
        t340 t340VarA = null;
        koz kozVar = t4gVar != null ? new koz(new iqz(20, 0, false, 0, 0, 62), null, new l5g(this, 0)) : null;
        if (kozVar != null && (lyhVar = kozVar.a) != 0 && (lyhVarC = ozh.c(lyhVar, oddVar)) != null) {
            t340VarA = rs5.a(lyhVarC, o8i0.d(this));
        }
        this.c = t340VarA;
    }
}
