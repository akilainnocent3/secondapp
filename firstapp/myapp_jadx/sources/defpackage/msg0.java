package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class msg0<T> {
    public static final msg0<Object> e = new msg0<>(0, m2g.a);
    public final int[] a;
    public final List<T> b;
    public final int c;
    public final List<Integer> d;

    /* JADX WARN: Multi-variable type inference failed */
    public msg0(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        iArr.getClass();
        list.getClass();
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            hb5.a("originalPageOffsets cannot be empty when constructing TransformablePage");
            throw null;
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        list2.getClass();
        throw new IllegalArgumentException(("If originalIndices (size = " + list2.size() + ") is provided, it must be same length as data (size = " + list.size() + ')').toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || msg0.class != obj.getClass()) {
            return false;
        }
        msg0 msg0Var = (msg0) obj;
        return Arrays.equals(this.a, msg0Var.a) && Intrinsics.g(this.b, msg0Var.b) && this.c == msg0Var.c && Intrinsics.g(this.d, msg0Var.d);
    }

    public final int hashCode() {
        int iA = (ai50.a(Arrays.hashCode(this.a) * 31, 31, this.b) + this.c) * 31;
        List<Integer> list = this.d;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.c);
        sb.append(", hintOriginalIndices=");
        return o8i.a(sb, this.d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public msg0(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, null);
        list.getClass();
    }
}
