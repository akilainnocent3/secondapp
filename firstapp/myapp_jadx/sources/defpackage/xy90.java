package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xy90 {
    public final Function1<jxo, iwo> a;
    public final goh<iwo> b;

    public xy90(goh gohVar, Function1 function1) {
        this.a = function1;
        this.b = gohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy90)) {
            return false;
        }
        xy90 xy90Var = (xy90) obj;
        return this.a.equals(xy90Var.a) && Intrinsics.g(this.b, xy90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
