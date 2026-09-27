package y4;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import x4.m1;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f145893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f145894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145895c;

    public a(int i10, int i11, String str) {
        this.f145893a = i10;
        this.f145894b = i11;
        this.f145895c = str;
    }

    @Nullable
    public static a a(v0 v0Var) {
        String str;
        v0Var.l0(2);
        int iU = v0Var.U();
        int i10 = iU >> 1;
        int iU2 = ((v0Var.U() >> 3) & 31) | ((iU & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = fe.F;
        sb2.append(i10 < 10 ? ".0" : fe.F);
        sb2.append(i10);
        if (iU2 < 10) {
            str2 = ".0";
        }
        sb2.append(str2);
        sb2.append(iU2);
        return new a(i10, iU2, sb2.toString());
    }
}
