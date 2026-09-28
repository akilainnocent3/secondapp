package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zs7 {
    public final float a;
    public final List<u8j> b;
    public final Function0<Unit> c;

    public zs7(float f, List<u8j> list, Function0<Unit> function0) {
        list.getClass();
        this.a = f;
        this.b = list;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs7)) {
            return false;
        }
        zs7 zs7Var = (zs7) obj;
        return g7f.b(this.a, zs7Var.a) && Intrinsics.g(this.b, zs7Var.b) && Intrinsics.g(this.c, zs7Var.c);
    }

    public final int hashCode() {
        int iA = ai50.a(Float.hashCode(this.a) * 31, 31, this.b);
        Function0<Unit> function0 = this.c;
        return iA + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "CloseButton(size=" + g7f.c(this.a) + ", fsAttributes=" + this.b + ", onClick=" + this.c + ")";
    }

    public zs7(int i, float f) {
        this(f, m2g.a, null);
    }
}
