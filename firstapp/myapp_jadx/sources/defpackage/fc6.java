package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class fc6 {
    public static final void a(Function2 function2, a3 a3Var, a3 a3Var2) {
        try {
            v1b v1bVarB = yzo.b(yzo.a(a3Var, a3Var2, function2));
            zi50.a aVar = zi50.b;
            zre.b(v1bVarB, Unit.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof vre) {
                th = ((vre) th).a;
            }
            zi50.a aVar2 = zi50.b;
            a3Var2.resumeWith(new zi50.b(th));
            throw th;
        }
    }
}
