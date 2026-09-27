package i3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f90288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90289b;

    public a() {
        this(10);
    }

    @Override // i3.r
    public void a(float f10) {
        setFloat(this.f90289b, f10);
        this.f90289b += 4;
    }

    @Override // i3.r
    public void b(int i10) {
        setInt(this.f90289b, i10);
        this.f90289b += 4;
    }

    @Override // i3.r
    public void c(long j10) {
        setLong(this.f90289b, j10);
        this.f90289b += 8;
    }

    @Override // i3.r
    public void d(double d10) {
        setDouble(this.f90289b, d10);
        this.f90289b += 8;
    }

    @Override // i3.r
    public void e(short s10) {
        o(this.f90289b, s10);
        this.f90289b += 2;
    }

    @Override // i3.r
    public void f(boolean z10) {
        setBoolean(this.f90289b, z10);
        this.f90289b++;
    }

    @Override // i3.r, i3.q
    public int g() {
        return this.f90289b;
    }

    @Override // i3.q
    public byte get(int i10) {
        return this.f90288a[i10];
    }

    @Override // i3.q
    public boolean getBoolean(int i10) {
        return this.f90288a[i10] != 0;
    }

    @Override // i3.q
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // i3.q
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // i3.q
    public int getInt(int i10) {
        byte[] bArr = this.f90288a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << zi.c.B) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // i3.q
    public long getLong(int i10) {
        byte[] bArr = this.f90288a;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40);
        return (((long) bArr[i10 + 7]) << 56) | j10 | ((255 & ((long) bArr[i10 + 6])) << 48);
    }

    @Override // i3.q
    public short getShort(int i10) {
        byte[] bArr = this.f90288a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // i3.q
    public byte[] h() {
        return this.f90288a;
    }

    @Override // i3.r
    public boolean i(int i10) {
        byte[] bArr = this.f90288a;
        if (bArr.length > i10) {
            return true;
        }
        int length = bArr.length;
        this.f90288a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // i3.r
    public void j(int i10, byte b10) {
        i(i10 + 1);
        this.f90288a[i10] = b10;
    }

    @Override // i3.r
    public int k() {
        return this.f90289b;
    }

    @Override // i3.r
    public void l(byte b10) {
        j(this.f90289b, b10);
        this.f90289b++;
    }

    @Override // i3.r
    public void m(int i10, byte[] bArr, int i11, int i12) {
        i((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f90288a, i10, i12);
    }

    @Override // i3.q
    public String n(int i10, int i11) {
        return b0.g(this.f90288a, i10, i11);
    }

    @Override // i3.r
    public void o(int i10, short s10) {
        i(i10 + 2);
        byte[] bArr = this.f90288a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }

    @Override // i3.r
    public void p(byte[] bArr, int i10, int i11) {
        m(this.f90289b, bArr, i10, i11);
        this.f90289b += i11;
    }

    @Override // i3.r
    public void setBoolean(int i10, boolean z10) {
        j(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // i3.r
    public void setDouble(int i10, double d10) {
        i(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f90288a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    @Override // i3.r
    public void setFloat(int i10, float f10) {
        i(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f90288a;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        bArr[i10 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i10 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i10 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // i3.r
    public void setInt(int i10, int i11) {
        i(i10 + 4);
        byte[] bArr = this.f90288a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    @Override // i3.r
    public void setLong(int i10, long j10) {
        i(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f90288a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public a(int i10) {
        this(new byte[i10]);
    }

    public a(byte[] bArr) {
        this.f90288a = bArr;
        this.f90289b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f90288a = bArr;
        this.f90289b = i10;
    }
}
