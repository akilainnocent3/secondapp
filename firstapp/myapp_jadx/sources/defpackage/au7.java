package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau7;", "Lj8i0;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class au7 extends j8i0 {
    public final m2l a;
    public final odd b;
    public final wwd0 c;
    public final yt7 d;
    public final t340 e;

    public au7(m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        m2lVar.getClass();
        this.a = m2lVar;
        this.b = oddVar;
        lyh<String> stringByFlow = m2lVar.getStringByFlow("cloudflare_siteKey", "");
        wwd0 wwd0VarA = xwd0.a(j6c.INITIAL);
        this.c = wwd0VarA;
        this.d = new yt7((zed.d0) m2lVar.getStringByFlow("cloudflare_loading_state", "Started"));
        this.e = e1i.d(new n1i(stringByFlow, wwd0VarA, new ut7(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), 0);
    }

    public final jvd0 x1(j6c j6cVar) {
        j6cVar.getClass();
        return ej5.c(o8i0.d(this), null, null, new xt7(this, j6cVar, null), 3);
    }

    public final void y1(qt7 qt7Var) {
        ej5.c(o8i0.d(this), null, null, new zt7(this, qt7Var, null), 3);
    }
}
