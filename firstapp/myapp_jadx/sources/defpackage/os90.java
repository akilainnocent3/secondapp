package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class os90 {
    public final int a;
    public final ResourceUiText b;
    public final String c;

    public os90(int i, ResourceUiText resourceUiText, String str) {
        this.a = i;
        this.b = resourceUiText;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os90)) {
            return false;
        }
        os90 os90Var = (os90) obj;
        return this.a == os90Var.a && this.b.equals(os90Var.b) && this.c.equals(os90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wh8.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationTicketDetailSelectionResult(drawableResId=");
        sb.append(this.a);
        sb.append(", tooltipUiText=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
