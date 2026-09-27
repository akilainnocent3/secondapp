package fh;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import eh.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84344c;

    public e(int i10, int i11, String str) {
        this.f84342a = i10;
        this.f84343b = i11;
        this.f84344c = str;
    }

    @Nullable
    public static e a(t0 t0Var) {
        String str;
        t0Var.Z(2);
        int iL = t0Var.L();
        int i10 = iL >> 1;
        int iL2 = ((t0Var.L() >> 3) & 31) | ((iL & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iL2 >= 10 ? fe.F : ".0");
        sb2.append(iL2);
        return new e(i10, iL2, sb2.toString());
    }
}
