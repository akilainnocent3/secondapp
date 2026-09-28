package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class pus implements mus {
    public final jus a;
    public final k5b b;

    public pus(jus jusVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        jusVar.getClass();
        this.a = jusVar;
        this.b = k5bVar;
    }

    @Override // defpackage.mus
    public final Object a(gel gelVar) {
        Object objD = ej5.d(this.b, new ous(this, null), gelVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    @Override // defpackage.mus
    public final Object b(gel gelVar) {
        return ej5.d(this.b, new nus(this, null), gelVar);
    }
}
