package defpackage;

import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class rep {
    public char[] a;
    public int b;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.a = Arrays.copyOf(cArr, i3);
        }
    }

    public final void b() {
        u77 u77Var = u77.c;
        char[] cArr = this.a;
        u77Var.getClass();
        cArr.getClass();
        synchronized (u77Var) {
            try {
                int i = u77Var.b;
                if (cArr.length + i < qx0.a) {
                    u77Var.b = i + cArr.length;
                    u77Var.a.addLast(cArr);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), this.a, this.b);
        this.b += length;
    }

    public final void d(long j) {
        c(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}
