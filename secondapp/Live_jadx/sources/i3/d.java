package i3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f90299a;

    public d(ByteBuffer byteBuffer) {
        this.f90299a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // i3.r
    public void a(float f10) {
        this.f90299a.putFloat(f10);
    }

    @Override // i3.r
    public void b(int i10) {
        this.f90299a.putInt(i10);
    }

    @Override // i3.r
    public void c(long j10) {
        this.f90299a.putLong(j10);
    }

    @Override // i3.r
    public void d(double d10) {
        this.f90299a.putDouble(d10);
    }

    @Override // i3.r
    public void e(short s10) {
        this.f90299a.putShort(s10);
    }

    @Override // i3.r
    public void f(boolean z10) {
        this.f90299a.put(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // i3.r, i3.q
    public int g() {
        return this.f90299a.limit();
    }

    @Override // i3.q
    public byte get(int i10) {
        return this.f90299a.get(i10);
    }

    @Override // i3.q
    public boolean getBoolean(int i10) {
        return get(i10) != 0;
    }

    @Override // i3.q
    public double getDouble(int i10) {
        return this.f90299a.getDouble(i10);
    }

    @Override // i3.q
    public float getFloat(int i10) {
        return this.f90299a.getFloat(i10);
    }

    @Override // i3.q
    public int getInt(int i10) {
        return this.f90299a.getInt(i10);
    }

    @Override // i3.q
    public long getLong(int i10) {
        return this.f90299a.getLong(i10);
    }

    @Override // i3.q
    public short getShort(int i10) {
        return this.f90299a.getShort(i10);
    }

    @Override // i3.q
    public byte[] h() {
        return this.f90299a.array();
    }

    @Override // i3.r
    public boolean i(int i10) {
        return i10 <= this.f90299a.limit();
    }

    @Override // i3.r
    public void j(int i10, byte b10) {
        i(i10 + 1);
        this.f90299a.put(i10, b10);
    }

    @Override // i3.r
    public int k() {
        return this.f90299a.position();
    }

    @Override // i3.r
    public void l(byte b10) {
        this.f90299a.put(b10);
    }

    @Override // i3.r
    public void m(int i10, byte[] bArr, int i11, int i12) {
        i((i12 - i11) + i10);
        int iPosition = this.f90299a.position();
        this.f90299a.position(i10);
        this.f90299a.put(bArr, i11, i12);
        this.f90299a.position(iPosition);
    }

    @Override // i3.q
    public String n(int i10, int i11) {
        return b0.h(this.f90299a, i10, i11);
    }

    @Override // i3.r
    public void o(int i10, short s10) {
        i(i10 + 2);
        this.f90299a.putShort(i10, s10);
    }

    @Override // i3.r
    public void p(byte[] bArr, int i10, int i11) {
        this.f90299a.put(bArr, i10, i11);
    }

    @Override // i3.r
    public void setBoolean(int i10, boolean z10) {
        j(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // i3.r
    public void setDouble(int i10, double d10) {
        i(i10 + 8);
        this.f90299a.putDouble(i10, d10);
    }

    @Override // i3.r
    public void setFloat(int i10, float f10) {
        i(i10 + 4);
        this.f90299a.putFloat(i10, f10);
    }

    @Override // i3.r
    public void setInt(int i10, int i11) {
        i(i10 + 4);
        this.f90299a.putInt(i10, i11);
    }

    @Override // i3.r
    public void setLong(int i10, long j10) {
        i(i10 + 8);
        this.f90299a.putLong(i10, j10);
    }
}
