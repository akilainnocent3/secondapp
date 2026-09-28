package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lfl0 implements Iterable, Serializable {
    public static final jfl0 b = new jfl0(kil0.b);
    public int a = 0;

    static {
        int i = hel0.a;
    }

    public static jfl0 h(byte[] bArr, int i, int i2) {
        i(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new jfl0(bArr2);
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    public abstract jfl0 d();

    public abstract void e(qfl0 qfl0Var);

    public abstract int f(int i, int i2);

    public final int hashCode() {
        int iF = this.a;
        if (iF == 0) {
            int iC = c();
            iF = f(iC, iC);
            if (iF == 0) {
                iF = 1;
            }
            this.a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new afl0(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return uf80.a(ml5.a(c(), "<ByteString@", hexString, " size=", " contents=\""), c() <= 50 ? ic4.a(this) : ic4.a(d()).concat("..."), "\">");
    }
}
