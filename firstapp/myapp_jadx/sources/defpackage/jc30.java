package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jc30 {
    public final int a;
    public final Integer b;

    public jc30(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc30)) {
            return false;
        }
        jc30 jc30Var = (jc30) obj;
        return this.a == jc30Var.a && Intrinsics.g(this.b, jc30Var.b);
    }

    public final int hashCode() {
        int iA = gpp.a(R.dimen.spr_stats_drawable_size, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.b;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "QuickBetMatchOddsDrawableSpec(drawableId=" + this.a + ", sizeRes=2131167276, tintColor=" + this.b + ")";
    }
}
