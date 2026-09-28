package defpackage;

import com.sportybet.plugin.realsports.data.CashOut;
import java.util.Arrays;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public final class j9e0 implements Appendable, CharSequence {
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public char[] a;
    public int b;

    public j9e0(String str) {
        int length = str.length();
        this.b = length;
        char[] cArr = new char[length + 16];
        this.a = cArr;
        str.getChars(0, length, cArr, 0);
    }

    public final void a(int i) {
        if (i == Integer.MIN_VALUE) {
            c("-2147483648");
            return;
        }
        if (i < 0) {
            b('-');
            i = -i;
        }
        char[] cArr = c;
        if (i >= 10000) {
            if (i >= 1000000000) {
                b(cArr[(int) ((((long) i) % RealConnection.IDLE_CONNECTION_HEALTHY_NS) / 1000000000)]);
            }
            if (i >= 100000000) {
                b(cArr[(i % Http2Connection.DEGRADED_PONG_TIMEOUT_NS) / 100000000]);
            }
            if (i >= 10000000) {
                b(cArr[(i % 100000000) / 10000000]);
            }
            if (i >= 1000000) {
                b(cArr[(i % 10000000) / CashOut.BIG_NUMBER]);
            }
            if (i >= 100000) {
                b(cArr[(i % CashOut.BIG_NUMBER) / 100000]);
            }
            b(cArr[(i % 100000) / 10000]);
        }
        if (i >= 1000) {
            b(cArr[(i % 10000) / 1000]);
        }
        if (i >= 100) {
            b(cArr[(i % 1000) / 100]);
        }
        if (i >= 10) {
            b(cArr[(i % 100) / 10]);
        }
        b(cArr[i % 10]);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            d();
            return this;
        }
        if (!(charSequence instanceof j9e0)) {
            c(charSequence.toString());
            return this;
        }
        j9e0 j9e0Var = (j9e0) charSequence;
        char[] cArr = j9e0Var.a;
        int i = j9e0Var.b;
        if (cArr.length < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset out of bounds: 0");
        }
        if (i < 0 || cArr.length < i) {
            throw new ArrayIndexOutOfBoundsException(hce0.a(i, "Length out of bounds: "));
        }
        int i2 = this.b + i;
        if (i2 > this.a.length) {
            e(i2);
        }
        System.arraycopy(cArr, 0, this.a, this.b, i);
        this.b = i2;
        return this;
    }

    public final void b(char c2) {
        int i = this.b;
        if (i == this.a.length) {
            e(i + 1);
        }
        char[] cArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        cArr[i2] = c2;
    }

    public final void c(String str) {
        if (str == null) {
            d();
            return;
        }
        int length = str.length();
        int i = this.b + length;
        if (i > this.a.length) {
            e(i);
        }
        str.getChars(0, length, this.a, this.b);
        this.b = i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.b) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.a[i];
    }

    public final void d() {
        int i = this.b + 4;
        if (i > this.a.length) {
            e(i);
        }
        char[] cArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        cArr[i2] = 'n';
        int i4 = i2 + 2;
        this.b = i4;
        cArr[i3] = 'u';
        int i5 = i2 + 3;
        this.b = i5;
        cArr[i4] = 'l';
        this.b = i2 + 4;
        cArr[i5] = 'l';
    }

    public final void e(int i) {
        char[] cArr = this.a;
        int length = (cArr.length >> 1) + cArr.length + 2;
        if (i <= length) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.b);
        this.a = cArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j9e0.class == obj.getClass()) {
            j9e0 j9e0Var = (j9e0) obj;
            int i = this.b;
            if (i == j9e0Var.b) {
                char[] cArr = this.a;
                char[] cArr2 = j9e0Var.a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (cArr[i2] == cArr2[i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, int i2) {
        char[] cArr = this.a;
        int length = cArr.length;
        int i3 = this.b;
        if (length - i3 >= i) {
            System.arraycopy(cArr, i2, cArr, i + i2, i3 - i2);
            return;
        }
        int i4 = i3 + i;
        int length2 = (cArr.length << 1) + 2;
        if (i4 <= length2) {
            i4 = length2;
        }
        char[] cArr2 = new char[i4];
        System.arraycopy(cArr, 0, cArr2, 0, i2);
        System.arraycopy(this.a, i2, cArr2, i + i2, this.b - i2);
        this.a = cArr2;
    }

    public final void g(char c2, String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i == i2) {
                return;
            }
            if (this.a[i] == c2) {
                int i3 = i + 1;
                if (i >= 0) {
                    if (i3 > i2) {
                        i3 = i2;
                    }
                    if (i3 > i) {
                        int length2 = str.length();
                        int i4 = (i3 - i) - length2;
                        if (i4 > 0) {
                            char[] cArr = this.a;
                            System.arraycopy(cArr, i3, cArr, i + length2, this.b - i3);
                        } else if (i4 < 0) {
                            f(-i4, i3);
                        }
                        str.getChars(0, length2, this.a, i);
                        this.b -= i4;
                    } else if (i == i3) {
                        if (i < 0 || i > i2) {
                            throw new StringIndexOutOfBoundsException(i);
                        }
                        int length3 = str.length();
                        if (length3 != 0) {
                            f(length3, i);
                            str.getChars(0, length3, this.a, i);
                            this.b += length3;
                        }
                    }
                    i += length;
                }
                throw new StringIndexOutOfBoundsException();
            }
            i++;
        }
    }

    public final void h(int i) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        char[] cArr = this.a;
        if (i > cArr.length) {
            e(i);
        } else {
            int i2 = this.b;
            if (i2 < i) {
                Arrays.fill(cArr, i2, i, (char) 0);
            }
        }
        this.b = i;
    }

    public final int hashCode() {
        int i = this.b + 31;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.b) {
            throw new StringIndexOutOfBoundsException();
        }
        return i == i2 ? "" : new String(this.a, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.b;
        return i == 0 ? "" : new String(this.a, 0, i);
    }

    public j9e0(int i) {
        if (i >= 0) {
            this.a = new char[i];
            return;
        }
        throw new NegativeArraySizeException();
    }

    public j9e0() {
        this.a = new char[16];
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        b(c2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= charSequence.length()) {
            c(charSequence.subSequence(i, i2).toString());
            return this;
        }
        throw new IndexOutOfBoundsException();
    }
}
