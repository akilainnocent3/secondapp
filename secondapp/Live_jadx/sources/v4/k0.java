package v4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f140038r = 65;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f140039s = 400;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f140040t = 4000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f140041u = 1.00001f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f140042v = 0.99999f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f140045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f140046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f140047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f140048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f140049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f140050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b<?> f140051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f140052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f140053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f140054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f140055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f140056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f140057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f140058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f140059q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a implements b<float[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f140060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f140061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f140062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f140063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f140064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f140065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f140066g;

        public a() {
            this.f140060a = new float[k0.this.f140050h];
            this.f140061b = new float[k0.this.f140050h * k0.this.f140044b];
            this.f140062c = new float[k0.this.f140050h * k0.this.f140044b];
            this.f140063d = new float[k0.this.f140050h * k0.this.f140044b];
        }

        @Override // v4.k0.b
        public void a(int i10, int i11) {
            for (int i12 = 0; i12 < k0.this.f140044b * i11; i12++) {
                this.f140061b[i10 + i12] = 0.0f;
            }
        }

        @Override // v4.k0.b
        public void b(int i10) {
            this.f140062c = r(this.f140062c, k0.this.f140053k, i10);
        }

        @Override // v4.k0.b
        public boolean c() {
            if (this.f140064e == 0.0d || k0.this.f140058p == 0) {
                return false;
            }
            double d10 = this.f140065f;
            double d11 = this.f140064e;
            return d10 <= d11 * 3.0d && d11 * 2.0d > this.f140066g * 3.0d;
        }

        @Override // v4.k0.b
        public void d(int i10) {
            this.f140061b = r(this.f140061b, k0.this.f140052j, i10);
        }

        @Override // v4.k0.b
        public int f() {
            return 4;
        }

        @Override // v4.k0.b
        public void flush() {
            this.f140066g = 0.0d;
            this.f140064e = 0.0d;
            this.f140065f = 0.0d;
        }

        @Override // v4.k0.b
        public void g(ByteBuffer byteBuffer, int i10) {
            byteBuffer.asFloatBuffer().put(this.f140062c, 0, k0.this.f140044b * i10);
            byteBuffer.position(byteBuffer.position() + (i10 * f() * k0.this.f140044b));
        }

        @Override // v4.k0.b
        public void h(int i10, int i11) {
            int i12 = k0.this.f140050h / i11;
            int i13 = k0.this.f140044b * i11;
            int i14 = i10 * k0.this.f140044b;
            for (int i15 = 0; i15 < i12; i15++) {
                double d10 = 0.0d;
                for (int i16 = 0; i16 < i13; i16++) {
                    d10 += (double) this.f140061b[(i15 * i13) + i14 + i16];
                }
                this.f140060a[i15] = (float) (d10 / ((double) i13));
            }
        }

        @Override // v4.k0.b
        public int i(int i10, int i11, int i12) {
            return s(this.f140061b, i10, i11, i12);
        }

        @Override // v4.k0.b
        public void j(int i10, int i11, int i12, int i13, int i14) {
            float[] fArr = this.f140062c;
            float[] fArr2 = this.f140061b;
            x(i10, i11, fArr, i12, fArr2, i13, fArr2, i14);
        }

        @Override // v4.k0.b
        public int k(int i10, int i11, int i12) {
            return s(this.f140060a, i10, i11, i12);
        }

        @Override // v4.k0.b
        public void l(int i10, long j10, long j11) {
            int i11 = 0;
            while (i11 < k0.this.f140044b) {
                long j12 = j10;
                this.f140062c[(k0.this.f140053k * k0.this.f140044b) + i11] = w(this.f140063d, (k0.this.f140044b * i10) + i11, j12, j11);
                i11++;
                j10 = j12;
            }
        }

        @Override // v4.k0.b
        public void m() {
            this.f140066g = this.f140064e;
        }

        @Override // v4.k0.b
        public void p(ByteBuffer byteBuffer, int i10) {
            byteBuffer.asFloatBuffer().get(this.f140061b, k0.this.f140052j * k0.this.f140044b, i10 / f());
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // v4.k0.b
        public void q(int i10) {
            this.f140063d = r(this.f140063d, k0.this.f140054l, i10);
        }

        public final float[] r(float[] fArr, int i10, int i11) {
            int length = fArr.length / k0.this.f140044b;
            return i10 + i11 <= length ? fArr : Arrays.copyOf(fArr, (((length * 3) / 2) + i11) * k0.this.f140044b);
        }

        public final int s(float[] fArr, int i10, int i11, int i12) {
            int i13 = k0.this.f140044b * i10;
            double d10 = 1.0d;
            int i14 = 0;
            double d11 = 0.0d;
            int i15 = 255;
            int i16 = i11;
            while (i16 <= i12) {
                double dAbs = 0.0d;
                for (int i17 = 0; i17 < i16; i17++) {
                    dAbs += (double) Math.abs(fArr[i13 + i17] - fArr[(i13 + i16) + i17]);
                }
                int i18 = i13;
                double d12 = i16;
                if (((double) i14) * dAbs < d10 * d12) {
                    i14 = i16;
                    d10 = dAbs;
                }
                if (((double) i15) * dAbs > d12 * d11) {
                    i15 = i16;
                    d11 = dAbs;
                }
                i16++;
                i13 = i18;
            }
            this.f140064e = d10 / ((double) i14);
            this.f140065f = d11 / ((double) i15);
            return i14;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public float[] e() {
            return this.f140061b;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public float[] n() {
            return this.f140062c;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public float[] o() {
            return this.f140063d;
        }

        public final float w(float[] fArr, int i10, long j10, long j11) {
            float f10 = fArr[i10];
            float f11 = fArr[i10 + k0.this.f140044b];
            long j12 = ((long) k0.this.f140056n) * j10;
            long j13 = ((long) k0.this.f140055m) * j11;
            long j14 = ((long) (k0.this.f140055m + 1)) * j11;
            long j15 = j14 - j12;
            long j16 = j14 - j13;
            return ((j15 * f10) + ((j16 - j15) * f11)) / j16;
        }

        public final void x(int i10, int i11, float[] fArr, int i12, float[] fArr2, int i13, float[] fArr3, int i14) {
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = (i12 * i11) + i15;
                int i17 = (i14 * i11) + i15;
                int i18 = (i13 * i11) + i15;
                for (int i19 = 0; i19 < i10; i19++) {
                    fArr[i16] = ((fArr2[i18] * (i10 - i19)) + (fArr3[i17] * i19)) / i10;
                    i16 += i11;
                    i18 += i11;
                    i17 += i11;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(int i10, int i11);

        void b(int i10);

        boolean c();

        void d(int i10);

        T e();

        int f();

        void flush();

        void g(ByteBuffer byteBuffer, int i10);

        void h(int i10, int i11);

        int i(int i10, int i11, int i12);

        void j(int i10, int i11, int i12, int i13, int i14);

        int k(int i10, int i11, int i12);

        void l(int i10, long j10, long j11);

        void m();

        T n();

        T o();

        void p(ByteBuffer byteBuffer, int i10);

        void q(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c implements b<short[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short[] f140068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short[] f140069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public short[] f140070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public short[] f140071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f140072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f140073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f140074g;

        public c() {
            this.f140068a = new short[k0.this.f140050h];
            this.f140069b = new short[k0.this.f140050h * k0.this.f140044b];
            this.f140070c = new short[k0.this.f140050h * k0.this.f140044b];
            this.f140071d = new short[k0.this.f140050h * k0.this.f140044b];
        }

        @Override // v4.k0.b
        public void a(int i10, int i11) {
            for (int i12 = 0; i12 < k0.this.f140044b * i11; i12++) {
                this.f140069b[i10 + i12] = 0;
            }
        }

        @Override // v4.k0.b
        public void b(int i10) {
            this.f140070c = r(this.f140070c, k0.this.f140053k, i10);
        }

        @Override // v4.k0.b
        public boolean c() {
            if (this.f140072e == 0 || k0.this.f140058p == 0) {
                return false;
            }
            int i10 = this.f140073f;
            int i11 = this.f140072e;
            return i10 <= i11 * 3 && i11 * 2 > this.f140074g * 3;
        }

        @Override // v4.k0.b
        public void d(int i10) {
            this.f140069b = r(this.f140069b, k0.this.f140052j, i10);
        }

        @Override // v4.k0.b
        public int f() {
            return 2;
        }

        @Override // v4.k0.b
        public void flush() {
            this.f140074g = 0;
            this.f140072e = 0;
            this.f140073f = 0;
        }

        @Override // v4.k0.b
        public void g(ByteBuffer byteBuffer, int i10) {
            byteBuffer.asShortBuffer().put(this.f140070c, 0, k0.this.f140044b * i10);
            byteBuffer.position(byteBuffer.position() + (i10 * f() * k0.this.f140044b));
        }

        @Override // v4.k0.b
        public void h(int i10, int i11) {
            short[] sArr = this.f140069b;
            int i12 = k0.this.f140050h / i11;
            int i13 = k0.this.f140044b * i11;
            int i14 = i10 * k0.this.f140044b;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = 0;
                for (int i17 = 0; i17 < i13; i17++) {
                    i16 += sArr[(i15 * i13) + i14 + i17];
                }
                this.f140068a[i15] = (short) (i16 / i13);
            }
        }

        @Override // v4.k0.b
        public int i(int i10, int i11, int i12) {
            return s(this.f140069b, i10, i11, i12);
        }

        @Override // v4.k0.b
        public void j(int i10, int i11, int i12, int i13, int i14) {
            short[] sArr = this.f140070c;
            short[] sArr2 = this.f140069b;
            x(i10, i11, sArr, i12, sArr2, i13, sArr2, i14);
        }

        @Override // v4.k0.b
        public int k(int i10, int i11, int i12) {
            return s(this.f140068a, i10, i11, i12);
        }

        @Override // v4.k0.b
        public void l(int i10, long j10, long j11) {
            int i11 = 0;
            while (i11 < k0.this.f140044b) {
                long j12 = j10;
                this.f140070c[(k0.this.f140053k * k0.this.f140044b) + i11] = w(this.f140071d, (k0.this.f140044b * i10) + i11, j12, j11);
                i11++;
                j10 = j12;
            }
        }

        @Override // v4.k0.b
        public void m() {
            this.f140074g = this.f140072e;
        }

        @Override // v4.k0.b
        public void p(ByteBuffer byteBuffer, int i10) {
            byteBuffer.asShortBuffer().get(this.f140069b, k0.this.f140052j * k0.this.f140044b, i10 / 2);
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // v4.k0.b
        public void q(int i10) {
            this.f140071d = r(this.f140071d, k0.this.f140054l, i10);
        }

        public final short[] r(short[] sArr, int i10, int i11) {
            int length = sArr.length / k0.this.f140044b;
            return i10 + i11 <= length ? sArr : Arrays.copyOf(sArr, (((length * 3) / 2) + i11) * k0.this.f140044b);
        }

        public final int s(short[] sArr, int i10, int i11, int i12) {
            int i13 = i10 * k0.this.f140044b;
            int i14 = 255;
            int i15 = 1;
            int i16 = 0;
            int i17 = 0;
            while (i11 <= i12) {
                int iAbs = 0;
                for (int i18 = 0; i18 < i11; i18++) {
                    iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
                }
                if (iAbs * i16 < i15 * i11) {
                    i16 = i11;
                    i15 = iAbs;
                }
                if (iAbs * i14 > i17 * i11) {
                    i14 = i11;
                    i17 = iAbs;
                }
                i11++;
            }
            this.f140072e = i15 / i16;
            this.f140073f = i17 / i14;
            return i16;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public short[] e() {
            return this.f140069b;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public short[] n() {
            return this.f140070c;
        }

        @Override // v4.k0.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public short[] o() {
            return this.f140071d;
        }

        public final short w(short[] sArr, int i10, long j10, long j11) {
            short s10 = sArr[i10];
            short s11 = sArr[i10 + k0.this.f140044b];
            long j12 = ((long) k0.this.f140056n) * j10;
            long j13 = ((long) k0.this.f140055m) * j11;
            long j14 = ((long) (k0.this.f140055m + 1)) * j11;
            long j15 = j14 - j12;
            long j16 = j14 - j13;
            return (short) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16);
        }

        public final void x(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = (i12 * i11) + i15;
                int i17 = (i14 * i11) + i15;
                int i18 = (i13 * i11) + i15;
                for (int i19 = 0; i19 < i10; i19++) {
                    sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                    i16 += i11;
                    i18 += i11;
                    i17 += i11;
                }
            }
        }
    }

    public k0(int i10, int i11, float f10, float f11, int i12, boolean z10) {
        this.f140043a = i10;
        this.f140044b = i11;
        this.f140045c = f10;
        this.f140046d = f11;
        this.f140047e = i10 / i12;
        this.f140048f = i10 / 400;
        int i13 = i10 / 65;
        this.f140049g = i13;
        this.f140050h = i13 * 2;
        this.f140051i = z10 ? new a() : new c();
    }

    public static long j(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal bigDecimalDivide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    public static long p(int i10, int i11, float f10, float f11, long j10) {
        float f12 = (i10 / i11) * f11;
        double d10 = f10 / f11;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f12));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d10), RoundingMode.HALF_EVEN);
        }
        return f12 == 1.0f ? bigDecimalValueOf.longValueExact() : bigDecimalValueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - j(bigDecimalValueOf, BigDecimal.valueOf(i10), bigDecimal);
    }

    public static long q(int i10, int i11, float f10, float f11, long j10) {
        long jR = r(BigDecimal.valueOf(i10), new BigDecimal(String.valueOf((i10 / i11) * f11)), BigDecimal.valueOf(j10));
        double d10 = f10 / f11;
        return (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) ? BigDecimal.valueOf(jR).multiply(BigDecimal.valueOf(d10)).setScale(0, RoundingMode.FLOOR).longValueExact() : jR;
    }

    public static long r(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, roundingMode), 0, roundingMode).longValueExact();
    }

    public final void A(int i10) {
        if (i10 == 0) {
            return;
        }
        System.arraycopy(this.f140051i.o(), this.f140044b * i10, this.f140051i.o(), 0, (this.f140054l - i10) * this.f140044b);
        this.f140054l -= i10;
    }

    public final void B(int i10) {
        int i11 = this.f140052j - i10;
        System.arraycopy(this.f140051i.e(), i10 * this.f140044b, this.f140051i.e(), 0, this.f140044b * i11);
        this.f140052j = i11;
    }

    public final int C(int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f140059q;
            int iRound = (int) Math.round(d11);
            this.f140059q = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f140059q;
            int iRound2 = (int) Math.round(d12);
            this.f140057o = iRound2;
            this.f140059q = d12 - ((double) iRound2);
            i12 = i11;
        }
        this.f140051i.b(i12);
        this.f140051i.j(i12, this.f140044b, this.f140053k, i10, i10 + i11);
        this.f140053k += i12;
        return i12;
    }

    public final void i(float f10, int i10) {
        int i11;
        int i12;
        if (this.f140053k == i10) {
            return;
        }
        int i13 = this.f140043a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        w(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f140054l;
            if (i14 >= i15 - 1) {
                A(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f140055m;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f140056n;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f140051i.b(1);
                this.f140051i.l(i14, j11, j10);
                this.f140056n++;
                this.f140053k++;
            }
            int i16 = i11 + 1;
            this.f140055m = i16;
            if (i16 == j11) {
                this.f140055m = 0;
                zi.l0.g0(((long) i12) == j10);
                this.f140056n = 0;
            }
            i14++;
        }
    }

    public final void k(double d10) {
        int iC;
        int i10 = this.f140052j;
        if (i10 < this.f140050h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f140057o > 0) {
                iC = l(i11);
            } else {
                int iN = n(i11);
                iC = d10 > 1.0d ? iN + C(i11, d10, iN) : v(i11, d10, iN);
            }
            i11 += iC;
        } while (this.f140050h + i11 <= i10);
        B(i11);
    }

    public final int l(int i10) {
        int iMin = Math.min(this.f140050h, this.f140057o);
        m(i10, iMin);
        this.f140057o -= iMin;
        return iMin;
    }

    public final void m(int i10, int i11) {
        this.f140051i.b(i11);
        Object objE = this.f140051i.e();
        int i12 = i10 * this.f140044b;
        Object objN = this.f140051i.n();
        int i13 = this.f140053k;
        int i14 = this.f140044b;
        System.arraycopy(objE, i12, objN, i13 * i14, i14 * i11);
        this.f140053k += i11;
    }

    public final int n(int i10) {
        int iK;
        int i11 = this.f140043a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f140044b == 1 && i12 == 1) {
            iK = this.f140051i.i(i10, this.f140048f, this.f140049g);
        } else {
            this.f140051i.h(i10, i12);
            int iK2 = this.f140051i.k(0, this.f140048f / i12, this.f140049g / i12);
            if (i12 != 1) {
                int i13 = iK2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f140048f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f140049g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f140044b == 1) {
                    iK = this.f140051i.i(i10, i15, i16);
                } else {
                    this.f140051i.h(i10, 1);
                    iK = this.f140051i.k(0, i15, i16);
                }
            } else {
                iK = iK2;
            }
        }
        int i19 = this.f140051i.c() ? this.f140058p : iK;
        this.f140051i.m();
        this.f140058p = iK;
        return i19;
    }

    public void o() {
        this.f140052j = 0;
        this.f140053k = 0;
        this.f140054l = 0;
        this.f140055m = 0;
        this.f140056n = 0;
        this.f140057o = 0;
        this.f140058p = 0;
        this.f140059q = 0.0d;
        this.f140051i.flush();
    }

    public void s(ByteBuffer byteBuffer) {
        zi.l0.g0(this.f140053k >= 0);
        int iMin = Math.min(byteBuffer.remaining() / (this.f140044b * this.f140051i.f()), this.f140053k);
        this.f140051i.g(byteBuffer, iMin);
        this.f140053k -= iMin;
        System.arraycopy(this.f140051i.n(), iMin * this.f140044b, this.f140051i.n(), 0, this.f140053k * this.f140044b);
    }

    public int t() {
        zi.l0.g0(this.f140053k >= 0);
        return this.f140053k * this.f140044b * this.f140051i.f();
    }

    public int u() {
        return this.f140052j * this.f140044b * this.f140051i.f();
    }

    public final int v(int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f140059q;
            int iRound = (int) Math.round(d11);
            this.f140059q = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f140059q;
            int iRound2 = (int) Math.round(d12);
            this.f140057o = iRound2;
            this.f140059q = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        this.f140051i.b(i13);
        Object objE = this.f140051i.e();
        int i14 = this.f140044b * i10;
        Object objN = this.f140051i.n();
        int i15 = this.f140053k;
        int i16 = this.f140044b;
        System.arraycopy(objE, i14, objN, i15 * i16, i16 * i11);
        this.f140051i.j(i12, this.f140044b, this.f140053k + i11, i10 + i11, i10);
        this.f140053k += i13;
        return i12;
    }

    public final void w(int i10) {
        int i11 = this.f140053k - i10;
        this.f140051i.q(i11);
        Object objN = this.f140051i.n();
        int i12 = this.f140044b * i10;
        Object objO = this.f140051i.o();
        int i13 = this.f140054l;
        int i14 = this.f140044b;
        System.arraycopy(objN, i12, objO, i13 * i14, i14 * i11);
        this.f140053k = i10;
        this.f140054l += i11;
    }

    public final void x() {
        int i10 = this.f140053k;
        float f10 = this.f140045c;
        float f11 = this.f140046d;
        double d10 = f10 / f11;
        float f12 = this.f140047e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            k(d10);
        } else {
            m(0, this.f140052j);
            this.f140052j = 0;
        }
        if (f12 != 1.0f) {
            i(f12, i10);
        }
    }

    public void y() {
        int i10 = this.f140052j;
        float f10 = this.f140045c;
        float f11 = this.f140046d;
        double d10 = f10 / f11;
        double d11 = this.f140047e * f11;
        int i11 = this.f140057o;
        int i12 = this.f140053k + ((int) ((((((((double) (i10 - i11)) / d10) + ((double) i11)) + this.f140059q) + ((double) this.f140054l)) / d11) + 0.5d));
        this.f140059q = 0.0d;
        this.f140051i.d((this.f140050h * 2) + i10);
        this.f140051i.a(i10 * this.f140044b, this.f140050h * 2);
        this.f140052j += this.f140050h * 2;
        x();
        if (this.f140053k > i12) {
            this.f140053k = Math.max(i12, 0);
        }
        this.f140052j = 0;
        this.f140057o = 0;
        this.f140054l = 0;
    }

    public void z(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int iF = iRemaining / (this.f140044b * this.f140051i.f());
        this.f140051i.d(iF);
        this.f140051i.p(byteBuffer, iRemaining);
        this.f140052j += iF;
        x();
    }
}
