package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dk5 {
    public final o45 a;
    public final cl60 b;
    public final Function0<Unit> c;

    public dk5(o45 o45Var, cl60 cl60Var, Function0<Unit> function0) {
        function0.getClass();
        this.a = o45Var;
        this.b = cl60Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk5)) {
            return false;
        }
        dk5 dk5Var = (dk5) obj;
        return this.a.equals(dk5Var.a) && this.b.equals(dk5Var.b) && Intrinsics.g(this.c, dk5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonData(type=" + this.a + ", color=" + this.b + ", onClick=" + this.c + ')';
    }
}
