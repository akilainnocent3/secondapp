package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;

/* JADX INFO: loaded from: classes5.dex */
public final class ohb0<T> implements lhb0<T> {
    public final jhb0 a;
    public final JsonSerializeService b;
    public final k5b c;

    public ohb0(jhb0 jhb0Var, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        jhb0Var.getClass();
        jsonSerializeService.getClass();
        this.a = jhb0Var;
        this.b = jsonSerializeService;
        this.c = k5bVar;
    }
}
