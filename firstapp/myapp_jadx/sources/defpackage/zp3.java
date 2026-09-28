package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class zp3 {
    public final int a;
    public final ResourceUiText b;

    public zp3(int i, ResourceUiText resourceUiText) {
        this.a = i;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp3)) {
            return false;
        }
        zp3 zp3Var = (zp3) obj;
        return this.a == zp3Var.a && this.b.equals(zp3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BetslipHeaderState(selectionCount=" + this.a + ", balanceUiText=" + this.b + ")";
    }
}
