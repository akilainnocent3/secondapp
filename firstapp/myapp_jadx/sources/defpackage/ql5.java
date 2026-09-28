package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ql5 implements Iterable<Byte>, Serializable {
    public static final f b = new f(gyo.b);
    public static final d c;
    public int a = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            nl5 nl5Var = (nl5) this;
            int i = nl5Var.a;
            if (i < nl5Var.b) {
                nl5Var.a = i + 1;
                return Byte.valueOf(nl5Var.c.e(i));
            }
            lrh0.a();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements d {
        @Override // ql5.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class c extends f {
        public final int e;
        public final int f;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            ql5.b(i, i + i2, bArr.length);
            this.e = i;
            this.f = i2;
        }

        @Override // ql5.f, defpackage.ql5
        public final byte a(int i) {
            int i2 = this.f;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.d[this.e + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(hce0.a(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(whs.b(i, i2, "Index > length: ", ", "));
        }

        @Override // ql5.f, defpackage.ql5
        public final void d(int i, byte[] bArr) {
            System.arraycopy(this.d, this.e, bArr, 0, i);
        }

        @Override // ql5.f, defpackage.ql5
        public final byte e(int i) {
            return this.d[this.e + i];
        }

        @Override // ql5.f
        public final int n() {
            return this.e;
        }

        @Override // ql5.f, defpackage.ql5
        public final int size() {
            return this.f;
        }
    }

    public interface d {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public static abstract class e extends ql5 {
        @Override // defpackage.ql5, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new nl5(this);
        }
    }

    public static class f extends e {
        public final byte[] d;

        public f(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // defpackage.ql5
        public byte a(int i) {
            return this.d[i];
        }

        @Override // defpackage.ql5
        public void d(int i, byte[] bArr) {
            System.arraycopy(this.d, 0, bArr, 0, i);
        }

        @Override // defpackage.ql5
        public byte e(int i) {
            return this.d[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof ql5) && size() == ((ql5) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return obj.equals(this);
                }
                f fVar = (f) obj;
                int i = this.a;
                int i2 = fVar.a;
                if (i == 0 || i2 == 0 || i == i2) {
                    int size = size();
                    if (size > fVar.size()) {
                        pe4.c(size, size());
                        return false;
                    }
                    if (size > fVar.size()) {
                        StringBuilder sbA = efe0.a(size, "Ran off end of other: 0, ", ", ");
                        sbA.append(fVar.size());
                        throw new IllegalArgumentException(sbA.toString());
                    }
                    byte[] bArr = fVar.d;
                    int iN = n() + size;
                    int iN2 = n();
                    int iN3 = fVar.n();
                    while (iN2 < iN) {
                        if (this.d[iN2] == bArr[iN3]) {
                            iN2++;
                            iN3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.ql5
        public final boolean f() {
            int iN = n();
            return yqh0.a.c(this.d, iN, size() + iN);
        }

        @Override // defpackage.ql5
        public final m08.a h() {
            int iN = n();
            int size = size();
            m08.a aVar = new m08.a(this.d, iN, size, true);
            try {
                aVar.g(size);
                return aVar;
            } catch (f0p e) {
                m8j.a(e);
                return null;
            }
        }

        @Override // defpackage.ql5
        public final int i(int i, int i2) {
            int iN = n();
            Charset charset = gyo.a;
            for (int i3 = iN; i3 < iN + i2; i3++) {
                i = (i * 31) + this.d[i3];
            }
            return i;
        }

        @Override // defpackage.ql5
        public final f j(int i) {
            int iB = ql5.b(0, i, size());
            return iB == 0 ? ql5.b : new c(this.d, n(), iB);
        }

        @Override // defpackage.ql5
        public final String l(Charset charset) {
            return new String(this.d, n(), size(), charset);
        }

        @Override // defpackage.ql5
        public final void m(r08.a aVar) {
            aVar.t0(this.d, n(), size());
        }

        public int n() {
            return 0;
        }

        @Override // defpackage.ql5
        public int size() {
            return this.d.length;
        }
    }

    public static final class g implements d {
        @Override // ql5.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = o20.a() ? new g() : new b();
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            mae0.a(pe4.b(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            mae0.a(whs.b(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        mae0.a(whs.b(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static f c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new f(c.copyFrom(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void d(int i, byte[] bArr);

    public abstract byte e(int i);

    public abstract boolean f();

    public abstract m08.a h();

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = i(size, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new nl5(this);
    }

    public abstract f j(int i);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return gyo.b;
        }
        byte[] bArr = new byte[size];
        d(size, bArr);
        return bArr;
    }

    public abstract String l(Charset charset);

    public abstract void m(r08.a aVar);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return uf80.a(ml5.a(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? pm2.a(this) : pm2.a(j(47)).concat("..."), "\">");
    }
}
