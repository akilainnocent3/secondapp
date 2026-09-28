package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zdh0 implements j3w, m3w {
    public final ytw b;
    public final g8j0 c;

    public zdh0() {
        this.b = m.b(new rth(0, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zdh0) {
            return Intrinsics.g(((zdh0) obj).c, this.c);
        }
        return false;
    }

    @Override // defpackage.j3w
    public final void g(n3w n3wVar) {
        ((x5a0) this.b).setValue(new ydh0(this.c, (g8j0) n3wVar.g(u8j0.a)));
    }

    @Override // defpackage.m3w
    public final g8j0 getValue() {
        return (g8j0) ((x5a0) this.b).getValue();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public zdh0(g8j0 g8j0Var) {
        this();
        this.c = g8j0Var;
    }
}
