package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qq6 {
    public final boolean a;
    public final boolean b;
    public final UiText c;
    public final UiText d;

    public qq6(boolean z, boolean z2, UiText uiText, UiText uiText2) {
        this.a = z;
        this.b = z2;
        this.c = uiText;
        this.d = uiText2;
    }

    public static qq6 a(qq6 qq6Var, boolean z, boolean z2, UiText uiText, UiText uiText2, int i) {
        if ((i & 1) != 0) {
            z = qq6Var.a;
        }
        if ((i & 2) != 0) {
            z2 = qq6Var.b;
        }
        if ((i & 4) != 0) {
            uiText = qq6Var.c;
        }
        if ((i & 8) != 0) {
            uiText2 = qq6Var.d;
        }
        qq6Var.getClass();
        return new qq6(z, z2, uiText, uiText2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq6)) {
            return false;
        }
        qq6 qq6Var = (qq6) obj;
        return this.a == qq6Var.a && this.b == qq6Var.b && Intrinsics.g(this.c, qq6Var.c) && Intrinsics.g(this.d, qq6Var.d);
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        UiText uiText = this.c;
        int iHashCode = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.d;
        return iHashCode + (uiText2 != null ? uiText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("CashoutReasonState(isVisible=", ", isExtend=", ", mainText=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", subText=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }

    public qq6() {
        this(false, false, null, null);
    }
}
