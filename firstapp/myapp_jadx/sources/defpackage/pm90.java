package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class pm90 {
    public final boolean a;
    public final ResourceUiText b;
    public final String c;
    public final int d;

    public pm90(boolean z, ResourceUiText resourceUiText, String str, int i) {
        this.a = z;
        this.b = resourceUiText;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm90)) {
            return false;
        }
        pm90 pm90Var = (pm90) obj;
        return this.a == pm90Var.a && this.b.equals(pm90Var.b) && this.c.equals(pm90Var.c) && this.d == pm90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gmf0.a(wh8.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationBetHistoryTicketResultState(shouldShowWonIcon=");
        sb.append(this.a);
        sb.append(", ticketResultUiText=");
        sb.append(this.b);
        sb.append(", ticketResultUiTextResourceId=");
        return ijg0.a(this.d, this.c, ", backgroundColorResId=", ")", sb);
    }
}
