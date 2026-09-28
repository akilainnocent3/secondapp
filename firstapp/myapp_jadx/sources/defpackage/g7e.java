package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;

/* JADX INFO: loaded from: classes6.dex */
public final class g7e implements e7e {
    public final pr10 a;
    public final k5b b;

    public g7e(pr10 pr10Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        pr10Var.getClass();
        this.a = pr10Var;
        this.b = k5bVar;
    }

    @Override // defpackage.e7e
    public final Object a(oyk oykVar) {
        return ej5.d(this.b, new f7e(this, null), oykVar);
    }
}
