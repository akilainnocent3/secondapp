package defpackage;

import com.sportybet.feature.luckynumber.featurematch.presentation.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class obq {
    public final qcn<d> a;
    public final int b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public obq(qcn<? extends d> qcnVar, int i, boolean z, boolean z2) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obq)) {
            return false;
        }
        obq obqVar = (obq) obj;
        return Intrinsics.g(this.a, obqVar.a) && this.b == obqVar.b && this.c == obqVar.c && this.d == obqVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNFeatureMatchState(viewPagerState=");
        sb.append(this.a);
        sb.append(", selectedPageIndex=");
        sb.append(this.b);
        sb.append(", showHowToPlay=");
        return lng.a(", isConfigDisabled=", ")", sb, this.c, this.d);
    }

    public obq() {
        this(0);
    }

    public obq(int i) {
        this(n1a0.c, 0, false, false);
    }
}
