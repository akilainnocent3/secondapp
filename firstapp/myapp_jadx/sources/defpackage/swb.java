package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;

/* JADX INFO: loaded from: classes7.dex */
public final class swb {
    public final k5b a;
    public final g3z b;
    public final JsonSerializeService c;

    public swb(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, g3z g3zVar, JsonSerializeService jsonSerializeService) {
        this.a = k5bVar;
        this.b = g3zVar;
        this.c = jsonSerializeService;
    }
}
