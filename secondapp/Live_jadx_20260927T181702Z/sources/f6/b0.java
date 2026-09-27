package f6;

import java.io.IOException;
import u4.p1;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83353a = "FlacFrameReader";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f83354a;
    }

    public static boolean a(x4.v0 v0Var, e0 e0Var, int i10, long j10) {
        int iK = k(v0Var, i10);
        long j11 = e0Var.f83454j;
        return iK != -1 && (((j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) == 0 || ((j10 + ((long) iK)) > j11 ? 1 : ((j10 + ((long) iK)) == j11 ? 0 : -1)) >= 0) || iK >= e0Var.f83445a) && iK <= e0Var.f83446b;
    }

    public static boolean b(x4.v0 v0Var, int i10) {
        return v0Var.U() == b2.H(v0Var.f(), i10, v0Var.g() - 1, 0);
    }

    public static boolean c(x4.v0 v0Var, e0 e0Var, boolean z10, a aVar) {
        try {
            long jD0 = v0Var.d0();
            if (!z10) {
                jD0 *= (long) e0Var.f83446b;
            }
            long j10 = e0Var.f83454j;
            if (j10 != 0 && jD0 > j10) {
                return false;
            }
            aVar.f83354a = jD0;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(x4.v0 v0Var, e0 e0Var, int i10, a aVar) {
        int iG = v0Var.g();
        long jW = v0Var.W();
        long j10 = jW >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jW >> 4) & 15), e0Var) && f((int) ((jW >> 1) & 7), e0Var) && !(((jW & 1) > 1L ? 1 : ((jW & 1) == 1L ? 0 : -1)) == 0) && c(v0Var, e0Var, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(v0Var, e0Var, (int) ((jW >> 12) & 15), aVar.f83354a) && e(v0Var, e0Var, (int) ((jW >> 8) & 15)) && b(v0Var, iG) && h(v0Var);
    }

    public static boolean e(x4.v0 v0Var, e0 e0Var, int i10) {
        int i11 = e0Var.f83449e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == e0Var.f83450f;
        }
        if (i10 == 12) {
            return v0Var.U() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iC0 = v0Var.c0();
            if (i10 == 14) {
                iC0 *= 10;
            }
            if (iC0 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int i10, e0 e0Var) {
        return i10 == 0 || i10 == e0Var.f83453i;
    }

    public static boolean g(int i10, e0 e0Var) {
        if (i10 <= 7) {
            return i10 == e0Var.f83451g - 1;
        }
        return i10 <= 10 && e0Var.f83451g == 2;
    }

    public static boolean h(x4.v0 v0Var) {
        if (v0Var.a() == 0) {
            return true;
        }
        int iR = v0Var.r();
        if ((iR & 128) != 0) {
            return false;
        }
        int i10 = (iR & 126) >> 1;
        if ((i10 < 2 || i10 > 7) && (i10 < 13 || i10 > 31)) {
            return true;
        }
        x4.d0.h(f83353a, "Ignoring frame where first subframe has a reserved type: " + i10);
        return false;
    }

    public static boolean i(v vVar, e0 e0Var, int i10, a aVar) throws IOException {
        long peekPosition = vVar.getPeekPosition();
        x4.v0 v0Var = new x4.v0(17);
        vVar.peekFully(v0Var.f(), 0, 2);
        if (v0Var.l() != i10) {
            vVar.resetPeekPosition();
            vVar.advancePeekPosition((int) (peekPosition - vVar.getPosition()));
            return false;
        }
        v0Var.i0(x.d(vVar, v0Var.f(), 2, 15) + 2);
        vVar.resetPeekPosition();
        vVar.advancePeekPosition((int) (peekPosition - vVar.getPosition()));
        return d(v0Var, e0Var, i10, aVar);
    }

    public static long j(v vVar, e0 e0Var) throws IOException {
        vVar.resetPeekPosition();
        vVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        vVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        vVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        x4.v0 v0Var = new x4.v0(i10);
        v0Var.i0(x.d(vVar, v0Var.f(), 0, i10));
        vVar.resetPeekPosition();
        a aVar = new a();
        if (c(v0Var, e0Var, z10, aVar)) {
            return aVar.f83354a;
        }
        throw p1.a(null, null);
    }

    public static int k(x4.v0 v0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return v0Var.U() + 1;
            case 7:
                return v0Var.c0() + 1;
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
