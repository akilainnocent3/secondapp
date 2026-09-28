package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class ld70 {
    public final ve70 a;
    public final ResourceUiText b;
    public final boolean c;
    public final String d;

    public ld70(ve70 ve70Var, ResourceUiText resourceUiText, boolean z, String str) {
        this.a = ve70Var;
        this.b = resourceUiText;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld70)) {
            return false;
        }
        ld70 ld70Var = (ld70) obj;
        return this.a == ld70Var.a && this.b.equals(ld70Var.b) && this.c == ld70Var.c && this.d.equals(ld70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballOverviewStatsChipState(overviewStatsType=");
        sb.append(this.a);
        sb.append(", uiText=");
        sb.append(this.b);
        sb.append(", selected=");
        return nyf.a(", resourceId=", this.d, ")", sb, this.c);
    }
}
