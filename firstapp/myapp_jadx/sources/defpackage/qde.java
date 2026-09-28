package defpackage;

import android.content.Context;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class qde {
    public final hde a;
    public final k5b b;
    public final Context c;
    public final m2l d;
    public final k650 e;

    public qde(hde hdeVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, Context context, m2l m2lVar, wwf0 wwf0Var, k650 k650Var) {
        this.a = hdeVar;
        this.b = k5bVar;
        this.c = context;
        this.d = m2lVar;
        this.e = k650Var;
    }

    public final Object a(rde rdeVar, x1b x1bVar) {
        Object objD = ej5.d(this.b, new ode(this, rdeVar, null), x1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
