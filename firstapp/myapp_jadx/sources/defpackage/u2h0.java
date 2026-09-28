package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u2h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;
    public final List<b0n> d;

    public u2h0(ResourceUiText resourceUiText, List list, int i) {
        UiText uiText = (i & 1) != 0 ? vch0.a : resourceUiText;
        StringUiText stringUiText = vch0.a;
        boolean z = (i & 4) != 0;
        list = (i & 8) != 0 ? m2g.a : list;
        uiText.getClass();
        stringUiText.getClass();
        list.getClass();
        this.a = uiText;
        this.b = stringUiText;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2h0)) {
            return false;
        }
        u2h0 u2h0Var = (u2h0) obj;
        return Intrinsics.g(this.a, u2h0Var.a) && Intrinsics.g(this.b, u2h0Var.b) && this.c == u2h0Var.c && Intrinsics.g(this.d, u2h0Var.d);
    }

    @Override // defpackage.b0n
    public final UiText getContent() {
        return this.b;
    }

    @Override // defpackage.b0n
    public final UiText getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "TxDetailsInfoGroup(title=", ", content=", ", isVisible=");
        sbA.append(this.c);
        sbA.append(", items=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
