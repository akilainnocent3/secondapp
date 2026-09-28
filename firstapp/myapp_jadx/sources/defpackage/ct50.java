package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ct50 {
    public static final long g = r58.d(4280391411L);
    public static final List<Character> h = b.k(8226, 9702, 9642);
    public final float a;
    public final float b;
    public final long c;
    public final List<Character> d;
    public final Map<String, Integer> e;
    public final prz f;

    public ct50() {
        throw null;
    }

    public ct50(long j, List list, Map map, prz przVar, int i) {
        float f = (i & 1) != 0 ? 16.0f : 6.0f;
        float f2 = (i & 2) != 0 ? 24.0f : 10.0f;
        j = (i & 4) != 0 ? g : j;
        list = (i & 8) != 0 ? h : list;
        if ((i & 16) != 0) {
            map = o2g.a;
            map.getClass();
        }
        przVar = (i & 32) != 0 ? prz.a.a : przVar;
        list.getClass();
        map.getClass();
        przVar.getClass();
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = list;
        this.e = map;
        this.f = przVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct50)) {
            return false;
        }
        ct50 ct50Var = (ct50) obj;
        if (!g7f.b(this.a, ct50Var.a) || !g7f.b(this.b, ct50Var.b)) {
            return false;
        }
        long j = ct50Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j) && Intrinsics.g(this.d, ct50Var.d) && Intrinsics.g(this.e, ct50Var.e) && Intrinsics.g(this.f, ct50Var.f);
    }

    public final int hashCode() {
        int iA = tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.f.hashCode() + ((this.e.hashCode() + ai50.a(f87.a(iA, this.c, 31), 31, this.d)) * 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strI = j58.i(this.c);
        StringBuilder sbA = ux5.a("RichTextStyle(listIndent=", strC, ", listPrefixWidth=", strC2, ", linkColor=");
        kya0.b(strI, ", bulletChars=", ", colorMap=", sbA, this.d);
        sbA.append(this.e);
        sbA.append(", paragraphSpacing=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
