package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lhw {
    public final float a;
    public final Float b;

    public lhw(float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhw)) {
            return false;
        }
        lhw lhwVar = (lhw) obj;
        return Float.compare(this.a, lhwVar.a) == 0 && Intrinsics.g(this.b, lhwVar.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        Float f = this.b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "MultiMakerOddsRange(lower=" + this.a + ", upper=" + this.b + LxHElgWAiSeM.QUsIcziTHkNc;
    }
}
