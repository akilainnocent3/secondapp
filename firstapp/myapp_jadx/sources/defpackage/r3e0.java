package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.StringUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class r3e0 {
    public final boolean a;
    public final ConcatUiText b;
    public final StringUiText c;

    public r3e0(boolean z, ConcatUiText concatUiText, StringUiText stringUiText) {
        this.a = z;
        this.b = concatUiText;
        this.c = stringUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3e0)) {
            return false;
        }
        r3e0 r3e0Var = (r3e0) obj;
        return this.a == r3e0Var.a && this.b.equals(r3e0Var.b) && this.c.equals(r3e0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "StreakAchievementUiModel(isAchieved=" + this.a + ", daysRequiredUiText=" + this.b + ", bonusUiTextInMultiplier=" + this.c + ")";
    }
}
