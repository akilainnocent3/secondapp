package af;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p {
    @ky.d
    public static void a(boolean z10, @Nullable String str) throws d4 {
        if (!z10) {
            throw d4.a(str, null);
        }
    }

    public static boolean b(n nVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return nVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(n nVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iB = nVar.b(bArr, i10 + i12, i11 - i12);
            if (iB == -1) {
                break;
            }
            i12 += iB;
        }
        return i12;
    }

    public static boolean d(n nVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            nVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(n nVar, int i10) throws IOException {
        try {
            nVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
