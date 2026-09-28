package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xis {
    public static final Object a(qis qisVar, tje0 tje0Var) throws Throwable {
        try {
            if (qisVar.isDone()) {
                return v4.f(qisVar);
            }
            bc6 bc6Var = new bc6(1, yzo.b(tje0Var));
            qisVar.k(new myf0(qisVar, bc6Var), jqe.a);
            bc6Var.t(new uis(qisVar));
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.l();
            }
            throw cause;
        }
    }
}
