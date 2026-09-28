package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class cse {
    public static final void a(bc6 bc6Var, v1b v1bVar, boolean z) {
        Object objE;
        Object objP = bc6Var.p();
        Throwable thD = bc6Var.d(objP);
        if (thD != null) {
            zi50.a aVar = zi50.b;
            objE = new zi50.b(thD);
        } else {
            zi50.a aVar2 = zi50.b;
            objE = bc6Var.e(objP);
        }
        if (!z) {
            v1bVar.resumeWith(objE);
            return;
        }
        v1bVar.getClass();
        yre yreVar = (yre) v1bVar;
        x1b x1bVar = yreVar.e;
        Object obj = yreVar.i;
        CoroutineContext context = x1bVar.getContext();
        Object objC = uof0.c(context, obj);
        ldh0<?> ldh0VarC = objC != uof0.a ? g5b.c(x1bVar, context, objC) : null;
        try {
            x1bVar.resumeWith(objE);
            Unit unit = Unit.a;
        } finally {
            if (ldh0VarC == null || ldh0VarC.p0()) {
                uof0.a(context, objC);
            }
        }
    }
}
