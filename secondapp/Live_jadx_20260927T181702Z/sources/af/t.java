package af;

import eh.o1;
import eh.t0;
import java.io.IOException;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class t {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4987a;
    }

    public static boolean a(t0 t0Var, w wVar, int i10) {
        int iJ = j(t0Var, i10);
        return iJ != -1 && iJ <= wVar.f4997b;
    }

    public static boolean b(t0 t0Var, int i10) {
        return t0Var.L() == o1.A(t0Var.e(), i10, t0Var.f() - 1, 0);
    }

    public static boolean c(t0 t0Var, w wVar, boolean z10, a aVar) {
        try {
            long jS = t0Var.S();
            if (!z10) {
                jS *= (long) wVar.f4997b;
            }
            aVar.f4987a = jS;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(t0 t0Var, w wVar, int i10, a aVar) {
        int iF = t0Var.f();
        long jN = t0Var.N();
        long j10 = jN >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) (15 & (jN >> 4)), wVar) && f((int) ((jN >> 1) & 7), wVar) && !(((jN & 1) > 1L ? 1 : ((jN & 1) == 1L ? 0 : -1)) == 0) && c(t0Var, wVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(t0Var, wVar, (int) ((jN >> 12) & 15)) && e(t0Var, wVar, (int) ((jN >> 8) & 15)) && b(t0Var, iF);
    }

    public static boolean e(t0 t0Var, w wVar, int i10) {
        int i11 = wVar.f5000e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == wVar.f5001f;
        }
        if (i10 == 12) {
            return t0Var.L() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iR = t0Var.R();
            if (i10 == 14) {
                iR *= 10;
            }
            if (iR == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int i10, w wVar) {
        return i10 == 0 || i10 == wVar.f5004i;
    }

    public static boolean g(int i10, w wVar) {
        if (i10 <= 7) {
            return i10 == wVar.f5002g - 1;
        }
        return i10 <= 10 && wVar.f5002g == 2;
    }

    public static boolean h(n nVar, w wVar, int i10, a aVar) throws IOException {
        long peekPosition = nVar.getPeekPosition();
        byte[] bArr = new byte[2];
        nVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            nVar.resetPeekPosition();
            nVar.advancePeekPosition((int) (peekPosition - nVar.getPosition()));
            return false;
        }
        t0 t0Var = new t0(16);
        System.arraycopy(bArr, 0, t0Var.e(), 0, 2);
        t0Var.X(p.c(nVar, t0Var.e(), 2, 14));
        nVar.resetPeekPosition();
        nVar.advancePeekPosition((int) (peekPosition - nVar.getPosition()));
        return d(t0Var, wVar, i10, aVar);
    }

    public static long i(n nVar, w wVar) throws IOException {
        nVar.resetPeekPosition();
        nVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        nVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        nVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        t0 t0Var = new t0(i10);
        t0Var.X(p.c(nVar, t0Var.e(), 0, i10));
        nVar.resetPeekPosition();
        a aVar = new a();
        if (c(t0Var, wVar, z10, aVar)) {
            return aVar.f4987a;
        }
        throw d4.a(null, null);
    }

    public static int j(t0 t0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return t0Var.L() + 1;
            case 7:
                return t0Var.R() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
