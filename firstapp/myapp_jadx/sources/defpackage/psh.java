package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class psh implements k730 {
    public final wnn a;
    public final m730<CoroutineContext> b;
    public final k730 c;

    public psh(wnn wnnVar, wnn wnnVar2, k730 k730Var) {
        this.a = wnnVar;
        this.b = wnnVar2;
        this.c = k730Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        Context context = (Context) this.a.a;
        CoroutineContext coroutineContext = this.b.get();
        cg80 cg80Var = (cg80) this.c.get();
        context.getClass();
        coroutineContext.getClass();
        cg80Var.getClass();
        return lsh.a(cg80Var, new h950(new jsh(cg80Var, 0)), w5b.a(coroutineContext), new ksh(context, 0));
    }
}
