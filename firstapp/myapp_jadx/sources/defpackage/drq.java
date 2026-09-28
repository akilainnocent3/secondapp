package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class drq {
    public final mgb0 a;
    public final k5b b;
    public final wwd0 c;
    public final v340 d;

    public drq(mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        mgb0Var.getClass();
        this.a = mgb0Var;
        this.b = k5bVar;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
    }

    public final Object a(Function1 function1, tje0 tje0Var) {
        Object objD = ej5.d(this.b, new brq(this, function1, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }
}
