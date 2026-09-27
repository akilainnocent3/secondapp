package a5;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class y {
    public static void a(@Nullable r rVar) {
        if (rVar != null) {
            try {
                rVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(r rVar, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = rVar.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i11 + " < " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    public static byte[] c(r rVar) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = rVar.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}
