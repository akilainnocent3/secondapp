package defpackage;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hl1 {
    public final Size a;
    public final Map<Integer, Size> b;
    public final Size c;
    public final Map<Integer, Size> d;
    public final Size e;
    public final Map<Integer, Size> f;
    public final Map<Integer, Size> g;
    public final Map<Integer, Size> h;
    public final Map<Integer, Size> i;

    public hl1(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        if (size == null) {
            bmy.a("Null analysisSize");
            throw null;
        }
        this.a = size;
        if (map == null) {
            bmy.a("Null s720pSizeMap");
            throw null;
        }
        this.b = map;
        if (size2 == null) {
            bmy.a("Null previewSize");
            throw null;
        }
        this.c = size2;
        if (map2 == null) {
            bmy.a("Null s1440pSizeMap");
            throw null;
        }
        this.d = map2;
        if (size3 == null) {
            bmy.a("Null recordSize");
            throw null;
        }
        this.e = size3;
        if (map3 == null) {
            bmy.a("Null maximumSizeMap");
            throw null;
        }
        this.f = map3;
        if (map4 == null) {
            bmy.a("Null maximum4x3SizeMap");
            throw null;
        }
        this.g = map4;
        if (map5 == null) {
            bmy.a("Null maximum16x9SizeMap");
            throw null;
        }
        this.h = map5;
        if (map6 != null) {
            this.i = map6;
        } else {
            bmy.a("Null ultraMaximumSizeMap");
            throw null;
        }
    }

    public final Map<Integer, Size> a() {
        return this.f;
    }

    public final Map<Integer, Size> b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hl1)) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        return this.a.equals(hl1Var.a) && this.b.equals(hl1Var.b) && this.c.equals(hl1Var.c) && this.d.equals(hl1Var.d) && this.e.equals(hl1Var.e) && this.f.equals(hl1Var.a()) && this.g.equals(hl1Var.g) && this.h.equals(hl1Var.h) && this.i.equals(hl1Var.b());
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
