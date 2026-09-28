package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sse implements j350 {
    public final Function1<use, tse> a;
    public tse b;

    /* JADX WARN: Multi-variable type inference failed */
    public sse(Function1<? super use, ? extends tse> function1) {
        this.a = function1;
    }

    @Override // defpackage.j350
    public final void c() {
        this.b = this.a.invoke(xvf.a);
    }

    @Override // defpackage.j350
    public final void f() {
        tse tseVar = this.b;
        if (tseVar != null) {
            tseVar.dispose();
        }
        this.b = null;
    }

    @Override // defpackage.j350
    public final void e() {
    }
}
