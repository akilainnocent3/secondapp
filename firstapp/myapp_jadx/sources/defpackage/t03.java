package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t03 {
    public final boolean a;
    public final String b;
    public final String c;
    public final float d;
    public final Pair<Float, Float> e;
    public final int f;
    public final CMSRes g;

    /* JADX WARN: Illegal instructions before constructor call */
    public t03(int i) {
        Float fValueOf = Float.valueOf(0.0f);
        this(true, "", "", 0.0f, new Pair(fValueOf, fValueOf), 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t03)) {
            return false;
        }
        t03 t03Var = (t03) obj;
        return this.a == t03Var.a && Intrinsics.g(this.b, t03Var.b) && Intrinsics.g(this.c, t03Var.c) && Float.compare(this.d, t03Var.d) == 0 && Intrinsics.g(this.e, t03Var.e) && this.f == t03Var.f && Intrinsics.g(this.g, t03Var.g);
    }

    public final int hashCode() {
        int iA = gpp.a(this.f, (this.e.hashCode() + tvh.a(this.d, gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31, 31);
        CMSRes cMSRes = this.g;
        return iA + (cMSRes == null ? 0 : cMSRes.hashCode());
    }

    public final String toString() {
        return "BetSliderUIState(enabled=" + this.a + ", min=" + this.b + ", max=" + this.c + ", value=" + this.d + ", valueRange=" + this.e + ", steps=" + this.f + ", imgRes=" + this.g + ')';
    }

    public t03(boolean z, String str, String str2, float f, Pair<Float, Float> pair, int i, CMSRes cMSRes) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = pair;
        this.f = i;
        this.g = cMSRes;
    }

    public t03() {
        this(0);
    }
}
