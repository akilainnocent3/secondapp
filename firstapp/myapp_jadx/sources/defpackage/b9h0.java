package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes8.dex */
public final class b9h0 implements qhp {
    public static final a c = new a(null);
    public final dq7 a;
    public final List<KTypeProjection> b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public b9h0(dq7 dq7Var) {
        List<KTypeProjection> list = Collections.EMPTY_LIST;
        list.getClass();
        this.a = dq7Var;
        this.b = list;
    }

    @Override // defpackage.qhp
    public final List<KTypeProjection> a() {
        return this.b;
    }

    @Override // defpackage.qhp
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b9h0)) {
            return false;
        }
        b9h0 b9h0Var = (b9h0) obj;
        return Intrinsics.g(this.a, b9h0Var.a) && Intrinsics.g(this.b, b9h0Var.b);
    }

    @Override // defpackage.qhp
    public final ygp g() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ai50.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String name;
        dq7 dq7Var = this.a;
        dq7 dq7Var2 = dq7Var != null ? dq7Var : null;
        Class clsB = dq7Var2 != null ? tgp.b(dq7Var2) : null;
        if (clsB == null) {
            name = dq7Var.toString();
        } else if (!clsB.isArray()) {
            name = clsB.getName();
        } else if (clsB.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsB.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsB.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsB.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsB.equals(int[].class)) {
            name = iKBWavCysVP.rbH;
        } else if (clsB.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsB.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsB.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        return tug.a(name, this.b.isEmpty() ? "" : CollectionsKt.a0(this.b, ", ", "<", ">", new a9h0(), 24), "").concat(" (Kotlin reflection is not available)");
    }
}
