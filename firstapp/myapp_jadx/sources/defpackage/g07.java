package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g07 {
    public final f07 a;
    public final UiText b;
    public final Integer c;
    public final boolean d;

    public g07(f07 f07Var, UiText uiText, Integer num, boolean z) {
        this.a = f07Var;
        this.b = uiText;
        this.c = num;
        this.d = z;
    }

    public static g07 a(g07 g07Var, boolean z) {
        return new g07(g07Var.a, g07Var.b, g07Var.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g07)) {
            return false;
        }
        g07 g07Var = (g07) obj;
        return this.a == g07Var.a && this.b.equals(g07Var.b) && Intrinsics.g(this.c, g07Var.c) && this.d == g07Var.d;
    }

    public final int hashCode() {
        int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "ChallengeFilterUiModel(type=" + this.a + ", label=" + this.b + ", count=" + this.c + ", isSelected=" + this.d + ")";
    }
}
