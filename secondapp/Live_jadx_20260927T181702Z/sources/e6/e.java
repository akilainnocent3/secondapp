package e6;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80376e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80377f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80378g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80379h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f80380i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f80382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f80383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f80384d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c[] f80385a;

        public b(c... cVarArr) {
            this.f80385a = cVarArr;
        }

        public c a(int i10) {
            return this.f80385a[i10];
        }

        public int b() {
            return this.f80385a.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f80386e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f80389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f80390d;

        public c(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f80387a = i10;
            l0.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f80389c = fArr;
            this.f80390d = fArr2;
            this.f80388b = i11;
        }

        public int a() {
            return this.f80389c.length / 3;
        }
    }

    public e(b bVar, int i10) {
        this(bVar, bVar, i10);
    }

    public static e a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        int i14 = i10;
        l0.d(f10 > 0.0f);
        l0.d(i14 >= 1);
        l0.d(i11 >= 1);
        l0.d(f11 > 0.0f && f11 <= 180.0f);
        l0.d(f12 > 0.0f && f12 <= 360.0f);
        float radians = (float) Math.toRadians(f11);
        float radians2 = (float) Math.toRadians(f12);
        float f13 = radians / i14;
        float f14 = radians2 / i11;
        int i15 = i11 + 1;
        int i16 = ((i15 * 2) + 2) * i14;
        float[] fArr = new float[i16 * 3];
        float[] fArr2 = new float[i16 * 2];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i14) {
            float f15 = radians / 2.0f;
            float f16 = (i17 * f13) - f15;
            int i20 = i17 + 1;
            float f17 = (i20 * f13) - f15;
            int i21 = 0;
            while (i21 < i15) {
                float f18 = radians;
                float f19 = radians2;
                int i22 = 0;
                int i23 = 2;
                while (i22 < i23) {
                    float f20 = f13;
                    float f21 = i21 * f14;
                    float f22 = f14;
                    float f23 = f16;
                    double d10 = f10;
                    double d11 = (f21 + 3.1415927f) - (f19 / 2.0f);
                    double d12 = i22 == 0 ? f16 : f17;
                    fArr[i18] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    fArr[i18 + 1] = (float) (d10 * Math.sin(d12));
                    int i24 = i18 + 3;
                    fArr[i18 + 2] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    fArr2[i19] = f21 / f19;
                    int i25 = i19 + 2;
                    fArr2[i19 + 1] = ((i17 + i22) * f20) / f18;
                    if ((i21 == 0 && i22 == 0) || (i21 == i11 && i22 == 1)) {
                        System.arraycopy(fArr, i18, fArr, i24, 3);
                        i18 += 6;
                        i13 = 2;
                        System.arraycopy(fArr2, i19, fArr2, i25, 2);
                        i19 += 4;
                    } else {
                        i13 = 2;
                        i18 = i24;
                        i19 = i25;
                    }
                    i22++;
                    i23 = i13;
                    f13 = f20;
                    f14 = f22;
                    f16 = f23;
                }
                i21++;
                radians2 = f19;
                radians = f18;
                f13 = f13;
            }
            i14 = i10;
            i17 = i20;
        }
        return new e(new b(new c(0, fArr, fArr2, 1)), i12);
    }

    public static e b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }

    public e(b bVar, b bVar2, int i10) {
        this.f80381a = bVar;
        this.f80382b = bVar2;
        this.f80383c = i10;
        this.f80384d = bVar == bVar2;
    }
}
