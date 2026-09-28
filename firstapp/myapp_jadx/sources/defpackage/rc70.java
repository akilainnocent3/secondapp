package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class rc70 {
    public final ec70 a;
    public final ResourceUiText b;
    public final String c;

    public rc70(ec70 ec70Var, ResourceUiText resourceUiText, String str) {
        this.a = ec70Var;
        this.b = resourceUiText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc70)) {
            return false;
        }
        rc70 rc70Var = (rc70) obj;
        return this.a.equals(rc70Var.a) && this.b.equals(rc70Var.b) && this.c.equals(rc70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wh8.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballOpenBetsSelectionResult(drawable=");
        sb.append(this.a);
        sb.append(", tooltipUiText=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
