package defpackage;

import defpackage.mj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ywh0<V extends mj0> {
    public final V a;
    public final tkf b;

    /* JADX WARN: Multi-variable type inference failed */
    public ywh0(mj0 mj0Var, tkf tkfVar) {
        this.a = mj0Var;
        this.b = tkfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh0)) {
            return false;
        }
        ywh0 ywh0Var = (ywh0) obj;
        return Intrinsics.g(this.a, ywh0Var.a) && Intrinsics.g(this.b, ywh0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
