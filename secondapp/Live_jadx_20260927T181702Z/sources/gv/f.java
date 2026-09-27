package gv;

import com.ironsource.C4235d4;
import cv.k;
import fr.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,648:1\n1#2:649\n*E\n"})
public class f extends e {
    public static final void q(@l String str, int i10) {
        m0.p(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    @a
    public static final void r(long j10, @l byte[] dst, int i10, int i11, int i12) {
        m0.p(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = k.m()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final long s(@l byte[] bArr, int i10) {
        m0.p(bArr, "<this>");
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    public static final void t(@l byte[] bArr, int i10, long j10) {
        m0.p(bArr, "<this>");
        int i11 = 7;
        while (-1 < i11) {
            bArr[i10] = (byte) (j10 >> (i11 << 3));
            i11--;
            i10++;
        }
    }

    public static final String u(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        m0.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        m0.o(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final String v(byte[] bArr, int i10) {
        return a0.ph(bArr, null, C4235d4.j.f61460d, C4235d4.j.f61462e, i10, null, null, 49, null);
    }

    @a
    @l
    public static final c w(@l byte[] randomBytes) {
        m0.p(randomBytes, "randomBytes");
        byte b10 = (byte) (randomBytes[6] & zi.c.f161639q);
        randomBytes[6] = b10;
        randomBytes[6] = (byte) (b10 | 64);
        byte b11 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b11;
        randomBytes[8] = (byte) (b11 | 128);
        return c.f87404d.a(randomBytes);
    }

    @a
    @l
    public static final c x(@l String hexString) {
        m0.p(hexString, "hexString");
        return c.f87404d.b(k.G(hexString, 0, 16, null, 4, null), k.G(hexString, 16, 32, null, 4, null));
    }

    @a
    @l
    public static final c y(@l String hexDashString) {
        m0.p(hexDashString, "hexDashString");
        long jG = k.G(hexDashString, 0, 8, null, 4, null);
        q(hexDashString, 8);
        long jG2 = k.G(hexDashString, 9, 13, null, 4, null);
        q(hexDashString, 13);
        long jG3 = k.G(hexDashString, 14, 18, null, 4, null);
        q(hexDashString, 18);
        long jG4 = k.G(hexDashString, 19, 23, null, 4, null);
        q(hexDashString, 23);
        return c.f87404d.b((jG2 << 16) | (jG << 32) | jG3, (jG4 << 48) | k.G(hexDashString, 24, 36, null, 4, null));
    }
}
