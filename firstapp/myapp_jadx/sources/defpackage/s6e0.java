package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s6e0 {
    public final UiText a;
    public final UiText b;
    public final long c;
    public final List<v3l> d;
    public final long e;
    public final long f;
    public final List<d7e0> g;

    public s6e0(UiText uiText, UiText uiText2, long j, List<v3l> list, long j2, long j3, List<d7e0> list2) {
        list.getClass();
        list2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = j;
        this.d = list;
        this.e = j2;
        this.f = j3;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6e0)) {
            return false;
        }
        s6e0 s6e0Var = (s6e0) obj;
        if (!this.a.equals(s6e0Var.a) || !this.b.equals(s6e0Var.b)) {
            return false;
        }
        long j = s6e0Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j) && Intrinsics.g(this.d, s6e0Var.d) && nbh0.a(this.e, s6e0Var.e) && nbh0.a(this.f, s6e0Var.f) && Intrinsics.g(this.g, s6e0Var.g);
    }

    public final int hashCode() {
        int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.g.hashCode() + f87.a(f87.a(ai50.a(f87.a(iA, this.c, 31), 31, this.d), this.e, 31), this.f, 31);
    }

    public final String toString() {
        String strI = j58.i(this.c);
        String strI2 = j58.i(this.e);
        String strI3 = j58.i(this.f);
        StringBuilder sbA = uh8.a(this.a, this.b, "StreakHistoryScreenData(currentStreak=", ", longestStreak=", ", trophyGlowColor=");
        kya0.b(strI, ", trophyGlowLayers=", ", bannerBackgroundColor=", sbA, this.d);
        hxa.c(sbA, strI2, ", bannerBorderColor=", strI3, ", records=");
        return ng1.a(sbA, this.g, ")");
    }
}
