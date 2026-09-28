package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r8h<T> {
    public final T a;
    public final op8 b;

    /* JADX WARN: Multi-variable type inference failed */
    public r8h(j3a0 j3a0Var, op8 op8Var) {
        this.a = j3a0Var;
        this.b = op8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8h) {
            r8h r8hVar = (r8h) obj;
            return Intrinsics.g(this.a, r8hVar.a) && this.b == r8hVar.b;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
