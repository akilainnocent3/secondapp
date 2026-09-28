package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class euh {
    public static uov a(l4h l4hVar, boolean z) throws Throwable {
        o6n o6nVar = z ? null : p6n.e;
        nsz nszVar = new nsz(10);
        uov uovVarW = null;
        int i = 0;
        while (true) {
            try {
                l4hVar.m(nszVar.a, 0, 10);
                nszVar.I(0);
                if (nszVar.z() != 4801587) {
                    break;
                }
                nszVar.J(3);
                int iV = nszVar.v();
                int i2 = iV + 10;
                if (uovVarW == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(nszVar.a, 0, bArr, 0, 10);
                    l4hVar.m(bArr, 10, iV);
                    uovVarW = new p6n(o6nVar).w(i2, bArr);
                } else {
                    l4hVar.i(iV);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        l4hVar.e();
        l4hVar.i(i);
        if (uovVarW == null || uovVarW.a.length == 0) {
            return null;
        }
        return uovVarW;
    }

    public static huh.a b(nsz nszVar) {
        nszVar.J(1);
        int iZ = nszVar.z();
        long j = ((long) nszVar.b) + ((long) iZ);
        int i = iZ / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jQ = nszVar.q();
            if (jQ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jQ;
            jArrCopyOf2[i2] = nszVar.q();
            nszVar.J(2);
        }
        nszVar.J((int) (j - ((long) nszVar.b)));
        return new huh.a(jArrCopyOf, jArrCopyOf2);
    }
}
