package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class owh {
    public float[] a;
    public int b;
    public final boolean c;

    public owh(int i, int i2) {
        this.c = true;
        this.a = new float[i];
    }

    public final void a(float f) {
        float[] fArr = this.a;
        int i = this.b;
        if (i == fArr.length) {
            int iMax = Math.max(8, (int) (i * 1.75f));
            float[] fArr2 = new float[iMax];
            System.arraycopy(this.a, 0, fArr2, 0, Math.min(this.b, iMax));
            this.a = fArr2;
            fArr = fArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        fArr[i2] = f;
    }

    public final void b(float[] fArr, int i) {
        float[] fArr2 = this.a;
        int i2 = this.b + i;
        if (i2 > fArr2.length) {
            int iMax = Math.max(Math.max(8, i2), (int) (this.b * 1.75f));
            float[] fArr3 = new float[iMax];
            System.arraycopy(this.a, 0, fArr3, 0, Math.min(this.b, iMax));
            this.a = fArr3;
            fArr2 = fArr3;
        }
        System.arraycopy(fArr, 0, fArr2, this.b, i);
        this.b += i;
    }

    public final float c(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        ks40.a(this.b, efe0.a(i, "index can't be >= size: ", " >= "));
        return 0.0f;
    }

    public final float[] d(int i) {
        if (i < 0) {
            hb5.a(hce0.a(i, "newSize must be >= 0: "));
            return null;
        }
        float[] fArr = this.a;
        if (i > fArr.length) {
            int iMax = Math.max(8, i);
            float[] fArr2 = new float[iMax];
            System.arraycopy(this.a, 0, fArr2, 0, Math.min(this.b, iMax));
            this.a = fArr2;
            fArr = fArr2;
        }
        this.b = i;
        return fArr;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (this.c && (obj instanceof owh)) {
            owh owhVar = (owh) obj;
            if (owhVar.c && (i = this.b) == owhVar.b) {
                float[] fArr = this.a;
                float[] fArr2 = owhVar.a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (fArr[i2] == fArr2[i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (!this.c) {
            return super.hashCode();
        }
        float[] fArr = this.a;
        int i = this.b;
        int iFloatToRawIntBits = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToRawIntBits = (iFloatToRawIntBits * 31) + Float.floatToRawIntBits(fArr[i2]);
        }
        return iFloatToRawIntBits;
    }

    public final String toString() {
        if (this.b == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        float[] fArr = this.a;
        j9e0 j9e0Var = new j9e0(32);
        j9e0Var.b('[');
        j9e0Var.c(Float.toString(fArr[0]));
        for (int i = 1; i < this.b; i++) {
            j9e0Var.c(", ");
            j9e0Var.c(Float.toString(fArr[i]));
        }
        j9e0Var.b(']');
        return j9e0Var.toString();
    }

    public owh() {
        this(16, 0);
    }
}
