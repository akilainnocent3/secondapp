package kj;

import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.b
@a
public final class k extends dj.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f102650e = {'+'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f102651f = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f102653d;

    public k(String safeChars, boolean plusForSpace) {
        l0.E(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f102652c = plusForSpace;
        this.f102653d = h(str);
    }

    public static boolean[] h(String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int iMax = -1;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // dj.l, dj.h
    public String b(String s10) {
        l0.E(s10);
        int length = s10.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = s10.charAt(i10);
            boolean[] zArr = this.f102653d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return e(s10, i10);
            }
        }
        return s10;
    }

    @Override // dj.l
    @zq.a
    public char[] d(int cp2) {
        boolean[] zArr = this.f102653d;
        if (cp2 < zArr.length && zArr[cp2]) {
            return null;
        }
        if (cp2 == 32 && this.f102652c) {
            return f102650e;
        }
        if (cp2 <= 127) {
            char[] cArr = f102651f;
            return new char[]{'%', cArr[cp2 >>> 4], cArr[cp2 & 15]};
        }
        if (cp2 <= 2047) {
            char[] cArr2 = f102651f;
            return new char[]{'%', cArr2[(cp2 >>> 10) | 12], cArr2[(cp2 >>> 6) & 15], '%', cArr2[((cp2 >>> 4) & 3) | 8], cArr2[cp2 & 15]};
        }
        if (cp2 <= 65535) {
            char[] cArr3 = f102651f;
            return new char[]{'%', 'E', cArr3[cp2 >>> 12], '%', cArr3[((cp2 >>> 10) & 3) | 8], cArr3[(cp2 >>> 6) & 15], '%', cArr3[((cp2 >>> 4) & 3) | 8], cArr3[cp2 & 15]};
        }
        if (cp2 <= 1114111) {
            char[] cArr4 = f102651f;
            return new char[]{'%', 'F', cArr4[(cp2 >>> 18) & 7], '%', cArr4[((cp2 >>> 16) & 3) | 8], cArr4[(cp2 >>> 12) & 15], '%', cArr4[((cp2 >>> 10) & 3) | 8], cArr4[(cp2 >>> 6) & 15], '%', cArr4[((cp2 >>> 4) & 3) | 8], cArr4[cp2 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + cp2);
    }

    @Override // dj.l
    public int g(CharSequence csq, int index, int end) {
        l0.E(csq);
        while (index < end) {
            char cCharAt = csq.charAt(index);
            boolean[] zArr = this.f102653d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            index++;
        }
        return index;
    }
}
