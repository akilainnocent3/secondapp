package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pxh {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pxh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pxh)) {
            return false;
        }
        pxh pxhVar = (pxh) obj;
        if (g7f.b(this.a, pxhVar.a) && g7f.b(this.b, pxhVar.b) && g7f.b(this.c, pxhVar.c)) {
            return g7f.b(this.d, pxhVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
