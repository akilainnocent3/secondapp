package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class hg4 extends m750 {
    public final float b;
    public final float c;
    public final int d;

    public hg4(int i, float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.m750
    public final RenderEffect b() {
        return p750.a(this.d, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg4)) {
            return false;
        }
        hg4 hg4Var = (hg4) obj;
        return this.b == hg4Var.b && this.c == hg4Var.c && this.d == hg4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + tvh.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) csb.a(this.d)) + ')';
    }
}
