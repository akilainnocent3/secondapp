package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class g7f implements Comparable<g7f> {
    public final float a;

    public /* synthetic */ g7f(float f) {
        this.a = f;
    }

    public static final /* synthetic */ g7f a(float f) {
        return new g7f(f);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(g7f g7fVar) {
        return Float.compare(this.a, g7fVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g7f) {
            return Float.compare(this.a, ((g7f) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
