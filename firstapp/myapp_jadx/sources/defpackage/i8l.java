package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i8l {
    public final String a;
    public final UiText b;
    public final uf00<k9f0> c;
    public final boolean d;
    public final boolean e;

    public i8l(String str, UiText uiText, uf00<k9f0> uf00Var, boolean z, boolean z2) {
        str.getClass();
        uiText.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uf00Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8l)) {
            return false;
        }
        i8l i8lVar = (i8l) obj;
        return Intrinsics.g(this.a, i8lVar.a) && Intrinsics.g(this.b, i8lVar.b) && Intrinsics.g(this.c, i8lVar.c) && this.d == i8lVar.d && this.e == i8lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(yvz.a(this.c, yvf.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "GroupUiModel(id=", this.a, ", title=", ", standings=");
        sbA.append(this.c);
        sbA.append(", isHighlighted=");
        sbA.append(this.d);
        sbA.append(", isBetNowVisible=");
        return mq0.a(sbA, this.e, ")");
    }

    public /* synthetic */ i8l(String str, ResourceUiText resourceUiText, uf00 uf00Var, boolean z, int i) {
        this(str, (UiText) resourceUiText, (uf00<k9f0>) uf00Var, false, (i & 16) != 0 ? true : z);
    }
}
