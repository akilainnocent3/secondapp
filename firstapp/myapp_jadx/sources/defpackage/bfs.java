package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class bfs implements LineHeightSpan {
    public int A;
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final boolean f;
    public int i = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int w = Integer.MIN_VALUE;
    public int y = Integer.MIN_VALUE;
    public int z;

    public bfs(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            xkn.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.b;
        boolean z3 = this.d;
        boolean z4 = this.c;
        if (z && z2 && z4 && z3) {
            return;
        }
        int i7 = this.i;
        if (i7 == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.a);
            int i9 = iCeil - i8;
            if (!this.f || i9 > 0) {
                float fAbs = this.e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.w = i11;
                int i12 = i11 - iCeil;
                this.v = i12;
                if (z4) {
                    i12 = fontMetricsInt.ascent;
                }
                this.i = i12;
                if (z3) {
                    i11 = i10;
                }
                this.y = i11;
                this.z = fontMetricsInt.ascent - i12;
                this.A = i11 - i10;
                i7 = i12;
            } else {
                int i13 = fontMetricsInt.ascent;
                this.v = i13;
                int i14 = fontMetricsInt.descent;
                this.w = i14;
                this.i = i13;
                this.y = i14;
                this.z = 0;
                this.A = 0;
                i7 = i13;
            }
        }
        if (!z) {
            i7 = this.v;
        }
        fontMetricsInt.ascent = i7;
        fontMetricsInt.descent = z2 ? this.y : this.w;
    }
}
