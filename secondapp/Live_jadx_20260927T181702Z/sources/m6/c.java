package m6;

import f6.v;
import java.io.IOException;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static boolean a(v vVar, boolean z10) throws IOException {
        int i10;
        v0 v0Var = new v0(16);
        boolean z11 = true;
        while (true) {
            v0Var.f0(8);
            if (!vVar.peekFully(v0Var.f(), 0, 8, true)) {
                return false;
            }
            long jW = v0Var.W();
            int iB = v0Var.B();
            if (jW != 1) {
                i10 = 8;
            } else {
                if (!vVar.peekFully(v0Var.f(), 8, 8, true)) {
                    return false;
                }
                jW = v0Var.b0();
                i10 = 16;
            }
            long j10 = i10;
            if (jW < j10) {
                return false;
            }
            int i11 = (int) (jW - j10);
            if (z11) {
                if (iB != 1718909296 || i11 < 8) {
                    return false;
                }
                v0Var.f0(4);
                vVar.peekFully(v0Var.f(), 0, 4);
                if (v0Var.B() != 1751476579) {
                    return false;
                }
                if (!z10) {
                    return true;
                }
                vVar.advancePeekPosition(i11 - 4);
                z11 = false;
            } else {
                if (iB == 1836086884) {
                    return true;
                }
                if (i11 != 0) {
                    vVar.advancePeekPosition(i11);
                }
            }
        }
    }
}
