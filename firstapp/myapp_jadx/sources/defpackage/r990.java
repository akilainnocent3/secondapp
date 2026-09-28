package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class r990 implements b990 {
    public final m2l a;
    public final uqm b;
    public final k5b c;

    public r990(m2l m2lVar, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        m2lVar.getClass();
        uqmVar.getClass();
        this.a = m2lVar;
        this.b = uqmVar;
        this.c = k5bVar;
    }

    @Override // defpackage.b990
    public final q990 a() {
        b990.a[] aVarArr = b990.a.a;
        m2l m2lVar = this.a;
        m2lVar.getClass();
        return new q990((zed.h) m2lVar.a.getBooleanByFlow("key-should-show-review-our-app-guide", true), this);
    }

    @Override // defpackage.b990
    public final Object b(tje0 tje0Var) {
        b990.a[] aVarArr = b990.a.a;
        Object objD = ej5.d(this.c, new p990(this, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }
}
