package qh;

import androidx.annotation.NonNull;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f122248i = 0.1f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f122250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f122251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f122252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f122253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f122254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f122255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f122256h;

    public a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f122249a = i10;
        this.f122250b = s1.a.d(f10, f11, f12);
        this.f122251c = i11;
        this.f122253e = f13;
        this.f122252d = i12;
        this.f122254f = f14;
        this.f122255g = i13;
        d(f15, f11, f12, f14);
        this.f122256h = b(f14);
    }

    public static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f122256h < aVar.f122256h) {
                        if (aVar2.f122256h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    public final float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    public final float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f122254f) * this.f122249a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f122251c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f122250b;
            this.f122250b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f122250b;
            this.f122250b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f122251c;
        float f17 = i11 > 0 ? this.f122250b : 0.0f;
        this.f122250b = f17;
        float fA = a(f10, i11, f17, this.f122252d, this.f122255g);
        this.f122254f = fA;
        float f18 = (this.f122250b + fA) / 2.0f;
        this.f122253e = f18;
        int i12 = this.f122252d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f122255g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f122253e -= fMin / this.f122252d;
            this.f122254f += fMin / this.f122255g;
        } else {
            this.f122253e += fMin / this.f122252d;
            this.f122254f -= fMin / this.f122255g;
        }
    }

    public int e() {
        return this.f122251c + this.f122252d + this.f122255g;
    }

    public final float f() {
        return (this.f122254f * this.f122255g) + (this.f122253e * this.f122252d) + (this.f122250b * this.f122251c);
    }

    public final boolean g() {
        int i10 = this.f122255g;
        if (i10 <= 0 || this.f122251c <= 0 || this.f122252d <= 0) {
            return i10 <= 0 || this.f122251c <= 0 || this.f122254f > this.f122250b;
        }
        float f10 = this.f122254f;
        float f11 = this.f122253e;
        return f10 > f11 && f11 > this.f122250b;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.f122249a + ", smallCount=" + this.f122251c + ", smallSize=" + this.f122250b + ", mediumCount=" + this.f122252d + ", mediumSize=" + this.f122253e + ", largeCount=" + this.f122255g + ", largeSize=" + this.f122254f + ", cost=" + this.f122256h + C4235d4.j.f61462e;
    }
}
