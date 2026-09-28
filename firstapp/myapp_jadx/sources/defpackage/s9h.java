package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class s9h implements o9e0 {
    @Override // defpackage.o9e0
    public final void a(s08.b bVar, String str, int i) throws IOException {
        char cCharAt;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && (cCharAt = str.charAt(i2)) < 128) {
            bVar.e((byte) cCharAt);
            i2++;
        }
        if (i2 == length) {
            return;
        }
        while (i2 < length) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 128) {
                bVar.e((byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                bVar.e((byte) ((cCharAt2 >>> 6) | 960));
                bVar.e((byte) ((cCharAt2 & '?') | 128));
            } else if (Character.isSurrogate(cCharAt2)) {
                int iCodePointAt = Character.codePointAt(str, i2);
                if (iCodePointAt != cCharAt2) {
                    bVar.e((byte) ((iCodePointAt >>> 18) | 240));
                    bVar.e((byte) (((iCodePointAt >>> 12) & 63) | 128));
                    bVar.e((byte) (((iCodePointAt >>> 6) & 63) | 128));
                    bVar.e((byte) ((iCodePointAt & 63) | 128));
                    i2++;
                } else {
                    bVar.e((byte) 63);
                }
            } else {
                bVar.e((byte) ((cCharAt2 >>> '\f') | 480));
                bVar.e((byte) (((cCharAt2 >>> 6) & 63) | 128));
                bVar.e((byte) ((cCharAt2 & '?') | 128));
            }
            i2++;
        }
    }

    @Override // defpackage.o9e0
    public final int b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        int i4 = i3 + 2;
                        if (!Character.isSurrogate(cCharAt2)) {
                            i3 = i4;
                        } else if (Character.codePointAt(str, i) != cCharAt2) {
                            i++;
                            i3 = i4;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        sqh0.a(((long) i2) + 4294967296L);
        return 0;
    }
}
