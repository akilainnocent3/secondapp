package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hxh0 {
    public final boolean a;
    public final a b;
    public final int c;
    public final spc[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("Lsq2", 0);
            a = aVar;
            a aVar2 = new a("Impulse", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public hxh0(boolean z, a aVar) {
        int i;
        this.a = z;
        this.b = aVar;
        if (z && aVar.equals(a.a)) {
            ib5.a("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new spc[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        spc[] spcVarArr = this.d;
        spc spcVar = spcVarArr[i];
        if (spcVar != null) {
            spcVar.a = j;
            spcVar.b = f;
        } else {
            spc spcVar2 = new spc();
            spcVar2.a = j;
            spcVar2.b = f;
            spcVarArr[i] = spcVar2;
        }
    }

    public final float b(float f) {
        a aVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            wkn.c("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        spc[] spcVarArr = this.d;
        spc spcVar = spcVarArr[i2];
        if (spcVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            spc spcVar2 = spcVar;
            while (true) {
                spc spcVar3 = spcVarArr[i2];
                boolean z2 = this.a;
                aVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (spcVar3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = spcVar.a;
                f2 = f4;
                int i4 = i2;
                long j2 = spcVar3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - spcVar2.a);
                spcVar2 = (aVar == a.a || z) ? spcVar3 : spcVar;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = spcVar3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        mxh0.c(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        uhc.a();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ hxh0() {
        this(false, a.a);
    }

    public hxh0(int i) {
        this(true, a.b);
    }
}
