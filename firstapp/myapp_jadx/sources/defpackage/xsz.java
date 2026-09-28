package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xsz {
    public String a;
    public gyj b;
    public int c;
    public int d;

    public final int a() {
        gyj gyjVar = this.b;
        String str = this.a;
        if (gyjVar == null) {
            return str.length();
        }
        return (gyjVar.a - gyjVar.a()) + (str.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            xkn.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            xkn.a("start must be non-negative, but was " + i);
        }
        gyj gyjVar = this.b;
        if (gyjVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            String str2 = this.a;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.a;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            gyj gyjVar2 = new gyj();
            gyjVar2.a = iMax;
            gyjVar2.b = cArr;
            gyjVar2.c = length;
            gyjVar2.d = i4;
            this.b = gyjVar2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > gyjVar.a - gyjVar.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > gyjVar.a()) {
            int iA = length2 - gyjVar.a();
            int i9 = gyjVar.a;
            do {
                i9 *= 2;
            } while (i9 - gyjVar.a < iA);
            char[] cArr2 = new char[i9];
            System.arraycopy(gyjVar.b, 0, cArr2, 0, gyjVar.c);
            int i10 = gyjVar.a;
            int i11 = gyjVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy(gyjVar.b, i11, cArr2, i13, (i12 + i11) - i11);
            gyjVar.b = cArr2;
            gyjVar.a = i9;
            gyjVar.d = i13;
        }
        int i14 = gyjVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = gyjVar.b;
            System.arraycopy(cArr3, i8, cArr3, gyjVar.d - i15, i15);
            gyjVar.c = i7;
            gyjVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = gyjVar.a() + i7;
            int iA3 = gyjVar.a() + i8;
            int i16 = gyjVar.d;
            int i17 = iA2 - i16;
            char[] cArr4 = gyjVar.b;
            System.arraycopy(cArr4, i16, cArr4, gyjVar.c, i17);
            i7 = gyjVar.c + i17;
            gyjVar.c = i7;
            gyjVar.d = iA3;
        } else {
            gyjVar.d = gyjVar.a() + i8;
            gyjVar.c = i7;
        }
        str.getChars(0, str.length(), gyjVar.b, i7);
        gyjVar.c = str.length() + gyjVar.c;
    }

    public final String toString() {
        gyj gyjVar = this.b;
        String str = this.a;
        if (gyjVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.c);
        sb.append(gyjVar.b, 0, gyjVar.c);
        char[] cArr = gyjVar.b;
        int i = gyjVar.d;
        sb.append(cArr, i, gyjVar.a - i);
        String str2 = this.a;
        sb.append((CharSequence) str2, this.d, str2.length());
        return sb.toString();
    }
}
