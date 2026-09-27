package gj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
public abstract class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f86921b = cv.k.f77221a.toCharArray();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends p implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f86922d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f86923c;

        public a(byte[] bytes) {
            this.f86923c = (byte[]) zi.l0.E(bytes);
        }

        @Override // gj.p
        public byte[] d() {
            return (byte[]) this.f86923c.clone();
        }

        @Override // gj.p
        public int g() {
            byte[] bArr = this.f86923c;
            zi.l0.n0(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f86923c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // gj.p
        public long h() {
            byte[] bArr = this.f86923c;
            zi.l0.n0(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return r();
        }

        @Override // gj.p
        public int i() {
            return this.f86923c.length * 8;
        }

        @Override // gj.p
        public boolean k(p that) {
            if (this.f86923c.length != that.q().length) {
                return false;
            }
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f86923c;
                if (i10 >= bArr.length) {
                    return z10;
                }
                z10 &= bArr[i10] == that.q()[i10];
                i10++;
            }
        }

        @Override // gj.p
        public byte[] q() {
            return this.f86923c;
        }

        @Override // gj.p
        public long r() {
            long j10 = this.f86923c[0] & 255;
            for (int i10 = 1; i10 < Math.min(this.f86923c.length, 8); i10++) {
                j10 |= (((long) this.f86923c[i10]) & 255) << (i10 * 8);
            }
            return j10;
        }

        @Override // gj.p
        public void t(byte[] dest, int offset, int maxLength) {
            System.arraycopy(this.f86923c, 0, dest, offset, maxLength);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends p implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f86924d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86925c;

        public b(int hash) {
            this.f86925c = hash;
        }

        @Override // gj.p
        public byte[] d() {
            int i10 = this.f86925c;
            return new byte[]{(byte) i10, (byte) (i10 >> 8), (byte) (i10 >> 16), (byte) (i10 >> 24)};
        }

        @Override // gj.p
        public int g() {
            return this.f86925c;
        }

        @Override // gj.p
        public long h() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // gj.p
        public int i() {
            return 32;
        }

        @Override // gj.p
        public boolean k(p that) {
            return this.f86925c == that.g();
        }

        @Override // gj.p
        public long r() {
            return lj.w.r(this.f86925c);
        }

        @Override // gj.p
        public void t(byte[] dest, int offset, int maxLength) {
            for (int i10 = 0; i10 < maxLength; i10++) {
                dest[offset + i10] = (byte) (this.f86925c >> (i10 * 8));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends p implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f86926d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f86927c;

        public c(long hash) {
            this.f86927c = hash;
        }

        @Override // gj.p
        public byte[] d() {
            long j10 = this.f86927c;
            return new byte[]{(byte) j10, (byte) (j10 >> 8), (byte) (j10 >> 16), (byte) (j10 >> 24), (byte) (j10 >> 32), (byte) (j10 >> 40), (byte) (j10 >> 48), (byte) (j10 >> 56)};
        }

        @Override // gj.p
        public int g() {
            return (int) this.f86927c;
        }

        @Override // gj.p
        public long h() {
            return this.f86927c;
        }

        @Override // gj.p
        public int i() {
            return 64;
        }

        @Override // gj.p
        public boolean k(p that) {
            return this.f86927c == that.h();
        }

        @Override // gj.p
        public long r() {
            return this.f86927c;
        }

        @Override // gj.p
        public void t(byte[] dest, int offset, int maxLength) {
            for (int i10 = 0; i10 < maxLength; i10++) {
                dest[offset + i10] = (byte) (this.f86927c >> (i10 * 8));
            }
        }
    }

    public static int j(char ch2) {
        if (ch2 >= '0' && ch2 <= '9') {
            return ch2 - '0';
        }
        if (ch2 >= 'a' && ch2 <= 'f') {
            return ch2 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + ch2);
    }

    public static p l(byte[] bytes) {
        zi.l0.e(bytes.length >= 1, "A HashCode must contain at least 1 byte.");
        return m((byte[]) bytes.clone());
    }

    public static p m(byte[] bytes) {
        return new a(bytes);
    }

    public static p n(int hash) {
        return new b(hash);
    }

    public static p o(long hash) {
        return new c(hash);
    }

    public static p p(String string) {
        zi.l0.u(string.length() >= 2, "input string (%s) must have at least 2 characters", string);
        zi.l0.u(string.length() % 2 == 0, "input string (%s) must have an even number of characters", string);
        byte[] bArr = new byte[string.length() / 2];
        for (int i10 = 0; i10 < string.length(); i10 += 2) {
            bArr[i10 / 2] = (byte) ((j(string.charAt(i10)) << 4) + j(string.charAt(i10 + 1)));
        }
        return m(bArr);
    }

    public abstract byte[] d();

    public final boolean equals(@zq.a Object object) {
        if (object instanceof p) {
            p pVar = (p) object;
            if (i() == pVar.i() && k(pVar)) {
                return true;
            }
        }
        return false;
    }

    public abstract int g();

    public abstract long h();

    public final int hashCode() {
        if (i() >= 32) {
            return g();
        }
        byte[] bArrQ = q();
        int i10 = bArrQ[0] & 255;
        for (int i11 = 1; i11 < bArrQ.length; i11++) {
            i10 |= (bArrQ[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public abstract int i();

    public abstract boolean k(p that);

    public byte[] q() {
        return d();
    }

    public abstract long r();

    @qj.a
    public int s(byte[] dest, int offset, int maxLength) {
        int iV = lj.l.v(maxLength, i() / 8);
        zi.l0.f0(offset, offset + iV, dest.length);
        t(dest, offset, iV);
        return iV;
    }

    public abstract void t(byte[] dest, int offset, int maxLength);

    public final String toString() {
        byte[] bArrQ = q();
        StringBuilder sb2 = new StringBuilder(bArrQ.length * 2);
        for (byte b10 : bArrQ) {
            char[] cArr = f86921b;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & zi.c.f161639q]);
        }
        return sb2.toString();
    }
}
