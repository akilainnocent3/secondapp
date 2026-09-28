package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lynb0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ynb0 extends j8i0 {
    public final djt a;
    public final h940 b;
    public final JsonSerializeService c;
    public final odd d;
    public final wwd0 e;
    public final v340 f;

    public ynb0(djt djtVar, h940 h940Var, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        h940Var.getClass();
        jsonSerializeService.getClass();
        this.a = djtVar;
        this.b = h940Var;
        this.c = jsonSerializeService;
        this.d = oddVar;
        wwd0 wwd0VarA = xwd0.a(mft.b.a);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.b.x();
        super.onCleared();
    }
}
