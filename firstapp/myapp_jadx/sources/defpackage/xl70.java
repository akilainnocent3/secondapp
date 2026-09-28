package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes5.dex */
public final class xl70 {
    public final UiText a;
    public final ColoredUiText b;
    public final String c;
    public final int d;
    public final a e;

    public enum a {
        c("UP", "Collapse matchday"),
        d("DOWN", "Expand matchday");

        public final float a;
        public final String b;

        a(String str, String str2) {
            this.a = f;
            this.b = str2;
        }
    }

    public xl70(UiText uiText, ColoredUiText coloredUiText, String str, int i, a aVar) {
        this.a = uiText;
        this.b = coloredUiText;
        this.c = str;
        this.d = i;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl70)) {
            return false;
        }
        xl70 xl70Var = (xl70) obj;
        return this.a.equals(xl70Var.a) && this.b.equals(xl70Var.b) && this.c.equals(xl70Var.c) && this.d == xl70Var.d && this.e == xl70Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballUpcomingCellHeaderState(primaryUiText=");
        sb.append(this.a);
        sb.append(", secondaryUiText=");
        sb.append(this.b);
        sb.append(", countdownText=");
        wxa.b(this.d, this.c, ", countdownTextBackgroundResId=", ", expansionIconDirection=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
