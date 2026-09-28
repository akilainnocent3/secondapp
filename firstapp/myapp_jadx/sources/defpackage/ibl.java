package defpackage;

import androidx.compose.runtime.m;

/* JADX INFO: loaded from: classes7.dex */
public final class ibl {
    public final wd0<gly, jj0> a;
    public final wd0<Float, ij0> b;
    public final wd0<Float, ij0> c;
    public final ytw<Boolean> d = m.b(Boolean.FALSE);

    public ibl(float f, float f2, long j) {
        this.a = new wd0<>(new gly((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32)), gjs.g, null, 12);
        this.b = ee0.a(f);
        this.c = ee0.a(f2);
    }
}
