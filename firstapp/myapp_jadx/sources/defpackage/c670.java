package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class c670 {
    public final boolean a;
    public final boolean b;
    public final ResourceUiText c;
    public final l670 d;

    public c670(boolean z, boolean z2, ResourceUiText resourceUiText, l670 l670Var) {
        this.a = z;
        this.b = z2;
        this.c = resourceUiText;
        this.d = l670Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c670)) {
            return false;
        }
        c670 c670Var = (c670) obj;
        return this.a == c670Var.a && this.b == c670Var.b && this.c.equals(c670Var.c) && this.d.equals(c670Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wh8.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("ScheduledFootballHeadToHeadStatsContentState(shouldShowLeftArrow=", ", shouldShowRightArrow=", ", titleUiText=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", infoState=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
