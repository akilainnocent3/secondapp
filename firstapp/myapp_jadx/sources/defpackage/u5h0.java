package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5h0 {
    public final ResourceUiText a;
    public final ResourceUiText b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public u5h0(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, String str, boolean z, boolean z2) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5h0)) {
            return false;
        }
        u5h0 u5h0Var = (u5h0) obj;
        return this.a.equals(u5h0Var.a) && this.b.equals(u5h0Var.b) && Intrinsics.g(this.c, u5h0Var.c) && this.d == u5h0Var.d && this.e == u5h0Var.e;
    }

    public final int hashCode() {
        int iA = wh8.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxFixStatusTipState(titleUiText=");
        sb.append(this.a);
        sb.append(", tipUiText=");
        sb.append(this.b);
        sb.append(", tipImageUrl=");
        uts.b(this.c, ", isExpandable=", ", isInitExpanded=", sb, this.d);
        return mq0.a(sb, this.e, ")");
    }
}
