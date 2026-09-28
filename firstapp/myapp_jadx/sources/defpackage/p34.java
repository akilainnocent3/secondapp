package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p34 {
    public final boolean a;
    public final String b;
    public final UiText c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p34(boolean z, String str, ConcatUiText concatUiText, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        this((i & 4) != 0 ? null : concatUiText, (i & 2) != 0 ? null : str, null, z2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        p34 p34Var = (p34) obj;
        return this.a == p34Var.a && Intrinsics.g(this.b, p34Var.b) && Intrinsics.g(this.c, p34Var.c) && this.d == p34Var.d && Intrinsics.g(this.e, p34Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiText uiText = this.c;
        int iA = mtg0.a((iHashCode2 + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("BettingStreakRewardStatusUiModel(isStreakFeatureEnabled=", ", multiplierWithSign=", this.b, ", streakBoostValue=", this.a);
        sbA.append(this.c);
        sbA.append(", showNewBadge=");
        sbA.append(this.d);
        sbA.append(", streakDisplayValue=");
        return uf80.a(sbA, this.e, ")");
    }

    public p34(UiText uiText, String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = uiText;
        this.d = z2;
        this.e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p34() {
        this(false, null, 0 == true ? 1 : 0, 31);
    }
}
