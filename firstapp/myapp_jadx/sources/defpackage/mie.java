package defpackage;

import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes8.dex */
public final class mie extends RuntimeException {
    public final List<mka> a;

    public mie(List<mka> list) {
        this.a = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ngs ngsVarB = a.b();
        List<mka> list = this.a;
        list.getClass();
        ep50 ep50Var = new ep50(list);
        if (ep50Var.b() > 0) {
            ((mka) ep50Var.get(0)).getClass();
            throw null;
        }
        ngs ngsVarA = a.a(ngsVarB);
        ngsVarA.getClass();
        ep50 ep50Var2 = new ep50(ngsVarA);
        int iB = ep50Var2.b();
        for (int i = 0; i < iB; i++) {
            sb.append("\tat " + ((String) ep50Var2.get(i)));
            sb.append('\n');
        }
        return sb.toString();
    }
}
