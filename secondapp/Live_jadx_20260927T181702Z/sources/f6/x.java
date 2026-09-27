package f6;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import u4.p1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class x {
    @ky.d
    public static void a(boolean z10, @Nullable String str) throws p1 {
        if (!z10) {
            throw p1.a(str, null);
        }
    }

    public static int b(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static boolean c(v vVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return vVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int d(v vVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iB = vVar.b(bArr, i10 + i12, i11 - i12);
            if (iB == -1) {
                break;
            }
            i12 += iB;
        }
        return i12;
    }

    public static boolean e(v vVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            vVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(v vVar, int i10) throws IOException {
        try {
            vVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
