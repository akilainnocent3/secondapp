package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class qla {
    public final rep a;
    public boolean b = true;

    public qla(rep repVar) {
        this.a = repVar;
    }

    public void a() {
        this.b = false;
    }

    public void b(byte b) {
        this.a.d(b);
    }

    public final void c(char c) {
        rep repVar = this.a;
        repVar.a(repVar.b, 1);
        char[] cArr = repVar.a;
        int i = repVar.b;
        repVar.b = i + 1;
        cArr[i] = c;
    }

    public void d(int i) {
        this.a.d(i);
    }

    public void e(long j) {
        this.a.d(j);
    }

    public final void f(String str) {
        str.getClass();
        this.a.c(str);
    }

    public void g(short s) {
        this.a.d(s);
    }

    public void h(String str) {
        byte b;
        str.getClass();
        int length = str.length() + 2;
        rep repVar = this.a;
        repVar.a(repVar.b, length);
        char[] cArr = repVar.a;
        int i = repVar.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length2 = str.length();
        str.getChars(0, length2, cArr, i2);
        int i3 = length2 + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = dae0.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i5 = i4 - i2; i5 < length3; i5++) {
                    repVar.a(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = dae0.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        repVar.a[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = dae0.a[cCharAt];
                        str2.getClass();
                        repVar.a(i4, str2.length());
                        str2.getChars(0, str2.length(), repVar.a, i4);
                        int length4 = str2.length() + i4;
                        repVar.b = length4;
                        i4 = length4;
                    } else {
                        char[] cArr2 = repVar.a;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        repVar.b = i4;
                    }
                }
                repVar.a(i4, 1);
                repVar.a[i4] = '\"';
                repVar.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        repVar.b = i3 + 1;
    }

    public void i() {
    }

    public void j() {
    }
}
