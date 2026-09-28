package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nya implements j3w {
    public final Function1<g8j0, Unit> b;
    public g8j0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public nya(Function1<? super g8j0, Unit> function1) {
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nya) && ((nya) obj).b == this.b;
    }

    @Override // defpackage.j3w
    public final void g(n3w n3wVar) {
        g8j0 g8j0Var = (g8j0) n3wVar.g(u8j0.a);
        if (Intrinsics.g(g8j0Var, this.c)) {
            return;
        }
        this.c = g8j0Var;
        this.b.invoke(g8j0Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
