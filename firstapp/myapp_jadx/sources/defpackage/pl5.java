package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class pl5 implements Iterable<Byte>, Serializable {
    public static final f b = new f(fyo.b);
    public static final d c;
    public int a = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            ol5 ol5Var = (ol5) this;
            int i = ol5Var.a;
            if (i < ol5Var.b) {
                ol5Var.a = i + 1;
                return Byte.valueOf(ol5Var.c.e(i));
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
        @Override // pl5.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class c extends f {
        public final int e;
        public final int f;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            pl5.b(i, i + i2, bArr.length);
            this.e = i;
            this.f = i2;
        }

        @Override // pl5.f, defpackage.pl5
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

        @Override // pl5.f, defpackage.pl5
        public final void d(int i, byte[] bArr) {
            System.arraycopy(this.d, this.e, bArr, 0, i);
        }

        @Override // pl5.f, defpackage.pl5
        public final byte e(int i) {
            return this.d[this.e + i];
        }

        @Override // pl5.f
        public final int j() {
            return this.e;
        }

        @Override // pl5.f, defpackage.pl5
        public final int size() {
            return this.f;
        }
    }

    public interface d {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public static abstract class e extends pl5 {
        @Override // defpackage.pl5, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new ol5(this);
        }
    }

    public static class f extends e {
        public final byte[] d;

        public f(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // defpackage.pl5
        public byte a(int i) {
            return this.d[i];
        }

        @Override // defpackage.pl5
        public void d(int i, byte[] bArr) {
            System.arraycopy(this.d, 0, bArr, 0, i);
        }

        @Override // defpackage.pl5
        public byte e(int i) {
            return this.d[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof pl5) && size() == ((pl5) obj).size()) {
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
                    int iJ = j() + size;
                    int iJ2 = j();
                    int iJ3 = fVar.j();
                    while (iJ2 < iJ) {
                        if (this.d[iJ2] == bArr[iJ3]) {
                            iJ2++;
                            iJ3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.pl5
        public final int f(int i, int i2) {
            int iJ = j();
            Charset charset = fyo.a;
            for (int i3 = iJ; i3 < iJ + i2; i3++) {
                i = (i * 31) + this.d[i3];
            }
            return i;
        }

        @Override // defpackage.pl5
        public final f h(int i) {
            int iB = pl5.b(0, i, size());
            return iB == 0 ? pl5.b : new c(this.d, j(), iB);
        }

        @Override // defpackage.pl5
        public final void i(q08 q08Var) {
            q08Var.g0(this.d, j(), size());
        }

        public int j() {
            return 0;
        }

        @Override // defpackage.pl5
        public int size() {
            return this.d.length;
        }
    }

    public static final class g implements d {
        @Override // pl5.d
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        c = p20.a() ? new g() : new b();
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

    public abstract int f(int i, int i2);

    public abstract f h(int i);

    public final int hashCode() {
        int iF = this.a;
        if (iF == 0) {
            int size = size();
            iF = f(size, size);
            if (iF == 0) {
                iF = 1;
            }
            this.a = iF;
        }
        return iF;
    }

    public abstract void i(q08 q08Var);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new ol5(this);
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return uf80.a(ml5.a(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? rm2.b(this) : rm2.b(h(47)).concat("..."), TEFcJcMqR.mBMvHPJh);
    }
}
