package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class lp90 {
    public final int a;
    public final ResourceUiText b;
    public final String c;

    public lp90(int i, ResourceUiText resourceUiText, String str) {
        this.a = i;
        this.b = resourceUiText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp90)) {
            return false;
        }
        lp90 lp90Var = (lp90) obj;
        return this.a == lp90Var.a && this.b.equals(lp90Var.b) && this.c.equals(lp90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wh8.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationSettlementSelectionResult(drawableResId=");
        sb.append(this.a);
        sb.append(", tooltipUiText=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
