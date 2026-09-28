package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class jrz {
    public final e90 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public jrz(e90 e90Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = e90Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final lk40 a(lk40 lk40Var) {
        return lk40Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = ulf0.b;
            if (ulf0.b(j, j2)) {
                return j2;
            }
        }
        int i = ulf0.c;
        int i2 = this.b;
        return vlf0.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final lk40 c(lk40 lk40Var) {
        float f = -this.f;
        return lk40Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return f.e(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jrz) {
            jrz jrzVar = (jrz) obj;
            if (this.a == jrzVar.a && this.b == jrzVar.b && this.c == jrzVar.c && this.d == jrzVar.d && this.e == jrzVar.e && Float.compare(this.f, jrzVar.f) == 0 && Float.compare(this.g, jrzVar.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + tvh.a(this.f, gpp.a(this.e, gpp.a(this.d, gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(QQWMbKFOuTf.WICMFapQBhI);
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return h70.a(sb, this.g, ')');
    }
}
