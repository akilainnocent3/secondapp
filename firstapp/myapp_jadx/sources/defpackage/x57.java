package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x57 {
    public final n54 a;
    public final Function1<jxo, jxo> b;
    public final goh<jxo> c;

    public x57(n54 n54Var, goh gohVar, Function1 function1) {
        this.a = n54Var;
        this.b = function1;
        this.c = gohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x57)) {
            return false;
        }
        x57 x57Var = (x57) obj;
        return this.a.equals(x57Var.a) && Intrinsics.g(this.b, x57Var.b) && Intrinsics.g(this.c, x57Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + w57.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
