package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ynj {
    public final znj a;
    public final hnj b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ynj(znj znjVar, int i) {
        hnj hnjVar;
        znjVar = (i & 1) != 0 ? new znj(false, false, false) : znjVar;
        hnj.a aVar = hnj.a;
        boolean z = znjVar.a;
        boolean z2 = znjVar.b;
        boolean z3 = znjVar.c;
        aVar.getClass();
        if (z3) {
            hnjVar = hnj.e;
        } else if (z) {
            hnjVar = hnj.c;
        } else {
            hnjVar = z2 ? hnj.d : hnj.b;
        }
        this.a = znjVar;
        this.b = hnjVar;
        this.c = hnjVar == hnj.c;
        this.d = hnjVar == hnj.d;
        this.e = hnjVar == hnj.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj)) {
            return false;
        }
        ynj ynjVar = (ynj) obj;
        return Intrinsics.g(this.a, ynjVar.a) && this.b == ynjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GameThemeData(requestedFlags=" + this.a + ", activeTheme=" + this.b + ")";
    }
}
