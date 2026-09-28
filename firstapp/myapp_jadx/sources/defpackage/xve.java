package defpackage;

import com.sporty.android.core.model.dateofbirth.DobVerificationRequest;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;

/* JADX INFO: loaded from: classes5.dex */
public final class xve implements sve {
    public final xxz a;
    public final x430 b;
    public final k5b c;

    public xve(xxz xxzVar, x430 x430Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        xxzVar.getClass();
        x430Var.getClass();
        this.a = xxzVar;
        this.b = x430Var;
        this.c = k5bVar;
    }

    @Override // defpackage.sve
    public final Object a(fye.a aVar) {
        return ej5.d(this.c, new uve(this, null), aVar);
    }

    @Override // defpackage.sve
    public final Object b(y3k y3kVar) {
        return ej5.d(this.c, new tve(this, null), y3kVar);
    }

    @Override // defpackage.sve
    public final Object c(DobVerificationRequest dobVerificationRequest, a0i0 a0i0Var) {
        return ej5.d(this.c, new wve(this, dobVerificationRequest, null), a0i0Var);
    }

    @Override // defpackage.sve
    public final Object d(r5k r5kVar) {
        return ej5.d(this.c, new vve(this, null), r5kVar);
    }
}
