package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class me40 implements ge40 {
    public final t840 a;
    public final ld40 b;
    public final k5b c;

    public me40(t840 t840Var, ld40 ld40Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        t840Var.getClass();
        this.a = t840Var;
        this.b = ld40Var;
        this.c = k5bVar;
    }

    @Override // defpackage.ge40
    public final Object a(int i, id40 id40Var) {
        return ej5.d(this.c, new ie40(this, i, null), id40Var);
    }

    @Override // defpackage.ge40
    public final Object b(rck rckVar) {
        return ej5.d(this.c, new je40(this, null), rckVar);
    }

    @Override // defpackage.ge40
    public final Object c(cd40 cd40Var) {
        return ej5.d(this.c, new he40(this, null), cd40Var);
    }

    @Override // defpackage.ge40
    public final Object d(rf40 rf40Var) {
        Object objD = ej5.d(this.c, new le40(this, null), rf40Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.ge40
    public final Object e(qf40 qf40Var) {
        Object objD = ej5.d(this.c, new ke40(this, null), qf40Var);
        return objD == y5b.a ? objD : Unit.a;
    }
}
