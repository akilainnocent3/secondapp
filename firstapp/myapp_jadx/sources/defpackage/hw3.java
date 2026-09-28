package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class hw3 {
    public final bz3 a;
    public final ResourceUiText b;
    public final boolean c;
    public final boolean d;

    public hw3(bz3 bz3Var, ResourceUiText resourceUiText, boolean z, boolean z2) {
        this.a = bz3Var;
        this.b = resourceUiText;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw3)) {
            return false;
        }
        hw3 hw3Var = (hw3) obj;
        return this.a == hw3Var.a && this.b.equals(hw3Var.b) && this.c == hw3Var.c && this.d == hw3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetslipTabState(betslipType=");
        sb.append(this.a);
        sb.append(", titleUiText=");
        sb.append(this.b);
        sb.append(", active=");
        return lng.a(", selected=", ")", sb, this.c, this.d);
    }
}
