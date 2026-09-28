package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dg30 {
    public final String a;
    public final ResourceUiText b;
    public final String c;

    public dg30(ResourceUiText resourceUiText, String str, String str2) {
        this.a = str;
        this.b = resourceUiText;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg30)) {
            return false;
        }
        dg30 dg30Var = (dg30) obj;
        return Intrinsics.g(this.a, dg30Var.a) && this.b.equals(dg30Var.b) && this.c.equals(dg30Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + wh8.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickBetWinningInfoState(withholdingTaxValueText=");
        sb.append(this.a);
        sb.append(", winningAmountTitleUiText=");
        sb.append(this.b);
        sb.append(", winningAmountValueText=");
        return uf80.a(sb, this.c, ")");
    }
}
