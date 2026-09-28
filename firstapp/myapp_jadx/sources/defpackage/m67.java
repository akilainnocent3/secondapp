package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m67 {
    public final ResourceUiText a;
    public final n67 b;
    public final String c;

    public m67(ResourceUiText resourceUiText, n67 n67Var, String str) {
        n67Var.getClass();
        this.a = resourceUiText;
        this.b = n67Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m67)) {
            return false;
        }
        m67 m67Var = (m67) obj;
        return this.a.equals(m67Var.a) && Intrinsics.g(this.b, m67Var.b) && this.c.equals(m67Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelActionButtonUiState(text=");
        sb.append(this.a);
        sb.append(", channelActionIconStyle=");
        sb.append(this.b);
        sb.append(", trackingButtonType=");
        return uf80.a(sb, this.c, ")");
    }
}
