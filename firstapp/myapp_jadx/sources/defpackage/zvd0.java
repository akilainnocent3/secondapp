package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zvd0 {
    public final long a;
    public final float b;
    public final float c;
    public final boolean d;
    public final List<gly> e;
    public final long f;
    public final float g;
    public final float h;

    public zvd0(long j, float f, float f2, boolean z, List<gly> list, long j2, float f3, float f4) {
        list.getClass();
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = list;
        this.f = j2;
        this.g = f3;
        this.h = f4;
    }

    public static zvd0 a(zvd0 zvd0Var, long j, float f, ArrayList arrayList, float f2, float f3, int i) {
        float f4 = zvd0Var.b;
        if ((i & 4) != 0) {
            f = zvd0Var.c;
        }
        float f5 = f;
        boolean z = (i & 8) != 0 ? zvd0Var.d : true;
        List<gly> list = arrayList;
        if ((i & 16) != 0) {
            list = zvd0Var.e;
        }
        List<gly> list2 = list;
        long j2 = zvd0Var.f;
        float f6 = (i & 64) != 0 ? zvd0Var.g : f2;
        float f7 = (i & 128) != 0 ? zvd0Var.h : f3;
        list2.getClass();
        return new zvd0(j, f4, f5, z, list2, j2, f6, f7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd0)) {
            return false;
        }
        zvd0 zvd0Var = (zvd0) obj;
        if (!gly.c(this.a, zvd0Var.a) || Float.compare(this.b, zvd0Var.b) != 0 || Float.compare(this.c, zvd0Var.c) != 0 || this.d != zvd0Var.d || !Intrinsics.g(this.e, zvd0Var.e)) {
            return false;
        }
        long j = zvd0Var.f;
        int i = j58.n;
        return nbh0.a(this.f, j) && Float.compare(this.g, zvd0Var.g) == 0 && Float.compare(this.h, zvd0Var.h) == 0;
    }

    public final int hashCode() {
        int iA = ai50.a(mtg0.a(tvh.a(this.c, tvh.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Float.hashCode(this.h) + tvh.a(this.g, f87.a(iA, this.f, 31), 31);
    }

    public final String toString() {
        String strH = gly.h(this.a);
        String strI = j58.i(this.f);
        StringBuilder sb = new StringBuilder("Star(position=");
        sb.append(strH);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isShooting=");
        sb.append(this.d);
        sb.append(", trail=");
        gfs.a(", color=", strI, ", life=", sb, this.e);
        sb.append(this.g);
        sb.append(", fadeStep=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
