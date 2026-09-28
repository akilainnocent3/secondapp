package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class six implements tse {
    public final /* synthetic */ twd0 a;
    public final /* synthetic */ sga b;

    public six(twd0 twd0Var, sga sgaVar) {
        this.a = twd0Var;
        this.b = sgaVar;
    }

    @Override // defpackage.tse
    public final void dispose() {
        Iterator it = ((List) this.a.getValue()).iterator();
        while (it.hasNext()) {
            this.b.b().b((ifx) it.next());
        }
    }
}
