package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ww90 {
    public static final ww90 c;
    public final dqe a;
    public final dqe b;

    static {
        dqe.b bVar = dqe.b.a;
        c = new ww90(bVar, bVar);
    }

    public ww90(dqe dqeVar, dqe dqeVar2) {
        this.a = dqeVar;
        this.b = dqeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww90)) {
            return false;
        }
        ww90 ww90Var = (ww90) obj;
        return Intrinsics.g(this.a, ww90Var.a) && Intrinsics.g(this.b, ww90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
