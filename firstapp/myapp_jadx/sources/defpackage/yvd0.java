package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class yvd0 {
    public final long a;
    public final float b;
    public final float c;
    public final List<gly> d;
    public final long e;
    public final float f;
    public final float g;

    public yvd0(long j, float f, float f2, List<gly> list, long j2, float f3, float f4) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = list;
        this.e = j2;
        this.f = f3;
        this.g = f4;
    }

    public static yvd0 a(yvd0 yvd0Var, long j, float f, ArrayList arrayList, int i) {
        float f2 = yvd0Var.b;
        if ((i & 4) != 0) {
            f = yvd0Var.c;
        }
        float f3 = f;
        List<gly> list = arrayList;
        if ((i & 8) != 0) {
            list = yvd0Var.d;
        }
        List<gly> list2 = list;
        long j2 = yvd0Var.e;
        float f4 = (i & 32) != 0 ? yvd0Var.f : 2.0f;
        float f5 = (i & 64) != 0 ? yvd0Var.g : 0.02f;
        list2.getClass();
        return new yvd0(j, f2, f3, list2, j2, f4, f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvd0)) {
            return false;
        }
        yvd0 yvd0Var = (yvd0) obj;
        if (!gly.c(this.a, yvd0Var.a) || Float.compare(this.b, yvd0Var.b) != 0 || Float.compare(this.c, yvd0Var.c) != 0 || !Intrinsics.g(this.d, yvd0Var.d)) {
            return false;
        }
        long j = yvd0Var.e;
        int i = j58.n;
        return nbh0.a(this.e, j) && Float.compare(this.f, yvd0Var.f) == 0 && Float.compare(this.g, yvd0Var.g) == 0;
    }

    public final int hashCode() {
        int iA = ai50.a(tvh.a(this.c, tvh.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Float.hashCode(this.g) + tvh.a(this.f, f87.a(iA, this.e, 31), 31);
    }

    public final String toString() {
        String strH = gly.h(this.a);
        String strI = j58.i(this.e);
        StringBuilder sb = new StringBuilder("Star(position=");
        sb.append(strH);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", trail=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(strI);
        sb.append(", life=");
        sb.append(this.f);
        sb.append(", fadeStep=");
        return wi1.a(this.g, ")", sb);
    }
}
